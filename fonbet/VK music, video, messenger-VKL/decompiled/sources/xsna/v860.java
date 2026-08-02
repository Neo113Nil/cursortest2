package xsna;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.rxjava3.internal.schedulers.ScheduledDirectTask;
import io.reactivex.rxjava3.internal.schedulers.d;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: NewSingleThreadScheduler.kt */
/* loaded from: classes.dex */
public final class v860 extends io.reactivex.rxjava3.core.w {
    public final ScheduledExecutorService b;
    public final boolean c = true;

    public v860(ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new d.c(this.b, this.c);
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c c(Runnable runnable) {
        try {
            ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
            scheduledDirectTask.a(this.b.submit(scheduledDirectTask));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            io.reactivex.rxjava3.plugins.a.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
            scheduledDirectTask.a(this.b.schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            io.reactivex.rxjava3.plugins.a.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            scheduledDirectPeriodicTask.a(this.b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            io.reactivex.rxjava3.plugins.a.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final void f() {
        this.b.shutdownNow();
    }
}
