package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListShowFiltersVh;

/* compiled from: HorizontalListShowFiltersVh.kt */
/* loaded from: classes16.dex */
public final class nev extends RecyclerView.t {
    public final /* synthetic */ HorizontalListShowFiltersVh b;

    public nev(HorizontalListShowFiltersVh horizontalListShowFiltersVh) {
        this.b = horizontalListShowFiltersVh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        float b = bn10.b(recyclerView.computeHorizontalScrollOffset() / 30.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        HorizontalListShowFiltersVh horizontalListShowFiltersVh = this.b;
        View view = horizontalListShowFiltersVh.e;
        if (view != null) {
            view.setAlpha(b);
        }
        View view2 = horizontalListShowFiltersVh.f;
        if (view2 != null) {
            view2.setAlpha(b);
        }
    }
}
