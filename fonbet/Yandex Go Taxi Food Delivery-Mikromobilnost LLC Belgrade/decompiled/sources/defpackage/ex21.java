package defpackage;

/* loaded from: classes10.dex */
public abstract class ex21 {
    public static final long a = ior.a(0.0f, 0.0f);
    public static final float b = 3.1415927f;
    public static final float c = 6.2831855f;

    public static final float a(float f, float f2) {
        float atan2 = (float) Math.atan2(f2, f);
        float f3 = c;
        return (atan2 + f3) % f3;
    }

    public static final long b(float f, float f2) {
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (sqrt > 0.0f) {
            return ior.a(f / sqrt, f2 / sqrt);
        }
        ny61.g("Required distance greater than zero");
        return 0L;
    }

    public static final float c(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final float d(float f, float f2) {
        return ((f % f2) + f2) % f2;
    }

    public static long e(float f, float f2) {
        double d = f2;
        return pw91.n(pw91.r(f, ior.a((float) Math.cos(d), (float) Math.sin(d))), a);
    }
}
