package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xsna.swi;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes11.dex */
public abstract class swi<N extends swi<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(swi.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(swi.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public swi(n4i0 n4i0Var) {
        this._prev$volatile = n4i0Var;
    }

    public final void b() {
        c.set(this, null);
    }

    public final N c() {
        Object obj = b.get(this);
        if (obj == rwi.a) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.swi] */
    public final void e() {
        Object obj;
        ?? c2;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            swi swiVar = (swi) atomicReferenceFieldUpdater.get(this);
            while (swiVar != null && swiVar.d()) {
                swiVar = (swi) atomicReferenceFieldUpdater.get(swiVar);
            }
            N c3 = c();
            while (c3.d() && (c2 = c3.c()) != 0) {
                c3 = c2;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(c3);
            } while (!hq.d(atomicReferenceFieldUpdater, c3, obj, ((swi) obj) == null ? null : swiVar));
            if (swiVar != null) {
                b.set(swiVar, c3);
            }
            if (!c3.d() || c3.c() == null) {
                if (swiVar == null || !swiVar.d()) {
                    return;
                }
            }
        }
    }
}
