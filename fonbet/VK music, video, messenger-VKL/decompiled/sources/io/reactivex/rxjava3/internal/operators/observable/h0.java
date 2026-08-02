package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.util.f;

/* compiled from: ObservableError.java */
/* loaded from: classes11.dex */
public final class h0<T> extends io.reactivex.rxjava3.core.q<T> {
    public final a.r b;

    public h0(a.r rVar) {
        this.b = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        U u;
        try {
            u = this.b.b;
        } catch (Throwable th) {
            th = th;
            io.reactivex.rxjava3.exceptions.a.b(th);
        }
        if (u == 0) {
            throw io.reactivex.rxjava3.internal.util.f.b("Supplier returned a null Throwable.");
        }
        f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
        th = (Throwable) u;
        vVar.onSubscribe(EmptyDisposable.INSTANCE);
        vVar.onError(th);
    }
}
