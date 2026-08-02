package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.AdsButton;
import com.vk.log.L;
import com.vk.toggle.data.AdsBtnAnimationStyle;
import com.vk.toggle.data.AdsBtnStyle;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StyleAdsBtnDelegate.kt */
/* loaded from: classes4.dex */
public final class ysm0 implements AdsButton.c {
    public static final float k = cn70.c(8);
    public final AdsButton a;
    public final h170 b;
    public final View c;
    public final AccelerateDecelerateInterpolator d;
    public AnimatorSet e;
    public ValueAnimator f;
    public Animation g;
    public int h;
    public int i;
    public final Object j;

    /* compiled from: StyleAdsBtnDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdsBtnAnimationStyle.values().length];
            try {
                iArr[AdsBtnAnimationStyle.BUTTON_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdsBtnAnimationStyle.BUTTON_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdsBtnAnimationStyle.CHEVRON_MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdsBtnStyle.values().length];
            try {
                iArr2[AdsBtnStyle.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: StyleAdsBtnDelegate.kt */
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;

        public b(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.invoke();
            super.onAnimationEnd(animator);
        }
    }

    /* compiled from: StyleAdsBtnDelegate.kt */
    public static final class d extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ ysm0 c;

        public d(gzs<s3q0> gzsVar, ysm0 ysm0Var) {
            this.b = gzsVar;
            this.c = ysm0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.invoke();
            this.c.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0, 300, null);
        }
    }

    public ysm0(AdsButton adsButton, h170 h170Var, View view, int i) {
        view = (i & 4) != 0 ? null : view;
        this.a = adsButton;
        this.b = h170Var;
        this.c = view;
        this.d = new AccelerateDecelerateInterpolator();
        this.h = 5000;
        this.i = dhr0.t.c(R.attr.vk_ui_background_content);
        this.j = msy.a(LazyThreadSafetyMode.NONE, new g2c0(8));
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void a(int i) {
        this.i = i;
        com.vk.toggle.data.a a2 = this.b.a();
        AdsBtnAnimationStyle adsBtnAnimationStyle = a2 != null ? a2.b : null;
        AdsBtnAnimationStyle adsBtnAnimationStyle2 = AdsBtnAnimationStyle.BUTTON_COLOR;
        AdsButton adsButton = this.a;
        if (adsBtnAnimationStyle != adsBtnAnimationStyle2) {
            adsButton.setBackgroundColor(i);
        } else {
            adsButton.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_contrast_secondary_alpha));
        }
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void b() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f = null;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.e;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.e = null;
        View view = this.c;
        if (view != null) {
            view.clearAnimation();
        }
        Animation animation = this.g;
        if (animation != null) {
            animation.cancel();
        }
        this.g = null;
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void c(int i) {
        float f = k;
        h170 h170Var = this.b;
        AdsButton adsButton = this.a;
        if (i != 0) {
            if (i != 1) {
                L.l(lhg.a(i, "Unknown style for AdsButton: "));
                return;
            }
            com.vk.toggle.data.a a2 = h170Var.a();
            AdsBtnStyle adsBtnStyle = a2 != null ? a2.a : null;
            if ((adsBtnStyle != null ? a.$EnumSwitchMapping$1[adsBtnStyle.ordinal()] : -1) == 1) {
                adsButton.setBackground(new dpg0(new ColorDrawable(this.i), f));
                jno0.c(adsButton, R.attr.vk_ui_text_contrast_themed);
                return;
            } else {
                adsButton.setBackground(m33.a(R.drawable.ads_button, adsButton.getContext()));
                jno0.c(adsButton, R.attr.vk_ui_text_contrast_themed);
                return;
            }
        }
        com.vk.toggle.data.a a3 = h170Var.a();
        AdsBtnAnimationStyle adsBtnAnimationStyle = a3 != null ? a3.b : null;
        int i2 = adsBtnAnimationStyle != null ? a.$EnumSwitchMapping$0[adsBtnAnimationStyle.ordinal()] : -1;
        if (i2 == 1) {
            adsButton.setBackground(h());
            adsButton.setTextColor(adsButton.getOriginalColor());
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                adsButton.setBackground(h());
                adsButton.setTextColor(adsButton.getOriginalColor());
                return;
            } else {
                adsButton.setBackground(h());
                adsButton.setTextColor(adsButton.getOriginalColor());
                return;
            }
        }
        com.vk.toggle.data.a a4 = h170Var.a();
        if ((a4 != null ? a4.a : null) == AdsBtnStyle.SHORT) {
            adsButton.setBackground(new dpg0(new ColorDrawable(this.i), f));
            jno0.c(adsButton, R.attr.vk_ui_text_contrast_themed);
        } else {
            adsButton.setBackground(h());
            adsButton.setTextColor(adsButton.getOriginalColor());
        }
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void d(int i) {
        this.h = i;
    }

    @Override // com.vk.core.view.AdsButton.c
    public final void e(int i, dv0 dv0Var) {
        if (i == this.a.getStyle()) {
            com.vk.toggle.data.a a2 = this.b.a();
            if ((a2 != null ? a2.b : null) != AdsBtnAnimationStyle.BUTTON_LIGHT) {
                return;
            }
        }
        if (i != 0) {
            if (i != 1) {
                L.l(lhg.a(i, "Unknown style for AdsButton: "));
            } else {
                j(new pvh0(dv0Var, 4));
            }
        }
    }

    public final void f(float f, float f2, int i, int i2, d dVar) {
        b();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<AdsButton, Float>) View.ALPHA, f, f2));
        if (dVar != null) {
            animatorSet.addListener(dVar);
        }
        animatorSet.setDuration(i2);
        animatorSet.setStartDelay(i);
        animatorSet.start();
        this.e = animatorSet;
    }

    public final void g() {
        com.vk.toggle.data.a a2 = this.b.a();
        if ((a2 != null ? a2.b : null) == AdsBtnAnimationStyle.BUTTON_LIGHT && this.a.getStyle() == 1) {
            j(new cfi0(2));
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    public final Drawable h() {
        h170 h170Var = this.b;
        com.vk.toggle.data.a a2 = h170Var.a();
        AdsBtnStyle adsBtnStyle = a2 != null ? a2.a : null;
        if ((adsBtnStyle == null ? -1 : a.$EnumSwitchMapping$1[adsBtnStyle.ordinal()]) != 1) {
            return this.a.getOriginalDrawable();
        }
        com.vk.toggle.data.a a3 = h170Var.a();
        AdsBtnAnimationStyle adsBtnAnimationStyle = a3 != null ? a3.b : null;
        AdsBtnAnimationStyle adsBtnAnimationStyle2 = AdsBtnAnimationStyle.BUTTON_COLOR;
        float f = k;
        return adsBtnAnimationStyle == adsBtnAnimationStyle2 ? new dpg0(new ColorDrawable(((Number) this.j.getValue()).intValue()), f) : new dpg0(new ColorDrawable(this.i), f);
    }

    public final Animation i() {
        View view = this.c;
        if (view == null) {
            return null;
        }
        com.vk.toggle.data.a a2 = this.b.a();
        AdsBtnStyle adsBtnStyle = a2 != null ? a2.a : null;
        if ((adsBtnStyle == null ? -1 : a.$EnumSwitchMapping$1[adsBtnStyle.ordinal()]) == 1) {
            return AnimationUtils.loadAnimation(view.getContext(), R.anim.shine_short_btn);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(gzs<s3q0> gzsVar) {
        h170 h170Var = this.b;
        com.vk.toggle.data.a a2 = h170Var.a();
        AdsBtnAnimationStyle adsBtnAnimationStyle = a2 != null ? a2.b : null;
        int i = adsBtnAnimationStyle == null ? -1 : a.$EnumSwitchMapping$0[adsBtnAnimationStyle.ordinal()];
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.d;
        if (i == 1) {
            b();
            int intValue = ((Number) this.j.getValue()).intValue();
            int i2 = this.i;
            b bVar = new b(gzsVar);
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(intValue), Integer.valueOf(i2));
            ofObject.setDuration(300L);
            ofObject.setInterpolator(accelerateDecelerateInterpolator);
            ofObject.addUpdateListener(new l7d(this, 4));
            ofObject.addListener(bVar);
            ofObject.setStartDelay(1500L);
            ofObject.start();
            this.f = ofObject;
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (h170Var.a() != null) {
                    gzsVar.invoke();
                    return;
                } else {
                    b();
                    f(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.h, 20, new d(gzsVar, this));
                    return;
                }
            }
            return;
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        b();
        Animation i3 = i();
        if (i3 != null) {
            i3.setInterpolator(accelerateDecelerateInterpolator);
            i3.setStartOffset(1500L);
            i3.setAnimationListener(new c(gzsVar, this));
            view.startAnimation(i3);
        }
    }

    /* compiled from: StyleAdsBtnDelegate.kt */
    public static final class c implements Animation.AnimationListener {
        public final /* synthetic */ ysm0 b;
        public final /* synthetic */ gzs<s3q0> c;

        public c(gzs gzsVar, ysm0 ysm0Var) {
            this.b = ysm0Var;
            this.c = gzsVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            ysm0 ysm0Var = this.b;
            ysm0Var.c.post(new qyc(7, this.c, ysm0Var));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            ysm0 ysm0Var = this.b;
            ysm0Var.c.setVisibility(0);
            View view = ysm0Var.c;
            view.setBackground(m33.a(R.drawable.ads_button_short_gradient, view.getContext()));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
