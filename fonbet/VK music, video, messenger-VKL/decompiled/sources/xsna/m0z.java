package xsna;

import android.view.View;
import com.vk.community.design.view.skeleton.community.CommunityProfileSkeleton;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import kotlin.NoWhenBranchMatchedException;
import xsna.yth;

/* compiled from: CommunityProfileChromeDelegate.kt */
/* loaded from: classes5.dex */
public final class m0z implements xeh {
    public final View a;
    public final yth b;

    public m0z(View view, View view2, View view3, View view4) {
        this.a = view4;
        this.b = new yth((CommunityProfileSkeleton) view, view2, view3);
    }

    @Override // xsna.xeh
    public final void b(int i) {
        f4m.l(i, i, this.b.a);
    }

    @Override // xsna.xeh
    public final void c(CommunityProfileViewState.Data.LoadingState loadingState) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(4);
        }
        yth ythVar = this.b;
        View view2 = ythVar.c;
        View view3 = ythVar.b;
        CommunityProfileSkeleton communityProfileSkeleton = ythVar.a;
        int i = yth.a.$EnumSwitchMapping$0[loadingState.ordinal()];
        if (i == 1) {
            view3.setVisibility(0);
            communityProfileSkeleton.setVisibility(4);
            view2.setVisibility(4);
            return;
        }
        if (i == 2) {
            view3.setVisibility(4);
            communityProfileSkeleton.setVisibility(0);
            communityProfileSkeleton.setCover(false);
            view2.setVisibility(4);
            return;
        }
        if (i == 3) {
            view3.setVisibility(4);
            communityProfileSkeleton.setVisibility(0);
            communityProfileSkeleton.setCover(true);
            view2.setVisibility(4);
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        view3.setVisibility(0);
        communityProfileSkeleton.setVisibility(4);
        view2.setVisibility(0);
    }
}
