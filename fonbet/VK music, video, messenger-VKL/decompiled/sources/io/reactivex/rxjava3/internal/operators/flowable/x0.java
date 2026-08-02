package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableTake.java */
/* loaded from: classes8.dex */
public final class x0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final long d;

    /* compiled from: FlowableTake.java */
    public static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = 2288246011222124525L;
        final axm0<? super T> downstream;
        long remaining;
        jxm0 upstream;

        public a(axm0<? super T> axm0Var, long j) {
            this.downstream = axm0Var;
            this.remaining = j;
            lazySet(j);
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.remaining <= 0) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.remaining = 0L;
                this.downstream.onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            long j = this.remaining;
            if (j > 0) {
                long j2 = j - 1;
                this.remaining = j2;
                this.downstream.onNext(t);
                if (j2 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                if (this.remaining == 0) {
                    jxm0Var.cancel();
                    EmptySubscription.b(this.downstream);
                } else {
                    this.upstream = jxm0Var;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            long j2;
            long min;
            if (SubscriptionHelper.e(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        min = Math.min(j2, j);
                    }
                } while (!compareAndSet(j2, j2 - min));
                this.upstream.request(min);
            }
        }
    }

    public x0(io.reactivex.rxjava3.core.g<T> gVar, long j) {
        super(gVar);
        this.d = j;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d));
    }
}
