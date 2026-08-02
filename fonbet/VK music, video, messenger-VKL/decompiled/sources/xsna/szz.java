package xsna;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes11.dex */
public final class szz<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(szz.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(szz.class, "_state$volatile");
    public static final con0 g = new con0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    public szz(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(E e2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, e2);
                    szz<E> szzVar = this;
                    while ((atomicLongFieldUpdater.get(szzVar) & 1152921504606846976L) != 0) {
                        szzVar = szzVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = szzVar.d;
                        int i4 = szzVar.c & i2;
                        Object obj = atomicReferenceArray2.get(i4);
                        if ((obj instanceof a) && ((a) obj).a == i2) {
                            atomicReferenceArray2.set(i4, e2);
                        } else {
                            szzVar = null;
                        }
                        if (szzVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final szz<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        szz<E> szzVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                szzVar = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            szzVar = this;
            if (atomicLongFieldUpdater.compareAndSet(szzVar, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            szz<E> szzVar2 = (szz) atomicReferenceFieldUpdater.get(this);
            if (szzVar2 != null) {
                return szzVar2;
            }
            szz szzVar3 = new szz(szzVar.a * 2, szzVar.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = szzVar.c;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    Object obj = szzVar.d.get(i4);
                    if (obj == null) {
                        obj = new a(i);
                    }
                    szzVar3.d.set(szzVar3.c & i, obj);
                    i++;
                }
            }
            atomicLongFieldUpdater.set(szzVar3, (-1152921504606846977L) & j);
            io.reactivex.rxjava3.internal.operators.mixed.n.f(atomicReferenceFieldUpdater, this, szzVar3);
        }
    }

    public final Object d() {
        szz<E> szzVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(szzVar);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = szzVar.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = szzVar.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = szzVar.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof a) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(szzVar, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                szzVar = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(szzVar);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            szzVar = szzVar.c();
                        } else {
                            szz<E> szzVar2 = szzVar;
                            if (f.compareAndSet(szzVar2, j3, (j3 & (-1073741824)) | j2)) {
                                szzVar2.d.set(i4 & szzVar2.c, null);
                                szzVar = null;
                            } else {
                                szzVar = szzVar2;
                            }
                        }
                        if (szzVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
