package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeNever.java */
/* loaded from: classes8.dex */
public final class w extends io.reactivex.rxjava3.core.k<Object> {
    public static final w b = new w();

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super Object> mVar) {
        mVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
