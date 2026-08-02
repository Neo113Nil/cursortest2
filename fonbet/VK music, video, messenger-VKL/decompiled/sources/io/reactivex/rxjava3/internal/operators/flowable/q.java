package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.util.f;
import xsna.axm0;

/* compiled from: FlowableError.java */
/* loaded from: classes8.dex */
public final class q<T> extends io.reactivex.rxjava3.core.g<T> {
    public final a.r c;

    public q(a.r rVar) {
        this.c = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        U u;
        try {
            u = this.c.b;
        } catch (Throwable th) {
            th = th;
            io.reactivex.rxjava3.exceptions.a.b(th);
        }
        if (u == 0) {
            throw io.reactivex.rxjava3.internal.util.f.b("Callable returned a null Throwable.");
        }
        f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
        th = (Throwable) u;
        axm0Var.onSubscribe(EmptySubscription.INSTANCE);
        axm0Var.onError(th);
    }
}
