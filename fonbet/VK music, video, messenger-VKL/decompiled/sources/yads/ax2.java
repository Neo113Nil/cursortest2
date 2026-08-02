package yads;

/* loaded from: classes10.dex */
public final class ax2 implements t52 {
    public final /* synthetic */ bx2 a;

    public ax2(bx2 bx2Var) {
        this.a = bx2Var;
    }

    @Override // yads.t52
    public final void a(l4 l4Var) {
        bx2 bx2Var = this.a;
        if (bx2Var.k) {
            return;
        }
        bx2Var.j = null;
        bx2Var.a.b(l4Var);
    }

    @Override // yads.t52
    public final void a(x12 x12Var) {
        bx2 bx2Var = this.a;
        if (bx2Var.k) {
            return;
        }
        bx2Var.j = x12Var;
        bx2Var.a.l();
    }
}
