package defpackage;

/* loaded from: classes9.dex */
public final class hay0 {
    public final e2t a;
    public final j2t b;

    public hay0(e2t e2tVar, j2t j2tVar) {
        this.a = e2tVar;
        this.b = j2tVar;
    }

    public final boolean a(boolean z) {
        Boolean bool;
        sxq0 sxq0Var;
        g2t a = ((f2t) this.a).a();
        rtx0 rtx0Var = null;
        if (a != null && (sxq0Var = a.a.a.d) != null) {
            rtx0Var = sxq0Var.a;
        }
        return (rtx0Var == null || (bool = rtx0Var.a) == null) ? z : bool.booleanValue();
    }
}
