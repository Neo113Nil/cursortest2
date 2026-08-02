package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes11.dex */
public abstract class jyx extends qzz implements ogn, atw {
    public pyx e;

    @Override // xsna.atw
    public final b570 b() {
        return null;
    }

    @Override // xsna.ogn
    public final void dispose() {
        pyx pyxVar = this.e;
        if (pyxVar == null) {
            pyxVar = null;
        }
        pyxVar.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyx.b;
            Object obj = atomicReferenceFieldUpdater.get(pyxVar);
            if (obj instanceof jyx) {
                if (obj != this) {
                    return;
                }
                nep nepVar = tyx.g;
                while (!atomicReferenceFieldUpdater.compareAndSet(pyxVar, obj, nepVar)) {
                    if (atomicReferenceFieldUpdater.get(pyxVar) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof atw) || ((atw) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = qzz.b;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof yxf0) {
                    qzz qzzVar = ((yxf0) obj2).a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                qzz qzzVar2 = (qzz) obj2;
                qzzVar2.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = qzz.d;
                yxf0 yxf0Var = (yxf0) atomicReferenceFieldUpdater3.get(qzzVar2);
                if (yxf0Var == null) {
                    yxf0Var = new yxf0(qzzVar2);
                    atomicReferenceFieldUpdater3.set(qzzVar2, yxf0Var);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, yxf0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                qzzVar2.d();
                return;
            }
        }
    }

    public abstract boolean h();

    public abstract void i(Throwable th);

    @Override // xsna.atw
    public final boolean isActive() {
        return true;
    }

    @Override // xsna.qzz
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(y6l.a(this));
        sb.append("[job@");
        pyx pyxVar = this.e;
        if (pyxVar == null) {
            pyxVar = null;
        }
        sb.append(y6l.a(pyxVar));
        sb.append(']');
        return sb.toString();
    }
}
