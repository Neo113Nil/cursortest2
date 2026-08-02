package xsna;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RunnableFutureTask.java */
/* loaded from: classes12.dex */
public abstract class bsg0<R, E extends Exception> implements RunnableFuture<R> {
    public final wwi b = new wwi();
    public final wwi c = new wwi();
    public final Object d = new Object();

    @Nullable
    public Exception e;

    @Nullable
    public R f;

    @Nullable
    public Thread g;
    public boolean h;

    public final void a() {
        this.c.b();
    }

    public abstract R c() throws Exception;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.d) {
            try {
                if (!this.h && !this.c.e()) {
                    this.h = true;
                    b();
                    Thread thread = this.g;
                    if (thread == null) {
                        this.b.f();
                        this.c.f();
                    } else if (z) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.c.a();
        if (this.h) {
            throw new CancellationException();
        }
        if (this.e == null) {
            return this.f;
        }
        throw new ExecutionException(this.e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            try {
                if (this.h) {
                    return;
                }
                this.g = Thread.currentThread();
                this.b.f();
                try {
                    try {
                        this.f = c();
                        synchronized (this.d) {
                            this.c.f();
                            this.g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.d) {
                            this.c.f();
                            this.g = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.e = e;
                    synchronized (this.d) {
                        this.c.f();
                        this.g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        wwi wwiVar = this.c;
        synchronized (wwiVar) {
            if (convert <= 0) {
                z = wwiVar.b;
            } else {
                long elapsedRealtime = wwiVar.a.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    wwiVar.a();
                } else {
                    while (!wwiVar.b && elapsedRealtime < j2) {
                        wwiVar.a.getClass();
                        wwiVar.wait(j2 - elapsedRealtime);
                        elapsedRealtime = wwiVar.a.elapsedRealtime();
                    }
                }
                z = wwiVar.b;
            }
        }
        if (z) {
            if (!this.h) {
                if (this.e == null) {
                    return this.f;
                }
                throw new ExecutionException(this.e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    public void b() {
    }
}
