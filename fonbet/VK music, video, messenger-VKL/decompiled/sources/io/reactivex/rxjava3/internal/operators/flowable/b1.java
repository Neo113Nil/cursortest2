package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableThrottleLatest.java */
/* loaded from: classes8.dex */
public final class b1<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final long d;
    public final TimeUnit e;
    public final io.reactivex.rxjava3.core.w f;

    /* compiled from: FlowableThrottleLatest.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final axm0<? super T> downstream;
        long emitted;
        Throwable error;
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        jxm0 upstream;
        final w.c worker;
        final boolean emitLast = false;
        final AtomicReference<T> latest = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public a(axm0 axm0Var, long j, TimeUnit timeUnit, w.c cVar) {
            this.downstream = axm0Var;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            AtomicLong atomicLong = this.requested;
            axm0<? super T> axm0Var = this.downstream;
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                if (z && this.error != null) {
                    atomicReference.lazySet(null);
                    axm0Var.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    if (z2 || !this.emitLast) {
                        atomicReference.lazySet(null);
                        axm0Var.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j = this.emitted;
                        if (j != atomicLong.get()) {
                            this.emitted = j + 1;
                            axm0Var.onNext(andSet);
                            axm0Var.onComplete();
                        } else {
                            axm0Var.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.worker.dispose();
                    return;
                }
                if (z2) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j2 = this.emitted;
                    if (j2 == atomicLong.get()) {
                        this.upstream.cancel();
                        axm0Var.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.worker.dispose();
                        return;
                    } else {
                        axm0Var.onNext(andSet2);
                        this.emitted = j2 + 1;
                        this.timerFired = false;
                        this.timerRunning = true;
                        this.worker.b(this, this.timeout, this.unit);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
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
            this.latest.set(t);
            d();
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
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.timerFired = true;
            d();
        }
    }

    public b1(io.reactivex.rxjava3.core.g gVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        super(gVar);
        this.d = j;
        this.e = timeUnit;
        this.f = wVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d, this.e, this.f.a()));
    }
}
