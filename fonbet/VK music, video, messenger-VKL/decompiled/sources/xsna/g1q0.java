package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: UiTrackingFragmentStateAdapter.kt */
/* loaded from: classes17.dex */
public final class g1q0 extends ViewPager2.g {
    public boolean d;
    public final /* synthetic */ k1q0 e;

    public g1q0(k1q0 k1q0Var) {
        this.e = k1q0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrolled(int i, float f, int i2) {
        if (!this.d && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i2 == 0) {
            k1q0.E0(this.e, i);
            this.d = true;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        k1q0 k1q0Var = this.e;
        if (k1q0Var.H0()) {
            k1q0.E0(k1q0Var, i);
            this.d = true;
        }
    }
}
