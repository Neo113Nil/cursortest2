package xsna;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes13.dex */
public final class tig {
    public static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(lhg.a(i, "Invalid rotation: "));
    }
}
