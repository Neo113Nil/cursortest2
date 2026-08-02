package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: MaybeDefer.java */
/* loaded from: classes8.dex */
public final class d<T> extends io.reactivex.rxjava3.core.k<T> {
    public final io.reactivex.rxjava3.functions.n<? extends io.reactivex.rxjava3.core.o<? extends T>> b;

    public d(io.reactivex.rxjava3.functions.n<? extends io.reactivex.rxjava3.core.o<? extends T>> nVar) {
        this.b = nVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        try {
            io.reactivex.rxjava3.core.o<? extends T> oVar = this.b.get();
            Objects.requireNonNull(oVar, "The maybeSupplier returned a null MaybeSource");
            oVar.subscribe(mVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            mVar.onSubscribe(EmptyDisposable.INSTANCE);
            mVar.onError(th);
        }
    }
}
