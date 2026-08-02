package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import xsna.axm0;
import xsna.iu4;
import xsna.jxm0;

/* compiled from: FlowableCollect.java */
/* loaded from: classes8.dex */
public final class e<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {
    public final io.reactivex.rxjava3.functions.n<? extends U> d;
    public final io.reactivex.rxjava3.functions.b<? super U, ? super T> e;

    /* compiled from: FlowableCollect.java */
    public static final class a<T, U> extends DeferredScalarSubscription<U> implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        final io.reactivex.rxjava3.functions.b<? super U, ? super T> collector;
        boolean done;
        final U u;
        jxm0 upstream;

        public a(axm0<? super U> axm0Var, U u, io.reactivex.rxjava3.functions.b<? super U, ? super T> bVar) {
            super(axm0Var);
            this.collector = bVar;
            this.u = u;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, xsna.jxm0
        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            b(this.u);
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
            try {
                this.collector.accept(this.u, t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.cancel();
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
    }

    public e(d0 d0Var, a.r rVar, iu4 iu4Var) {
        super(d0Var);
        this.d = rVar;
        this.e = iu4Var;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super U> axm0Var) {
        try {
            U u = this.d.get();
            Objects.requireNonNull(u, "The initial value supplied is null");
            this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, u, this.e));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            axm0Var.onSubscribe(EmptySubscription.INSTANCE);
            axm0Var.onError(th);
        }
    }
}
