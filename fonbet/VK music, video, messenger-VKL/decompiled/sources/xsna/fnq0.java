package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: UserProfileContentDonutWallFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class fnq0 extends wmq0<p5o, s3q0> {
    public final String m;

    public fnq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z) {
        super(dvq0Var, r0e0Var, z);
        this.m = "donut_wall";
    }

    @Override // xsna.wmq0
    public final void A(p5o p5oVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        p5o p5oVar2 = p5oVar;
        if (state == null) {
            state = p5oVar2.l;
        }
        z(p5o.i(p5oVar2, state));
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return p5o.i((p5o) communityProfileContentItem, CommunityProfileContentItem.State.RELOAD);
    }

    @Override // xsna.wmq0
    public final p5o s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.m;
        if (str.equals(str2)) {
            return new p5o(new CommunityProfileContentItem.b(R.string.community_content_wall_empty, null, null, null, null, 30), new CommunityProfileContentItem.c(R.string.community_content_wall_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.LOADED, mVar.b);
        }
        throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str2).toString());
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.m;
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ void w(CommunityProfileContentItem communityProfileContentItem) {
    }
}
