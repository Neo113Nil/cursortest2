package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: ObservableNever.java */
/* loaded from: classes8.dex */
public final class l1 extends io.reactivex.rxjava3.core.q<Object> {
    public static final l1 b = new l1();

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Object> vVar) {
        vVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
