package xsna;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import one.video.calls.sdk_private.dF;
import xsna.eqy0;

/* compiled from: AbstractSessionFactoryImpl.java */
/* loaded from: classes8.dex */
public abstract class rpy0 {
    public volatile int d;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ReentrantLock b = new ReentrantLock();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public volatile long e = -1;

    public final void a(long j, dry0 dry0Var) throws dF {
        this.b.lock();
        try {
            eqy0 eqy0Var = (eqy0) this.a.get(Long.valueOf(j));
            if (eqy0Var != null && eqy0Var.e == eqy0.b.b) {
                eqy0Var.b(dry0Var);
            } else if (eqy0Var == null && j <= this.e) {
                dry0Var.a(386759528L);
                if (dry0Var.e()) {
                    dry0Var.b(386759528L);
                }
            } else {
                if (this.d >= 3) {
                    throw new dF();
                }
                ((List) this.c.computeIfAbsent(Long.valueOf(j), new ppy0())).add(dry0Var);
                this.d++;
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final void b(eqy0 eqy0Var) {
        long j = eqy0Var.c;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.a.remove(Long.valueOf(j));
            this.c.remove(Long.valueOf(j));
        } finally {
            reentrantLock.unlock();
        }
    }
}
