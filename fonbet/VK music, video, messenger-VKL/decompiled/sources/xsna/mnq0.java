package xsna;

import com.ironsource.X3;
import com.vk.dto.common.VideoFile;
import com.vk.dto.hints.HintId;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.LazyThreadSafetyMode;
import xsna.c5i;

/* compiled from: UserProfileContentMainWallFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class mnq0 extends wmq0<lg00, s3q0> {
    public final loq0 m;
    public final Object n;
    public final String o;

    public mnq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, loq0 loq0Var) {
        super(dvq0Var, r0e0Var, z);
        this.m = loq0Var;
        this.n = msy.a(LazyThreadSafetyMode.NONE, new hyd0(5));
        this.o = X3.i.Z;
    }

    @Override // xsna.wmq0
    public final void A(lg00 lg00Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        lg00 lg00Var2 = lg00Var;
        if (state == null) {
            state = lg00Var2.l;
        }
        z(lg00.i(lg00Var2, state, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean C(VideoFile videoFile) {
        if (videoFile != null) {
            return ((Boolean) this.n.getValue()).booleanValue() || videoFile.C2();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wmq0, xsna.rgq0
    public final void c(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        ((p870) this.m.m.getValue()).c(159);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(lg00.i((lg00) communityProfileContentItem, null, 15));
        ((a5i) this.m.p.getValue()).b(c5i.a.a);
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void h(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        lg00 lg00Var = (lg00) communityProfileContentItem;
        super.h(lg00Var, extendedUserProfile);
        z(lg00.i(lg00Var, CommunityProfileContentItem.State.LOADED, 27));
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return lg00.i((lg00) communityProfileContentItem, CommunityProfileContentItem.State.RELOAD, 27);
    }

    @Override // xsna.wmq0
    public final lg00 s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.o;
        if (str.equals(str2)) {
            return new lg00(new CommunityProfileContentItem.b(R.string.community_content_main_wall_empty, null, null, null, null, 30), new CommunityProfileContentItem.c(R.string.community_content_wall_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, mVar.b, !z2 ? null : new CommunityProfileContentItem.e(HintId.USER_PROFILE_MAIN_WALL_TAB_ONBOARDING.getId(), R.string.profile_main_wall_tab_onboarding));
        }
        throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str2).toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wmq0
    public final io.reactivex.rxjava3.core.q<s3q0> t() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(wjs0.b.a0(asu0.a.d()), new u730(new ece0(this, 15), 15)).U(new t3j0(new pmp0(1), 5));
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.o;
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ void w(CommunityProfileContentItem communityProfileContentItem) {
    }
}
