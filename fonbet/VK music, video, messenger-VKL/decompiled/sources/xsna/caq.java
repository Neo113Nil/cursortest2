package xsna;

import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.newsfeed.impl.explore.ExploreFragment;

/* compiled from: ExploreFragment.kt */
/* loaded from: classes4.dex */
public final class caq implements AppBarLayout.f {
    public int b;
    public int c;
    public final /* synthetic */ ExploreFragment d;

    public caq(ExploreFragment exploreFragment) {
        this.d = exploreFragment;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.a
    public final void a(AppBarLayout appBarLayout, int i) {
        boolean z = (this.b == i && appBarLayout.getHeight() == this.c) ? false : true;
        boolean z2 = this.b > i;
        boolean z3 = appBarLayout.getTotalScrollRange() + i == 0;
        this.b = i;
        this.c = appBarLayout.getHeight();
        ExploreFragment exploreFragment = this.d;
        if (z2 && z3) {
            VkTabLayout vkTabLayout = exploreFragment.S;
            if (vkTabLayout != null) {
                vkTabLayout.setBackground(null);
            }
            VkTabLayout vkTabLayout2 = exploreFragment.S;
            if (vkTabLayout2 != null) {
                dhr0.m(vkTabLayout2, false);
            }
            VkTabs vkTabs = exploreFragment.T;
            if (vkTabs != null) {
                vkTabs.setBackground(null);
            }
            FrameLayout frameLayout = exploreFragment.U;
            if (frameLayout != null) {
                frameLayout.setBackground(null);
            }
            FrameLayout frameLayout2 = exploreFragment.U;
            if (frameLayout2 != null) {
                dhr0.m(frameLayout2, false);
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            com.vk.newsfeed.impl.explore.a aVar = exploreFragment.Y;
            androidx.lifecycle.f g = aVar != null ? aVar.g(i2) : null;
            ods odsVar = g instanceof ods ? (ods) g : null;
            if (z) {
                if (odsVar != null) {
                    odsVar.Dm(i, appBarLayout.getTotalScrollRange());
                }
            } else if (odsVar != null) {
                odsVar.Kg(i, appBarLayout.getTotalScrollRange());
            }
        }
        int bottom = appBarLayout.getBottom();
        int i3 = bottom >= 0 ? bottom : 0;
        int i4 = ExploreFragment.h0;
        exploreFragment.ho(i3);
    }
}
