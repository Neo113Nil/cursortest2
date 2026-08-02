package xsna;

import android.content.Context;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.search.ui.stat.SearchContext;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: FriendsListDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class fqs implements eqs {
    public final ProfileFragmentProviderComponent a;

    public fqs(ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = profileFragmentProviderComponent;
    }

    @Override // xsna.eqs
    public final void a(UserProfile userProfile, int i, String str, boolean z, Context context) {
        if (z) {
            bzh0 bzh0Var = bzh0.a;
            MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
            SearchContext searchContext = new SearchContext(str, i, SchemeStat$EventItem.Type.USER, userProfile.c.b, userProfile.J, null, 32, null);
            UiTracker uiTracker = UiTracker.a;
            bzh0Var.b(action, searchContext, UiTracker.c());
        }
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.USER;
        long j = userProfile.c.b;
        String str2 = userProfile.J;
        UiTracker uiTracker2 = UiTracker.a;
        SearchStatsLoggingInfo searchStatsLoggingInfo = new SearchStatsLoggingInfo(str, i, type, j, str2, UiTracker.c(), null, false, false, 448, null);
        UserId userId = userProfile.c;
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        this.a.ye(userId, null).L(userProfile).H(searchStatsLoggingInfo).K(userProfile.J).k(context);
    }
}
