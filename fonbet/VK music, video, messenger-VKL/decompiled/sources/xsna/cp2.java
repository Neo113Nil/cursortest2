package xsna;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimationExt.kt */
/* loaded from: classes6.dex */
public final class cp2 {
    public static final void a(View view, float f, float f2) {
        if (view == null) {
            return;
        }
        view.clearAnimation();
        view.setAlpha(f);
        view.setTranslationY(f2);
        view.animate().setListener(null).setUpdateListener(null).cancel();
    }

    public static /* synthetic */ void b(View view, int i, float f) {
        if ((i & 2) != 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        a(view, 1.0f, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(View view, long j, long j2, Runnable runnable, j8z j8zVar, int i) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            runnable = null;
        }
        if ((i & 8) != 0) {
            j8zVar = null;
        }
        if (view == null) {
            return;
        }
        a(view, view.getVisibility() == 0 ? view.getAlpha() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getTranslationY());
        view.setVisibility(0);
        ViewPropertyAnimator duration = view.animate().withEndAction(new qo2(0 == true ? 1 : 0, view, runnable)).alpha(1.0f).setDuration(j);
        if (Boolean.valueOf(j8zVar != null).equals(Boolean.TRUE)) {
            duration.setInterpolator(j8zVar);
            s3q0 s3q0Var = s3q0.a;
        }
        duration.setStartDelay(j2);
    }

    public static void d(View view, long j, Runnable runnable, hlq hlqVar, int i) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            runnable = null;
        }
        if ((i & 8) != 0) {
            hlqVar = null;
        }
        if (view == null) {
            return;
        }
        if (view.getVisibility() != 0) {
            b(view, 1, view.getTranslationY());
            view.post(new to2(runnable, 0));
            return;
        }
        a(view, view.getAlpha(), view.getTranslationY());
        view.setVisibility(0);
        ViewPropertyAnimator duration = view.animate().withEndAction(new vo2(0, runnable, view)).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j);
        if (hlqVar != null) {
            duration.setInterpolator(hlqVar);
        }
        duration.setStartDelay(0L);
    }
}
