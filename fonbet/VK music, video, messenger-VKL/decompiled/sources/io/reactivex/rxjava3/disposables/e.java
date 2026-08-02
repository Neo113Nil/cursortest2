package io.reactivex.rxjava3.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReferenceDisposable.java */
/* loaded from: classes11.dex */
public abstract class e<T> extends AtomicReference<T> implements c {
    private static final long serialVersionUID = 6537757548749041217L;

    public abstract void a(T t);

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return get() == null;
    }
}
