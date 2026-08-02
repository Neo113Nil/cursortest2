package xsna;

import android.graphics.Color;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public final class l8g {
    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static int b(float f) {
        return Math.round(f * 255.0f);
    }

    public static int c(float f, int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * f;
        return Color.HSVToColor(fArr);
    }

    public static boolean d(int i) {
        return e(i) > 0.75f;
    }

    public static float e(int i) {
        return ((Color.blue(i) / 255.0f) * 0.0722f) + ((Color.green(i) / 255.0f) * 0.7152f) + ((Color.red(i) / 255.0f) * 0.2126f);
    }

    public static int f(float f, int i) {
        return g(i, (int) (f * 255.0f));
    }

    public static int g(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }
}
