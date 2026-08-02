package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: Interruptible.kt */
/* loaded from: classes8.dex */
public final class mro0 extends jyx {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(mro0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread f = Thread.currentThread();
    public ogn g;

    public static void k(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // xsna.jyx
    public final boolean h() {
        return true;
    }

    @Override // xsna.jyx
    public final void i(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = h;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                k(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        k(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                ogn ognVar = this.g;
                if (ognVar != null) {
                    ognVar.dispose();
                    return;
                }
                return;
            }
        }
    }
}
