package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import xsna.axm0;
import xsna.jxm0;
import xsna.m40;

/* compiled from: FlowableTakeWhile.java */
/* loaded from: classes8.dex */
public final class z0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final m40 d;

    /* compiled from: FlowableTakeWhile.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        public final axm0<? super T> b;
        public final io.reactivex.rxjava3.functions.m<? super T> c;
        public jxm0 d;
        public boolean e;

        public a(axm0 axm0Var, m40 m40Var) {
            this.b = axm0Var;
            this.c = m40Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.d.cancel();
        }

        @Override // xsna.axm0
        public final void onComplete() {
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
            } else {
                this.e = true;
                this.b.onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            try {
                boolean test = this.c.test(t);
                axm0<? super T> axm0Var = this.b;
                if (test) {
                    axm0Var.onNext(t);
                    return;
                }
                this.e = true;
                this.d.cancel();
                axm0Var.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.d.cancel();
                onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.d, jxm0Var)) {
                this.d = jxm0Var;
                this.b.onSubscribe(this);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            this.d.request(j);
        }
    }

    public z0(f0 f0Var, m40 m40Var) {
        super(f0Var);
        this.d = m40Var;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d));
    }
}
