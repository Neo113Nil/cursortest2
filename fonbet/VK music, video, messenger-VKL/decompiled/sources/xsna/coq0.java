package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: UserProfileContentWallFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class coq0 extends wmq0<b9x0, s3q0> {
    public final String m;

    public coq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z) {
        super(dvq0Var, r0e0Var, z);
        this.m = "wall";
    }

    @Override // xsna.wmq0
    public final void A(b9x0 b9x0Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        b9x0 b9x0Var2 = b9x0Var;
        if (state == null) {
            state = b9x0Var2.l;
        }
        z(b9x0.i(b9x0Var2, state, 27));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(b9x0.i((b9x0) communityProfileContentItem, null, 15));
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return b9x0.i((b9x0) communityProfileContentItem, CommunityProfileContentItem.State.RELOAD, 27);
    }

    @Override // xsna.wmq0
    public final b9x0 s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.m;
        if (str.equals(str2)) {
            return new b9x0(new CommunityProfileContentItem.b(R.string.community_content_wall_empty, null, null, null, null, 30), new CommunityProfileContentItem.c(R.string.community_content_wall_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.LOADED, mVar.b, 16);
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
