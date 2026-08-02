package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: SingleFromCallable.java */
/* loaded from: classes11.dex */
public final class v<T> extends io.reactivex.rxjava3.core.x<T> {
    public final Callable<? extends T> b;

    public v(Callable<? extends T> callable) {
        this.b = callable;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        zVar.onSubscribe(fVar);
        if (fVar.h()) {
            return;
        }
        try {
            T call = this.b.call();
            Objects.requireNonNull(call, "The callable returned a null value");
            if (fVar.h()) {
                return;
            }
            zVar.onSuccess(call);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            if (fVar.h()) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                zVar.onError(th);
            }
        }
    }
}
