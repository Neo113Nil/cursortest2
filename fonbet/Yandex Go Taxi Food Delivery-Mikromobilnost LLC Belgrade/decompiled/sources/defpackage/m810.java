package defpackage;

/* loaded from: classes9.dex */
public class m810 extends l810 {
    public static int a(double d) {
        if (Double.isNaN(d)) {
            ny61.g("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int b(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        ny61.g("Cannot round NaN value.");
        return 0;
    }

    public static long c(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        ny61.g("Cannot round NaN value.");
        return 0L;
    }
}
