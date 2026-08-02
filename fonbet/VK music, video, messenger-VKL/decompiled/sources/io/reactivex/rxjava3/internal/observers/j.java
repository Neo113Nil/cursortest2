package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ResumeSingleObserver.java */
/* loaded from: classes8.dex */
public final class j<T> implements z<T> {
    public final AtomicReference<io.reactivex.rxjava3.disposables.c> b;
    public final z<? super T> c;

    public j(AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference, z<? super T> zVar) {
        this.b = atomicReference;
        this.c = zVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        this.c.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        DisposableHelper.c(this.b, cVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSuccess(T t) {
        this.c.onSuccess(t);
    }
}
