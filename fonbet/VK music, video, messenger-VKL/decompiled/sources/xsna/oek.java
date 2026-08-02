package xsna;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CronetExecutorsPool.kt */
/* loaded from: classes.dex */
public final class oek {
    public final long a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final LinkedBlockingDeque<jek> c;
    public final ThreadPoolExecutor d;

    public oek(int i, long j, long j2) {
        this.a = j2;
        this.c = new LinkedBlockingDeque<>(i);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, j, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new lek(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = threadPoolExecutor;
        for (int i2 = 0; i2 < i; i2++) {
            LinkedBlockingDeque<jek> linkedBlockingDeque = this.c;
            long j3 = this.a;
            jek jekVar = new jek(0, 1, j3, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: xsna.mek
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return new Thread(runnable, lhg.a(oek.this.b.getAndIncrement(), "Cronet-Requests-Executor-"));
                }
            });
            new AtomicBoolean(true);
            if (j3 > 0) {
                jekVar.allowCoreThreadTimeOut(true);
            }
            linkedBlockingDeque.add(jekVar);
        }
    }
}
