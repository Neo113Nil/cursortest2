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
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PopupContentAnimator.kt */
/* loaded from: classes2.dex */
public final class iwb0 {
    public static final float f;
    public static final float h;
    public final View a;
    public AnimatorSet b;
    public AnimatorSet c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public gd70 e;
    public static final j8z g = new j8z();
    public static final hlq i = new hlq();

    /* compiled from: PopupContentAnimator.kt */
    public final class a extends AnimatorListenerAdapter {
        public final gzs<s3q0> b;

        public a(gd70 gd70Var) {
            this.b = gd70Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            iwb0 iwb0Var = iwb0.this;
            iwb0Var.b = null;
            iwb0Var.c = null;
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    /* compiled from: PopupContentAnimator.kt */
    public final class b extends AnimatorListenerAdapter {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            iwb0 iwb0Var = iwb0.this;
            iwb0Var.b = null;
            iwb0Var.c = null;
            iwb0Var.a.setVisibility(this.b);
        }
    }

    static {
        float f2 = 4;
        f = -iah0.a(f2);
        h = -iah0.a(f2);
    }

    public iwb0(View view) {
        this.a = view;
    }

    public final void a() {
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

    public final void b(boolean z) {
        View view = this.a;
        if (!z) {
            a();
            view.setVisibility(4);
            gd70 gd70Var = this.e;
            if (gd70Var != null) {
                gd70Var.invoke();
                return;
            }
            return;
        }
        a();
        if (view.getMeasuredHeight() > 0) {
            c();
            return;
        }
        x550 x550Var = new x550(this, 13);
        view.setVisibility(4);
        this.d.postDelayed(new jk9(x550Var, 7), 50L);
    }

    public final void c() {
        View view = this.a;
        view.setClipBounds(null);
        view.setAlpha(1.0f);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new b(4));
        animatorSet.addListener(new a(this.e));
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(i);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        this.c = animatorSet;
    }

    public final void d() {
        View view = this.a;
        Rect rect = new Rect(0, 0, view.getMeasuredWidth(), 0);
        Rect rect2 = new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setClipBounds(rect);
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f2 = f;
        view.setTranslationY(f2);
        view.setVisibility(0);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", new RectEvaluator(), rect, rect2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new b(0));
        animatorSet.addListener(new a(null));
        animatorSet.setDuration(225L);
        animatorSet.setInterpolator(g);
        animatorSet.playTogether(ofObject, ofFloat, ofFloat2);
        animatorSet.start();
        this.b = animatorSet;
    }
}
