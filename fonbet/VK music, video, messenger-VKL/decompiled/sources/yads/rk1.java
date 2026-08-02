package yads;

/* loaded from: classes10.dex */
public final class rk1 {
    public final y00 a;

    public rk1(y00 y00Var) {
        this.a = y00Var;
    }

    public final Float a() {
        int i;
        int i2;
        y00 y00Var = this.a;
        h10 h10Var = y00Var.a;
        a10 a10Var = y00Var.d;
        if (h10Var != null) {
            return Float.valueOf(h10Var.a);
        }
        if (a10Var == null || (i = a10Var.c) <= 0 || (i2 = a10Var.d) <= 0) {
            return null;
        }
        return Float.valueOf(i / i2);
    }
}
