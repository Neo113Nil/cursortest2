package xsna;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: VKValidationLocker.kt */
/* loaded from: classes15.dex */
public final class yhr0 {
    public static final ReentrantLock a;
    public static final Condition b;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        a = reentrantLock;
        b = reentrantLock.newCondition();
    }

    public static void a() {
        try {
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                b.await();
                s3q0 s3q0Var = s3q0.a;
            } finally {
                reentrantLock.unlock();
            }
        } catch (InterruptedException unused) {
        }
    }

    public static void b() {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            b.signalAll();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
