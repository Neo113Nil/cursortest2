package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.VKTabLayout;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.search.ui.impl.widget.FirstFixedTabsLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: VkTabLayoutMediator.kt */
/* loaded from: classes17.dex */
public final class kpv0 {
    public final FirstFixedTabsLayout a;
    public final ViewPager2 b;
    public final t34 c;
    public RecyclerView.Adapter<?> d;
    public boolean e;

    /* compiled from: VkTabLayoutMediator.kt */
    public final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            kpv0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            kpv0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            kpv0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            kpv0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            kpv0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            kpv0.this.b();
        }
    }

    /* compiled from: VkTabLayoutMediator.kt */
    public static final class b extends ViewPager2.g {
        public final WeakReference<rou0> d;
        public int f = 0;
        public int e = 0;

        public b(FirstFixedTabsLayout firstFixedTabsLayout) {
            this.d = new WeakReference<>(firstFixedTabsLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            this.e = this.f;
            this.f = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
            rou0 rou0Var = this.d.get();
            if (rou0Var != null) {
                int i3 = this.f;
                rou0Var.d(i, f, i3 != 2 || this.e == 1, (i3 == 2 && this.e == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            rou0 rou0Var = this.d.get();
            if (rou0Var == null || rou0Var.getSelectedTabPosition() == i || i >= rou0Var.getTabCount()) {
                return;
            }
            int i2 = this.f;
            rou0Var.c(rou0Var.b(i), i2 == 0 || (i2 == 2 && this.e == 0));
        }
    }

    public kpv0(FirstFixedTabsLayout firstFixedTabsLayout, ViewPager2 viewPager2, t34 t34Var) {
        this.a = firstFixedTabsLayout;
        this.b = viewPager2;
        this.c = t34Var;
    }

    public final void a() {
        if (this.e) {
            throw new IllegalStateException("VkTabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.b;
        RecyclerView.Adapter<?> adapter = viewPager2.getAdapter();
        this.d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("VkTabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.e = true;
        FirstFixedTabsLayout firstFixedTabsLayout = this.a;
        viewPager2.b(new b(firstFixedTabsLayout));
        firstFixedTabsLayout.h(new c(viewPager2, firstFixedTabsLayout));
        this.d.registerAdapterDataObserver(new a());
        b();
        firstFixedTabsLayout.d(viewPager2.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
    }

    public final void b() {
        FirstFixedTabsLayout firstFixedTabsLayout = this.a;
        VKTabLayout vKTabLayout = firstFixedTabsLayout.c;
        if (vKTabLayout != null) {
            vKTabLayout.r();
        }
        VKTabLayout vKTabLayout2 = firstFixedTabsLayout.b;
        if (vKTabLayout2 != null) {
            vKTabLayout2.r();
        }
        RecyclerView.Adapter<?> adapter = this.d;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int i = 0;
            while (i < itemCount) {
                VKTabLayout vKTabLayout3 = firstFixedTabsLayout.c;
                VKTabLayout vKTabLayout4 = firstFixedTabsLayout.b;
                if (vKTabLayout3 == null || vKTabLayout4 == null) {
                    throw new Exception("ERROR: VK tab");
                }
                TabLayout.g p = i < 1 ? vKTabLayout3.p() : vKTabLayout4.p();
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) this.c.c;
                int i2 = DiscoverSearchFragment.s0;
                Context mo2getContext = discoverSearchFragment.mo2getContext();
                p.q(mo2getContext != null ? mo2getContext.getString(((DiscoverSearchTabs.a) ((List) discoverSearchFragment.o0.getValue()).get(i)).a) : null);
                VKTabLayout vKTabLayout5 = firstFixedTabsLayout.c;
                if (vKTabLayout5 != null) {
                    if (vKTabLayout5.getTabCount() < 1) {
                        vKTabLayout5.i(p, false);
                    } else {
                        VKTabLayout vKTabLayout6 = firstFixedTabsLayout.b;
                        if (vKTabLayout6 != null) {
                            vKTabLayout6.i(p, false);
                        }
                    }
                }
                i++;
            }
            if (itemCount > 0) {
                int min = Math.min(this.b.getCurrentItem(), firstFixedTabsLayout.getTabCount() - 1);
                if (min != firstFixedTabsLayout.getSelectedTabPosition()) {
                    firstFixedTabsLayout.c(firstFixedTabsLayout.b(min), true);
                }
            }
        }
    }

    /* compiled from: VkTabLayoutMediator.kt */
    public static final class c implements TabLayout.d {
        public final ViewPager2 b;
        public final FirstFixedTabsLayout c;
        public final WeakReference<rou0> d;

        public c(ViewPager2 viewPager2, FirstFixedTabsLayout firstFixedTabsLayout) {
            this.b = viewPager2;
            this.c = firstFixedTabsLayout;
            this.d = new WeakReference<>(firstFixedTabsLayout);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            rou0 rou0Var = this.d.get();
            if (rou0Var != null) {
                this.b.e(rou0Var.e(gVar), !this.c.a(gVar));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
        }
    }
}
