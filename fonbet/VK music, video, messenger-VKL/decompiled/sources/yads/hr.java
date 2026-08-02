package yads;

/* loaded from: classes10.dex */
public final class hr extends qp2 {
    public final vq2 s;

    public hr(String str, kw0 kw0Var, lw0 lw0Var) {
        super(0, str, lw0Var);
        this.s = kw0Var;
    }

    @Override // yads.qp2
    public final void a(Object obj) {
        this.s.a((byte[]) obj);
    }

    @Override // yads.qp2
    public final wq2 a(g92 g92Var) {
        try {
            return new wq2(g92Var.b, x11.a(g92Var));
        } catch (Exception e) {
            return new wq2(new mn3(e));
        }
    }
}
