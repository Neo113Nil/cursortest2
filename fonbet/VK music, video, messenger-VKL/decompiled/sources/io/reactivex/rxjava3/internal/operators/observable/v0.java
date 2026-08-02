package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: ObservableFromPublisher.java */
/* loaded from: classes8.dex */
public final class v0<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.core.g b;

    /* compiled from: ObservableFromPublisher.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.j<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public jxm0 c;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.b = vVar;
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
        public final void onNext(T t) {
            this.b.onNext(t);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.c, jxm0Var)) {
                this.c = jxm0Var;
                this.b.onSubscribe(this);
                jxm0Var.request(Long.MAX_VALUE);
            }
        }
    }

    public v0(io.reactivex.rxjava3.core.g gVar) {
        this.b = gVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe((axm0) new a(vVar));
    }
}
