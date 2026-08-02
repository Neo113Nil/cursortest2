package xsna;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ClipsFeedAdapterMainThreadExecutorLocker.kt */
/* loaded from: classes17.dex */
public final class w5e implements b9e {
    public final ConcurrentHashMap.KeySetView<b9e, Boolean> b = ConcurrentHashMap.newKeySet();
    public final AtomicBoolean c = new AtomicBoolean(false);

    public final void a(b9e b9eVar) {
        this.b.add(b9eVar);
        boolean y = b9eVar.y();
        AtomicBoolean atomicBoolean = this.c;
        if (y != atomicBoolean.get()) {
            if (atomicBoolean.get()) {
                b9eVar.g0();
            } else {
                b9eVar.unlock();
            }
        }
    }

    public final void b(b9e b9eVar) {
        this.b.remove(b9eVar);
    }

    @Override // xsna.b9e
    public final void g0() {
        if (this.c.getAndSet(true)) {
            return;
        }
        Iterator<b9e> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().g0();
        }
    }

    @Override // xsna.b9e
    public final void unlock() {
        if (this.c.getAndSet(false)) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((b9e) it.next()).unlock();
            }
        }
    }

    @Override // xsna.b9e
    public final boolean y() {
        return this.c.get();
    }
}
