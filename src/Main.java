public class Main {

    public static void main(String[] args) {
        int x = 0;
        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    x++;
                }
            }
            if (x == 0) {
                System.out.print(i + " ");
            }
            x = 0;
        }
    }
}
