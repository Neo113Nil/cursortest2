package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableThrottleFirstTimed.java */
/* loaded from: classes8.dex */
public final class a1<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final long d;
    public final TimeUnit e;
    public final io.reactivex.rxjava3.core.w f;

    /* compiled from: FlowableThrottleFirstTimed.java */
    public static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.j<T>, jxm0, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final axm0<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final SequentialDisposable timer = new SequentialDisposable();
        final TimeUnit unit;
        jxm0 upstream;
        final w.c worker;

        public a(io.reactivex.rxjava3.subscribers.a aVar, long j, TimeUnit timeUnit, w.c cVar) {
            this.downstream = aVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done || this.gate) {
                return;
            }
            this.gate = true;
            if (get() == 0) {
                this.done = true;
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return;
            }
            this.downstream.onNext(t);
            io.reactivex.rxjava3.internal.util.b.d(this, 1L);
            io.reactivex.rxjava3.disposables.c cVar = this.timer.get();
            if (cVar != null) {
                cVar.dispose();
            }
            SequentialDisposable sequentialDisposable = this.timer;
            io.reactivex.rxjava3.disposables.c b = this.worker.b(this, this.timeout, this.unit);
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, b);
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
                io.reactivex.rxjava3.internal.util.b.a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.gate = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(io.reactivex.rxjava3.core.g gVar, long j, io.reactivex.rxjava3.core.w wVar) {
        super(gVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.d = j;
        this.e = timeUnit;
        this.f = wVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(new io.reactivex.rxjava3.subscribers.a(axm0Var), this.d, this.e, this.f.a()));
    }
}
