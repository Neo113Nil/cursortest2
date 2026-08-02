package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AlphaViewVisibilitySwitcher.kt */
/* loaded from: classes7.dex */
public final class mv1 {
    public final ViewGroup a;
    public final TimeInterpolator b;
    public AnimatorSet c;
    public AnimatorSet d;

    public mv1(ViewGroup viewGroup, AccelerateInterpolator accelerateInterpolator, int i) {
        accelerateInterpolator = (i & 2) != 0 ? null : accelerateInterpolator;
        this.a = viewGroup;
        this.b = accelerateInterpolator;
    }

    public final void a(boolean z) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        ViewGroup viewGroup = this.a;
        if (!z) {
            AnimatorSet animatorSet3 = this.d;
            if ((animatorSet3 == null || !animatorSet3.isRunning()) && bwt0.K(viewGroup)) {
                AnimatorSet animatorSet4 = this.c;
                if (animatorSet4 != null && animatorSet4.isRunning() && (animatorSet = this.c) != null) {
                    animatorSet.cancel();
                }
                AnimatorSet duration = new AnimatorSet().setDuration(300L);
                duration.play(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) LinearLayout.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                duration.addListener(new kv1(this, 0));
                this.d = duration;
                duration.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet5 = this.c;
        if ((animatorSet5 == null || !animatorSet5.isRunning()) && !bwt0.K(viewGroup)) {
            AnimatorSet animatorSet6 = this.d;
            if (animatorSet6 != null && animatorSet6.isRunning() && (animatorSet2 = this.d) != null) {
                animatorSet2.cancel();
            }
            AnimatorSet duration2 = new AnimatorSet().setDuration(300L);
            TimeInterpolator timeInterpolator = this.b;
            if (timeInterpolator != null) {
                duration2.setInterpolator(timeInterpolator);
            }
            duration2.play(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) LinearLayout.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            duration2.addListener(new lv1(this, 0));
            this.c = duration2;
            duration2.start();
        }
    }
}
