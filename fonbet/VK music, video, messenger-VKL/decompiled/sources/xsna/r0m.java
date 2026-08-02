package xsna;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: DeprecatedSentTable.java */
/* loaded from: classes5.dex */
public final class r0m {
    public static final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public static volatile Set<String> b = null;
    public static final ConcurrentHashMap.KeySetView c = ConcurrentHashMap.newKeySet();

    public static void a() {
        if (b == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = a;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (b == null) {
                    b = qyk0.a().d();
                }
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                a.writeLock().unlock();
                throw th;
            }
        }
    }
}
