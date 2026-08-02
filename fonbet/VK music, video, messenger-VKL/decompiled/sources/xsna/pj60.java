package xsna;

import com.vk.toggle.features.FeedFeatures;
import kotlin.NoWhenBranchMatchedException;
import xsna.r070;
import xsna.vs60;

/* compiled from: NewsfeedFreshNewsActor.kt */
/* loaded from: classes4.dex */
public final class pj60 extends al50<qz60, vs60.c, on50, r070, jv60, xh60> {
    public final sj50<qz60, on50, r070, jv60, xh60> c;

    public pj60(sj50<qz60, on50, r070, jv60, xh60> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        vs60.c cVar = (vs60.c) lj50Var;
        if (cVar instanceof vs60.c.a) {
            FeedFeatures feedFeatures = FeedFeatures.FRESH_TIMER;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures)) {
                a(r070.f.b.b);
                return;
            } else {
                a(r070.e.c.b);
                return;
            }
        }
        if (cVar instanceof vs60.c.C3902c) {
            a(new r070.e.h(((vs60.c.C3902c) cVar).b));
        } else {
            if (!(cVar instanceof vs60.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(new r070.e.a(((vs60.c.b) cVar).b));
        }
    }
}
