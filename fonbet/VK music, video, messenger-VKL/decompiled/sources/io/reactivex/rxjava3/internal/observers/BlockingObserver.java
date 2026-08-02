package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.AbstractQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class BlockingObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements v<T>, io.reactivex.rxjava3.disposables.c {
    public static final Object b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingObserver(AbstractQueue abstractQueue) {
        this.queue = abstractQueue;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        if (DisposableHelper.a(this)) {
            this.queue.offer(b);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.queue.offer(NotificationLite.COMPLETE);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.queue.offer(new NotificationLite.b(th));
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        this.queue.offer(t);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        DisposableHelper.e(this, cVar);
    }
}
