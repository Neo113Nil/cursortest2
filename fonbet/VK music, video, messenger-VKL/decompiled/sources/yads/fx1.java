package yads;

/* loaded from: classes10.dex */
public final class fx1 extends fo {
    public final xw1 b;

    public fx1(ix1 ix1Var, pi3 pi3Var, yw1 yw1Var, yw1 yw1Var2, yw1 yw1Var3, jx1 jx1Var, xw1 xw1Var) {
        super(ix1Var);
        this.b = xw1Var;
        xw1Var.l = jx1Var;
        xw1Var.a(pi3Var);
        xw1Var.a(yw1Var);
        xw1Var.b(yw1Var2);
        xw1Var.c(yw1Var3);
    }

    @Override // yads.fo
    public final void a(String str) {
        this.b.a(str);
    }

    public final void a(lx1 lx1Var) {
        this.a.setHtmlWebViewListener(new ax1(this.b));
    }
}
