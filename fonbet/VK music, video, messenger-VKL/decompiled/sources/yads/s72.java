package yads;

/* loaded from: classes10.dex */
public final class s72 implements ig3 {
    public final /* synthetic */ u72 a;

    public s72(u72 u72Var) {
        this.a = u72Var;
    }

    public static final void a(u72 u72Var) {
        u72Var.a(u72Var.g);
    }

    @Override // yads.ig3
    public final void b() {
        u72 u72Var = this.a;
        u72Var.l = null;
        qz2 qz2Var = u72Var.c;
        if (qz2Var == null || !qz2Var.d) {
            u72Var.i.a();
        } else {
            oi1 oi1Var = u72Var.k;
            oi1Var.a.post(new xsna.t12(u72Var, 17));
        }
        this.a.b.b();
    }

    @Override // yads.ig3
    public final void c() {
        g82 g82Var = (g82) this.a.a.b();
        if (g82Var != null) {
            g82Var.setClickable(true);
        }
    }

    @Override // yads.ig3
    public final void a() {
        this.a.b.a();
    }
}
