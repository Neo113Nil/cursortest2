package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.search.VkSearchView;

/* compiled from: VkSearchAnimationHelper.kt */
/* loaded from: classes17.dex */
public final class aiv0 {
    public final VkSearchView a;
    public final View b;
    public final int c = iah0.v() - iah0.a(28);
    public final int d = iah0.a(25);
    public boolean e;

    public aiv0(View view, VkSearchView vkSearchView) {
        this.a = vkSearchView;
        this.b = view;
    }

    public final void a(gzs<s3q0> gzsVar) {
        if (this.e) {
            return;
        }
        this.e = true;
        View view = this.b;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        d3m.e(this.b, (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        this.a.setVisibility(0);
        xo2.c(this.a, this.c, this.d, iah0.v(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 300L, new zhv0(0, this, gzsVar));
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        View view = this.b;
        if (view != null) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        d3m.c(this.b, (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a.setVisibility(0);
        xo2.c(this.a, this.c, this.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.v(), 300L, new ivs0(this, 6));
    }
}
