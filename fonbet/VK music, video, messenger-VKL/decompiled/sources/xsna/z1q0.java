package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UiTrackingTabLayoutListener.kt */
/* loaded from: classes17.dex */
public class z1q0 implements TabLayout.d {
    public List<? extends MobileOfficialAppsCoreNavStat$EventScreen> b;

    public z1q0() {
        this(0);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void Wd(TabLayout.g gVar) {
        int i = gVar.e;
        if (!this.b.isEmpty() && i >= 0 && i < this.b.size()) {
            UiTracker.i.j(new UiTrackingScreen(this.b.get(i)), a(gVar));
        } else {
            L.G(z1q0.class + " : No screens provided for tracking");
        }
    }

    public boolean a(TabLayout.g gVar) {
        return true;
    }

    public z1q0(List<? extends MobileOfficialAppsCoreNavStat$EventScreen> list) {
        this.b = list;
    }

    public z1q0(int i) {
        this(EmptyList.b);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void hl(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void za(TabLayout.g gVar) {
    }
}
