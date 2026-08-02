package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.e;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class CancellableDisposable extends AtomicReference<e> implements c {
    private static final long serialVersionUID = 5718521705281392066L;

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        e andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            io.reactivex.rxjava3.plugins.a.a(th);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return get() == null;
    }
}
