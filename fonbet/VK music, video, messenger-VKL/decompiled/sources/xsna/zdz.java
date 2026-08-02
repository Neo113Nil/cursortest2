package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ListAnimator23.kt */
/* loaded from: classes2.dex */
public final class zdz implements aez {
    public static final float e;
    public static final float g;
    public final View a;
    public AnimatorSet b;
    public AnimatorSet c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public static final j8z f = new j8z();
    public static final hlq h = new hlq();

    /* compiled from: ListAnimator23.kt */
    public final class a extends AnimatorListenerAdapter {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            zdz zdzVar = zdz.this;
            zdzVar.b = null;
            zdzVar.c = null;
            zdzVar.a.setVisibility(this.b);
        }
    }

    static {
        float f2 = 16;
        e = -iah0.a(f2);
        g = -iah0.a(f2);
    }

    public zdz(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // xsna.aez
    public final void a(boolean z) {
        if (isVisible()) {
            View view = this.a;
            if (!z) {
                b();
                view.setVisibility(8);
                return;
            }
            b();
            if (!view.isLayoutRequested() && view.getMeasuredHeight() > 0) {
                c();
                return;
            }
            kyc kycVar = new kyc(this, 2);
            view.setVisibility(4);
            this.d.postDelayed(kycVar, 50L);
        }
    }

    public final void b() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b = null;
        AnimatorSet animatorSet2 = this.c;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.c = null;
        this.d.removeCallbacksAndMessages(null);
    }

    public final void c() {
        View view = this.a;
        view.setClipBounds(null);
        view.setAlpha(1.0f);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, g);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new a(8));
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(h);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        this.c = animatorSet;
    }

    public final void d() {
        View view = this.a;
        Rect rect = new Rect(0, 0, view.getMeasuredWidth(), 0);
        Rect rect2 = new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setClipBounds(rect);
        view.setAlpha(0.4f);
        float f2 = e;
        view.setTranslationY(f2);
        view.setVisibility(0);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", new RectEvaluator(), rect, rect2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.4f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new a(0));
        animatorSet.setDuration(225L);
        animatorSet.setInterpolator(f);
        animatorSet.playTogether(ofObject, ofFloat, ofFloat2);
        animatorSet.start();
        this.b = animatorSet;
    }

    @Override // xsna.aez
    public final boolean isVisible() {
        if (this.b != null) {
            return true;
        }
        return bwt0.K(this.a) && this.c == null;
    }

    @Override // xsna.aez
    public final void show() {
        if (isVisible()) {
            return;
        }
        b();
        View view = this.a;
        if (!view.isLayoutRequested() && view.getMeasuredHeight() > 0) {
            d();
            return;
        }
        sj1 sj1Var = new sj1(this, 8);
        view.setVisibility(4);
        this.d.postDelayed(sj1Var, 50L);
    }
}
