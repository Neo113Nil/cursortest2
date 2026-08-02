package defpackage;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class lhc {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(double d, double d2, double d3) {
        double a2 = vfc.a(d3, -0.4986d, ((-1.5372d) * d2) + (3.2406d * d), 100.0d);
        double a3 = vfc.a(d3, 0.0415d, (1.8758d * d2) + ((-0.9689d) * d), 100.0d);
        double a4 = vfc.a(d3, 1.057d, ((-0.204d) * d2) + (0.0557d * d), 100.0d);
        double pow = a2 > 0.0031308d ? (Math.pow(a2, 0.4166666666666667d) * 1.055d) - 0.055d : a2 * 12.92d;
        double pow2 = a3 > 0.0031308d ? (Math.pow(a3, 0.4166666666666667d) * 1.055d) - 0.055d : a3 * 12.92d;
        double pow3 = a4 > 0.0031308d ? (Math.pow(a4, 0.4166666666666667d) * 1.055d) - 0.055d : a4 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static double c(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            ny61.g("outXyz must have a length of 3.");
            return 0.0d;
        }
        double d = red / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = blue / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d4 / 100.0d;
    }

    public static int d(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, e(Color.red(i), alpha2, Color.red(i2), alpha, i3), e(Color.green(i), alpha2, Color.green(i2), alpha, i3), e(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return g8e.d(255, i2, i3 * i4, (i * 255) * i2) / (i5 * 255);
    }

    public static int f(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        ny61.g("alpha must be between 0 and 255.");
        return 0;
    }
}
