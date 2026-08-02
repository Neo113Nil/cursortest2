package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ejd0;

/* compiled from: ProductCardDataActor.kt */
/* loaded from: classes18.dex */
public final class okd0 extends al50<nmd0, ejd0.c, on50, smd0, xld0, tkd0> {
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        ejd0.c cVar = (ejd0.c) lj50Var;
        boolean z = cVar instanceof ejd0.c.a;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z) {
        } else if (cVar instanceof ejd0.c.C2817c) {
        } else {
            if (!(cVar instanceof ejd0.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
