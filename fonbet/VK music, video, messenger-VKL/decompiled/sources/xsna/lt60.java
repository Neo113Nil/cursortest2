package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.vs60;
import xsna.xn60;

/* compiled from: NewsfeedMainListActor.kt */
/* loaded from: classes4.dex */
public final class lt60 extends al50<qz60, vs60.g, on50, r070, jv60, xh60> {
    public final sj50<qz60, on50, r070, jv60, xh60> c;
    public final go60 d;

    public lt60(ot60 ot60Var, sj50<qz60, on50, r070, jv60, xh60> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new go60(new dht(this, ot60Var));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        xn60.d dVar;
        vs60.g gVar = (vs60.g) lj50Var;
        if (gVar instanceof vs60.g.a) {
            dVar = xn60.d.a.b;
        } else if (gVar instanceof vs60.g.c) {
            dVar = xn60.d.c.b;
        } else {
            if (!(gVar instanceof vs60.g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = xn60.d.b.b;
        }
        this.d.p(dVar);
    }
}
