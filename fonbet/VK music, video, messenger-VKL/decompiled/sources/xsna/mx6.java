package xsna;

/* compiled from: BenchmarkObservableContainer.kt */
/* loaded from: classes4.dex */
public final class mx6<T> extends io.reactivex.rxjava3.core.q<T> {
    public io.reactivex.rxjava3.core.q<T> b;
    public final awq c;

    public mx6(io.reactivex.rxjava3.core.q<T> qVar, awq awqVar) {
        this.b = qVar;
        this.c = awqVar;
    }

    public final void M0(bwq bwqVar) {
        bwqVar.u(this.c);
    }

    public final void N0(ucg ucgVar) {
        this.b = (io.reactivex.rxjava3.core.q) ucgVar.invoke(this.b);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(vVar);
    }
}
