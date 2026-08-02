package xsna;

/* compiled from: AutoPlayItemAdapter.kt */
/* loaded from: classes17.dex */
public final class ph5 implements p0f {
    public final /* synthetic */ izs<pi5, s3q0> a;
    public final /* synthetic */ pi5 b;
    public final /* synthetic */ izs<Boolean, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ph5(izs<? super pi5, s3q0> izsVar, pi5 pi5Var, izs<? super Boolean, s3q0> izsVar2) {
        this.a = izsVar;
        this.b = pi5Var;
        this.c = izsVar2;
    }

    @Override // xsna.g64
    public final void a() {
        release();
    }

    @Override // xsna.o0f
    public final void f() {
        prepare();
        this.c.invoke(Boolean.TRUE);
        kih0 j = this.b.j();
        if (j != null) {
            j.play();
        }
    }

    @Override // xsna.g64
    public final void g(sht0 sht0Var) {
        play();
    }

    @Override // xsna.g64
    public final boolean h() {
        return isPrepared();
    }

    @Override // xsna.o0f
    public final boolean isPrepared() {
        kih0 j = this.b.j();
        return j != null && j.isPrepared();
    }

    @Override // xsna.g64
    public final void j(sht0 sht0Var) {
        prepare();
    }

    public final void k() {
        pi5 pi5Var = this.b;
        oi5 e4 = pi5Var.e4();
        kih0 j = pi5Var.j();
        if (j != null) {
            j.m(e4 != null ? e4.a : null, e4 != null ? e4.b : null, e4 != null ? e4.c : null);
        }
    }

    @Override // xsna.o0f
    public final void pause() {
        this.c.invoke(Boolean.FALSE);
        kih0 j = this.b.j();
        if (j != null) {
            j.pause();
        }
    }

    @Override // xsna.o0f
    public final void play() {
        this.c.invoke(Boolean.TRUE);
        izs<pi5, s3q0> izsVar = this.a;
        pi5 pi5Var = this.b;
        izsVar.invoke(pi5Var);
        k();
        kih0 j = pi5Var.j();
        if (j != null) {
            j.play();
        }
    }

    @Override // xsna.o0f
    public final void prepare() {
        izs<pi5, s3q0> izsVar = this.a;
        pi5 pi5Var = this.b;
        izsVar.invoke(pi5Var);
        k();
        kih0 j = pi5Var.j();
        if (j != null) {
            j.D();
        }
        kih0 j2 = pi5Var.j();
        if (j2 != null) {
            j2.prepare();
        }
    }

    @Override // xsna.o0f
    public final void release() {
        this.c.invoke(Boolean.FALSE);
        pi5 pi5Var = this.b;
        kih0 j = pi5Var.j();
        if (j != null) {
            j.pause();
        }
        kih0 j2 = pi5Var.j();
        if (j2 != null) {
            j2.D();
        }
    }
}
