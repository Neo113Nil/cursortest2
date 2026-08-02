package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public abstract class o8z0 {
    public static final ExecutorService a = Executors.newFixedThreadPool(6);
    public static final ExecutorService b = Executors.newSingleThreadExecutor();
    public static final ExecutorService c = Executors.newFixedThreadPool(6);
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ThreadPoolExecutor e = new ThreadPoolExecutor(1, 5, 20, TimeUnit.SECONDS, new SynchronousQueue());
    public static final ArrayList f = new ArrayList();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final a i = new a();
    public static final AtomicBoolean j = new AtomicBoolean();
    public static final Handler h = new Handler(h5s.a("MonitoringHandlerThread").getLooper());

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            o8z0.g.post(runnable);
        }
    }

    public static void a(Runnable runnable) {
        AtomicBoolean atomicBoolean = j;
        if (!atomicBoolean.get()) {
            ArrayList arrayList = f;
            synchronized (arrayList) {
                try {
                    if (!atomicBoolean.get()) {
                        arrayList.add(runnable);
                        gu8.c("AsyncCommand", "Can't use onAdLoadExecutor - sdk initialize not finished");
                        return;
                    }
                } finally {
                }
            }
        }
        c.execute(runnable);
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void c(Runnable runnable) {
        d.execute(runnable);
    }

    public static void d(Runnable runnable) {
        i.execute(runnable);
    }
}
