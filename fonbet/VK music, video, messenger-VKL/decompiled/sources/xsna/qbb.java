package xsna;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes11.dex */
public final class qbb<E> extends n4i0<qbb<E>> {
    public final nm8<E> f;
    public final /* synthetic */ AtomicReferenceArray g;

    public qbb(long j, qbb<E> qbbVar, nm8<E> nm8Var, int i) {
        super(j, qbbVar, i);
        this.f = nm8Var;
        this.g = new AtomicReferenceArray(tm8.b * 2);
    }

    @Override // xsna.n4i0
    public final int g() {
        return tm8.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0052, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0054, code lost:
    
        r7 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0056, code lost:
    
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0058, code lost:
    
        xsna.fvr.g(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // xsna.n4i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, kotlin.coroutines.d dVar) {
        izs<E, s3q0> izsVar;
        int i2 = tm8.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.g.get(i * 2);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof a8x0;
            nm8<E> nm8Var = this.f;
            if (z2 || (l instanceof b8x0)) {
                if (k(i, l, z ? tm8.j : tm8.k)) {
                    n(i, null);
                    m(i, !z);
                    if (!z || (izsVar = nm8Var.c) == null) {
                        return;
                    }
                    fvr.g(izsVar, obj, dVar);
                    return;
                }
            } else {
                if (l == tm8.j || l == tm8.k) {
                    break;
                }
                if (l != tm8.g && l != tm8.f) {
                    if (l != tm8.i && l != tm8.d && l != tm8.l) {
                        throw new IllegalStateException(rqi.c(l, "unexpected state: "));
                    }
                    return;
                }
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.g;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.g.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            this.f.N((this.d * tm8.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.g.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.g.set((i * 2) + 1, obj);
    }
}
