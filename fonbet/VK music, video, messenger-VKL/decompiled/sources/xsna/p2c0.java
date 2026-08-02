package xsna;

import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.t4c0;
import xsna.t5c0;

/* compiled from: PostEntryMviActor.kt */
/* loaded from: classes4.dex */
public final class p2c0 extends al50<m5c0, t4c0.a, on50, t5c0, h5c0, d5c0> {
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        t4c0.a aVar = (t4c0.a) lj50Var;
        if (aVar instanceof t4c0.a.b) {
            a(new u5c0(new ds60.b(new NewsfeedExternalAction.c.f0(null))));
        } else {
            if (!(aVar instanceof t4c0.a.C3717a)) {
                throw new NoWhenBranchMatchedException();
            }
            a(t5c0.b.a.b);
        }
    }
}
