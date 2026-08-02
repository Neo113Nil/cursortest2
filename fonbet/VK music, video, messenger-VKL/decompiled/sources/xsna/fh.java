package xsna;

/* compiled from: AbstractProducerToDataSourceAdapter.kt */
/* loaded from: classes12.dex */
public final class fh extends ac6<Object> {
    public final /* synthetic */ gh<Object> b;

    public fh(gh<Object> ghVar) {
        this.b = ghVar;
    }

    @Override // xsna.ac6
    public final void f() {
        gh<Object> ghVar = this.b;
        synchronized (ghVar) {
            sex0.f(ghVar.f());
        }
    }

    @Override // xsna.ac6
    public final void g(Throwable th) {
        gh<Object> ghVar = this.b;
        ozi0 ozi0Var = ghVar.h;
        if (ghVar.h(th, ozi0Var.g)) {
            ghVar.i.c(ozi0Var, th);
        }
    }

    @Override // xsna.ac6
    public final void h(int i, Object obj) {
        gh<Object> ghVar = this.b;
        ghVar.l(obj, i, ghVar.h);
    }

    @Override // xsna.ac6
    public final void i(float f) {
        this.b.i(f);
    }
}
