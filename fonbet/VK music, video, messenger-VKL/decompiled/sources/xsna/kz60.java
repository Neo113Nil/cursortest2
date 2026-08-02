package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.jv60;
import xsna.vs60;

/* compiled from: NewsfeedSitpostingActor.kt */
/* loaded from: classes4.dex */
public final class kz60 extends al50<qz60, vs60.h, on50, r070, jv60, xh60> {
    public final sj50<qz60, on50, r070, jv60, xh60> c;

    public kz60(sj50<qz60, on50, r070, jv60, xh60> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        vs60.h hVar = (vs60.h) lj50Var;
        if (hVar instanceof ws60) {
            a(new x070(((ws60) hVar).b));
            return;
        }
        if (hVar instanceof ys60) {
            a(new y070(((ys60) hVar).b));
        } else {
            if (!(hVar instanceof xs60)) {
                throw new NoWhenBranchMatchedException();
            }
            e(jv60.d.c.a);
            c(new zh60(((xs60) hVar).b));
        }
    }
}
