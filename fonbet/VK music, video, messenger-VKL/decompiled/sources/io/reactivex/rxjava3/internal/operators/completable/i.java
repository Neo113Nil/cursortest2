package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: CompletableEmpty.java */
/* loaded from: classes11.dex */
public final class i extends io.reactivex.rxjava3.core.a {
    public static final i b = new i();

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        cVar.onSubscribe(EmptyDisposable.INSTANCE);
        cVar.onComplete();
    }
}
