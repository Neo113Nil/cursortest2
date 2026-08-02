package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;

/* compiled from: FlowableSubscribeOn.java */
/* loaded from: classes11.dex */
public final class v0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final io.reactivex.rxjava3.core.w d;
    public final boolean e;

    /* compiled from: FlowableSubscribeOn.java */
    public static final class a<T> extends AtomicReference<Thread> implements io.reactivex.rxjava3.core.j<T>, jxm0, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final axm0<? super T> downstream;
        final boolean nonScheduledRequests;
        ffe0<T> source;
        final w.c worker;
        final AtomicReference<jxm0> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        /* compiled from: FlowableSubscribeOn.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v0$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class RunnableC2123a implements Runnable {
            public final jxm0 b;
            public final long c;

            public RunnableC2123a(long j, jxm0 jxm0Var) {
                this.b = jxm0Var;
                this.c = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.request(this.c);
            }
        }

        public a(axm0<? super T> axm0Var, w.c cVar, ffe0<T> ffe0Var, boolean z) {
            this.downstream = axm0Var;
            this.worker = cVar;
            this.source = ffe0Var;
            this.nonScheduledRequests = !z;
        }

        public final void a(long j, jxm0 jxm0Var) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                jxm0Var.request(j);
            } else {
                this.worker.a(new RunnableC2123a(j, jxm0Var));
            }
        }

        @Override // xsna.jxm0
        public final void cancel() {
            SubscriptionHelper.a(this.upstream);
            this.worker.dispose();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.d(this.upstream, jxm0Var)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, jxm0Var);
                }
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                jxm0 jxm0Var = this.upstream.get();
                if (jxm0Var != null) {
                    a(j, jxm0Var);
                    return;
                }
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                jxm0 jxm0Var2 = this.upstream.get();
                if (jxm0Var2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, jxm0Var2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            ffe0<T> ffe0Var = this.source;
            this.source = null;
            ffe0Var.subscribe(this);
        }
    }

    public v0(io.reactivex.rxjava3.core.g<T> gVar, io.reactivex.rxjava3.core.w wVar, boolean z) {
        super(gVar);
        this.d = wVar;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        w.c a2 = this.d.a();
        a aVar = new a(axm0Var, a2, this.c, this.e);
        axm0Var.onSubscribe(aVar);
        a2.a(aVar);
    }
}
