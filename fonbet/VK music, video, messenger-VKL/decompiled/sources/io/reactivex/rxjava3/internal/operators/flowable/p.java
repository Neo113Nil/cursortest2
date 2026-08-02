package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import xsna.axm0;

/* compiled from: FlowableEmpty.java */
/* loaded from: classes8.dex */
public final class p extends io.reactivex.rxjava3.core.g<Object> implements io.reactivex.rxjava3.internal.fuseable.j<Object> {
    public static final p c = new p();

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super Object> axm0Var) {
        axm0Var.onSubscribe(EmptySubscription.INSTANCE);
        axm0Var.onComplete();
    }
}
