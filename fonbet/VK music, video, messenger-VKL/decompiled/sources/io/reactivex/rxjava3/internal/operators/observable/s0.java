package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.f;
import java.util.concurrent.Callable;

/* compiled from: ObservableFromCallable.java */
/* loaded from: classes11.dex */
public final class s0<T> extends io.reactivex.rxjava3.core.q<T> implements io.reactivex.rxjava3.functions.n<T> {
    public final Callable<? extends T> b;

    public s0(Callable<? extends T> callable) {
        this.b = callable;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final T get() throws Throwable {
        T call = this.b.call();
        if (call == null) {
            throw io.reactivex.rxjava3.internal.util.f.b("The Callable returned a null value.");
        }
        f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
        return call;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(vVar);
        vVar.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.h()) {
            return;
        }
        try {
            T call = this.b.call();
            if (call == null) {
                throw io.reactivex.rxjava3.internal.util.f.b("Callable returned a null value.");
            }
            f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
            deferredScalarDisposable.b(call);
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
