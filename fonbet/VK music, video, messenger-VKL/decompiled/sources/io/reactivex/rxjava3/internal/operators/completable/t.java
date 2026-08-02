package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: CompletableNever.java */
/* loaded from: classes8.dex */
public final class t extends io.reactivex.rxjava3.core.a {
    public static final t b = new t();

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        cVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
