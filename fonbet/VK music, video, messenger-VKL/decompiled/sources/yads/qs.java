package yads;

/* loaded from: classes10.dex */
public final class qs implements q10 {
    public final g9 a;
    public final /* synthetic */ ts b;

    public qs(ts tsVar, g9 g9Var) {
        this.b = tsVar;
        this.a = g9Var;
    }

    @Override // yads.q10
    public final void a(l4 l4Var) {
    }

    @Override // yads.q10
    public final void a(es2 es2Var) {
        us2 us2Var = this.b.e;
        g9 g9Var = this.a;
        synchronized (us2Var) {
            lj2 lj2Var = us2Var.a;
            us2Var.b.getClass();
            lj2Var.a(py0.a(g9Var), es2Var);
        }
    }
}
