package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AbstractDirectTask.java */
/* loaded from: classes11.dex */
public abstract class a extends AtomicReference<Future<?>> implements io.reactivex.rxjava3.disposables.c {
    public static final FutureTask<Void> b;
    public static final FutureTask<Void> c;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    static {
        a.m mVar = io.reactivex.rxjava3.internal.functions.a.b;
        b = new FutureTask<>(mVar, null);
        c = new FutureTask<>(mVar, null);
    }

    public a(Runnable runnable) {
        this.runnable = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == b) {
                return;
            }
            if (future2 == c) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == b || future == (futureTask = c) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.runner != Thread.currentThread());
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        Future<?> future = get();
        return future == b || future == c;
    }
}
