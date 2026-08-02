package xsna;

import java.util.LinkedHashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: ColdStartController.kt */
/* loaded from: classes.dex */
public final class b0g {
    public static final b0g a = new b0g();
    public static final bpn0 b = new bpn0(new kb3(3));
    public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public static final CountDownLatch d = new CountDownLatch(1);
    public static final LinkedHashSet e = new LinkedHashSet();
    public static volatile boolean f;

    /* compiled from: ColdStartController.kt */
    public interface a {
        void a();
    }

    public static void a(a aVar) {
        Lock writeLock = c.writeLock();
        writeLock.lock();
        try {
            if (!f) {
                e.add(aVar);
                aVar = null;
            }
            if (aVar != null) {
                aVar.a();
            }
        } finally {
            writeLock.unlock();
        }
    }

    public static boolean b() {
        Lock readLock = c.readLock();
        readLock.lock();
        try {
            return f;
        } finally {
            readLock.unlock();
        }
    }
}
