package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SerialDisposable.java */
/* loaded from: classes11.dex */
public final class g implements c {
    public final AtomicReference<c> b;

    public g() {
        this.b = new AtomicReference<>();
    }

    public final c a() {
        c cVar = this.b.get();
        return cVar == DisposableHelper.DISPOSED ? EmptyDisposable.INSTANCE : cVar;
    }

    public final void b(c cVar) {
        DisposableHelper.d(this.b, cVar);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        DisposableHelper.a(this.b);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return DisposableHelper.b(this.b.get());
    }

    public g(EmptyDisposable emptyDisposable) {
        this.b = new AtomicReference<>(emptyDisposable);
    }
}
