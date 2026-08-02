package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import xsna.axm0;
import xsna.jxm0;
import xsna.uq;

/* compiled from: FlowableReduce.java */
/* loaded from: classes8.dex */
public final class m0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final io.reactivex.rxjava3.functions.c<T, T, T> d;

    /* compiled from: FlowableReduce.java */
    public static final class a<T> extends DeferredScalarSubscription<T> implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -4663883003264602070L;
        final io.reactivex.rxjava3.functions.c<T, T, T> reducer;
        jxm0 upstream;

        public a(axm0<? super T> axm0Var, io.reactivex.rxjava3.functions.c<T, T, T> cVar) {
            super(axm0Var);
            this.reducer = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, xsna.jxm0
        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            jxm0 jxm0Var = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (jxm0Var == subscriptionHelper) {
                return;
            }
            this.upstream = subscriptionHelper;
            T t = this.value;
            if (t != null) {
                b(t);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            jxm0 jxm0Var = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (jxm0Var == subscriptionHelper) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.upstream = subscriptionHelper;
                this.downstream.onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.upstream == SubscriptionHelper.CANCELLED) {
                return;
            }
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                T apply = this.reducer.apply(t2, t);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.value = apply;
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

    public m0(io.reactivex.rxjava3.internal.operators.mixed.c cVar, uq uqVar) {
        super(cVar);
        this.d = uqVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d));
    }
}
