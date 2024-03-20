import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Count area rectangle
        System.out.print("Let's Count Area of Rectangle\n");
        // Prompt the user for input
        System.out.print("Enter Length: ");
        int length = scanner.nextInt();
        System.out.print("Enter Width: ");
        int width = scanner.nextInt();

        // Print out the input received from the user
        System.out.print("Result area of rectangle: "+calculatearea(width,length)+"\n");
        System.out.println("============================================");

        // diameter, circumference, area of circle
        // Prompt the user for input
        System.out.print("Let's Count Diameter,Circumference and area \n");
        System.out.print("Enter Radius: ");
        int radius = scanner.nextInt();
        int diameter = 2*radius;
        double circumference = Math.PI*diameter;
        double area = Math.PI*Math.pow(radius,2) ;
        DecimalFormat dfc = new DecimalFormat("#.####");
        dfc.setRoundingMode(RoundingMode.FLOOR);
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.FLOOR);
        System.out.print("diameter = "+diameter+",circumference = "+dfc.format(circumference)+", area = "+df.format(area)+"\n");
        System.out.println("============================================");

        // Find angles from triangle
        System.out.print("Let's Triangle Angle \n");
        System.out.print("Enter Angle a: ");
        int a = scanner.nextInt();
        System.out.print("Enter Angle b: ");
        int b = scanner.nextInt();

        System.out.print("Angles Triangle : "+calculateangle(a,b)+"\n");
        System.out.println("============================================");

        // Difference between 2 date
        System.out.print("Let's Count Differences between two date \n");
        System.out.println("Enter Date 1 (format:YYYY-MM-DD): ");
        String startDate = scanner.next();
        System.out.println("Enter Date 2 (format:YYYY-MM-DD): ");
        String endDate = scanner.next();
        scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parseStartDate = LocalDate.parse(startDate, formatter);
        LocalDate parseEndDate = LocalDate.parse(endDate, formatter);
        long daysDifference = ChronoUnit.DAYS.between(parseStartDate, parseEndDate);
        System.out.print("Total Day: "+daysDifference+"\n");
        System.out.println("============================================");

        System.out.println("Let's get initial name");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        String[] arrOfStr = name.split(" ");

        for (String initial : arrOfStr)
            System.out.print(initial.toUpperCase().charAt(0));
        scanner.close();

    }

    // function to get area
    static int calculatearea(int width, int height){
        return width * height;
    }

    // function to get angle
    static int calculateangle(int a, int b){
        return 180-(a + b);
    }
}