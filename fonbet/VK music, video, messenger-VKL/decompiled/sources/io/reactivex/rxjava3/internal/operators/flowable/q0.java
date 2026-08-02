package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;

/* compiled from: FlowableRetryBiPredicate.java */
/* loaded from: classes8.dex */
public final class q0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final io.reactivex.rxjava3.functions.d<? super Integer, ? super Throwable> d;

    /* compiled from: FlowableRetryBiPredicate.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final axm0<? super T> downstream;
        final io.reactivex.rxjava3.functions.d<? super Integer, ? super Throwable> predicate;
        long produced;
        int retries;
        final SubscriptionArbiter sa;
        final ffe0<? extends T> source;

        public a(axm0<? super T> axm0Var, io.reactivex.rxjava3.functions.d<? super Integer, ? super Throwable> dVar, SubscriptionArbiter subscriptionArbiter, ffe0<? extends T> ffe0Var) {
            this.downstream = axm0Var;
            this.sa = subscriptionArbiter;
            this.source = ffe0Var;
            this.predicate = dVar;
        }

        public final void d() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sa.g()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.sa.i(j);
                    }
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            try {
                io.reactivex.rxjava3.functions.d<? super Integer, ? super Throwable> dVar = this.predicate;
                int i = this.retries + 1;
                this.retries = i;
                if (dVar.test(Integer.valueOf(i), th)) {
                    d();
                } else {
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            this.sa.j(jxm0Var);
        }
    }

    public q0(io.reactivex.rxjava3.core.g<T> gVar, io.reactivex.rxjava3.functions.d<? super Integer, ? super Throwable> dVar) {
        super(gVar);
        this.d = dVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter();
        axm0Var.onSubscribe(subscriptionArbiter);
        new a(axm0Var, this.d, subscriptionArbiter, this.c).d();
    }
}
