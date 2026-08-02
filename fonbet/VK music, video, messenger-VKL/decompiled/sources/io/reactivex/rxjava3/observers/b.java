package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableSingleObserver.java */
/* loaded from: classes8.dex */
public abstract class b<T> implements z<T>, io.reactivex.rxjava3.disposables.c {
    public final AtomicReference<io.reactivex.rxjava3.disposables.c> b = new AtomicReference<>();

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        DisposableHelper.a(this.b);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.b.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.z
    public void onError(Throwable th) {
        dispose();
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.internal.util.e.a(this.b, cVar, getClass());
    }

    @Override // io.reactivex.rxjava3.core.z
    public void onSuccess(Object obj) {
        dispose();
    }
}
