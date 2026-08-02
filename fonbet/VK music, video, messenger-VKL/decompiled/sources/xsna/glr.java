package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.search.ui.impl.widget.FirstFixedTabsLayout;
import java.util.Iterator;

/* compiled from: FirstFixedTabsLayout.kt */
/* loaded from: classes5.dex */
public final class glr implements TabLayout.d {
    public final /* synthetic */ FirstFixedTabsLayout b;

    public glr(FirstFixedTabsLayout firstFixedTabsLayout) {
        this.b = firstFixedTabsLayout;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        FirstFixedTabsLayout firstFixedTabsLayout = this.b;
        Iterator it = firstFixedTabsLayout.f.iterator();
        while (it.hasNext()) {
            ((TabLayout.d) it.next()).Wd(gVar);
        }
        FirstFixedTabsLayout.f(firstFixedTabsLayout, firstFixedTabsLayout.b, gVar);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        Iterator it = this.b.f.iterator();
        while (it.hasNext()) {
            ((TabLayout.d) it.next()).hl(gVar);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        FirstFixedTabsLayout firstFixedTabsLayout = this.b;
        Iterator it = firstFixedTabsLayout.f.iterator();
        while (it.hasNext()) {
            ((TabLayout.d) it.next()).za(gVar);
        }
        firstFixedTabsLayout.g();
    }
}
