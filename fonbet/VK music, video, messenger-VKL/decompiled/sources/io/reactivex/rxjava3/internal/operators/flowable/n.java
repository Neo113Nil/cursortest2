package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableElementAt.java */
/* loaded from: classes8.dex */
public final class n<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* compiled from: FlowableElementAt.java */
    public static final class a<T> extends DeferredScalarSubscription<T> implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;
        jxm0 upstream;

        public a(axm0 axm0Var) {
            super(axm0Var);
            this.index = 0L;
            this.defaultValue = null;
            this.errorOnFewer = false;
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
            T t = this.defaultValue;
            if (t != null) {
                b(t);
            } else if (this.errorOnFewer) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
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
            long j = this.count;
            if (j != this.index) {
                this.count = j + 1;
                return;
            }
            this.done = true;
            this.upstream.cancel();
            b(t);
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

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var));
    }
}
