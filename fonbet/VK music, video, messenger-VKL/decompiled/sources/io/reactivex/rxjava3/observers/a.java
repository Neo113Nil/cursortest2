package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableObserver.java */
/* loaded from: classes11.dex */
public abstract class a<T> implements v<T>, io.reactivex.rxjava3.disposables.c {
    public final AtomicReference<io.reactivex.rxjava3.disposables.c> b = new AtomicReference<>();

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        DisposableHelper.a(this.b);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.b.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.internal.util.e.a(this.b, cVar, getClass());
    }
}
