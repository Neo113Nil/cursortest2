package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.channels.a;

/* loaded from: classes9.dex */
public final class pi9 extends s7q0 {
    public final /* synthetic */ AtomicReferenceArray A;
    public final a z;

    public pi9(long j, pi9 pi9Var, a aVar, int i) {
        super(j, pi9Var, i);
        this.z = aVar;
        this.A = new AtomicReferenceArray(kq6.b * 2);
    }

    @Override // defpackage.s7q0
    public final int l() {
        return kq6.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x004c, code lost:
    
        s(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004f, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0051, code lost:
    
        r6 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0053, code lost:
    
        if (r6 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0055, code lost:
    
        defpackage.sub1.a(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // defpackage.s7q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i, fse fseVar) {
        tls tlsVar;
        int i2 = kq6.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.A.get(i * 2);
        while (true) {
            Object q = q(i);
            boolean z2 = q instanceof k041;
            a aVar = this.z;
            if (z2 || (q instanceof l041)) {
                if (p(i, q, z ? kq6.j : kq6.k)) {
                    s(i, null);
                    r(i, !z);
                    if (!z || (tlsVar = aVar.b) == null) {
                        return;
                    }
                    sub1.a(tlsVar, obj, fseVar);
                    return;
                }
            } else {
                if (q == kq6.j || q == kq6.k) {
                    break;
                }
                if (q != kq6.g && q != kq6.f) {
                    if (q == kq6.i || q == kq6.d || q == kq6.l) {
                        return;
                    }
                    ny61.r(b64.i("unexpected state: ", q));
                    return;
                }
            }
        }
    }

    public final boolean p(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.A;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.A.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            this.z.T((this.x * kq6.b) + i);
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.A.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.A.set((i * 2) + 1, obj);
    }
}
