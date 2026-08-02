package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import xsna.axm0;

/* compiled from: FlowableJust.java */
/* loaded from: classes8.dex */
public final class b0<T> extends io.reactivex.rxjava3.core.g<T> implements io.reactivex.rxjava3.internal.fuseable.j<T> {
    public final T c;

    public b0(T t) {
        this.c = t;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final T get() {
        return this.c;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        axm0Var.onSubscribe(new ScalarSubscription(this.c, axm0Var));
    }
}
