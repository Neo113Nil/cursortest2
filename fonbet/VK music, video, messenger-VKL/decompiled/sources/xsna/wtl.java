package xsna;

/* compiled from: DelegatingConsumer.kt */
/* loaded from: classes12.dex */
public abstract class wtl<I, O> extends ac6<I> {
    public final l7j<O> b;

    public wtl(l7j<O> l7jVar) {
        this.b = l7jVar;
    }

    @Override // xsna.ac6
    public void f() {
        this.b.a();
    }

    @Override // xsna.ac6
    public void g(Throwable th) {
        this.b.onFailure(th);
    }

    @Override // xsna.ac6
    public void i(float f) {
        this.b.c(f);
    }
}
