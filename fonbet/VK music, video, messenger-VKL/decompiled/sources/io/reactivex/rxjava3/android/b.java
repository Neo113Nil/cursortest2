package io.reactivex.rxjava3.android;

import android.os.Looper;
import io.reactivex.rxjava3.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MainThreadDisposable.java */
/* loaded from: classes8.dex */
public abstract class b implements c {
    public final AtomicBoolean b = new AtomicBoolean();

    public abstract void a();

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        if (this.b.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
            } else {
                io.reactivex.rxjava3.android.schedulers.a.b().c(new a(this, 0));
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.b.get();
    }
}
