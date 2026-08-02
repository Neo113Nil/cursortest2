package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.m;
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

/* compiled from: DynamicFriendsAndFollowersPagerAdapter.kt */
/* loaded from: classes15.dex */
public final class qpo extends k1q0 {
    public final FragmentManager s;
    public els t;

    /* compiled from: DynamicFriendsAndFollowersPagerAdapter.kt */
    public static final class b extends m.b {
        public final List<els.a> b;
        public final List<els.a> c;

        public b(List<els.a> list, List<els.a> list2) {
            this.b = list;
            this.c = list2;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            return this.b.get(i).a == this.c.get(i2).a;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            return this.b.get(i).b == this.c.get(i2).b;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            return this.b.size();
        }
    }

    /* compiled from: DynamicFriendsAndFollowersPagerAdapter.kt */
    public static final /* synthetic */ class c {
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

    public qpo(ViewPager2 viewPager2, FriendsAndFollowersRootFragment friendsAndFollowersRootFragment, mbs mbsVar, FragmentManager fragmentManager) {
        super(friendsAndFollowersRootFragment, viewPager2, mbsVar, fragmentManager);
        this.s = fragmentManager;
        this.t = els.e;
    }

    public final void J0(els elsVar) {
        if (epx.f(this.t, elsVar)) {
            return;
        }
        List<els.a> list = this.t.d;
        m.d a2 = androidx.recyclerview.widget.m.a(new b(list, elsVar.d), true);
        this.t = elsVar;
        a2.c(new a(list.size()));
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

    @Override // xsna.scs
    public final Fragment z0(int i) {
        FragmentImpl f;
        FriendsAndFollowersTabType friendsAndFollowersTabType = this.t.d.get(i).b;
        Fragment F0 = F0(i);
        if (F0 != null) {
            if (uzp.m(F0) != friendsAndFollowersTabType || F0.isAdded()) {
                F0 = null;
            }
            if (F0 != null) {
                return F0;
            }
        }
        els elsVar = this.t;
        UserId userId = elsVar.a;
        int i2 = c.$EnumSwitchMapping$0[friendsAndFollowersTabType.ordinal()];
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
            f = new MutualFriendsTabFragment.a(userId, elsVar.b).f();
        }
        G0(f, i);
        return f;
    }

    /* compiled from: DynamicFriendsAndFollowersPagerAdapter.kt */
    public final class a implements ggz {
        public int b;

        public a(int i) {
            this.b = i;
        }

        @Override // xsna.ggz
        public final void onInserted(int i, int i2) {
            int i3 = this.b - 1;
            qpo qpoVar = qpo.this;
            if (i <= i3) {
                while (true) {
                    qpoVar.G0(qpoVar.F0(i3), i3 + i2);
                    if (i3 == i) {
                        break;
                    } else {
                        i3--;
                    }
                }
            } else {
                qpoVar.getClass();
            }
            int i4 = i + i2;
            for (int i5 = i; i5 < i4; i5++) {
                qpoVar.G0(null, i5);
            }
            this.b += i2;
            qpoVar.notifyItemRangeInserted(i, i2);
        }

        @Override // xsna.ggz
        public final void onMoved(int i, int i2) {
            qpo qpoVar = qpo.this;
            if (i == i2) {
                qpoVar.getClass();
            } else {
                Fragment F0 = qpoVar.F0(i);
                if (i < i2) {
                    int i3 = i;
                    while (i3 < i2) {
                        int i4 = i3 + 1;
                        qpoVar.G0(qpoVar.F0(i4), i3);
                        i3 = i4;
                    }
                } else {
                    int i5 = i2 + 1;
                    if (i5 <= i) {
                        int i6 = i;
                        while (true) {
                            qpoVar.G0(qpoVar.F0(i6 - 1), i6);
                            if (i6 == i5) {
                                break;
                            } else {
                                i6--;
                            }
                        }
                    }
                }
                qpoVar.G0(F0, i2);
            }
            qpoVar.notifyItemMoved(i, i2);
        }

        @Override // xsna.ggz
        public final void onRemoved(int i, int i2) {
            int i3 = 0;
            while (true) {
                qpo qpoVar = qpo.this;
                if (i3 >= i2) {
                    this.b -= i2;
                    qpoVar.notifyItemRangeRemoved(i, i2);
                    return;
                } else {
                    qpoVar.removeItem(i);
                    i3++;
                }
            }
        }

        @Override // xsna.ggz
        public final void onChanged(int i, int i2, Object obj) {
        }
    }
}
