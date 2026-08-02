package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.f;

/* compiled from: ObservableFromSupplier.java */
/* loaded from: classes8.dex */
public final class w0<T> extends io.reactivex.rxjava3.core.q<T> implements io.reactivex.rxjava3.functions.n<T> {
    public final io.reactivex.rxjava3.functions.n<? extends T> b;

    public w0(io.reactivex.rxjava3.functions.n<? extends T> nVar) {
        this.b = nVar;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final T get() throws Throwable {
        T t = this.b.get();
        if (t == null) {
            throw io.reactivex.rxjava3.internal.util.f.b("The supplier returned a null value.");
        }
        f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
        return t;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(vVar);
        vVar.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.h()) {
            return;
        }
        try {
            T t = this.b.get();
            if (t == null) {
                throw io.reactivex.rxjava3.internal.util.f.b("Supplier returned a null value.");
            }
            f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
            deferredScalarDisposable.b(t);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            if (deferredScalarDisposable.h()) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                vVar.onError(th);
            }
        }
    }
}
