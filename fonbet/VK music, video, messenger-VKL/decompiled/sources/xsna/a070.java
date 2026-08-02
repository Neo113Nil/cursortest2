package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.r070;
import xsna.vs60;
import xsna.xh60;

/* compiled from: NewsfeedStoriesActor.kt */
/* loaded from: classes4.dex */
public final class a070 extends al50<qz60, vs60.i, on50, r070, jv60, xh60> {
    public final sj50<qz60, on50, r070, jv60, xh60> c;

    public a070(sj50<qz60, on50, r070, jv60, xh60> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        vs60.i iVar = (vs60.i) lj50Var;
        if (iVar instanceof vs60.i.c) {
            a(new r070.k.e(((vs60.i.c) iVar).b));
            return;
        }
        boolean z = iVar instanceof zs60;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z) {
            c(new bi60(null, ((qz60) sj50Var.getCurrentState()).f));
            return;
        }
        if (iVar instanceof vs60.i.d) {
            c(new xh60.h.e(null, ((qz60) sj50Var.getCurrentState()).f));
            return;
        }
        if (iVar instanceof vs60.i.a) {
            c(new xh60.h.b(((vs60.i.a) iVar).b));
        } else if (iVar instanceof vs60.i.b) {
            a(r070.k.c.b);
        } else {
            if (!(iVar instanceof vs60.i.e)) {
                throw new NoWhenBranchMatchedException();
            }
            a(new r070.k.h(((vs60.i.e) iVar).b));
        }
    }
}
