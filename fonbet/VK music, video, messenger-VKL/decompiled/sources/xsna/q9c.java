package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes11.dex */
public final class q9c extends jyx {
    public final lq9<?> f;

    public q9c(lq9<?> lq9Var) {
        this.f = lq9Var;
    }

    @Override // xsna.jyx
    public final boolean h() {
        return true;
    }

    @Override // xsna.jyx
    public final void i(Throwable th) {
        pyx pyxVar = this.e;
        if (pyxVar == null) {
            pyxVar = null;
        }
        lq9<?> lq9Var = this.f;
        Throwable m = lq9Var.m(pyxVar);
        if (lq9Var.u()) {
            mcn mcnVar = (mcn) lq9Var.e;
            mcnVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mcn.i;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(mcnVar);
                if (epx.f(obj, upj.b)) {
                    if (u11.j(atomicReferenceFieldUpdater, mcnVar, m)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (v11.f(atomicReferenceFieldUpdater, mcnVar, obj)) {
                        break;
                    }
                }
            }
        }
        lq9Var.z(m);
        if (lq9Var.u()) {
            return;
        }
        lq9Var.k();
    }
}
