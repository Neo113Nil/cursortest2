package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.m2n;
import xsna.xn60;

/* compiled from: DiscoverMediaLifecycleActor.kt */
/* loaded from: classes4.dex */
public final class u3n extends al50<t4n, m2n.c, on50, l5n, h4n, e3n> {
    public final sj50<t4n, on50, l5n, h4n, e3n> c;
    public final AtomicReference<wn60> d;
    public final tq60 e;
    public boolean f;

    public u3n(z3n z3nVar, sj50<t4n, on50, l5n, h4n, e3n> sj50Var, AtomicReference<wn60> atomicReference) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = atomicReference;
        this.e = new tq60(new dht(this, z3nVar), atomicReference);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        m2n.c cVar = (m2n.c) lj50Var;
        if (!(cVar instanceof m2n.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        xn60.c cVar2 = ((m2n.c.a) cVar).b;
        this.e.p(cVar2);
        if (cVar2 instanceof xn60.c.a) {
            xn60.c.a aVar = (xn60.c.a) cVar2;
            if (aVar.equals(xn60.c.a.C4021a.b) || aVar.equals(xn60.c.a.d.b)) {
                return;
            }
            if (aVar.equals(xn60.c.a.C4022c.b)) {
                a(s5n.b);
                return;
            } else {
                if (!aVar.equals(xn60.c.a.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if ((cVar2 instanceof co60) || (cVar2 instanceof do60) || (cVar2 instanceof eo60)) {
            return;
        }
        if (cVar2 instanceof xn60.c.InterfaceC4025c) {
            xn60.c.InterfaceC4025c interfaceC4025c = (xn60.c.InterfaceC4025c) cVar2;
            if (interfaceC4025c.equals(xn60.c.InterfaceC4025c.b.b)) {
                a(r5n.b);
                if (this.f) {
                    return;
                }
                this.f = true;
                return;
            }
            if (!interfaceC4025c.equals(xn60.c.InterfaceC4025c.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f) {
                this.f = false;
                return;
            }
            return;
        }
        if (!(cVar2 instanceof xn60.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        xn60.c.b bVar = (xn60.c.b) cVar2;
        if (bVar.equals(xn60.c.b.C4024c.b)) {
            byte b = this.d.get().a;
            return;
        }
        if (!bVar.equals(xn60.c.b.h.b) && !bVar.equals(xn60.c.b.d.b) && !(bVar instanceof xn60.c.b.f) && !(bVar instanceof xn60.c.b.e) && !(bVar instanceof xn60.c.b.g) && !bVar.equals(xn60.c.b.C4023b.b) && !bVar.equals(xn60.c.b.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
