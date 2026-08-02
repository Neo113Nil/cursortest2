package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ViewExt.kt */
/* loaded from: classes3.dex */
public final class twt0 {
    public static void a(View view, float f, float f2, float f3, float f4, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        if ((i & 16) != 0) {
            f4 = 0.0f;
        }
        if (view == null) {
            return;
        }
        view.clearAnimation();
        view.setAlpha(1.0f);
        view.setTranslationY(f2);
        view.setTranslationX(f);
        view.setScaleX(f3);
        view.setScaleY(f4);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.setListener(null).setUpdateListener(null);
    }

    public static void b(int i, long j, View view) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if (view == null) {
            return;
        }
        view.setAlpha(view.getVisibility() != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : view.getAlpha());
        view.setVisibility(0);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.setListener(new fwt0(view));
        animate.alpha(1.0f).setDuration(j).setStartDelay(0L);
        animate.start();
    }

    public static ViewPropertyAnimator c(View view, long j, myd0 myd0Var, int i) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            myd0Var = null;
        }
        if (view == null) {
            return null;
        }
        view.setVisibility(0);
        view.setAlpha(1.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.setListener(new gwt0(view, myd0Var));
        animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).setStartDelay(0L);
        return animate;
    }

    public static final void d(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i;
        }
    }

    public static final void e(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = i;
        }
    }

    public static final void f(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
        }
    }

    public static final void g(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = i;
            marginLayoutParams.height = i2;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
