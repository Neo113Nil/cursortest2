package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes11.dex */
public class rzz<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(rzz.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new szz(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            szz szzVar = (szz) atomicReferenceFieldUpdater.get(this);
            int a2 = szzVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                szz<E> c = szzVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, szzVar, c) && atomicReferenceFieldUpdater.get(this) == szzVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final int b() {
        szz szzVar = (szz) a.get(this);
        szzVar.getClass();
        long j = szz.f.get(szzVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final E c() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            szz szzVar = (szz) atomicReferenceFieldUpdater.get(this);
            E e = (E) szzVar.d();
            if (e != szz.g) {
                return e;
            }
            szz<E> c = szzVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, szzVar, c) && atomicReferenceFieldUpdater.get(this) == szzVar) {
            }
        }
    }
}
