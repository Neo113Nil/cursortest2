package xsna;

import android.content.Context;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: BottomNavigationButtonsPool.kt */
/* loaded from: classes11.dex */
public final class d58 {
    public static final d58 a = new d58();
    public static volatile boolean b;
    public static volatile boolean c;
    public static final ReentrantLock d;
    public static final Condition e;
    public static final vvb0<j58> f;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        d = reentrantLock;
        e = reentrantLock.newCondition();
        f = new vvb0<>(6);
    }

    public static j58 a(Context context) {
        b = true;
        if (c) {
            ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                if (c) {
                    c = false;
                    e.await();
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        j58 c2 = f.c();
        return c2 == null ? new j58(context) : c2;
    }
}
