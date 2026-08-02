package xsna;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes11.dex */
public class oz3 extends mxo0 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static oz3 l;
    public boolean e;
    public oz3 f;
    public long g;

    /* compiled from: AsyncTimeout.kt */
    public static final class a {
        public static oz3 a() throws InterruptedException {
            oz3 oz3Var = oz3.l.f;
            if (oz3Var == null) {
                long nanoTime = System.nanoTime();
                oz3.i.await(oz3.j, TimeUnit.MILLISECONDS);
                if (oz3.l.f != null || System.nanoTime() - nanoTime < oz3.k) {
                    return null;
                }
                return oz3.l;
            }
            long nanoTime2 = oz3Var.g - System.nanoTime();
            if (nanoTime2 > 0) {
                oz3.i.await(nanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            oz3.l.f = oz3Var.f;
            oz3Var.f = null;
            return oz3Var;
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes8.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            oz3 a;
            while (true) {
                try {
                    reentrantLock = oz3.h;
                    reentrantLock.lock();
                    try {
                        a = a.a();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (a == oz3.l) {
                    oz3.l = null;
                    return;
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
                if (a != null) {
                    a.k();
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        i = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        oz3 oz3Var;
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (l == null) {
                    l = new oz3();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    this.g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.g = j2 + nanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j3 = this.g - nanoTime;
                oz3 oz3Var2 = l;
                while (true) {
                    oz3Var = oz3Var2.f;
                    if (oz3Var == null || j3 < oz3Var.g - nanoTime) {
                        break;
                    } else {
                        oz3Var2 = oz3Var;
                    }
                }
                this.f = oz3Var;
                oz3Var2.f = this;
                if (oz3Var2 == l) {
                    i.signal();
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            oz3 oz3Var = l;
            while (oz3Var != null) {
                oz3 oz3Var2 = oz3Var.f;
                if (oz3Var2 == this) {
                    oz3Var.f = this.f;
                    this.f = null;
                    return false;
                }
                oz3Var = oz3Var2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}
