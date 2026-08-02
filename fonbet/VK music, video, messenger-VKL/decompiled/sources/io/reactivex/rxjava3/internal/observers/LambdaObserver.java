package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class LambdaObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements v<T>, io.reactivex.rxjava3.disposables.c, io.reactivex.rxjava3.observers.c {
    private static final long serialVersionUID = -7251123623727029452L;
    final io.reactivex.rxjava3.functions.a onComplete;
    final io.reactivex.rxjava3.functions.f<? super Throwable> onError;
    final io.reactivex.rxjava3.functions.f<? super T> onNext;
    final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> onSubscribe = io.reactivex.rxjava3.internal.functions.a.d;

    public LambdaObserver(io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2, io.reactivex.rxjava3.functions.a aVar) {
        this.onNext = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
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

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        if (h()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            io.reactivex.rxjava3.plugins.a.a(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        if (h()) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            io.reactivex.rxjava3.plugins.a.a(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        if (h()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (DisposableHelper.e(this, cVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                cVar.dispose();
                onError(th);
            }
        }
    }
}
