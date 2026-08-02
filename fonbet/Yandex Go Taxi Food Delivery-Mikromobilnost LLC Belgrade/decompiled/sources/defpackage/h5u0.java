package defpackage;

import androidx.compose.runtime.internal.AtomicInt;

/* loaded from: classes.dex */
public abstract class h5u0 implements g5u0 {
    public static final int $stable = 8;
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: isReadIn-h_f27i8$runtime, reason: not valid java name */
    public final boolean m483isReadInh_f27i8$runtime(int i) {
        return (this.readerKind.get() & i) != 0;
    }

    /* renamed from: recordReadIn-h_f27i8$runtime, reason: not valid java name */
    public final void m484recordReadInh_f27i8$runtime(int i) {
        int i2;
        do {
            i2 = this.readerKind.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(i2, i2 | i));
    }
}
