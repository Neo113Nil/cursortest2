package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class CallbackCompletableObserver extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c, io.reactivex.rxjava3.functions.f<Throwable>, io.reactivex.rxjava3.observers.c {
    private static final long serialVersionUID = -4361286194466301354L;
    final io.reactivex.rxjava3.functions.a onComplete;
    final io.reactivex.rxjava3.functions.f<? super Throwable> onError;

    public CallbackCompletableObserver(io.reactivex.rxjava3.functions.a aVar) {
        this.onError = this;
        this.onComplete = aVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Throwable th) throws Throwable {
        io.reactivex.rxjava3.plugins.a.a(new OnErrorNotImplementedException(th));
    }

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
        return this.onError != this;
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            io.reactivex.rxjava3.plugins.a.a(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            io.reactivex.rxjava3.plugins.a.a(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        DisposableHelper.e(this, cVar);
    }

    public CallbackCompletableObserver(io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.f fVar) {
        this.onError = fVar;
        this.onComplete = aVar;
    }
}
