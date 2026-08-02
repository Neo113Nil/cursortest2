package xsna;

/* compiled from: ExoTransferListenerImpl.kt */
/* loaded from: classes8.dex */
public final class e7q implements mjp0 {
    public final xk80 a;
    public final one.video.player.k b;

    public e7q(xk80 xk80Var, one.video.player.k kVar) {
        this.a = xk80Var;
        this.b = kVar;
    }

    @Override // xsna.mjp0
    public final void e(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        this.b.c(this.a, evkVar.a, evkVar.h, z);
    }

    @Override // xsna.mjp0
    public final void f(androidx.media3.datasource.a aVar, evk evkVar, boolean z, int i) {
        this.b.a(this.a, evkVar.a, evkVar.h, z, i);
    }

    @Override // xsna.mjp0
    public final void g(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        this.b.e(this.a, evkVar.a, evkVar.h, z);
    }

    @Override // xsna.mjp0
    public final void h(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        this.b.d(this.a, evkVar.a, evkVar.h, z);
    }
}
