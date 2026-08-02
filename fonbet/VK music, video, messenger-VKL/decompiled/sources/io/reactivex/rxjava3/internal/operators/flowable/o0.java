package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;

/* compiled from: FlowableRepeat.java */
/* loaded from: classes8.dex */
public final class o0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final long d;

    /* compiled from: FlowableRepeat.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final axm0<? super T> downstream;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final ffe0<? extends T> source;

        public a(axm0<? super T> axm0Var, long j, SubscriptionArbiter subscriptionArbiter, ffe0<? extends T> ffe0Var) {
            this.downstream = axm0Var;
            this.sa = subscriptionArbiter;
            this.source = ffe0Var;
            this.remaining = j;
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
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                d();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.downstream.onError(th);
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

    public o0(io.reactivex.rxjava3.core.g gVar) {
        super(gVar);
        this.d = Long.MAX_VALUE;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter();
        axm0Var.onSubscribe(subscriptionArbiter);
        long j = this.d;
        new a(axm0Var, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, subscriptionArbiter, this.c).d();
    }
}
