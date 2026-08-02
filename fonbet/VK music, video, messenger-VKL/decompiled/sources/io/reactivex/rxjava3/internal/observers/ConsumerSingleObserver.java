package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements z<T>, io.reactivex.rxjava3.disposables.c, io.reactivex.rxjava3.observers.c {
    private static final long serialVersionUID = -7012088219455310787L;
    final io.reactivex.rxjava3.functions.f<? super Throwable> onError;
    final io.reactivex.rxjava3.functions.f<? super T> onSuccess;

    public ConsumerSingleObserver(io.reactivex.rxjava3.functions.f<? super T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2) {
        this.onSuccess = fVar;
        this.onError = fVar2;
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
        return this.onError != io.reactivex.rxjava3.internal.functions.a.f;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            io.reactivex.rxjava3.plugins.a.a(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        DisposableHelper.e(this, cVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            io.reactivex.rxjava3.plugins.a.a(th);
        }
    }
}
