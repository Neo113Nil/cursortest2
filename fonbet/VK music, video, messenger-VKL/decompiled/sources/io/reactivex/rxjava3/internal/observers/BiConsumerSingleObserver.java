package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements z<T>, io.reactivex.rxjava3.disposables.c {
    private static final long serialVersionUID = 4943102778943297569L;
    final io.reactivex.rxjava3.functions.b<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(io.reactivex.rxjava3.functions.b<? super T, ? super Throwable> bVar) {
        this.onCallback = bVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(null, th);
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
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(t, null);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            io.reactivex.rxjava3.plugins.a.a(th);
        }
    }
}
