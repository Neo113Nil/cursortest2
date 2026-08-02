package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: UserProfileContentArchiveFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class smq0 extends wmq0<hg3, s3q0> {
    public final String m;

    public smq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z) {
        super(dvq0Var, r0e0Var, z);
        this.m = "archive_wall";
    }

    @Override // xsna.wmq0
    public final void A(hg3 hg3Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        hg3 hg3Var2 = hg3Var;
        if (state == null) {
            state = hg3Var2.l;
        }
        z(hg3.i(hg3Var2, state, 27));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(hg3.i((hg3) communityProfileContentItem, null, 15));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void h(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        wmq0.B(this, (hg3) communityProfileContentItem, CommunityProfileContentItem.State.LOADED, null, 4);
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return hg3.i((hg3) communityProfileContentItem, CommunityProfileContentItem.State.RELOAD, 27);
    }

    @Override // xsna.wmq0
    public final hg3 s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.m;
        if (str.equals(str2)) {
            return new hg3(new CommunityProfileContentItem.b(R.string.community_content_wall_empty, null, null, null, null, 30), new CommunityProfileContentItem.c(R.string.community_content_wall_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.LOADED, mVar.b, null);
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
