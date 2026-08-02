package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.l;
import io.reactivex.rxjava3.internal.operators.observable.p;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements v<T>, io.reactivex.rxjava3.disposables.c {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final h<T> parent;
    final int prefetch;
    l<T> queue;

    public InnerQueuedObserver(p.a aVar, int i) {
        this.parent = aVar;
        this.prefetch = i;
    }

    public final boolean d() {
        return this.done;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        DisposableHelper.a(this);
    }

    public final l<T> g() {
        return this.queue;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return DisposableHelper.b(get());
    }

    public final void i() {
        this.done = true;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        p.a aVar = (p.a) this.parent;
        aVar.getClass();
        i();
        aVar.g();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        ((p.a) this.parent).i(this, th);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        if (this.fusionMode != 0) {
            ((p.a) this.parent).g();
            return;
        }
        p.a aVar = (p.a) this.parent;
        aVar.getClass();
        g().offer(t);
        aVar.g();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (DisposableHelper.e(this, cVar)) {
            if (cVar instanceof io.reactivex.rxjava3.internal.fuseable.g) {
                io.reactivex.rxjava3.internal.fuseable.g gVar = (io.reactivex.rxjava3.internal.fuseable.g) cVar;
                int a = gVar.a(3);
                if (a == 1) {
                    this.fusionMode = a;
                    this.queue = gVar;
                    this.done = true;
                    p.a aVar = (p.a) this.parent;
                    aVar.getClass();
                    this.done = true;
                    aVar.g();
                    return;
                }
                if (a == 2) {
                    this.fusionMode = a;
                    this.queue = gVar;
                    return;
                }
            }
            int i = -this.prefetch;
            this.queue = i < 0 ? new io.reactivex.rxjava3.internal.queue.b<>(-i) : new SpscArrayQueue<>(i);
        }
    }
}
