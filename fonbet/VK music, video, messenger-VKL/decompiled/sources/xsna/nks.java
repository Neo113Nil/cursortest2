package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AllFriendsTabFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.FollowersTabFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.MutualFriendsTabFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.OnlineFriendsTabFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.els;

/* compiled from: FriendsAndFollowersPagerAdapter.kt */
/* loaded from: classes15.dex */
public final class nks extends k1q0 {
    public final FragmentManager s;
    public els t;

    /* compiled from: FriendsAndFollowersPagerAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsAndFollowersTabType.values().length];
            try {
                iArr[FriendsAndFollowersTabType.FOLLOWERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsAndFollowersTabType.ALL_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FriendsAndFollowersTabType.ONLINE_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FriendsAndFollowersTabType.MUTUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nks(ViewPager2 viewPager2, FriendsAndFollowersRootFragment friendsAndFollowersRootFragment, mbs mbsVar, FragmentManager fragmentManager) {
        super(friendsAndFollowersRootFragment, viewPager2, mbsVar, fragmentManager);
        this.s = fragmentManager;
        this.t = els.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.t.d.size();
    }

    @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.t.d.get(i).b.getId();
    }

    @Override // xsna.scs
    public final boolean y0(long j) {
        List<els.a> list = this.t.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((els.a) it.next()).b.getId() == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 != null) goto L28;
     */
    @Override // xsna.scs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Fragment z0(int i) {
        FragmentImpl f;
        FriendsAndFollowersTabType friendsAndFollowersTabType = this.t.d.get(i).b;
        Fragment F0 = F0(i);
        if (F0 != null) {
            if (uzp.m(F0) != friendsAndFollowersTabType) {
                F0 = null;
            }
        }
        UserId userId = this.t.a;
        int i2 = a.$EnumSwitchMapping$0[friendsAndFollowersTabType.ordinal()];
        if (i2 == 1) {
            f = new FollowersTabFragment.a(userId).f();
        } else if (i2 == 2) {
            f = new AllFriendsTabFragment.a(userId).f();
        } else if (i2 == 3) {
            f = new OnlineFriendsTabFragment.a(userId).f();
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f = new MutualFriendsTabFragment.a(userId, this.t.b).f();
        }
        F0 = f;
        Bundle arguments = F0.getArguments();
        if (arguments != null) {
            arguments.putInt("friends_and_followers_tab_adapter_position", i);
        }
        G0(F0, i);
        return F0;
    }
}
