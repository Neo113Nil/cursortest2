package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class gb3 extends ydz0 {
    public static final k3f0 h = new k3f0();
    public static gb3 i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final long l;
    public static final long m;
    public int e;
    public int f = -1;
    public long g;

    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            gb3 b;
            while (true) {
                try {
                    k3f0 k3f0Var = gb3.h;
                    reentrantLock = gb3.j;
                    reentrantLock.lock();
                    try {
                        b = fb3.b();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (b == gb3.i) {
                    gb3.i = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (b != null) {
                        b.l();
                    }
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        k = reentrantLock.newCondition();
        l = 60000L;
        m = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void i() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                fb3.a(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            h.b(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException k(IOException iOException) {
        throw null;
    }

    public void l() {
    }
}
