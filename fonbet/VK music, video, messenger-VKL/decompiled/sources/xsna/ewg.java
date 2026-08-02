package xsna;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import xsna.mvg;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ewg implements SwipeRefreshLayout.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ gm50 c;

    public /* synthetic */ ewg(gm50 gm50Var, int i) {
        this.b = i;
        this.c = gm50Var;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
        int i = this.b;
        gm50 gm50Var = this.c;
        switch (i) {
            case 0:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) gm50Var;
                int i2 = CommunityCheckListFragment.Y;
                mvg.f fVar = mvg.f.b;
                communityCheckListFragment.getClass();
                xn50.a.c(communityCheckListFragment, fVar);
                break;
            default:
                ((com.vk.profile.user.impl.ui.i) gm50Var).c.a(new UserProfileAction.x(null, 11));
                break;
        }
    }
}
