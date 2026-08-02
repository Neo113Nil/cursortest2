package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class dbh extends kgo implements Runnable {
    public static final dbh D;
    public static final long E;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        dbh dbhVar = new dbh();
        D = dbhVar;
        dbhVar.U(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        E = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    public final synchronized void O0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            A0();
            notifyAll();
        }
    }

    @Override // defpackage.lgo
    public final Thread a0() {
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
                thread.setContextClassLoader(D.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.fph
    public final m1k e(long j, Runnable runnable, fse fseVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return ke60.a;
        }
        long nanoTime = System.nanoTime();
        hgo hgoVar = new hgo(j2 + nanoTime, runnable);
        D0(nanoTime, hgoVar);
        return hgoVar;
    }

    @Override // defpackage.lgo
    public final void e0(long j, igo igoVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.kgo
    public final void n0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n0(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean x0;
        byy0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (x0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long W = W();
                    if (W == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                        long nanoTime = System.nanoTime();
                        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                            j = E + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            O0();
                            if (x0()) {
                                return;
                            }
                            a0();
                            return;
                        }
                        if (W > j2) {
                            W = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (W > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            O0();
                            if (x0()) {
                                return;
                            }
                            a0();
                            return;
                        }
                        LockSupport.parkNanos(this, W);
                    }
                }
            }
        } finally {
            _thread = null;
            O0();
            if (!x0()) {
                a0();
            }
        }
    }

    @Override // defpackage.kgo, defpackage.fgo
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.jse
    public final String toString() {
        return "DefaultExecutor";
    }
}
