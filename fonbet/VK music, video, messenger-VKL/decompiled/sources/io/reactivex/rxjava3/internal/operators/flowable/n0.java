package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import xsna.jxm0;
import xsna.uq;

/* compiled from: FlowableReduceMaybe.java */
/* loaded from: classes8.dex */
public final class n0<T> extends io.reactivex.rxjava3.core.k<T> implements io.reactivex.rxjava3.internal.fuseable.d<T> {
    public final io.reactivex.rxjava3.internal.operators.mixed.c b;
    public final uq c;

    /* compiled from: FlowableReduceMaybe.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.j<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public final io.reactivex.rxjava3.functions.c<T, T, T> c;
        public T d;
        public jxm0 e;
        public boolean f;

        public a(io.reactivex.rxjava3.core.m mVar, uq uqVar) {
            this.b = mVar;
            this.c = uqVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e.cancel();
            this.f = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.f;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            T t = this.d;
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            if (t != null) {
                mVar.onSuccess(t);
            } else {
                mVar.onComplete();
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.f) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.f = true;
                this.b.onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            T t2 = this.d;
            if (t2 == null) {
                this.d = t;
                return;
            }
            try {
                T apply = this.c.apply(t2, t);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.d = apply;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.e.cancel();
                onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.e, jxm0Var)) {
                this.e = jxm0Var;
                this.b.onSubscribe(this);
                jxm0Var.request(Long.MAX_VALUE);
            }
        }
    }

    public n0(io.reactivex.rxjava3.internal.operators.mixed.c cVar, uq uqVar) {
        this.b = cVar;
        this.c = uqVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public final io.reactivex.rxjava3.core.g<T> a() {
        return new m0(this.b, this.c);
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe((io.reactivex.rxjava3.core.j) new a(mVar, this.c));
    }
}
