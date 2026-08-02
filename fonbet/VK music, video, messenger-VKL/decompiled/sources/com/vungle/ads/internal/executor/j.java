package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.q44;
import xsna.qb3;
import xsna.qc9;

/* loaded from: classes7.dex */
public final class j extends ThreadPoolExecutor implements AutoCloseable {
    public static final /* synthetic */ int b = 0;
    public final c a;

    static {
        new g();
    }

    public j(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, c cVar) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, cVar);
        this.a = cVar;
        allowCoreThreadTimeOut(true);
    }

    public static final void b(j jVar) {
        StringBuilder a = l.a("submit error in ");
        a.append(jVar.a());
        new OutOfMemory(a.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    public static final void c(j jVar) {
        StringBuilder a = l.a("submit error with result in ");
        a.append(jVar.a());
        new OutOfMemory(a.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final String a() {
        String str;
        c cVar = this.a;
        return (cVar == null || (str = cVar.a) == null) ? "VungleThreadPoolExecutor" : str;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            super.execute(g.a(runnable, new q44(this, 17)));
        } catch (Exception e) {
            boolean z = u.a;
            t.a("VungleThreadPool", "execute exception", e);
        } catch (OutOfMemoryError e2) {
            StringBuilder a = l.a("execute error in ");
            a.append(a());
            a.append(": ");
            a.append(e2.getLocalizedMessage());
            String sb = a.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", sb, e2);
            new OutOfMemory(sb).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        try {
            return super.submit(g.a(runnable, new qb3(this, 20)));
        } catch (Exception e) {
            boolean z = u.a;
            t.a("VungleThreadPool", "submit exception", e);
            return new b(null);
        } catch (OutOfMemoryError e2) {
            StringBuilder a = l.a("submit error in ");
            a.append(a());
            a.append(": ");
            a.append(e2.getLocalizedMessage());
            String sb = a.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", sb, e2);
            new OutOfMemory(sb).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }

    public static final void a(j jVar) {
        StringBuilder a = l.a("execute error in ");
        a.append(jVar.a());
        new OutOfMemory(a.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final void a(Runnable runnable, Runnable runnable2) {
        try {
            super.execute(g.a(runnable, runnable2));
        } catch (Exception e) {
            boolean z = u.a;
            t.a("VungleThreadPool", "execute exception with fail", e);
            runnable2.run();
        } catch (OutOfMemoryError e2) {
            StringBuilder a = l.a("execute error with fail in ");
            a.append(a());
            a.append(": ");
            a.append(e2.getLocalizedMessage());
            String sb = a.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", sb, e2);
            new OutOfMemory(sb).logErrorNoReturnValue$vungle_ads_release();
            runnable2.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        try {
            return super.submit(g.a(runnable, new qc9(this, 16)), obj);
        } catch (Exception e) {
            boolean z = u.a;
            t.a("VungleThreadPool", "submit exception with result", e);
            return new b(null);
        } catch (OutOfMemoryError e2) {
            StringBuilder a = l.a("submit error with result in ");
            a.append(a());
            a.append(": ");
            a.append(e2.getLocalizedMessage());
            String sb = a.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", sb, e2);
            new OutOfMemory(sb).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        Callable b2;
        try {
            b2 = g.b(callable, new i(this));
            return super.submit(b2);
        } catch (Exception e) {
            boolean z = u.a;
            t.b("VungleThreadPool", "submit exception callable: " + e);
            return new b(null);
        } catch (OutOfMemoryError e2) {
            StringBuilder a = l.a("submit error callable in ");
            a.append(a());
            a.append(": ");
            a.append(e2.getLocalizedMessage());
            String sb = a.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", sb, e2);
            new OutOfMemory(sb).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }
}
