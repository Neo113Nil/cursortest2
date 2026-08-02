package defpackage;

/* loaded from: classes9.dex */
public final class eqh implements v7p {
    public xvf0 a;

    public static void a(xvf0 xvf0Var, xvf0 xvf0Var2) {
        eqh eqhVar = (eqh) xvf0Var;
        xvf0Var2.getClass();
        if (eqhVar.a == null) {
            eqhVar.a = xvf0Var2;
        } else {
            ny61.k();
        }
    }

    @Override // defpackage.yvf0
    public final Object get() {
        xvf0 xvf0Var = this.a;
        if (xvf0Var != null) {
            return xvf0Var.get();
        }
        ny61.k();
        return null;
    }
}
