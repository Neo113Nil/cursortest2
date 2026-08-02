package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes11.dex */
public final class p7 extends qha1 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(w7.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(w7.class, w7.class, "b");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(x7.class, w7.class, "c");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(x7.class, o7.class, "b");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(x7.class, Object.class, "a");

    @Override // defpackage.qha1
    public final boolean b(x7 x7Var, o7 o7Var, o7 o7Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(x7Var, o7Var, o7Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x7Var) == o7Var);
        return false;
    }

    @Override // defpackage.qha1
    public final boolean c(w4r0 w4r0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = e;
            if (atomicReferenceFieldUpdater.compareAndSet(w4r0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w4r0Var) == obj);
        return false;
    }

    @Override // defpackage.qha1
    public final boolean d(x7 x7Var, w7 w7Var, w7 w7Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = c;
            if (atomicReferenceFieldUpdater.compareAndSet(x7Var, w7Var, w7Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x7Var) == w7Var);
        return false;
    }

    @Override // defpackage.qha1
    public final o7 e(w4r0 w4r0Var) {
        return (o7) d.getAndSet(w4r0Var, o7.d);
    }

    @Override // defpackage.qha1
    public final w7 f(w4r0 w4r0Var) {
        return (w7) c.getAndSet(w4r0Var, w7.c);
    }

    @Override // defpackage.qha1
    public final void i(w7 w7Var, w7 w7Var2) {
        b.lazySet(w7Var, w7Var2);
    }

    @Override // defpackage.qha1
    public final void j(w7 w7Var, Thread thread) {
        a.lazySet(w7Var, thread);
    }
}
