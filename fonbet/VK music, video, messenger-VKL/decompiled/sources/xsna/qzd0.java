package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.container.ProfileShowFiltersVh;

/* compiled from: ProfileShowFiltersVh.kt */
/* loaded from: classes16.dex */
public final class qzd0 extends RecyclerView.t {
    public final /* synthetic */ ProfileShowFiltersVh b;

    public qzd0(ProfileShowFiltersVh profileShowFiltersVh) {
        this.b = profileShowFiltersVh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        float b = bn10.b(recyclerView.computeHorizontalScrollOffset() / 30.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ProfileShowFiltersVh profileShowFiltersVh = this.b;
        View view = profileShowFiltersVh.e;
        if (view != null) {
            view.setAlpha(b);
        }
        View view2 = profileShowFiltersVh.f;
        if (view2 != null) {
            view2.setAlpha(b);
        }
    }
}
