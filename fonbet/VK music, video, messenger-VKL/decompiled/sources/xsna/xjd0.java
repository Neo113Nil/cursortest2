package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ejd0;
import xsna.smd0;
import xsna.tkd0;

/* compiled from: ProductCardCommunityInfoActor.kt */
/* loaded from: classes18.dex */
public final class xjd0 extends al50<nmd0, ejd0.b, on50, smd0, xld0, tkd0> {
    public final sj50<nmd0, on50, smd0, xld0, tkd0> c;

    public xjd0(sj50<nmd0, on50, smd0, xld0, tkd0> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        ejd0.b bVar = (ejd0.b) lj50Var;
        boolean equals = bVar.equals(ejd0.b.d.b);
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (equals) {
            ekd0 ekd0Var = ((nmd0) sj50Var.getCurrentState()).j;
            if (ekd0Var == null) {
                return;
            }
            if (ekd0Var.d) {
                c(new tkd0.b.f(((nmd0) sj50Var.getCurrentState()).b));
                return;
            } else {
                a(smd0.b.a.b);
                return;
            }
        }
        if (bVar.equals(ejd0.b.C2816b.b)) {
            c(new tkd0.b.a(((nmd0) sj50Var.getCurrentState()).b));
            return;
        }
        if (bVar.equals(ejd0.b.a.b)) {
            kkd0 kkd0Var = ((nmd0) sj50Var.getCurrentState()).k;
            if (kkd0Var == null) {
                return;
            }
            if (kkd0Var.g) {
                c(new tkd0.b.d(((nmd0) sj50Var.getCurrentState()).b));
                return;
            } else {
                c(new tkd0.b.C3753b(((nmd0) sj50Var.getCurrentState()).b));
                return;
            }
        }
        if (bVar.equals(ejd0.b.c.b)) {
            c(new tkd0.b.e(((nmd0) sj50Var.getCurrentState()).c, ((nmd0) sj50Var.getCurrentState()).b));
            return;
        }
        if (!bVar.equals(ejd0.b.e.b)) {
            if (!(bVar instanceof ejd0.b.f)) {
                throw new NoWhenBranchMatchedException();
            }
            a(new smd0.b.C3679b(((ejd0.b.f) bVar).b));
        } else {
            kkd0 kkd0Var2 = ((nmd0) sj50Var.getCurrentState()).k;
            if (kkd0Var2 == null) {
                return;
            }
            c(new tkd0.b.c(((nmd0) sj50Var.getCurrentState()).b, !kkd0Var2.e && kkd0Var2.c > 0));
        }
    }
}
