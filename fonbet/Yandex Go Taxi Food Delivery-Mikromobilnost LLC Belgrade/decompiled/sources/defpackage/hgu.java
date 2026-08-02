package defpackage;

/* loaded from: classes15.dex */
public final class hgu extends njt {
    public final k020 e;

    public hgu(String str, k020 k020Var) {
        super(str, true, false);
        this.e = k020Var;
    }

    @Override // defpackage.njt
    public final boolean b(o1b0 o1b0Var) {
        String str = o1b0Var.b;
        k020 k020Var = this.e;
        return k020Var.i(str) && !k020Var.k(o1b0Var.a).H;
    }

    @Override // defpackage.njt
    public final boolean c(fm21 fm21Var) {
        String str = fm21Var.a;
        k020 k020Var = this.e;
        j3b m = k020Var.m(str);
        if (m == null || m.H) {
            return false;
        }
        return k020Var.i(m.b);
    }
}
