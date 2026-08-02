package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.operators.observable.ObservableScalarXMap;

/* compiled from: ObservableJust.java */
/* loaded from: classes11.dex */
public final class g1<T> extends io.reactivex.rxjava3.core.q<T> implements io.reactivex.rxjava3.internal.fuseable.j<T> {
    public final T b;

    public g1(T t) {
        this.b = t;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final T get() {
        return this.b;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(vVar, this.b);
        vVar.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }
}
