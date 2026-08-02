package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;

/* compiled from: FlowableRepeatWhen.java */
/* loaded from: classes8.dex */
public final class p0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final io.reactivex.rxjava3.functions.l<? super io.reactivex.rxjava3.core.g<Object>, ? extends ffe0<?>> d;

    /* compiled from: FlowableRepeatWhen.java */
    public static final class a<T> extends c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        @Override // xsna.axm0
        public final void onComplete() {
            k(0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.p0.c, xsna.axm0
        public final void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }
    }

    /* compiled from: FlowableRepeatWhen.java */
    public static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.j<Object>, jxm0 {
        private static final long serialVersionUID = 2827772011130406689L;
        final ffe0<T> source;
        c<T, U> subscriber;
        final AtomicReference<jxm0> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public b(ffe0<T> ffe0Var) {
            this.source = ffe0Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            SubscriptionHelper.a(this.upstream);
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            SubscriptionHelper.c(this.upstream, this.requested, jxm0Var);
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            SubscriptionHelper.b(this.upstream, this.requested, j);
        }
    }

    /* compiled from: FlowableRepeatWhen.java */
    public static abstract class c<T, U> extends SubscriptionArbiter implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final axm0<? super T> downstream;
        protected final io.reactivex.rxjava3.processors.a<U> processor;
        private long produced;
        protected final jxm0 receiver;

        public c(io.reactivex.rxjava3.subscribers.a aVar, io.reactivex.rxjava3.processors.d dVar, b bVar) {
            this.downstream = aVar;
            this.processor = dVar;
            this.receiver = bVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, xsna.jxm0
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        public final void k(Serializable serializable) {
            j(EmptySubscription.INSTANCE);
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                i(j);
            }
            this.receiver.request(1L);
            this.processor.onNext(serializable);
        }

        public void onError(Throwable th) {
            k(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }
    }

    public p0(io.reactivex.rxjava3.core.g<T> gVar, io.reactivex.rxjava3.functions.l<? super io.reactivex.rxjava3.core.g<Object>, ? extends ffe0<?>> lVar) {
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
            b bVar = new b(this.c);
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
