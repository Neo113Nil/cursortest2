package xsna;

/* compiled from: RoundedCornerShape.kt */
/* loaded from: classes11.dex */
public final class vog0 {
    public static final uog0 a;

    static {
        tv90 tv90Var = new tv90(50);
        a = new uog0(tv90Var, tv90Var, tv90Var, tv90Var);
    }

    public static final uog0 a(float f) {
        yle0 yle0Var = new yle0(f);
        return new uog0(yle0Var, yle0Var, yle0Var, yle0Var);
    }

    public static final uog0 b(float f) {
        qco qcoVar = new qco(f);
        return new uog0(qcoVar, qcoVar, qcoVar, qcoVar);
    }

    public static final uog0 c(float f, float f2, float f3, float f4) {
        return new uog0(new qco(f), new qco(f2), new qco(f3), new qco(f4));
    }

    public static uog0 d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return c(f, f2, f3, f4);
    }
}
