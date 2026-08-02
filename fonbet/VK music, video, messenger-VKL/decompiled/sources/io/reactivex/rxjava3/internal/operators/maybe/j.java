package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeError.java */
/* loaded from: classes8.dex */
public final class j<T> extends io.reactivex.rxjava3.core.k<T> {
    public final Throwable b;

    public j(Throwable th) {
        this.b = th;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        mVar.onSubscribe(EmptyDisposable.INSTANCE);
        mVar.onError(this.b);
    }
}
