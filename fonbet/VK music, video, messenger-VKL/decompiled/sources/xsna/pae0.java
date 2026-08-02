package xsna;

import xsna.jk80;

/* compiled from: ProxyTransferListener.kt */
/* loaded from: classes8.dex */
public final class pae0 implements mjp0 {
    public final mjp0 a;
    public volatile mjp0 b;
    public volatile boolean c = true;

    public pae0(jk80.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.mjp0
    public final void e(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        mjp0 mjp0Var = this.b;
        if (mjp0Var != null) {
            mjp0Var.e(aVar, evkVar, z);
        }
        if (this.c) {
            this.a.e(aVar, evkVar, z);
        }
    }

    @Override // xsna.mjp0
    public final void f(androidx.media3.datasource.a aVar, evk evkVar, boolean z, int i) {
        mjp0 mjp0Var = this.b;
        if (mjp0Var != null) {
            mjp0Var.f(aVar, evkVar, z, i);
        }
        if (this.c) {
            this.a.f(aVar, evkVar, z, i);
        }
    }

    @Override // xsna.mjp0
    public final void g(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        mjp0 mjp0Var = this.b;
        if (mjp0Var != null) {
            mjp0Var.g(aVar, evkVar, z);
        }
        if (this.c) {
            this.a.g(aVar, evkVar, z);
        }
    }

    @Override // xsna.mjp0
    public final void h(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        mjp0 mjp0Var = this.b;
        if (mjp0Var != null) {
            mjp0Var.h(aVar, evkVar, z);
        }
        if (this.c) {
            this.a.h(aVar, evkVar, z);
        }
    }
}
