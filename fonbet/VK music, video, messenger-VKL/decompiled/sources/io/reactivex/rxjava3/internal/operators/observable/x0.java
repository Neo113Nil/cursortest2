package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableFromUnsafeSource.java */
/* loaded from: classes8.dex */
public final class x0<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.core.t<T> b;

    public x0(io.reactivex.rxjava3.core.t<T> tVar) {
        this.b = tVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(vVar);
    }
}
