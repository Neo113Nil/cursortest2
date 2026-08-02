package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: SingleNever.java */
/* loaded from: classes8.dex */
public final class a0 extends io.reactivex.rxjava3.core.x<Object> {
    public static final a0 b = new a0();

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super Object> zVar) {
        zVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
