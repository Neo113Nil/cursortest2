package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;

/* compiled from: UserProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class pqq0 implements bjh {
    public final /* synthetic */ nqq0 a;

    public pqq0(nqq0 nqq0Var) {
        this.a = nqq0Var;
    }

    @Override // xsna.bjh
    public final void a(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.k(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void b(UserId userId) {
        this.a.d.a(UserProfileAction.c0.a.b);
    }

    @Override // xsna.bjh
    public final void c(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.h(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void d(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.a(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.d(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void f(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.b(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void g(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.c(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final float i() {
        nqq0 nqq0Var = this.a;
        nqq0Var.getClass();
        UserProfileHeaderView userProfileHeaderView = nqq0Var.g;
        if (userProfileHeaderView == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return userProfileHeaderView.getTranslationY() + userProfileHeaderView.getBottom();
    }

    @Override // xsna.bjh
    public final void j(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.i(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void k(CommunityProfileContentItem communityProfileContentItem, CommunityProfileContentItem communityProfileContentItem2) {
        this.a.d.a(new UserProfileAction.g.o(communityProfileContentItem, communityProfileContentItem2));
    }

    @Override // xsna.bjh
    public final void l(CommunityProfileContentItem communityProfileContentItem, boolean z) {
        this.a.d.a(new UserProfileAction.g.l(communityProfileContentItem, z));
    }

    @Override // xsna.bjh
    public final void m(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.C1687g(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void h(String str) {
    }
}
