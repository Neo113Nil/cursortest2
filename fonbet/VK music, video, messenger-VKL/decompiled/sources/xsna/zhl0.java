package xsna;

import androidx.annotation.NonNull;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: StorageTaskScheduler.java */
/* loaded from: classes13.dex */
public final class zhl0 {
    public static final ThreadPoolExecutor a;
    public static final ThreadPoolExecutor b;
    public static final ThreadPoolExecutor c;
    public static final ThreadPoolExecutor d;

    /* compiled from: StorageTaskScheduler.java */
    public static class a implements ThreadFactory {
        public final AtomicInteger b = new AtomicInteger(1);
        public final String c;

        public a(@NonNull String str) {
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "FirebaseStorage-" + this.c + this.b.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new a("Command-"));
        a = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 2, 5L, timeUnit, new LinkedBlockingQueue(), new a("Upload-"));
        b = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 3, 5L, timeUnit, new LinkedBlockingQueue(), new a("Download-"));
        c = threadPoolExecutor3;
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new a("Callbacks-"));
        d = threadPoolExecutor4;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
    }
}
