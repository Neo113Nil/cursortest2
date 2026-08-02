package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public abstract class de71 implements RunnableFuture {
    public final sh71 b = new sh71();
    public final sh71 c = new sh71();
    public final Object d = new Object();
    public Exception e;
    public Object f;
    public Thread g;
    public boolean h;

    public void a() {
    }

    public abstract Object b();

    public final Object c() {
        if (this.h) {
            throw new CancellationException();
        }
        Exception exc = this.e;
        if (exc == null) {
            return this.f;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        synchronized (this.d) {
            try {
                if (!this.h) {
                    sh71 sh71Var = this.c;
                    synchronized (sh71Var) {
                        z2 = sh71Var.a;
                    }
                    if (!z2) {
                        this.h = true;
                        a();
                        Thread thread = this.g;
                        if (thread == null) {
                            this.b.c();
                            this.c.c();
                        } else if (z) {
                            thread.interrupt();
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        sh71 sh71Var = this.c;
        synchronized (sh71Var) {
            if (convert <= 0) {
                z = sh71Var.a;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    sh71Var.a();
                } else {
                    while (!sh71Var.a && elapsedRealtime < j2) {
                        sh71Var.wait(j2 - elapsedRealtime);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = sh71Var.a;
            }
        }
        if (z) {
            return c();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        sh71 sh71Var = this.c;
        synchronized (sh71Var) {
            z = sh71Var.a;
        }
        return z;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            try {
                if (this.h) {
                    return;
                }
                this.g = Thread.currentThread();
                this.b.c();
                try {
                    try {
                        this.f = b();
                        synchronized (this.d) {
                            this.c.c();
                            this.g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.d) {
                            this.c.c();
                            this.g = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.e = e;
                    synchronized (this.d) {
                        this.c.c();
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
    public final Object get() {
        this.c.a();
        return c();
    }
}
