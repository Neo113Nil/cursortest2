package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes11.dex */
public final class csa1 extends yua1 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public csa1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.yua1
    public final void d(x7b1 x7b1Var, x7b1 x7b1Var2) {
        this.b.lazySet(x7b1Var, x7b1Var2);
    }

    @Override // defpackage.yua1
    public final void e(x7b1 x7b1Var, Thread thread) {
        this.a.lazySet(x7b1Var, thread);
    }

    @Override // defpackage.yua1
    public final boolean f(zfb1 zfb1Var, dga1 dga1Var, dga1 dga1Var2) {
        return qxa1.d(this.d, zfb1Var, dga1Var, dga1Var2);
    }

    @Override // defpackage.yua1
    public final boolean g(zfb1 zfb1Var, Object obj, Object obj2) {
        return qxa1.d(this.e, zfb1Var, obj, obj2);
    }

    @Override // defpackage.yua1
    public final boolean h(zfb1 zfb1Var, x7b1 x7b1Var, x7b1 x7b1Var2) {
        return qxa1.d(this.c, zfb1Var, x7b1Var, x7b1Var2);
    }
}
