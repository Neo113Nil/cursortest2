package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.f;
import java.util.concurrent.Future;

/* compiled from: ObservableFromFuture.java */
/* loaded from: classes8.dex */
public final class t0<T> extends io.reactivex.rxjava3.core.q<T> {
    public final Future<? extends T> b;

    public t0(Future future) {
        this.b = future;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        Future<? extends T> future = this.b;
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(vVar);
        vVar.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.h()) {
            return;
        }
        try {
            T t = future.get();
            if (t == null) {
                throw io.reactivex.rxjava3.internal.util.f.b("Future returned a null value.");
            }
            f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
            deferredScalarDisposable.b(t);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            if (deferredScalarDisposable.h()) {
                return;
            }
            vVar.onError(th);
        }
    }
}
