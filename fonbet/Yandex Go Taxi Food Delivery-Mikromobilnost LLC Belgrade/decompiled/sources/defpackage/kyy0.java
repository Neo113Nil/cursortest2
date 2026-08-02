package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes9.dex */
public final class kyy0 extends t8x {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(kyy0.class, "_state$volatile");
    public final Thread A = Thread.currentThread();
    public m1k B;
    private volatile /* synthetic */ int _state$volatile;

    public static void q(int i) {
        throw new IllegalStateException(qv10.g(i, "Illegal state "));
    }

    @Override // defpackage.t8x
    public final boolean n() {
        return true;
    }

    @Override // defpackage.t8x
    public final void o(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = C;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                q(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.A.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void p() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        q(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                m1k m1kVar = this.B;
                if (m1kVar != null) {
                    m1kVar.dispose();
                    return;
                }
                return;
            }
        }
    }
}
