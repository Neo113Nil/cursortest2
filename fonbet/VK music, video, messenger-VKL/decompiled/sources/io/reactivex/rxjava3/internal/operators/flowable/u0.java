package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import xsna.jxm0;

/* compiled from: FlowableSingleSingle.java */
/* loaded from: classes8.dex */
public final class u0<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.d<T> {
    public final io.reactivex.rxjava3.core.g<T> b;

    /* compiled from: FlowableSingleSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.j<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super T> b;
        public jxm0 c;
        public boolean d;
        public T e;

        public a(io.reactivex.rxjava3.core.z zVar) {
            this.b = zVar;
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
            if (this.d) {
                return;
            }
            this.d = true;
            this.c = SubscriptionHelper.CANCELLED;
            T t = this.e;
            this.e = null;
            if (t == null) {
                t = null;
            }
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            if (t != null) {
                zVar.onSuccess(t);
            } else {
                zVar.onError(new NoSuchElementException());
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.d) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.d = true;
            this.c = SubscriptionHelper.CANCELLED;
            this.b.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            if (this.e == null) {
                this.e = t;
                return;
            }
            this.d = true;
            this.c.cancel();
            this.c = SubscriptionHelper.CANCELLED;
            this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
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

    public u0(io.reactivex.rxjava3.core.g gVar) {
        this.b = gVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public final io.reactivex.rxjava3.core.g<T> a() {
        return new t0(this.b);
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe((io.reactivex.rxjava3.core.j) new a(zVar));
    }
}
