package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeEmpty.java */
/* loaded from: classes8.dex */
public final class i extends io.reactivex.rxjava3.core.k<Object> implements io.reactivex.rxjava3.internal.fuseable.j<Object> {
    public static final i b = new i();

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super Object> mVar) {
        mVar.onSubscribe(EmptyDisposable.INSTANCE);
        mVar.onComplete();
    }
}
