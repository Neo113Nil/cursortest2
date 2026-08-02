package defpackage;

/* loaded from: classes12.dex */
public final class pit0 implements pft0 {
    public final cg5 a;
    public final rf5 b;

    public pit0(cg5 cg5Var, rf5 rf5Var) {
        this.a = cg5Var;
        this.b = rf5Var;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        cg5 cg5Var = this.a;
        if (cg5Var.a) {
            return;
        }
        this.b.a("first_pin");
        cg5Var.a = true;
    }
}
