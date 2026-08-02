package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.friends.api.FollowersInitialTab;
import com.vk.friends.impl.followers.presentation.fragments.AllFollowersListFragment;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.cls;

/* compiled from: FollowersListRouterImpl.kt */
/* loaded from: classes15.dex */
public final class r3s implements q3s {
    public final b25 a;
    public final sw50 b;
    public final bpn0 c = new bpn0(new qzg(this, 16));

    public r3s(b25 b25Var, sw50 sw50Var) {
        this.a = b25Var;
        this.b = sw50Var;
    }

    @Override // xsna.q3s
    public final void a(FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile, FollowersInitialTab followersInitialTab) {
        FriendsAndFollowersTabType friendsAndFollowersTabType;
        if (this.a.a(extendedUserProfile.a.c)) {
            if (extendedUserProfile.a.a0) {
                new AllFollowersListFragment.a(extendedUserProfile.a.c, fragmentActivity.getString(R.string.followers)).k(fragmentActivity);
                return;
            }
            a13 a13Var = (a13) this.c.getValue();
            UserProfile userProfile = extendedUserProfile.a;
            a13Var.k(fragmentActivity, userProfile.c, userProfile.n());
            return;
        }
        ComFeatures comFeatures = ComFeatures.COM_FOLLOWERS_ONLINE_TAB;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            followersInitialTab = FollowersInitialTab.FOLLOWERS;
        }
        UiTracker.b();
        UserId userId = extendedUserProfile.a.c;
        boolean a = extendedUserProfile.a();
        String str = extendedUserProfile.a.e;
        if (str == null) {
            str = "";
        }
        els a2 = cls.a(userId, a, str, extendedUserProfile.b("followers"), extendedUserProfile.b("friends"), extendedUserProfile.b("online_friends"), extendedUserProfile.b("mutual_friends"));
        int i = cls.a.$EnumSwitchMapping$0[followersInitialTab.ordinal()];
        if (i == 1) {
            friendsAndFollowersTabType = FriendsAndFollowersTabType.FOLLOWERS;
        } else if (i == 2) {
            friendsAndFollowersTabType = FriendsAndFollowersTabType.MUTUAL;
        } else if (i == 3) {
            friendsAndFollowersTabType = FriendsAndFollowersTabType.ALL_FRIENDS;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            friendsAndFollowersTabType = FriendsAndFollowersTabType.ONLINE_FRIENDS;
        }
        FriendsAndFollowersRootFragment.a aVar = new FriendsAndFollowersRootFragment.a(FriendsAndFollowersRootFragment.class, null, null);
        int i2 = FriendsAndFollowersRootFragment.Z;
        Bundle bundle = aVar.j;
        FriendsAndFollowersRootFragment.b.d(bundle, a2);
        bundle.putString("selected_tab_type", friendsAndFollowersTabType.name());
        aVar.k(fragmentActivity);
    }
}
