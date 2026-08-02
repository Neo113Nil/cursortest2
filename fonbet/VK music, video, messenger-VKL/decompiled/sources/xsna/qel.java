package xsna;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import xsna.d0q;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes11.dex */
public final class qel extends d0q implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final qel j;
    public static final long k;

    static {
        Long l;
        qel qelVar = new qel();
        j = qelVar;
        qelVar.X(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        k = timeUnit.toNanos(l.longValue());
    }

    @Override // xsna.d0q, xsna.osl
    public final ogn J(long j2, Runnable runnable, kotlin.coroutines.d dVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 >= 4611686018427387903L) {
            return t570.b;
        }
        long nanoTime = System.nanoTime();
        d0q.b bVar = new d0q.b(j3 + nanoTime, runnable);
        h0(nanoTime, bVar);
        return bVar;
    }

    @Override // xsna.e0q
    public final Thread b0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // xsna.e0q
    public final void c0(long j2, d0q.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // xsna.d0q
    public final void d0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.d0(runnable);
    }

    public final synchronized void i0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            d0q.g.set(this, null);
            d0q.h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean g0;
        bro0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (g0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long Y = Y();
                    if (Y == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = k + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            i0();
                            if (g0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        if (Y > j3) {
                            Y = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (Y > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            i0();
                            if (g0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        LockSupport.parkNanos(this, Y);
                    }
                }
            }
        } finally {
            _thread = null;
            i0();
            if (!g0()) {
                b0();
            }
        }
    }

    @Override // xsna.d0q, xsna.c0q
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // xsna.ovj
    public final String toString() {
        return "DefaultExecutor";
    }
}
