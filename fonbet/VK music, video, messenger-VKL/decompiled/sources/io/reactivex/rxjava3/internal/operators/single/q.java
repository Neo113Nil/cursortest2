package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.f;

/* compiled from: SingleError.java */
/* loaded from: classes8.dex */
public final class q<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.functions.n<? extends Throwable> b;

    public q(io.reactivex.rxjava3.functions.n<? extends Throwable> nVar) {
        this.b = nVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        Throwable th;
        try {
            th = this.b.get();
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.rxjava3.exceptions.a.b(th);
        }
        if (th == null) {
            throw io.reactivex.rxjava3.internal.util.f.b("Supplier returned a null Throwable.");
        }
        f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
        th = th;
        zVar.onSubscribe(EmptyDisposable.INSTANCE);
        zVar.onError(th);
    }
}
