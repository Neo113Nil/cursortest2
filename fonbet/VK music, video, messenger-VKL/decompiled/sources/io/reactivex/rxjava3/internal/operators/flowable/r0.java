package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.p0;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.Objects;
import xsna.axm0;
import xsna.ffe0;

/* compiled from: FlowableRetryWhen.java */
/* loaded from: classes8.dex */
public final class r0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final io.reactivex.rxjava3.functions.l<? super io.reactivex.rxjava3.core.g<Throwable>, ? extends ffe0<?>> d;

    /* compiled from: FlowableRetryWhen.java */
    public static final class a<T> extends p0.c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        @Override // xsna.axm0
        public final void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }
    }

    public r0(io.reactivex.rxjava3.core.g<T> gVar, io.reactivex.rxjava3.functions.l<? super io.reactivex.rxjava3.core.g<Throwable>, ? extends ffe0<?>> lVar) {
        super(gVar);
        this.d = lVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        io.reactivex.rxjava3.subscribers.a aVar = new io.reactivex.rxjava3.subscribers.a(axm0Var);
        io.reactivex.rxjava3.internal.functions.b.a(8, "capacityHint");
        io.reactivex.rxjava3.processors.d dVar = new io.reactivex.rxjava3.processors.d(new io.reactivex.rxjava3.processors.e());
        try {
            ffe0<?> apply = this.d.apply(dVar);
            Objects.requireNonNull(apply, "handler returned a null Publisher");
            ffe0<?> ffe0Var = apply;
            p0.b bVar = new p0.b(this.c);
            a aVar2 = new a(aVar, dVar, bVar);
            bVar.subscriber = aVar2;
            axm0Var.onSubscribe(aVar2);
            ffe0Var.subscribe(bVar);
            bVar.onNext(0);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            axm0Var.onSubscribe(EmptySubscription.INSTANCE);
            axm0Var.onError(th);
        }
    }
}
