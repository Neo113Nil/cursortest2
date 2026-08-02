package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.pf60;
import xsna.xn60;

/* compiled from: NewsfeedCustomLifecycleActor.kt */
/* loaded from: classes4.dex */
public final class of60 extends al50<xf60, pf60.c, on50, lg60, vf60, rf60> {
    public final sj50<xf60, on50, lg60, vf60, rf60> c;
    public final tq60 d;

    public of60(tf60 tf60Var, sj50<xf60, on50, lg60, vf60, rf60> sj50Var, AtomicReference<wn60> atomicReference) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new tq60(new dht(this, tf60Var), atomicReference);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        pf60.c cVar = (pf60.c) lj50Var;
        if (!(cVar instanceof pf60.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        xn60.c cVar2 = ((pf60.c.a) cVar).b;
        this.d.p(cVar2);
        if (cVar2 instanceof xn60.c.a) {
            xn60.c.a aVar = (xn60.c.a) cVar2;
            if (aVar.equals(xn60.c.a.C4021a.b) || aVar.equals(xn60.c.a.d.b)) {
                return;
            }
            if (aVar.equals(xn60.c.a.C4022c.b)) {
                a(kg60.b);
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
        if (!(cVar2 instanceof xn60.c.InterfaceC4025c)) {
            if (!(cVar2 instanceof xn60.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        xn60.c.InterfaceC4025c interfaceC4025c = (xn60.c.InterfaceC4025c) cVar2;
        if (interfaceC4025c.equals(xn60.c.InterfaceC4025c.b.b)) {
            a(jg60.b);
        } else if (!interfaceC4025c.equals(xn60.c.InterfaceC4025c.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
