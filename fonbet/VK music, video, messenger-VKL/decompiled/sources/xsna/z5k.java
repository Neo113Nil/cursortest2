package xsna;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsWorker.java */
/* loaded from: classes.dex */
public final class z5k implements Executor {
    public final ExecutorService b;
    public final Object c = new Object();
    public Task<?> d = Tasks.forResult(null);

    public z5k(ExecutorService executorService) {
        this.b = executorService;
    }

    public final Task<Void> a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.c) {
            continueWithTask = this.d.continueWithTask(this.b, new ka4(runnable, 1));
            this.d = continueWithTask;
        }
        return continueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }
}
