package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public abstract class p8q0 {
    public static final t7q0 a = new t7q0(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(t7q0 t7q0Var) {
        if (t7q0Var.f != null || t7q0Var.g != null) {
            ny61.g("Failed requirement.");
            return;
        }
        if (t7q0Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        t7q0 t7q0Var2 = a;
        t7q0 t7q0Var3 = (t7q0) atomicReference.getAndSet(t7q0Var2);
        if (t7q0Var3 == t7q0Var2) {
            return;
        }
        int i = t7q0Var3 != null ? t7q0Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(t7q0Var3);
            return;
        }
        t7q0Var.f = t7q0Var3;
        t7q0Var.b = 0;
        t7q0Var.c = i + 8192;
        atomicReference.set(t7q0Var);
    }

    public static final t7q0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        t7q0 t7q0Var = a;
        t7q0 t7q0Var2 = (t7q0) atomicReference.getAndSet(t7q0Var);
        if (t7q0Var2 == t7q0Var) {
            return new t7q0();
        }
        if (t7q0Var2 == null) {
            atomicReference.set(null);
            return new t7q0();
        }
        atomicReference.set(t7q0Var2.f);
        t7q0Var2.f = null;
        t7q0Var2.c = 0;
        return t7q0Var2;
    }
}
