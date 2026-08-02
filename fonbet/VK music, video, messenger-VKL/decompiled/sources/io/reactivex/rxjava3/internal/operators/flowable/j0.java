package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.Objects;
import xsna.axm0;
import xsna.ffe0;

/* compiled from: FlowableOnErrorNext.java */
/* loaded from: classes8.dex */
public final class j0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final defpackage.j0 d;

    /* compiled from: FlowableOnErrorNext.java */
    public static final class a<T> extends SubscriptionArbiter implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        boolean done;
        final axm0<? super T> downstream;
        final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends ffe0<? extends T>> nextSupplier;
        boolean once;
        long produced;

        public a(axm0 axm0Var, defpackage.j0 j0Var) {
            this.downstream = axm0Var;
            this.nextSupplier = j0Var;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.once = true;
            this.downstream.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.once) {
                if (this.done) {
                    io.reactivex.rxjava3.plugins.a.a(th);
                    return;
                } else {
                    this.downstream.onError(th);
                    return;
                }
            }
            this.once = true;
            try {
                ffe0<? extends T> apply = this.nextSupplier.apply(th);
                Objects.requireNonNull(apply, "The nextSupplier returned a null Publisher");
                ffe0<? extends T> ffe0Var = apply;
                long j = this.produced;
                if (j != 0) {
                    i(j);
                }
                ffe0Var.subscribe(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (!this.once) {
                this.produced++;
            }
            this.downstream.onNext(t);
        }
    }

    public j0(io.reactivex.rxjava3.core.g gVar, defpackage.j0 j0Var) {
        super(gVar);
        this.d = j0Var;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        a aVar = new a(axm0Var, this.d);
        axm0Var.onSubscribe(aVar);
        this.c.subscribe((io.reactivex.rxjava3.core.j) aVar);
    }
}
