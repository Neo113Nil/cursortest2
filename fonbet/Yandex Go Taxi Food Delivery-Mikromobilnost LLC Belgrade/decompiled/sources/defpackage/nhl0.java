package defpackage;

/* loaded from: classes10.dex */
public final class nhl0 implements mhl0 {
    public static final nhl0 a = new nhl0();

    @Override // defpackage.mhl0
    public final f530 a(f530 f530Var, float f, boolean z) {
        if (f <= 0.0d) {
            gxv.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return f530Var.k(new x2y(f, z));
    }

    @Override // defpackage.mhl0
    public final f530 b(f530 f530Var, to5 to5Var) {
        return f530Var.k(new pa31(to5Var));
    }
}
