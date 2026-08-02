package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableHide.java */
/* loaded from: classes11.dex */
public final class a0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* compiled from: FlowableHide.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        public final axm0<? super T> b;
        public jxm0 c;

        public a(axm0<? super T> axm0Var) {
            this.b = axm0Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.c.cancel();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.b.onNext(t);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.c, jxm0Var)) {
                this.c = jxm0Var;
                this.b.onSubscribe(this);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            this.c.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var));
    }
}
