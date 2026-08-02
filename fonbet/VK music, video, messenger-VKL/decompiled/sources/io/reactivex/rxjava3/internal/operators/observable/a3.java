package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableWindowSubscribeIntercept.java */
/* loaded from: classes8.dex */
public final class a3<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.subjects.k b;
    public final AtomicBoolean c = new AtomicBoolean();

    public a3(io.reactivex.rxjava3.subjects.k kVar) {
        this.b = kVar;
    }

    public final boolean M0() {
        AtomicBoolean atomicBoolean = this.c;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(vVar);
        this.c.set(true);
    }
}
