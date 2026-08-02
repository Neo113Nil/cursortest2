package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import xsna.axm0;

/* compiled from: FlowableFromFuture.java */
/* loaded from: classes8.dex */
public final class x<T> extends io.reactivex.rxjava3.core.g<T> {
    public final Future<? extends T> c;

    public x(Future future) {
        this.c = future;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        Future<? extends T> future = this.c;
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(axm0Var);
        axm0Var.onSubscribe(deferredScalarSubscription);
        try {
            T t = future.get();
            if (t == null) {
                axm0Var.onError(io.reactivex.rxjava3.internal.util.f.b("The future returned a null value."));
            } else {
                deferredScalarSubscription.b(t);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            if (deferredScalarSubscription.get() == 4) {
                return;
            }
            axm0Var.onError(th);
        }
    }
}
