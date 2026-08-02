package xsna;

/* compiled from: CompositeHttpRequestLifecycleListener.kt */
/* loaded from: classes2.dex */
public final class gti implements gkv {
    public final gkv[] a;

    public gti(gkv... gkvVarArr) {
        this.a = gkvVarArr;
    }

    @Override // xsna.gkv
    public final void a(ckv ckvVar, Throwable th) {
        for (gkv gkvVar : this.a) {
            gkvVar.a(ckvVar, th);
        }
    }

    @Override // xsna.gkv
    public final void b(ckv ckvVar) {
        for (gkv gkvVar : this.a) {
            gkvVar.b(ckvVar);
        }
    }

    @Override // xsna.gkv
    public final void c(ckv ckvVar) {
        for (gkv gkvVar : this.a) {
            gkvVar.c(ckvVar);
        }
    }

    @Override // xsna.gkv
    public final void d(ckv ckvVar) {
        for (gkv gkvVar : this.a) {
            gkvVar.d(ckvVar);
        }
    }

    @Override // xsna.gkv
    public final void e(ckv ckvVar, Throwable th) {
        for (gkv gkvVar : this.a) {
            gkvVar.e(ckvVar, th);
        }
    }

    @Override // xsna.gkv
    public final void f(ckv ckvVar, Throwable th) {
        for (gkv gkvVar : this.a) {
            gkvVar.f(ckvVar, th);
        }
    }

    @Override // xsna.gkv
    public final void g(ckv ckvVar) {
        for (gkv gkvVar : this.a) {
            gkvVar.g(ckvVar);
        }
    }

    @Override // xsna.gkv
    public final void h(ckv ckvVar, long j) {
        for (gkv gkvVar : this.a) {
            gkvVar.h(ckvVar, j);
        }
    }

    @Override // xsna.gkv
    public final void i(ckv ckvVar, Throwable th) {
        for (gkv gkvVar : this.a) {
            gkvVar.i(ckvVar, th);
        }
    }

    @Override // xsna.gkv
    public final void j(ckv ckvVar) {
        for (gkv gkvVar : this.a) {
            gkvVar.j(ckvVar);
        }
    }

    @Override // xsna.gkv
    public final void k(ckv ckvVar) {
        for (gkv gkvVar : this.a) {
            gkvVar.k(ckvVar);
        }
    }

    @Override // xsna.gkv
    public final void l(ckv ckvVar) {
        for (gkv gkvVar : this.a) {
            gkvVar.l(ckvVar);
        }
    }
}
