package xsna;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FirstPinnedTabLayoutMediator.kt */
/* loaded from: classes16.dex */
public final class plr {
    public final FirstPinnedTabLayout a;
    public final ViewPager b;
    public final int c;
    public final boolean d;
    public PagerAdapter e;
    public boolean g;
    public boolean i;
    public b j;
    public c k;
    public a l;
    public List<iwj0> f = EmptyList.b;
    public final qlr h = new qlr(this);

    /* compiled from: FirstPinnedTabLayoutMediator.kt */
    public final class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            plr plrVar = plr.this;
            plrVar.a(plrVar.b.getCurrentItem());
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            plr plrVar = plr.this;
            plrVar.a(plrVar.b.getCurrentItem());
        }
    }

    /* compiled from: FirstPinnedTabLayoutMediator.kt */
    public static final class b implements ViewPager.j {
        public final WeakReference<rou0> b;
        public int d = 0;
        public int c = 0;

        public b(FirstPinnedTabLayout firstPinnedTabLayout) {
            this.b = new WeakReference<>(firstPinnedTabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            this.c = this.d;
            this.d = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            rou0 rou0Var = this.b.get();
            if (rou0Var == null) {
                return;
            }
            int i3 = this.d;
            rou0Var.d(i, f, (i3 != 2 || this.c == 1) && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i3 == 2 && this.c == 0) ? false : true);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            rou0 rou0Var = this.b.get();
            if (rou0Var == null || rou0Var.getSelectedTabPosition() == i || i >= rou0Var.getTabCount()) {
                return;
            }
            int i2 = this.d;
            boolean z = false;
            boolean z2 = i2 == 0;
            boolean z3 = i2 == 2;
            boolean z4 = this.c == 0;
            if (z2 || (z3 && z4)) {
                z = true;
            }
            rou0Var.c(rou0Var.b(i), z);
        }
    }

    /* compiled from: FirstPinnedTabLayoutMediator.kt */
    public static final class c extends rgp {
        public final ViewPager b;
        public final rou0 c;
        public final WeakReference<rou0> d;

        public c(ViewPager viewPager, FirstPinnedTabLayout firstPinnedTabLayout) {
            this.b = viewPager;
            this.c = firstPinnedTabLayout;
            this.d = new WeakReference<>(firstPinnedTabLayout);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            rou0 rou0Var = this.d.get();
            if (rou0Var != null) {
                this.b.setCurrentItem(rou0Var.e(gVar), !this.c.a(gVar));
            }
        }
    }

    public plr(FirstPinnedTabLayout firstPinnedTabLayout, DisableableViewPager disableableViewPager, int i, boolean z) {
        this.a = firstPinnedTabLayout;
        this.b = disableableViewPager;
        this.c = i;
        this.d = z;
    }

    public final void a(int i) {
        PagerAdapter pagerAdapter = this.e;
        if (pagerAdapter == null) {
            return;
        }
        int count = pagerAdapter.getCount();
        PagerAdapter pagerAdapter2 = this.e;
        int count2 = pagerAdapter2 != null ? pagerAdapter2.getCount() : 0;
        int size = this.f.size() + count2;
        FirstPinnedTabLayout firstPinnedTabLayout = this.a;
        if (size == firstPinnedTabLayout.getTabCount() && count2 > 0 && !this.g) {
            for (int i2 = 0; i2 < count; i2++) {
                TabLayout.g b2 = firstPinnedTabLayout.b(i2);
                if (b2 != null) {
                    b2.q(String.valueOf(pagerAdapter.getPageTitle(i2)));
                }
                if (i2 == i && b2 != null && !b2.h()) {
                    b2.j();
                }
            }
            return;
        }
        VKTabLayout vKTabLayout = firstPinnedTabLayout.c;
        if (vKTabLayout != null) {
            vKTabLayout.r();
        }
        VKTabLayout vKTabLayout2 = firstPinnedTabLayout.b;
        if (vKTabLayout2 != null) {
            vKTabLayout2.r();
        }
        int i3 = 0;
        while (i3 < count) {
            TabLayout.g i4 = firstPinnedTabLayout.i(i3);
            i4.q(pagerAdapter.getPageTitle(i3));
            firstPinnedTabLayout.h(i4, i3 == i);
            i3++;
        }
        int i5 = 0;
        for (Object obj : this.f) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                e43.t();
                throw null;
            }
            iwj0 iwj0Var = (iwj0) obj;
            TabLayout.g i7 = firstPinnedTabLayout.i(i5 + count);
            String str = iwj0Var.c;
            if (str == null) {
                str = iwj0Var.a != null ? firstPinnedTabLayout.getContext().getString(R.string.rate_recommendations) : null;
            }
            i7.k(str);
            firstPinnedTabLayout.h(i7, false);
            i5 = i6;
        }
    }
}
