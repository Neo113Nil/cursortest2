package xsna;

import androidx.compose.runtime.internal.AtomicInt;

/* compiled from: StateObjectImpl.kt */
/* loaded from: classes.dex */
public abstract class nuk0 implements muk0 {
    public final AtomicInt b = new AtomicInt(0);

    public final boolean W(int i) {
        return (i & this.b.get()) != 0;
    }

    public final void Z(int i) {
        AtomicInt atomicInt;
        int i2;
        do {
            atomicInt = this.b;
            i2 = atomicInt.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(i2, i2 | i));
    }
}
