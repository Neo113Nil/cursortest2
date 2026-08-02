package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.operators.observable.a2;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableInternalHelper.java */
/* loaded from: classes8.dex */
public final class c1<T> implements io.reactivex.rxjava3.functions.n<io.reactivex.rxjava3.observables.a<T>> {
    public final io.reactivex.rxjava3.core.q<T> b;

    public c1(io.reactivex.rxjava3.core.q<T> qVar) {
        this.b = qVar;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() throws Throwable {
        io.reactivex.rxjava3.core.q<T> qVar = this.b;
        qVar.getClass();
        AtomicReference atomicReference = new AtomicReference();
        a2.l lVar = a2.f;
        return new a2(new a2.j(atomicReference, lVar), qVar, atomicReference, lVar);
    }
}
