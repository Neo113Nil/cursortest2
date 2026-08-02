package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: SingleJust.java */
/* loaded from: classes11.dex */
public final class x<T> extends io.reactivex.rxjava3.core.x<T> {
    public final T b;

    public x(T t) {
        this.b = t;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        zVar.onSubscribe(EmptyDisposable.INSTANCE);
        zVar.onSuccess(this.b);
    }
}
