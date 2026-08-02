package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
    private static final long serialVersionUID = -8612022020200669122L;
    final io.reactivex.rxjava3.core.v<? super T> downstream;
    final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.downstream = vVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        DisposableHelper.a(this.upstream);
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (DisposableHelper.e(this.upstream, cVar)) {
            this.downstream.onSubscribe(this);
        }
    }
}
