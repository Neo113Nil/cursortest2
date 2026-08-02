package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: CompletableError.java */
/* loaded from: classes8.dex */
public final class j extends io.reactivex.rxjava3.core.a {
    public final Throwable b;

    public j(Throwable th) {
        this.b = th;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        cVar.onSubscribe(EmptyDisposable.INSTANCE);
        cVar.onError(this.b);
    }
}
