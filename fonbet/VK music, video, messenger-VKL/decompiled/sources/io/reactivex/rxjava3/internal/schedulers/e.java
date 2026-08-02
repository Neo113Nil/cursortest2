package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InstantPeriodicTask.java */
/* loaded from: classes8.dex */
public final class e implements Callable<Void>, io.reactivex.rxjava3.disposables.c {
    public static final FutureTask<Void> g = new FutureTask<>(io.reactivex.rxjava3.internal.functions.a.b, null);
    public final Runnable b;
    public final ExecutorService e;
    public Thread f;
    public final AtomicReference<Future<?>> d = new AtomicReference<>();
    public final AtomicReference<Future<?>> c = new AtomicReference<>();

    public e(ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        this.b = runnable;
        this.e = scheduledExecutorService;
    }

    public final void a(Future<?> future) {
        while (true) {
            AtomicReference<Future<?>> atomicReference = this.d;
            Future<?> future2 = atomicReference.get();
            if (future2 == g) {
                future.cancel(this.f != Thread.currentThread());
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        this.f = Thread.currentThread();
        try {
            this.b.run();
            Future<?> submit = this.e.submit(this);
            AtomicReference<Future<?>> atomicReference = this.c;
            loop0: while (true) {
                Future<?> future = atomicReference.get();
                if (future != g) {
                    while (!atomicReference.compareAndSet(future, submit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                submit.cancel(this.f != Thread.currentThread());
            }
            this.f = null;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            this.f = null;
            io.reactivex.rxjava3.plugins.a.a(th);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        AtomicReference<Future<?>> atomicReference = this.d;
        FutureTask<Void> futureTask = g;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f != Thread.currentThread());
        }
        Future<?> andSet2 = this.c.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f != Thread.currentThread());
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.d.get() == g;
    }
}
