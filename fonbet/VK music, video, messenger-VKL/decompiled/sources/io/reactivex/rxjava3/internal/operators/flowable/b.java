package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.jxm0;

/* compiled from: BlockingFlowableIterable.java */
/* loaded from: classes8.dex */
public final class b<T> implements Iterable<T> {
    public final t b;

    /* compiled from: BlockingFlowableIterable.java */
    public static final class a<T> extends AtomicReference<jxm0> implements io.reactivex.rxjava3.core.j<T>, Iterator<T>, Runnable, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 6695226475494099826L;
        final Condition condition;
        volatile boolean done;
        volatile Throwable error;
        final Lock lock;
        long produced;
        final SpscArrayQueue<T> queue = new SpscArrayQueue<>(2);
        final long batchSize = 2;
        final long limit = 2;

        public a() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        public final void d() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            SubscriptionHelper.a(this);
            d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!h()) {
                boolean z = this.done;
                boolean isEmpty = this.queue.isEmpty();
                if (z) {
                    Throwable th = this.error;
                    if (th != null) {
                        throw io.reactivex.rxjava3.internal.util.f.f(th);
                    }
                    if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                this.lock.lock();
                while (!this.done && this.queue.isEmpty() && !h()) {
                    try {
                        try {
                            this.condition.await();
                        } catch (InterruptedException e) {
                            run();
                            throw io.reactivex.rxjava3.internal.util.f.f(e);
                        }
                    } finally {
                        this.lock.unlock();
                    }
                }
            }
            Throwable th2 = this.error;
            if (th2 == null) {
                return false;
            }
            throw io.reactivex.rxjava3.internal.util.f.f(th2);
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T poll = this.queue.poll();
            long j = this.produced + 1;
            if (j != this.limit) {
                this.produced = j;
                return poll;
            }
            this.produced = 0L;
            get().request(j);
            return poll;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.queue.offer(t)) {
                d();
            } else {
                SubscriptionHelper.a(this);
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            long j = this.batchSize;
            if (SubscriptionHelper.d(this, jxm0Var)) {
                jxm0Var.request(j);
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException(SignalingProtocol.KEY_REMOVE);
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubscriptionHelper.a(this);
            d();
        }
    }

    public b(t tVar) {
        this.b = tVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        a aVar = new a();
        this.b.subscribe((io.reactivex.rxjava3.core.j) aVar);
        return aVar;
    }
}
