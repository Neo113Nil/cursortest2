package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import kotlin.Pair;

/* compiled from: VideoDiscoveryCatalogTabsController.kt */
/* loaded from: classes7.dex */
public final class zfs0 implements df90 {
    public final /* synthetic */ ags0 b;

    public zfs0(ags0 ags0Var) {
        this.b = ags0Var;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        int i5;
        ags0 ags0Var = this.b;
        int i6 = ags0Var.f;
        VkSubnavigationBar vkSubnavigationBar = ags0Var.a;
        if (ags0Var.i || (recyclerPaginatedView = (RecyclerPaginatedView) ags0Var.c.invoke()) == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        kfs0 kfs0Var = ((VideoMinimizableDiscoveryFragment) ags0Var.d.c).G0;
        Pair a = xfs0.a(recyclerView, i3, kfs0Var != null ? kfs0Var.h.f : null);
        boolean booleanValue = ((Boolean) a.d()).booleanValue();
        int intValue = ((Number) a.g()).intValue();
        if (booleanValue || intValue <= (i5 = ags0Var.h)) {
            vkSubnavigationBar.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            mha mhaVar = ags0Var.n;
            if (!mhaVar.e) {
                mhaVar.e = true;
                mhaVar.f.a();
            }
        } else {
            if (intValue >= ags0Var.g || intValue <= i5) {
                vkSubnavigationBar.setTranslationY(-i6);
            } else {
                vkSubnavigationBar.setTranslationY(((intValue - i5) * (-i6)) / (r1 - i5));
            }
        }
        ags0Var.a();
    }

    @Override // xsna.df90
    public final void l(int i) {
        RecyclerView recyclerView;
        int i2;
        int i3;
        if (i != 0) {
            return;
        }
        ags0 ags0Var = this.b;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) ags0Var.c.invoke();
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        kfs0 kfs0Var = ((VideoMinimizableDiscoveryFragment) ags0Var.d.c).G0;
        Pair<Boolean, Integer> b = xfs0.b(recyclerView, kfs0Var != null ? kfs0Var.h.f : null);
        if (b == null) {
            return;
        }
        boolean booleanValue = b.d().booleanValue();
        int intValue = b.g().intValue();
        if (booleanValue || intValue >= (i2 = ags0Var.g) || intValue <= (i3 = ags0Var.h)) {
            return;
        }
        if ((intValue - i3) / (i2 - i3) < 0.5d) {
            recyclerView.smoothScrollBy(0, i2 - intValue);
        } else {
            recyclerView.smoothScrollBy(0, i3 - intValue);
        }
    }
}
