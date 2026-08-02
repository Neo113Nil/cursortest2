package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableOnBackpressureDrop.java */
/* loaded from: classes8.dex */
public final class g0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> implements io.reactivex.rxjava3.functions.f<T> {
    public final g0 d;

    /* compiled from: FlowableOnBackpressureDrop.java */
    public static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final axm0<? super T> downstream;
        final io.reactivex.rxjava3.functions.f<? super T> onDrop;
        jxm0 upstream;

        public a(axm0 axm0Var, g0 g0Var) {
            this.downstream = axm0Var;
            this.onDrop = g0Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (get() != 0) {
                this.downstream.onNext(t);
                io.reactivex.rxjava3.internal.util.b.d(this, 1L);
                return;
            }
            try {
                this.onDrop.accept(t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                cancel();
                onError(th);
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
                io.reactivex.rxjava3.internal.util.b.a(this, j);
            }
        }
    }

    public g0(io.reactivex.rxjava3.core.g<T> gVar) {
        super(gVar);
        this.d = this;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d));
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(T t) {
    }
}
