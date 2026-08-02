package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes11.dex */
public class qzz {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(qzz.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(qzz.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(qzz.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(qzz qzzVar, int i) {
        while (true) {
            qzz d2 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            if (d2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    d2 = (qzz) obj;
                    if (!d2.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d2);
                }
            }
            if (d2 instanceof gez) {
                return (((gez) d2).e & i) == 0 && d2.c(qzzVar, i);
            }
            atomicReferenceFieldUpdater.set(qzzVar, d2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            atomicReferenceFieldUpdater2.set(qzzVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(d2, this, qzzVar)) {
                if (atomicReferenceFieldUpdater2.get(d2) != this) {
                    break;
                }
            }
            qzzVar.e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((xsna.yxf0) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qzz d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            qzz qzzVar = (qzz) atomicReferenceFieldUpdater.get(this);
            qzz qzzVar2 = qzzVar;
            while (true) {
                qzz qzzVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                    Object obj = atomicReferenceFieldUpdater2.get(qzzVar2);
                    if (obj == this) {
                        if (qzzVar == qzzVar2) {
                            return qzzVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, qzzVar, qzzVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != qzzVar) {
                                break;
                            }
                        }
                        return qzzVar2;
                    }
                    if (g()) {
                        return null;
                    }
                    if (!(obj instanceof yxf0)) {
                        qzzVar3 = qzzVar2;
                        qzzVar2 = (qzz) obj;
                    } else {
                        if (qzzVar3 != null) {
                            break;
                        }
                        qzzVar2 = (qzz) atomicReferenceFieldUpdater.get(qzzVar2);
                    }
                }
                qzzVar2 = qzzVar3;
            }
        }
    }

    public final void e(qzz qzzVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            qzz qzzVar2 = (qzz) atomicReferenceFieldUpdater.get(qzzVar);
            if (b.get(this) != qzzVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(qzzVar, qzzVar2, this)) {
                if (atomicReferenceFieldUpdater.get(qzzVar) != qzzVar2) {
                    break;
                }
            }
            if (g()) {
                qzzVar.d();
                return;
            }
            return;
        }
    }

    public final qzz f() {
        qzz qzzVar;
        Object obj = b.get(this);
        yxf0 yxf0Var = obj instanceof yxf0 ? (yxf0) obj : null;
        return (yxf0Var == null || (qzzVar = yxf0Var.a) == null) ? (qzz) obj : qzzVar;
    }

    public boolean g() {
        return b.get(this) instanceof yxf0;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: xsna.qzz.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + y6l.a(this);
    }
}
