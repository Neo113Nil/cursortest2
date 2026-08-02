package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.fragments.FragmentImpl;
import xsna.foe;
import xsna.xn50;

/* compiled from: ClipsOwnerSwipeFragment.kt */
/* loaded from: classes17.dex */
public final class noe extends ViewPager2.g {
    public final /* synthetic */ ClipsOwnerSwipeFragment d;
    public final /* synthetic */ ViewPager2 e;

    public noe(ClipsOwnerSwipeFragment clipsOwnerSwipeFragment, ViewPager2 viewPager2) {
        this.d = clipsOwnerSwipeFragment;
        this.e = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        ViewPager2 viewPager2 = this.e;
        viewPager2.post(new wv4(4, viewPager2, this.d));
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrolled(int i, float f, int i2) {
        if (i == 0 && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Object obj = ClipsOwnerSwipeFragment.k0;
            ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = this.d;
            if (clipsOwnerSwipeFragment.ho().f()) {
                clipsOwnerSwipeFragment.fo();
            }
        }
        ViewPager2 viewPager2 = this.e;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        yoe yoeVar = adapter instanceof yoe ? (yoe) adapter : null;
        if (yoeVar == null) {
            return;
        }
        Fragment F0 = yoeVar.F0(0);
        ClipFeedListFragment clipFeedListFragment = F0 instanceof ClipFeedListFragment ? (ClipFeedListFragment) F0 : null;
        if (Math.abs(f) <= 0.1f) {
            viewPager2.post(new moe());
            if (clipFeedListFragment != null) {
                clipFeedListFragment.No(false);
                return;
            }
            return;
        }
        if (f <= 0.2f || clipFeedListFragment == null) {
            return;
        }
        clipFeedListFragment.No(true);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        Fragment fragment;
        boolean z;
        super.onPageSelected(i);
        foe.d dVar = new foe.d(i);
        ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = this.d;
        xn50.a.c(clipsOwnerSwipeFragment, dVar);
        yoe yoeVar = clipsOwnerSwipeFragment.c0;
        if (yoeVar != null) {
            ViewPager2 viewPager2 = clipsOwnerSwipeFragment.d0;
            fragment = yoeVar.F0(viewPager2 != null ? viewPager2.getCurrentItem() : -1);
        } else {
            fragment = null;
        }
        for (Fragment fragment2 : clipsOwnerSwipeFragment.getChildFragmentManager().c.f()) {
            FragmentImpl fragmentImpl = fragment2 instanceof FragmentImpl ? (FragmentImpl) fragment2 : null;
            if (fragmentImpl != null && fragmentImpl.Mn() != (!fragmentImpl.equals(fragment))) {
                fragmentImpl.onHiddenChanged(z);
            }
        }
        this.e.post(new io.reactivex.rxjava3.android.a(clipsOwnerSwipeFragment, 3));
        Intent intent = new Intent("request_update_bottom_theme_event");
        Context context = e43.a;
        cuz.a(context != null ? context : null).c(intent);
    }
}
