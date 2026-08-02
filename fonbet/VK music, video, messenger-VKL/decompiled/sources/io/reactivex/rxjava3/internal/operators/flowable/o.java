package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import xsna.jxm0;

/* compiled from: FlowableElementAtMaybe.java */
/* loaded from: classes8.dex */
public final class o<T> extends io.reactivex.rxjava3.core.k<T> implements io.reactivex.rxjava3.internal.fuseable.d<T> {
    public final r b;

    /* compiled from: FlowableElementAtMaybe.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.j<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public jxm0 c;
        public long d;
        public boolean e;

        public a(io.reactivex.rxjava3.core.m mVar) {
            this.b = mVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.c.cancel();
            this.c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c == SubscriptionHelper.CANCELLED;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.c = SubscriptionHelper.CANCELLED;
            if (this.e) {
                return;
            }
            this.e = true;
            this.b.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.e) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.e = true;
            this.c = SubscriptionHelper.CANCELLED;
            this.b.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            long j = this.d;
            if (j != 0) {
                this.d = j + 1;
                return;
            }
            this.e = true;
            this.c.cancel();
            this.c = SubscriptionHelper.CANCELLED;
            this.b.onSuccess(t);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.c, jxm0Var)) {
                this.c = jxm0Var;
                this.b.onSubscribe(this);
                jxm0Var.request(1L);
            }
        }
    }

    public o(r rVar) {
        this.b = rVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public final io.reactivex.rxjava3.core.g<T> a() {
        return new n(this.b);
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe((io.reactivex.rxjava3.core.j) new a(mVar));
    }
}
