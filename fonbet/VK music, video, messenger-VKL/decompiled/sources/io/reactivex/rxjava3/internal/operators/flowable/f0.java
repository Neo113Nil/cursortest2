package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableOnBackpressureBufferStrategy.java */
/* loaded from: classes8.dex */
public final class f0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final long d;
    public final io.reactivex.rxjava3.functions.a e;
    public final BackpressureOverflowStrategy f;

    /* compiled from: FlowableOnBackpressureBufferStrategy.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            a = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: FlowableOnBackpressureBufferStrategy.java */
    public static final class b<T> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final axm0<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.functions.a onOverflow;
        final BackpressureOverflowStrategy strategy;
        jxm0 upstream;
        final AtomicLong requested = new AtomicLong();
        final Deque<T> deque = new ArrayDeque();

        public b(axm0<? super T> axm0Var, io.reactivex.rxjava3.functions.a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.downstream = axm0Var;
            this.onOverflow = aVar;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j;
        }

        public static void a(Deque deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                a(this.deque);
            }
        }

        public final void d() {
            boolean isEmpty;
            T poll;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.deque;
            axm0<? super T> axm0Var = this.downstream;
            int i = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        a(deque);
                        return;
                    }
                    boolean z = this.done;
                    synchronized (deque) {
                        poll = deque.poll();
                    }
                    boolean z2 = poll == null;
                    if (z) {
                        Throwable th = this.error;
                        if (th != null) {
                            a(deque);
                            axm0Var.onError(th);
                            return;
                        } else if (z2) {
                            axm0Var.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    axm0Var.onNext(poll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        a(deque);
                        return;
                    }
                    boolean z3 = this.done;
                    synchronized (deque) {
                        isEmpty = deque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            a(deque);
                            axm0Var.onError(th2);
                            return;
                        } else if (isEmpty) {
                            axm0Var.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    io.reactivex.rxjava3.internal.util.b.d(this.requested, j2);
                }
                i = addAndGet(-i);
            } while (i != 0);
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            boolean z;
            boolean z2;
            if (this.done) {
                return;
            }
            Deque<T> deque = this.deque;
            synchronized (deque) {
                try {
                    z = false;
                    if (deque.size() == this.bufferSize) {
                        int i = a.a[this.strategy.ordinal()];
                        z2 = true;
                        if (i == 1) {
                            deque.pollLast();
                            deque.offer(t);
                        } else if (i == 2) {
                            deque.poll();
                            deque.offer(t);
                        }
                        z2 = false;
                        z = true;
                    } else {
                        deque.offer(t);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                if (!z2) {
                    d();
                    return;
                } else {
                    this.upstream.cancel();
                    onError(new MissingBackpressureException());
                    return;
                }
            }
            io.reactivex.rxjava3.functions.a aVar = this.onOverflow;
            if (aVar != null) {
                try {
                    aVar.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
                jxm0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                d();
            }
        }
    }

    public f0(io.reactivex.rxjava3.core.g<T> gVar, long j, io.reactivex.rxjava3.functions.a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(gVar);
        this.d = j;
        this.e = aVar;
        this.f = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new b(axm0Var, this.e, this.f, this.d));
    }
}
