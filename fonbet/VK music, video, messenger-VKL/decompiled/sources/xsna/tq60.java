package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.xn60;

/* compiled from: NewsfeedListLifecycleActor.kt */
/* loaded from: classes4.dex */
public final class tq60 extends al50<ur60, xn60.c, on50, ds60, qr60, yo60> {
    public final AtomicReference<wn60> c;
    public boolean d;
    public int e;

    public tq60(dht dhtVar, AtomicReference atomicReference) {
        super(dhtVar);
        this.c = atomicReference;
    }

    @Override // xsna.qj50
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void p(xn60.c cVar) {
        if (cVar instanceof xn60.c.a) {
            xn60.c.a aVar = (xn60.c.a) cVar;
            if (aVar.equals(xn60.c.a.C4021a.b)) {
                return;
            }
            if (aVar.equals(xn60.c.a.d.b)) {
                q(true);
                return;
            } else if (aVar.equals(xn60.c.a.C4022c.b)) {
                q(false);
                return;
            } else {
                if (!aVar.equals(xn60.c.a.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (cVar instanceof co60) {
            return;
        }
        if (cVar instanceof do60) {
            q(false);
            return;
        }
        if (cVar instanceof eo60) {
            q(true);
            return;
        }
        if (cVar instanceof xn60.c.InterfaceC4025c) {
            xn60.c.InterfaceC4025c interfaceC4025c = (xn60.c.InterfaceC4025c) cVar;
            if (interfaceC4025c.equals(xn60.c.InterfaceC4025c.b.b)) {
                if (this.d) {
                    return;
                }
                r(true);
                return;
            } else {
                if (!interfaceC4025c.equals(xn60.c.InterfaceC4025c.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.d) {
                    r(false);
                    return;
                }
                return;
            }
        }
        if (!(cVar instanceof xn60.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        xn60.c.b bVar = (xn60.c.b) cVar;
        boolean equals = bVar.equals(xn60.c.b.C4024c.b);
        AtomicReference<wn60> atomicReference = this.c;
        if (equals) {
            if ((atomicReference.get().a & 2) != 0) {
                int i = this.e + 1;
                this.e = i;
                if (i == 1) {
                    x1o0.q(atomicReference, true);
                    return;
                }
                return;
            }
            return;
        }
        if (bVar.equals(xn60.c.b.h.b)) {
            return;
        }
        if (bVar.equals(xn60.c.b.d.b)) {
            int i2 = this.e - 1;
            this.e = i2;
            if (i2 <= 0) {
                x1o0.q(atomicReference, false);
                return;
            }
            return;
        }
        if (bVar instanceof xn60.c.b.f) {
            atomicReference.set(new wn60(wn60.a(atomicReference.get().a, false, false, false, ((xn60.c.b.f) cVar).b, false, 23)));
            return;
        }
        if (bVar instanceof xn60.c.b.e) {
            atomicReference.set(new wn60(wn60.a(atomicReference.get().a, ((xn60.c.b.e) cVar).b, false, false, false, false, 30)));
        } else if (bVar instanceof xn60.c.b.g) {
            x1o0.q(atomicReference, false);
        } else if (!bVar.equals(xn60.c.b.C4023b.b) && !bVar.equals(xn60.c.b.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void q(boolean z) {
        AtomicReference<wn60> atomicReference = this.c;
        atomicReference.set(new wn60(wn60.a(atomicReference.get().a, false, z, false, false, false, 29)));
    }

    public final void r(boolean z) {
        this.d = z;
        AtomicReference<wn60> atomicReference = this.c;
        atomicReference.set(new wn60(wn60.a(atomicReference.get().a, false, false, z, false, false, 27)));
    }
}
