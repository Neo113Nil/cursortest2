package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: ObservableEmpty.java */
/* loaded from: classes11.dex */
public final class g0 extends io.reactivex.rxjava3.core.q<Object> implements io.reactivex.rxjava3.internal.fuseable.j<Object> {
    public static final g0 b = new g0();

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Object> vVar) {
        vVar.onSubscribe(EmptyDisposable.INSTANCE);
        vVar.onComplete();
    }
}
