package xsna;

/* compiled from: PreloadDiskCacheManager.kt */
/* loaded from: classes8.dex */
public final class a1d0 implements yan {
    public final /* synthetic */ z0d0 a;

    public a1d0(z0d0 z0d0Var) {
        this.a = z0d0Var;
    }

    @Override // xsna.yan
    public final void a(dbn dbnVar) {
        z0d0 z0d0Var = this.a;
        z0d0Var.b.k(new t210(z0d0Var, dbnVar));
    }

    @Override // xsna.yan
    public final void b() {
        z0d0 z0d0Var = this.a;
        z0d0Var.b.k(new r010(z0d0Var, 23));
    }

    @Override // xsna.yan
    public final void c(dbn dbnVar, long j, long j2) {
        z0d0 z0d0Var = this.a;
        z0d0Var.b.k(new sy50(z0d0Var, dbnVar, j, j2));
    }

    @Override // xsna.yan
    public final void d(dbn dbnVar, Exception exc) {
        z0d0 z0d0Var = this.a;
        z0d0Var.b.k(new qbc0(z0d0Var, dbnVar, exc));
    }
}
