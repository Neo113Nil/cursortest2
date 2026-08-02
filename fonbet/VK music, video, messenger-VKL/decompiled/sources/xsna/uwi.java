package xsna;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ConditionLock.kt */
/* loaded from: classes2.dex */
public final class uwi {
    public final ReentrantLock a;
    public boolean b = false;
    public boolean c;
    public final Condition d;

    public uwi(ReentrantLock reentrantLock) {
        this.a = reentrantLock;
        this.d = reentrantLock.newCondition();
    }

    /* JADX WARN: Finally extract failed */
    public final boolean a(long j) {
        boolean z;
        Condition condition = this.d;
        ReentrantLock reentrantLock = this.a;
        if (j <= 0) {
            reentrantLock.lock();
            while (!this.b) {
                try {
                    condition.await();
                } finally {
                    reentrantLock.unlock();
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            return true;
        }
        reentrantLock.lock();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime + j;
            while (true) {
                z = this.b;
                if (z || elapsedRealtime >= j2) {
                    break;
                }
                condition.await(j2 - elapsedRealtime, TimeUnit.MILLISECONDS);
                if (this.c) {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    j2 = elapsedRealtime + j;
                    this.c = false;
                } else {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                }
            }
            boolean z2 = z;
            reentrantLock.unlock();
            return z2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(boolean z) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b = z;
            this.d.signalAll();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
