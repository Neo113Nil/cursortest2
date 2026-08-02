package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.Callable;

/* compiled from: MaybeFromCallable.java */
/* loaded from: classes8.dex */
public final class p<T> extends io.reactivex.rxjava3.core.k<T> implements io.reactivex.rxjava3.functions.n<T> {
    public final Callable<? extends T> b;

    public p(Callable<? extends T> callable) {
        this.b = callable;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final T get() throws Exception {
        return this.b.call();
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        mVar.onSubscribe(fVar);
        if (fVar.h()) {
            return;
        }
        try {
            T call = this.b.call();
            if (fVar.h()) {
                return;
            }
            if (call == null) {
                mVar.onComplete();
            } else {
                mVar.onSuccess(call);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            if (fVar.h()) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                mVar.onError(th);
            }
        }
    }
}
