package xsna;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.d;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: VkTabsViewPagerConnector.kt */
/* loaded from: classes17.dex */
public final class vpv0 {
    public VkTabs b;
    public ViewPager d;
    public tde f;
    public int a = -1;
    public final c c = new c();
    public final b e = new b();
    public final a g = new a();
    public final ArrayList h = new ArrayList();

    /* compiled from: VkTabsViewPagerConnector.kt */
    public static final class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            vpv0.this.f();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            vpv0.this.f();
        }
    }

    public final void a(tde tdeVar) {
        tde tdeVar2 = this.f;
        a aVar = this.g;
        if (tdeVar2 != null) {
            tdeVar2.unregisterDataSetObserver(aVar);
        }
        this.f = tdeVar;
        tdeVar.registerDataSetObserver(aVar);
        f();
    }

    public final void b(VkTabs vkTabs) {
        if (epx.f(this.b, vkTabs)) {
            return;
        }
        VkTabs vkTabs2 = this.b;
        c cVar = this.c;
        if (vkTabs2 != null) {
            int i = VkTabs.t;
            vkTabs2.h(true);
            vkTabs2.e.remove(cVar);
        }
        this.b = vkTabs;
        vkTabs.a(cVar);
        f();
    }

    public final void c(ViewPager viewPager) {
        if (epx.f(this.d, viewPager)) {
            return;
        }
        ViewPager viewPager2 = this.d;
        b bVar = this.e;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(bVar);
        }
        this.d = viewPager;
        viewPager.addOnPageChangeListener(bVar);
        e(this.a);
    }

    public final void d() {
        VkTabs vkTabs = this.b;
        if (vkTabs != null) {
            vkTabs.post(new sb(vkTabs, 14));
        }
    }

    public final void e(int i) {
        VkTabs vkTabs;
        ViewPager viewPager;
        VkTabs.c selectedTab;
        tde tdeVar = this.f;
        int size = (tdeVar != null ? tdeVar.k.size() : 0) - 1;
        if (i <= size) {
            size = i;
        }
        this.a = i;
        if (size < 0) {
            return;
        }
        VkTabs vkTabs2 = this.b;
        if ((vkTabs2 == null || (selectedTab = vkTabs2.getSelectedTab()) == null || selectedTab.b != size) && (vkTabs = this.b) != null) {
            int i2 = VkTabs.t;
            vkTabs.l(i, true);
        }
        ViewPager viewPager2 = this.d;
        if ((viewPager2 == null || viewPager2.getCurrentItem() != size) && (viewPager = this.d) != null) {
            viewPager.setCurrentItem(size);
        }
    }

    public final void f() {
        VkTabs vkTabs = this.b;
        if (vkTabs != null) {
            ArrayList arrayList = this.h;
            arrayList.clear();
            tde tdeVar = this.f;
            if (tdeVar != null) {
                int size = tdeVar.k.size();
                for (int i = 0; i < size; i++) {
                    int i2 = com.vk.core.view.components.tabs.d.G;
                    nxv0 a2 = d.a.a(vkTabs.getContext());
                    a2.setText(tdeVar.getPageTitle(i));
                    arrayList.add(new VkTabs.c(a2));
                }
            }
            int i3 = VkTabs.t;
            vkTabs.h(true);
            Iterator it = arrayList.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                vkTabs.b((VkTabs.c) next, i4 == this.a);
                i4 = i5;
            }
            vkTabs.setTabLayoutMode(arrayList.size() == 2 ? VkTabs.TabLayoutMode.FIXED : VkTabs.TabLayoutMode.AUTO);
        }
    }

    /* compiled from: VkTabsViewPagerConnector.kt */
    public static final class c implements VkTabs.b {
        public c() {
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void c(VkTabs.c cVar) {
            vpv0 vpv0Var = vpv0.this;
            int i = vpv0Var.a;
            int i2 = cVar.b;
            if (i != i2) {
                vpv0Var.e(i2);
            }
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void b() {
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void a(VkTabs.c cVar) {
        }
    }

    /* compiled from: VkTabsViewPagerConnector.kt */
    public static final class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            vpv0.this.e(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }
}
