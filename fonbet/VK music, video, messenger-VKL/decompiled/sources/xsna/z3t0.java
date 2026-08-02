package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.AdsButton;
import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: VideoPlayerAdsPanelButtonStyleDelegate.kt */
/* loaded from: classes3.dex */
public final class z3t0 implements AdsButton.c {
    public final AdsButton a;
    public AnimatorSet b = new AnimatorSet();
    public int c = 5000;
    public Integer d;

    public z3t0(AdsButton adsButton) {
        this.a = adsButton;
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void a(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void b() {
        this.b.cancel();
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void c(int i) {
        AdsButton adsButton = this.a;
        if (i == 0) {
            adsButton.setBackground(adsButton.getOriginalDrawable());
            adsButton.setTextColor(adsButton.getOriginalColor());
        } else {
            if (i != 1) {
                L.l(lhg.a(i, "Unknown style for AdsButton: "));
                return;
            }
            Integer num = this.d;
            if (num != null) {
                adsButton.setBackgroundTintList(ColorStateList.valueOf(num.intValue()));
            }
            adsButton.setBackground(m33.a(R.drawable.ads_button, adsButton.getContext()));
            jno0.c(adsButton, R.attr.vk_ui_background_contrast_themed);
        }
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void d(int i) {
        this.c = i;
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void e(int i, dv0 dv0Var) {
        b();
        f(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c, 20, new y3t0(this, dv0Var));
    }

    public final void f(float f, float f2, int i, int i2, y3t0 y3t0Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<AdsButton, Float>) View.ALPHA, f, f2));
        if (y3t0Var != null) {
            animatorSet.addListener(y3t0Var);
        }
        animatorSet.setDuration(i2);
        animatorSet.setStartDelay(i);
        animatorSet.start();
        this.b = animatorSet;
    }
}
