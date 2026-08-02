package io.reactivex.rxjava3.internal.operators.completable;

import xsna.axm0;

/* compiled from: CompletableToFlowable.java */
/* loaded from: classes8.dex */
public final class b0<T> extends io.reactivex.rxjava3.core.g<T> {
    public final io.reactivex.rxjava3.core.a c;

    public b0(io.reactivex.rxjava3.core.a aVar) {
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe(new io.reactivex.rxjava3.internal.operators.flowable.w(axm0Var));
    }
}
