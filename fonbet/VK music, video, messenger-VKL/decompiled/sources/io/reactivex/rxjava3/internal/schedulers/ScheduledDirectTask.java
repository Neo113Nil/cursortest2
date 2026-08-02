package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes11.dex */
public final class ScheduledDirectTask extends a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        FutureTask<Void> futureTask = a.b;
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.runner = null;
        }
    }
}
