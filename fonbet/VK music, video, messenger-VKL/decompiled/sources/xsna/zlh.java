package xsna;

import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityProfileContentWallFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class zlh implements jxg<CommunityProfileContentItem> {
    public final bw6 a;

    public zlh(bw6 bw6Var) {
        this.a = bw6Var;
    }

    @Override // xsna.jxg
    public final void k(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        boolean z = communityProfileContentItem instanceof b9x0;
        bw6 bw6Var = this.a;
        if (z) {
            bw6Var.invoke(new d.f(b9x0.i((b9x0) communityProfileContentItem, CommunityProfileContentItem.State.LOADED, 27)));
        } else if (communityProfileContentItem instanceof p5o) {
            bw6Var.invoke(new d.f(p5o.i((p5o) communityProfileContentItem, CommunityProfileContentItem.State.LOADED)));
        }
    }

    @Override // xsna.jxg
    public final void onDestroy() {
    }

    @Override // xsna.jxg
    public final void onPause() {
    }

    @Override // xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
    }

    @Override // xsna.jxg
    public final void a(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void h(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void j(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }
}
