package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import xsna.eks;
import xsna.els;
import xsna.xn50;

/* compiled from: FriendsAndFollowersRootFragment.kt */
/* loaded from: classes15.dex */
public final class uks extends ViewPager2.g {
    public final /* synthetic */ FriendsAndFollowersRootFragment d;

    public uks(FriendsAndFollowersRootFragment friendsAndFollowersRootFragment) {
        this.d = friendsAndFollowersRootFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        els.a aVar;
        FriendsAndFollowersTabType friendsAndFollowersTabType;
        FriendsAndFollowersRootFragment friendsAndFollowersRootFragment = this.d;
        if (friendsAndFollowersRootFragment.U || (aVar = (els.a) j5g.b0(i, friendsAndFollowersRootFragment.V.d)) == null || (friendsAndFollowersTabType = aVar.b) == null) {
            return;
        }
        xn50.a.c(friendsAndFollowersRootFragment, new eks.b(friendsAndFollowersTabType));
    }
}
