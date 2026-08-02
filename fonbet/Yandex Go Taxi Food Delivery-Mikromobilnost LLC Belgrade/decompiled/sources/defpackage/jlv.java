package defpackage;

import com.yandex.plus.log.api.LogPriority;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public final class jlv implements pgz {
    public final AtomicInteger a = new AtomicInteger(0);
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedList c;
    public final LinkedList d;

    public jlv() {
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        this.d = linkedList;
    }

    @Override // defpackage.pgz
    public final void a(LogPriority logPriority, String str, String str2) {
        b(logPriority, str, str2, null);
    }

    @Override // defpackage.pgz
    public final void b(LogPriority logPriority, String str, String str2, Throwable th) {
        LinkedList linkedList = this.c;
        hdd0 hdd0Var = new hdd0(this.a.incrementAndGet(), logPriority, str, str2, th);
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        while (linkedList.size() >= 10000) {
            try {
                linkedList.remove();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        linkedList.add(hdd0Var);
        reentrantLock.unlock();
    }

    @Override // defpackage.pgz
    public final boolean e(LogPriority logPriority) {
        return true;
    }
}
