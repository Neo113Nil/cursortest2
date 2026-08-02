package xsna;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: BoltsExecutors.java */
/* loaded from: classes12.dex */
public final class wj7 {
    public static final wj7 d = new wj7();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final a c;

    /* compiled from: BoltsExecutors.java */
    public static class a implements Executor {
        public ThreadLocal<Integer> b;

        public final void a() {
            ThreadLocal<Integer> threadLocal = this.b;
            Integer num = threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(intValue));
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ThreadLocal<Integer> threadLocal = this.b;
            Integer num = threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            threadLocal.set(Integer.valueOf(intValue));
            try {
                if (intValue <= 15) {
                    runnable.run();
                } else {
                    wj7.d.a.execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    public wj7() {
        ExecutorService executorService;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains("android")) {
            h82 h82Var = h82.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(h82.c, h82.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor;
        } else {
            executorService = Executors.newCachedThreadPool();
        }
        this.a = executorService;
        this.b = Executors.newSingleThreadScheduledExecutor();
        a aVar = new a();
        aVar.b = new ThreadLocal<>();
        this.c = aVar;
    }
}
