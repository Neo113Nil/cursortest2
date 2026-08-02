package yads;

/* loaded from: classes10.dex */
public final class b42 implements by0 {
    public final ms2 a;
    public final lw b;
    public final long c;
    public final xc2 d;
    public final a42 e;

    public /* synthetic */ b42(v9 v9Var, ms2 ms2Var, o73 o73Var) {
        this(ms2Var, o73Var.b(), c42.a(v9Var), wc2.a(false));
    }

    @Override // yads.by0
    public final void invalidate() {
        ((ad2) this.d).a();
    }

    @Override // yads.by0
    public final void pause() {
        ((ad2) this.d).b();
    }

    @Override // yads.by0
    public final void resume() {
        ((ad2) this.d).d();
    }

    @Override // yads.by0
    public final void start() {
        long max = Math.max(0L, this.c - this.b.a);
        ad2 ad2Var = (ad2) this.d;
        ad2Var.e = this.b;
        ad2Var.a(max, this.e);
    }

    public b42(ms2 ms2Var, lw lwVar, long j, xc2 xc2Var) {
        this.a = ms2Var;
        this.b = lwVar;
        this.c = j;
        this.d = xc2Var;
        this.e = new a42(this);
    }
}
