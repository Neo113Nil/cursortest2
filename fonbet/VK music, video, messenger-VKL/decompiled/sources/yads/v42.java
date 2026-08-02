package yads;

/* loaded from: classes10.dex */
public final class v42 implements by0 {
    public final uk2 a;
    public final xc2 b;
    public final tk2 c;
    public final u2 d;
    public final ic0 e;

    public v42(y52 y52Var, xc2 xc2Var, tk2 tk2Var, u2 u2Var, ic0 ic0Var) {
        this.a = y52Var;
        this.b = xc2Var;
        this.c = tk2Var;
        this.d = u2Var;
        this.e = ic0Var;
    }

    @Override // yads.by0
    public final void invalidate() {
        ((ad2) this.b).a();
    }

    @Override // yads.by0
    public final void pause() {
        ((ad2) this.b).b();
    }

    @Override // yads.by0
    public final void resume() {
        ((ad2) this.b).d();
    }

    @Override // yads.by0
    public final void start() {
        u42 u42Var = new u42(this);
        ((ad2) this.b).a(this.e.a(), u42Var);
        ((ad2) this.b).e = u42Var;
    }
}
