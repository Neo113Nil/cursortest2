package xsna;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CameraExecutor.java */
/* loaded from: classes11.dex */
public final class li9 implements Executor {
    public static final a d = new a();
    public final Object b = new Object();

    @NonNull
    public ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), d);

    /* compiled from: CameraExecutor.java */
    public class a implements ThreadFactory {
        public final AtomicInteger b = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-core_camera_" + this.b.getAndIncrement());
            return thread;
        }
    }

    public final void a(@NonNull oi9 oi9Var) {
        ThreadPoolExecutor threadPoolExecutor;
        oi9Var.getClass();
        synchronized (this.b) {
            try {
                if (this.c.isShutdown()) {
                    this.c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), d);
                }
                threadPoolExecutor = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, oi9Var.d().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        runnable.getClass();
        synchronized (this.b) {
            this.c.execute(runnable);
        }
    }
}
