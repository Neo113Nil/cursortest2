package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.core.view.VKTabLayout;
import java.util.Iterator;

/* compiled from: FirstPinnedTabLayout.kt */
/* loaded from: classes16.dex */
public final class nlr implements TabLayout.d {
    public final /* synthetic */ FirstPinnedTabLayout b;

    public nlr(FirstPinnedTabLayout firstPinnedTabLayout) {
        this.b = firstPinnedTabLayout;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        FirstPinnedTabLayout firstPinnedTabLayout = this.b;
        Iterator it = firstPinnedTabLayout.e.iterator();
        while (it.hasNext()) {
            ((TabLayout.d) it.next()).Wd(gVar);
        }
        FirstPinnedTabLayout.f(firstPinnedTabLayout, firstPinnedTabLayout.c, gVar);
        VKTabLayout vKTabLayout = firstPinnedTabLayout.b;
        if (vKTabLayout != null) {
            vKTabLayout.smoothScrollTo(0, 0);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        Iterator it = this.b.e.iterator();
        while (it.hasNext()) {
            ((TabLayout.d) it.next()).hl(gVar);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        FirstPinnedTabLayout firstPinnedTabLayout = this.b;
        Iterator it = firstPinnedTabLayout.e.iterator();
        while (it.hasNext()) {
            ((TabLayout.d) it.next()).za(gVar);
        }
        VKTabLayout vKTabLayout = firstPinnedTabLayout.c;
        if (vKTabLayout != null) {
            usn0.a(vKTabLayout);
        }
        VKTabLayout vKTabLayout2 = firstPinnedTabLayout.b;
        if (vKTabLayout2 != null) {
            usn0.a(vKTabLayout2);
        }
    }
}
