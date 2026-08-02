package xsna;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: Semaphore.kt */
/* loaded from: classes11.dex */
public final class fhi0 extends n4i0<fhi0> {
    public final /* synthetic */ AtomicReferenceArray f;

    public fhi0(long j, fhi0 fhi0Var, int i) {
        super(j, fhi0Var, i);
        this.f = new AtomicReferenceArray(ehi0.f);
    }

    @Override // xsna.n4i0
    public final int g() {
        return ehi0.f;
    }

    @Override // xsna.n4i0
    public final void h(int i, kotlin.coroutines.d dVar) {
        this.f.set(i, ehi0.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
