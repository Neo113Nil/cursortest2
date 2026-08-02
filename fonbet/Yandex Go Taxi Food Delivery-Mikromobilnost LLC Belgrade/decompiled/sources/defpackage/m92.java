package defpackage;

/* loaded from: classes10.dex */
public abstract class m92 {
    public static final float[] a;

    static {
        float f;
        float a2;
        float f2;
        float f3;
        float f4;
        float f5;
        float a3;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        a = fArr;
        float[] fArr2 = new float[101];
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100.0f;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                a2 = n.a(f13, f9, 2.0f, f9);
                f2 = f11 - a2;
                f3 = a2 * 3.0f * f2;
                f4 = a2 * a2 * a2;
                float b = x4e.b(a2, 0.35000002f, f2 * 0.175f, f3) + f4;
                f5 = f11;
                if (Math.abs(b - f12) < 1.0E-5d) {
                    break;
                }
                if (b > f12) {
                    f13 = a2;
                } else {
                    f9 = a2;
                }
                f11 = f5;
            }
            float f14 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + a2) * f3) + f4;
            float f15 = f5;
            while (true) {
                a3 = n.a(f15, f10, f, f10);
                f6 = f5 - a3;
                f7 = a3 * 3.0f * f6;
                f8 = a3 * a3 * a3;
                float b2 = x4e.b(f6, f14, a3, f7) + f8;
                if (Math.abs(b2 - f12) >= 1.0E-5d) {
                    if (b2 > f12) {
                        f15 = a3;
                    } else {
                        f10 = a3;
                    }
                    f14 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((a3 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static l92 a(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float c = y6i0.c(f, 0.0f, 1.0f);
        int i = (int) (100.0f * c);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = a;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float b = g8e.b(c, f4, f6, f5);
            f2 = f6;
            f3 = b;
        }
        return new l92(f3, f2);
    }
}
