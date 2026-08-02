package yads;

/* loaded from: classes10.dex */
public final class f42 implements by0 {
    public final xc2 a;
    public final ic0 b;
    public z3 c;
    public uk2 d;

    public f42(z3 z3Var, uk2 uk2Var, xc2 xc2Var, ic0 ic0Var) {
        this.a = xc2Var;
        this.b = ic0Var;
        this.c = z3Var;
        this.d = uk2Var;
    }

    @Override // yads.by0
    public final void invalidate() {
        ((ad2) this.a).a();
        ((ad2) this.a).e = null;
        this.c = null;
        this.d = null;
    }

    @Override // yads.by0
    public final void pause() {
        ((ad2) this.a).b();
    }

    @Override // yads.by0
    public final void resume() {
        ((ad2) this.a).d();
    }

    @Override // yads.by0
    public final void start() {
        d42 d42Var = new d42(this);
        long a = this.b.a();
        e42 e42Var = new e42(this, a);
        ad2 ad2Var = (ad2) this.a;
        ad2Var.e = e42Var;
        ad2Var.a(a, d42Var);
    }

    public /* synthetic */ f42(z3 z3Var, o73 o73Var, uk2 uk2Var) {
        this(z3Var, uk2Var, wc2.a(false), o73Var.c());
    }
}
