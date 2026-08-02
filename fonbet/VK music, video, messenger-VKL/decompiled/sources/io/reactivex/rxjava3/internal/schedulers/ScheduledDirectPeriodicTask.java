package io.reactivex.rxjava3.internal.schedulers;

/* loaded from: classes8.dex */
public final class ScheduledDirectPeriodicTask extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            this.runner = null;
            lazySet(a.b);
            io.reactivex.rxjava3.plugins.a.a(th);
        }
    }
}
