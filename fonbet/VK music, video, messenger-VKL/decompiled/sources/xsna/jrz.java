package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.fm6;

/* compiled from: LoaderFragment.kt */
/* loaded from: classes6.dex */
public abstract class jrz<P extends fm6> extends bb6<P> {
    public FrameLayout i;
    public View j;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = viewGroup instanceof FrameLayout ? (FrameLayout) viewGroup : null;
        if (frameLayout != null) {
            this.i = frameLayout;
            View findViewById = frameLayout.findViewById(R.id.vkpay_loader);
            if (findViewById == null) {
                LayoutInflater from = LayoutInflater.from(mo2getContext());
                FrameLayout frameLayout2 = this.i;
                if (frameLayout2 == null) {
                    frameLayout2 = null;
                }
                findViewById = from.inflate(R.layout.vk_pay_checkout_progress_bar, (ViewGroup) frameLayout2, false);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.gravity = 17;
                } else {
                    layoutParams2 = null;
                }
                findViewById.setLayoutParams(layoutParams2);
                FrameLayout frameLayout3 = this.i;
                (frameLayout3 != null ? frameLayout3 : null).addView(findViewById);
            }
            this.j = findViewById;
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void un() {
        View view = this.j;
        if (view == null) {
            view = null;
        }
        d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
    }

    public void vn() {
        View view = this.j;
        if (view == null) {
            view = null;
        }
        d3m.c(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
