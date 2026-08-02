package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.operators.flowable.r0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: CompletableFromPublisher.java */
/* loaded from: classes8.dex */
public final class n<T> extends io.reactivex.rxjava3.core.a {
    public final r0 b;

    public n(r0 r0Var) {
        this.b = r0Var;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe((axm0) new a(cVar));
    }

    /* compiled from: CompletableFromPublisher.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.j<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.c b;
        public jxm0 c;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.b = cVar;
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
            this.b.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.c, jxm0Var)) {
                this.c = jxm0Var;
                this.b.onSubscribe(this);
                jxm0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
        }
    }
}
