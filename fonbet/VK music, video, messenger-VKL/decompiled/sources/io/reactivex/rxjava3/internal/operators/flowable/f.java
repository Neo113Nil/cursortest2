package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import xsna.iu4;
import xsna.jxm0;

/* compiled from: FlowableCollectSingle.java */
/* loaded from: classes8.dex */
public final class f<T, U> extends io.reactivex.rxjava3.core.x<U> implements io.reactivex.rxjava3.internal.fuseable.d<U> {
    public final d0 b;
    public final a.r c;
    public final iu4 d;

    /* compiled from: FlowableCollectSingle.java */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.j<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super U> b;
        public final io.reactivex.rxjava3.functions.b<? super U, ? super T> c;
        public final U d;
        public jxm0 e;
        public boolean f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.core.z zVar, Object obj, iu4 iu4Var) {
            this.b = zVar;
            this.c = iu4Var;
            this.d = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e.cancel();
            this.e = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e == SubscriptionHelper.CANCELLED;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e = SubscriptionHelper.CANCELLED;
            this.b.onSuccess(this.d);
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.f) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.f = true;
            this.e = SubscriptionHelper.CANCELLED;
            this.b.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            try {
                this.c.accept(this.d, t);
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

    public f(d0 d0Var, a.r rVar, iu4 iu4Var) {
        this.b = d0Var;
        this.c = rVar;
        this.d = iu4Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public final io.reactivex.rxjava3.core.g<U> a() {
        return new e(this.b, this.c, this.d);
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super U> zVar) {
        try {
            U u = this.c.b;
            Objects.requireNonNull(u, "The initialSupplier returned a null value");
            this.b.subscribe((io.reactivex.rxjava3.core.j) new a(zVar, u, this.d));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            zVar.onSubscribe(EmptyDisposable.INSTANCE);
            zVar.onError(th);
        }
    }
}
