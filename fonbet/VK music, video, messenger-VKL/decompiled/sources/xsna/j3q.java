package xsna;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Executors.kt */
/* loaded from: classes11.dex */
public final class j3q extends i3q implements osl {
    public final Executor c;

    public j3q(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = qwi.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = qwi.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // xsna.osl
    public final ogn J(long j, Runnable runnable, kotlin.coroutines.d dVar) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                iyx.b(dVar, fsk.j("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new ngn(scheduledFuture) : qel.j.J(j, runnable, dVar);
    }

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            iyx.b(dVar, fsk.j("The task was rejected", e));
            bdn bdnVar = bdn.a;
            wgl.c.P(dVar, runnable);
        }
    }

    @Override // xsna.i3q
    public final Executor U() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j3q) && ((j3q) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // xsna.osl
    public final void s(long j, lq9 lq9Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            meg0 meg0Var = new meg0(this, lq9Var);
            kotlin.coroutines.d dVar = lq9Var.f;
            try {
                scheduledFuture = scheduledExecutorService.schedule(meg0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                iyx.b(dVar, fsk.j("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            lq9Var.s(new lp9(scheduledFuture));
        } else {
            qel.j.s(j, lq9Var);
        }
    }

    @Override // xsna.ovj
    public final String toString() {
        return this.c.toString();
    }
}
