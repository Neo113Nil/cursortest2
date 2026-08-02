package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class EmptyCompletableObserver extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c, io.reactivex.rxjava3.observers.c {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.observers.c
    public final boolean hasCustomOnError() {
        return false;
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        io.reactivex.rxjava3.plugins.a.a(new OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        DisposableHelper.e(this, cVar);
    }
}
