package io.reactivex.rxjava3.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SchedulerPoolFactory.java */
/* loaded from: classes11.dex */
public final class i {
    public static final boolean a;
    public static final int b;
    public static final AtomicReference<ScheduledExecutorService> c = new AtomicReference<>();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* compiled from: SchedulerPoolFactory.java */
    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = new ArrayList(i.d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    i.d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[LOOP:0: B:11:0x0043->B:19:0x0074, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        boolean z;
        String property;
        int parseInt;
        ScheduledExecutorService newScheduledThreadPool;
        String property2;
        try {
            property2 = System.getProperty("rx3.purge-enabled");
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
        }
        if (property2 != null) {
            z = "true".equals(property2);
            a = z;
            if (z) {
                try {
                    property = System.getProperty("rx3.purge-period-seconds");
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                }
                if (property != null) {
                    parseInt = Integer.parseInt(property);
                    b = parseInt;
                    if (!a) {
                        return;
                    }
                    while (true) {
                        AtomicReference<ScheduledExecutorService> atomicReference = c;
                        ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                        if (scheduledExecutorService != null) {
                            return;
                        }
                        newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                        while (!atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                            if (atomicReference.get() != scheduledExecutorService) {
                                break;
                            }
                        }
                        a aVar = new a();
                        long j = b;
                        newScheduledThreadPool.scheduleAtFixedRate(aVar, j, j, TimeUnit.SECONDS);
                        return;
                        newScheduledThreadPool.shutdownNow();
                    }
                }
            }
            parseInt = 1;
            b = parseInt;
            if (!a) {
            }
        }
        z = true;
        a = z;
        if (z) {
        }
        parseInt = 1;
        b = parseInt;
        if (!a) {
        }
    }
}
