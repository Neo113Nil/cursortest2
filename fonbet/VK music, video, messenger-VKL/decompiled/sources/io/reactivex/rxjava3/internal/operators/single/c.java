package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: SingleDefer.java */
/* loaded from: classes8.dex */
public final class c<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.functions.n<? extends io.reactivex.rxjava3.core.b0<? extends T>> b;

    public c(io.reactivex.rxjava3.functions.n<? extends io.reactivex.rxjava3.core.b0<? extends T>> nVar) {
        this.b = nVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        try {
            io.reactivex.rxjava3.core.b0<? extends T> b0Var = this.b.get();
            Objects.requireNonNull(b0Var, "The singleSupplier returned a null SingleSource");
            b0Var.subscribe(zVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            zVar.onSubscribe(EmptyDisposable.INSTANCE);
            zVar.onError(th);
        }
    }
}
