package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class aa extends qke {
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;
    public final AtomicReferenceFieldUpdater v;
    public final AtomicReferenceFieldUpdater w;
    public final AtomicReferenceFieldUpdater x;

    public aa(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.t = atomicReferenceFieldUpdater;
        this.u = atomicReferenceFieldUpdater2;
        this.v = atomicReferenceFieldUpdater3;
        this.w = atomicReferenceFieldUpdater4;
        this.x = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.qke
    public final boolean d(ga gaVar, y9 y9Var, y9 y9Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.w;
            if (atomicReferenceFieldUpdater.compareAndSet(gaVar, y9Var, y9Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gaVar) == y9Var);
        return false;
    }

    @Override // defpackage.qke
    public final boolean e(ga gaVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.x;
            if (atomicReferenceFieldUpdater.compareAndSet(gaVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gaVar) == obj);
        return false;
    }

    @Override // defpackage.qke
    public final boolean f(ga gaVar, ea eaVar, ea eaVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.v;
            if (atomicReferenceFieldUpdater.compareAndSet(gaVar, eaVar, eaVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gaVar) == eaVar);
        return false;
    }

    @Override // defpackage.qke
    public final void x(ea eaVar, ea eaVar2) {
        this.u.lazySet(eaVar, eaVar2);
    }

    @Override // defpackage.qke
    public final void y(ea eaVar, Thread thread) {
        this.t.lazySet(eaVar, thread);
    }
}
