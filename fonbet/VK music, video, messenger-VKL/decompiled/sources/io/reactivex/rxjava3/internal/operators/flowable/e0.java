package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableOnBackpressureBuffer.java */
/* loaded from: classes8.dex */
public final class e0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final int d;
    public final boolean e;
    public final a.k f;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    public static final class a<T> extends BasicIntQueueSubscription<T> implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        volatile boolean done;
        final axm0<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.functions.a onOverflow;
        boolean outputFused;
        final io.reactivex.rxjava3.internal.fuseable.k<T> queue;
        jxm0 upstream;
        final AtomicLong requested = new AtomicLong();
        final boolean delayError = false;

        public a(axm0 axm0Var, int i, boolean z, a.k kVar) {
            this.downstream = axm0Var;
            this.onOverflow = kVar;
            this.queue = z ? new io.reactivex.rxjava3.internal.queue.b<>(i) : new SpscArrayQueue<>(i);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            this.outputFused = true;
            return 2;
        }

        public final boolean b(boolean z, boolean z2, axm0<? super T> axm0Var) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    axm0Var.onError(th);
                } else {
                    axm0Var.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                axm0Var.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            axm0Var.onComplete();
            return true;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.queue.clear();
        }

        public final void d() {
            if (getAndIncrement() == 0) {
                io.reactivex.rxjava3.internal.fuseable.k<T> kVar = this.queue;
                axm0<? super T> axm0Var = this.downstream;
                int i = 1;
                while (!b(this.done, kVar.isEmpty(), axm0Var)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        T poll = kVar.poll();
                        boolean z2 = poll == null;
                        if (b(z, z2, axm0Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        axm0Var.onNext(poll);
                        j2++;
                    }
                    if (j2 == j && b(this.done, kVar.isEmpty(), axm0Var)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                d();
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                d();
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.queue.offer(t)) {
                if (this.outputFused) {
                    this.downstream.onNext(null);
                    return;
                } else {
                    d();
                    return;
                }
            }
            this.upstream.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.onOverflow.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
                jxm0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            return this.queue.poll();
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (this.outputFused || !SubscriptionHelper.e(j)) {
                return;
            }
            io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
            d();
        }
    }

    public e0(z zVar, int i) {
        super(zVar);
        this.d = i;
        this.e = true;
        this.f = io.reactivex.rxjava3.internal.functions.a.c;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d, this.e, this.f));
    }
}
