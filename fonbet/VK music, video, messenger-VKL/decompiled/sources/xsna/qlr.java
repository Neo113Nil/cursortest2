package xsna;

import androidx.viewpager.widget.PagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;

/* compiled from: FirstPinnedTabLayoutMediator.kt */
/* loaded from: classes16.dex */
public final class qlr implements xgr0 {
    public final /* synthetic */ plr a;

    public qlr(plr plrVar) {
        this.a = plrVar;
    }

    @Override // xsna.xgr0
    public final boolean a(TabLayout.g gVar) {
        TabLayout.g b;
        plr plrVar = this.a;
        FirstPinnedTabLayout firstPinnedTabLayout = plrVar.a;
        if (gVar != null) {
            int e = firstPinnedTabLayout.e(gVar);
            PagerAdapter pagerAdapter = plrVar.e;
            int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
            if (e < count) {
                int i = plrVar.c;
                if (plrVar.d && e != i && gVar.h() && (b = firstPinnedTabLayout.b(i)) != null) {
                    b.j();
                    return true;
                }
            } else {
                iwj0 iwj0Var = (iwj0) j5g.b0(e - count, plrVar.f);
                if (iwj0Var != null) {
                    iwj0Var.d.invoke(firstPinnedTabLayout.getContext());
                    return true;
                }
            }
        }
        return false;
    }
}
