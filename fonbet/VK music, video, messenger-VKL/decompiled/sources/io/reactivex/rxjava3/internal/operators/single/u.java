package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;
import xsna.n5j0;

/* compiled from: SingleFlatMapPublisher.java */
/* loaded from: classes8.dex */
public final class u<T, R> extends io.reactivex.rxjava3.core.g<R> {
    public final f0 c;
    public final n5j0 d;

    public u(f0 f0Var, n5j0 n5j0Var) {
        this.c = f0Var;
        this.d = n5j0Var;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        this.c.subscribe(new a(axm0Var, this.d));
    }

    /* compiled from: SingleFlatMapPublisher.java */
    public static final class a<S, T> extends AtomicLong implements io.reactivex.rxjava3.core.z<S>, io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = 7759721921468635667L;
        io.reactivex.rxjava3.disposables.c disposable;
        final axm0<? super T> downstream;
        final io.reactivex.rxjava3.functions.l<? super S, ? extends ffe0<? extends T>> mapper;
        final AtomicReference<jxm0> parent = new AtomicReference<>();

        public a(axm0 axm0Var, n5j0 n5j0Var) {
            this.downstream = axm0Var;
            this.mapper = n5j0Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.a(this.parent);
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.disposable = cVar;
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(S s) {
            try {
                ffe0<? extends T> apply = this.mapper.apply(s);
                Objects.requireNonNull(apply, "the mapper returned a null Publisher");
                ffe0<? extends T> ffe0Var = apply;
                if (this.parent.get() != SubscriptionHelper.CANCELLED) {
                    ffe0Var.subscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            SubscriptionHelper.b(this.parent, this, j);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            SubscriptionHelper.c(this.parent, this, jxm0Var);
        }
    }
}
