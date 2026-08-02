package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SegmentPool.kt */
/* loaded from: classes11.dex */
public final class i5i0 {
    public static final m4i0 a = new m4i0(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference<m4i0>[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference<m4i0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(m4i0 m4i0Var) {
        if (m4i0Var.f != null || m4i0Var.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (m4i0Var.d) {
            return;
        }
        AtomicReference<m4i0> atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        m4i0 m4i0Var2 = a;
        m4i0 andSet = atomicReference.getAndSet(m4i0Var2);
        if (andSet == m4i0Var2) {
            return;
        }
        int i = andSet != null ? andSet.c : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        m4i0Var.f = andSet;
        m4i0Var.b = 0;
        m4i0Var.c = i + 8192;
        atomicReference.set(m4i0Var);
    }

    public static final m4i0 b() {
        AtomicReference<m4i0> atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        m4i0 m4i0Var = a;
        m4i0 andSet = atomicReference.getAndSet(m4i0Var);
        if (andSet == m4i0Var) {
            return new m4i0();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new m4i0();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
