package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import xsna.n4i0;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes11.dex */
public abstract class n4i0<S extends n4i0<S>> extends swi<S> implements z670 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n4i0.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public n4i0(long j, S s, int i) {
        super(s);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // xsna.swi
    public final boolean d() {
        return e.get(this) == g() && c() != 0;
    }

    public final boolean f() {
        return e.addAndGet(this, -65536) == g() && c() != 0;
    }

    public abstract int g();

    public abstract void h(int i, kotlin.coroutines.d dVar);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = e;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != 0) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
