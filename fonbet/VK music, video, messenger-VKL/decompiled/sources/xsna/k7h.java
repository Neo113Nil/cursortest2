package xsna;

import com.vk.profile.community.core.communityleave.LeaveAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.m7h;
import xsna.q7h;
import xsna.t6h;

/* compiled from: CommunityLeaveFeature.kt */
/* loaded from: classes5.dex */
public final class k7h extends wk50<t7h, r7h, t6h, m7h> {
    public final f4z f;

    public k7h(boolean z) {
        super(new t6h.b(LeaveAction.STAY_ADMIN), new p7h(new r7h(z, 1)));
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(r7h r7hVar, t6h t6hVar) {
        r7h r7hVar2 = r7hVar;
        t6h t6hVar2 = t6hVar;
        if (t6hVar2 instanceof t6h.b) {
            T(new m7h.a(((t6h.b) t6hVar2).b));
            return;
        }
        boolean equals = t6hVar2.equals(t6h.c.b);
        f4z f4zVar = this.f;
        if (equals) {
            f4zVar.b(new q7h.b(r7hVar2.b));
        } else {
            if (!t6hVar2.equals(t6h.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(q7h.a.a);
        }
    }
}
