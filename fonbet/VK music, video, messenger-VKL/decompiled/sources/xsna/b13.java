package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profilelist.impl.fragments.FollowersListFragment;
import com.vk.profilelist.impl.fragments.SubscriptionsUserListFragment;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.fragments.friends.lists.OtherUserFriendsFragment;

/* compiled from: AppActionNavigatorCallbackImpl.kt */
/* loaded from: classes5.dex */
public final class b13 implements a13 {
    public final SearchStatsLoggingInfo a;
    public final gog b;
    public final ProfileFragmentProviderComponent c;

    public b13(SearchStatsLoggingInfo searchStatsLoggingInfo, gog gogVar, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = searchStatsLoggingInfo;
        this.b = gogVar;
        this.c = profileFragmentProviderComponent;
    }

    @Override // xsna.a13
    public final void a(FragmentActivity fragmentActivity, UserProfile userProfile, String str) {
        g2v.d().a().f(fragmentActivity, userProfile, str);
    }

    @Override // xsna.a13
    public final void b(Context context, UserId userId) {
        ProfileFragmentProviderComponent profileFragmentProviderComponent = this.c;
        if (profileFragmentProviderComponent != null) {
            ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
            profileFragmentProviderComponent.ye(userId, null).k(context);
        }
    }

    @Override // xsna.a13
    public final void c(FragmentActivity fragmentActivity) {
        o19.j(fragmentActivity).c(fragmentActivity);
    }

    @Override // xsna.a13
    public final void d(FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile, boolean z) {
        if (bwd0.d(extendedUserProfile)) {
            new FriendsCatalogFragment.a().k(fragmentActivity);
            return;
        }
        boolean c = bwd0.c(extendedUserProfile);
        String string = !c ? fragmentActivity.getResources().getString(R.string.friends_of_user, extendedUserProfile.b) : fragmentActivity.getResources().getString(R.string.mutual_friends);
        OtherUserFriendsFragment.a aVar = new OtherUserFriendsFragment.a();
        aVar.C(bwd0.i(extendedUserProfile));
        aVar.B(string);
        aVar.D(true);
        Bundle bundle = aVar.j;
        bundle.putBoolean("only muted", c);
        if (z) {
            bundle.putInt("initial_tab", 2);
        }
        aVar.k(fragmentActivity);
    }

    @Override // xsna.a13
    public final void e(Context context, UserId userId) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("uid", userId);
        bundle.putCharSequence("title", context.getString(R.string.profile_subscriptions));
        new oz50(SubscriptionsUserListFragment.class, null, bundle).k(context);
    }

    @Override // xsna.a13
    public final void f(Context context, ExtendedUserProfile extendedUserProfile, String str) {
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_GIFT;
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
        if (searchStatsLoggingInfo != null) {
            bzh0.a.a(action, searchStatsLoggingInfo);
        }
        g2v.d().a().r(context, extendedUserProfile.a.c, str);
    }

    @Override // xsna.a13
    public final void g(FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile) {
        if (o25.a().a(extendedUserProfile.a.c)) {
            rwi.d().m().b(fragmentActivity);
        } else {
            rwi.d().m().a(fragmentActivity, extendedUserProfile, false);
        }
        mpe0.b(SchemeStat$TypeQuestionItem.Type.CLICK_TO_QUESTION, extendedUserProfile.a.c, null, null, null, null, 60);
    }

    @Override // xsna.a13
    public final void h(Context context, UserId userId) {
        Uri.Builder appendPath = er.a(HttpRequest.DEFAULT_SCHEME).authority(a0a.d).appendPath(InternalVkMiniApps.WISHLIST.h().b);
        appendPath.encodedFragment("user_id=" + userId.b);
        com.vk.common.links.b.f(context, appendPath.toString());
    }

    @Override // xsna.a13
    public final void i(FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile) {
        gog gogVar = this.b;
        if (gogVar != null) {
            if (bwd0.d(extendedUserProfile)) {
                gogVar.a(fragmentActivity, "/groups?tab=my", "profile_groups_list", false);
            } else {
                gogVar.b(fragmentActivity, extendedUserProfile.a.c, "profile_groups_list", false);
            }
        }
    }

    @Override // xsna.a13
    public final void j(FragmentActivity fragmentActivity, String str, UserId userId, String str2) {
        VideoCatalogFragment.a aVar = new VideoCatalogFragment.a();
        aVar.H(userId);
        aVar.K(str2);
        aVar.M(str);
        aVar.k(fragmentActivity);
    }

    @Override // xsna.a13
    @ozl
    public final void k(FragmentActivity fragmentActivity, UserId userId, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("uid", userId);
        bundle.putCharSequence("title", fragmentActivity.getString(R.string.followers_of, str));
        new oz50(FollowersListFragment.class, null, bundle).k(fragmentActivity);
    }
}
