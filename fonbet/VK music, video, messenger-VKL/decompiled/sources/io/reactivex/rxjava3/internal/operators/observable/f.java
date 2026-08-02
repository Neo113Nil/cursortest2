package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableAutoConnect.java */
/* loaded from: classes8.dex */
public final class f<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.observables.a<? extends T> b;
    public final int c;
    public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> d;
    public final AtomicInteger e = new AtomicInteger();

    public f(io.reactivex.rxjava3.observables.a<? extends T> aVar, int i, io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> fVar) {
        this.b = aVar;
        this.c = i;
        this.d = fVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        io.reactivex.rxjava3.observables.a<? extends T> aVar = this.b;
        aVar.subscribe((io.reactivex.rxjava3.core.v<? super Object>) vVar);
        if (this.e.incrementAndGet() == this.c) {
            aVar.N0(this.d);
        }
    }
}
