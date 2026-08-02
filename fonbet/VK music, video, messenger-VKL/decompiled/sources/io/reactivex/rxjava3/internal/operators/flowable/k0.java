package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import xsna.axm0;

/* compiled from: FlowableOnErrorReturn.java */
/* loaded from: classes8.dex */
public final class k0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final a.r d;

    /* compiled from: FlowableOnErrorReturn.java */
    public static final class a<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends T> valueSupplier;

        public a(axm0 axm0Var, a.r rVar) {
            super(axm0Var);
            this.valueSupplier = rVar;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            try {
                T apply = this.valueSupplier.apply(th);
                Objects.requireNonNull(apply, "The valueSupplier returned a null value");
                a(apply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }
    }

    public k0(io.reactivex.rxjava3.internal.operators.mixed.c cVar, a.r rVar) {
        super(cVar);
        this.d = rVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d));
    }
}
