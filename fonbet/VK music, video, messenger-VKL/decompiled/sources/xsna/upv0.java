package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabsVh;
import com.vk.core.view.components.tabs.VkTabs;

/* compiled from: VkTabsVh.kt */
/* loaded from: classes16.dex */
public final class upv0 implements ViewPager.j {
    public final /* synthetic */ VkTabsVh b;

    public upv0(VkTabsVh vkTabsVh) {
        this.b = vkTabsVh;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        VkTabs vkTabs;
        VkTabsVh vkTabsVh = this.b;
        boolean z = vkTabsVh.h;
        if (z && i == 0) {
            VkTabs vkTabs2 = vkTabsVh.j;
            (vkTabs2 != null ? vkTabs2 : null).j();
        } else {
            if (z) {
                VkTabs vkTabs3 = vkTabsVh.j;
                vkTabs = vkTabs3 != null ? vkTabs3 : null;
                int i2 = VkTabs.t;
                vkTabs.l(i - 1, true);
                return;
            }
            VkTabs vkTabs4 = vkTabsVh.j;
            vkTabs = vkTabs4 != null ? vkTabs4 : null;
            int i3 = VkTabs.t;
            vkTabs.l(i, true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
