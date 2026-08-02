package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.vk.core.fragments.transition.TransitionOption$Type;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vk.profile.user.api.data.UserProfileSkeletonParams;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.UUID;
import kotlin.Pair;

/* compiled from: UserProfileFragmentBuilder.kt */
/* loaded from: classes5.dex */
public final class npq0 extends pwd0 {
    public npq0(UserId userId, String str) {
        super(UserProfileFragment.class, null, null);
        this.j.putParcelable("id", userId);
        this.j.putString("access_key", str);
        this.j.putBoolean("fit_system_window", false);
        u(TransitionOption$Type.TRANSITION_SLIDE_FROM_RIGHT.h());
        o25.a().N();
    }

    @Override // xsna.pwd0
    public final pwd0 A() {
        this.j.putBoolean("community_from_clip", true);
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 C(int i, UserId userId) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(i);
        this.j.putString("from_post", sb.toString());
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 F() {
        this.j.putBoolean("community_as_viewpager_holder", true);
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 G(String str) {
        if (str == null || drm0.N(str)) {
            str = null;
        }
        if (str != null) {
            this.j.putString("referrer", str);
        }
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 H(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.j.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 J() {
        this.j.putBoolean("to_edit_profile", true);
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 K(String str) {
        if (str == null || drm0.N(str)) {
            str = null;
        }
        if (str != null) {
            this.j.putString("track_code", str);
        }
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 L(UserProfile userProfile) {
        M(new UserProfileSkeletonParams(userProfile.e, userProfile.h, userProfile.Y, userProfile.T));
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 M(UserProfileSkeletonParams userProfileSkeletonParams) {
        this.j.putParcelable("skeleton_info", userProfileSkeletonParams);
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 N(WallGetMode wallGetMode) {
        this.j.putString("wall_mode", wallGetMode.name());
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 O() {
        this.j.putBoolean("show_change_ava", true);
        return this;
    }

    @Override // xsna.oz50
    public final void r(Intent intent) {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        Pair c = rzp0.c(UiMeasuringScreen.PROFILE, null, false, 62);
        UUID uuid = (UUID) c.d();
        ((mzp0) c.g()).init();
        Bundle bundleExtra = intent.getBundleExtra("args");
        if (bundleExtra != null) {
            rzp0.f(bundleExtra, uuid);
        }
        zrd0 zrd0Var = zrd0.a;
        Pair a = zrd0.a(PerformanceScoreProduct.PROFILE);
        UUID uuid2 = (UUID) a.d();
        ((yw90) a.g()).init();
        Bundle bundleExtra2 = intent.getBundleExtra("args");
        if (bundleExtra2 != null) {
            zrd0.d(bundleExtra2, uuid2);
        }
    }

    @Override // xsna.pwd0
    public final pwd0 y(CatchUpBanner catchUpBanner) {
        if (catchUpBanner != null) {
            this.j.putParcelable("catchup_link", catchUpBanner);
        }
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 z(CommunityProfileDeeplinkParams communityProfileDeeplinkParams) {
        this.j.putParcelable("community_deeplink_param", communityProfileDeeplinkParams);
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 B(boolean z) {
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 I(String str) {
        return this;
    }

    @Override // xsna.pwd0
    public final pwd0 D(FullSourceJoinApi.EntryServiceType entryServiceType, String str, String str2) {
        return this;
    }
}
