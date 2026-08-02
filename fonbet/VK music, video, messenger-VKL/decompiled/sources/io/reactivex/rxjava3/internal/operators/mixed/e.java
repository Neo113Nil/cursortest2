package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaterializeSingleObserver.java */
/* loaded from: classes8.dex */
public final class e<T> implements z<T>, io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
    public final z<? super io.reactivex.rxjava3.core.p<T>> b;
    public io.reactivex.rxjava3.disposables.c c;

    public e(z<? super io.reactivex.rxjava3.core.p<T>> zVar) {
        this.b = zVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.c.h();
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
    public final void onComplete() {
        this.b.onSuccess(io.reactivex.rxjava3.core.p.b);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        this.b.onSuccess(io.reactivex.rxjava3.core.p.a(th));
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (DisposableHelper.f(this.c, cVar)) {
            this.c = cVar;
            this.b.onSubscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSuccess(T t) {
        this.b.onSuccess(io.reactivex.rxjava3.core.p.b(t));
    }
}
