package xsna;

import android.annotation.SuppressLint;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FriendsPagerAdapter.kt */
/* loaded from: classes15.dex */
public final class nrs extends k1q0 {
    public List<uts> s;

    public nrs(ViewPager2 viewPager2, FriendsFragment friendsFragment, mbs mbsVar, FragmentManager fragmentManager) {
        super(friendsFragment, viewPager2, mbsVar, fragmentManager);
        this.s = EmptyList.b;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void J0(ArrayList arrayList) {
        if (epx.f(this.s, arrayList)) {
            return;
        }
        this.s = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.s.size();
    }

    @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.s.get(i).f;
    }

    @Override // xsna.scs
    public final boolean y0(long j) {
        List<uts> list = this.s;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((uts) it.next()).f == j) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        return this.s.get(i).a;
    }
}
