package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: Builders.common.kt */
/* loaded from: classes11.dex */
public final class ncn<T> extends z9h0<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(ncn.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public ncn() {
        throw null;
    }

    @Override // xsna.z9h0, xsna.pyx
    public final void C(Object obj) {
        G(obj);
    }

    @Override // xsna.z9h0, xsna.pyx
    public final void G(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                upj.b(s7s0.d(obj), s7s0.c(this.e));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
