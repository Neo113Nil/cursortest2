package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeJust.java */
/* loaded from: classes8.dex */
public final class t<T> extends io.reactivex.rxjava3.core.k<T> implements io.reactivex.rxjava3.internal.fuseable.j<T> {
    public final T b;

    public t(T t) {
        this.b = t;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final T get() {
        return this.b;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        mVar.onSubscribe(EmptyDisposable.INSTANCE);
        mVar.onSuccess(this.b);
    }
}
