package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommunityProfileQuerySearchFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class ysh {
    public final wmc a;

    public ysh(wmc wmcVar) {
        this.a = wmcVar;
    }

    public final void a(CommunityProfileAction.b0 b0Var) {
        boolean z = b0Var instanceof CommunityProfileAction.b0.a;
        wmc wmcVar = this.a;
        if (z) {
            wmcVar.invoke(d.l.a.a);
        } else {
            if (!(b0Var instanceof CommunityProfileAction.b0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            wmcVar.invoke(new d.l.c(((CommunityProfileAction.b0.b) b0Var).b));
        }
    }
}
