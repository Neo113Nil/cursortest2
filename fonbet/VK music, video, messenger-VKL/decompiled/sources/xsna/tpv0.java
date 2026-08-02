package xsna;

import com.vk.catalog2.common.ui.mvp.holder.container.VkTabsVh;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.disableable.DisableableViewPager;

/* compiled from: VkTabsVh.kt */
/* loaded from: classes16.dex */
public final class tpv0 implements VkTabs.b {
    public final /* synthetic */ VkTabsVh a;

    public tpv0(VkTabsVh vkTabsVh) {
        this.a = vkTabsVh;
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void b() {
        this.a.b.s();
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void c(VkTabs.c cVar) {
        VkTabsVh vkTabsVh = this.a;
        VkTabs vkTabs = vkTabsVh.j;
        if (vkTabs == null) {
            vkTabs = null;
        }
        int i = cVar.equals(vkTabs.getFixedTab()) ? 0 : vkTabsVh.h ? cVar.b + 1 : cVar.b;
        vkTabsVh.i.invoke(Integer.valueOf(i));
        DisableableViewPager disableableViewPager = vkTabsVh.b.o;
        (disableableViewPager != null ? disableableViewPager : null).setCurrentItem(i);
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void a(VkTabs.c cVar) {
    }
}
