package xsna;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: HighPriorityExecutor.java */
/* loaded from: classes11.dex */
public final class q4v implements Executor {
    public static volatile q4v c;
    public final ExecutorService b = Executors.newSingleThreadExecutor(new a());

    /* compiled from: HighPriorityExecutor.java */
    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.b.execute(runnable);
    }
}
