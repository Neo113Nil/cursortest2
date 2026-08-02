package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimationExt.kt */
/* loaded from: classes8.dex */
public final class dp2 {
    @ozl
    public static final void a(View view, float f, float f2) {
        if (view == null) {
            return;
        }
        view.clearAnimation();
        view.setAlpha(f);
        view.setTranslationY(f2);
        view.animate().setListener(null).setUpdateListener(null).cancel();
    }

    public static void b(View view, kl2 kl2Var, int i) {
        if ((i & 4) != 0) {
            kl2Var = null;
        }
        if (view == null) {
            return;
        }
        a(view, view.getVisibility() == 0 ? view.getAlpha() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getTranslationY());
        view.setVisibility(0);
        view.animate().withEndAction(new ro2(0, view, kl2Var)).alpha(1.0f).setDuration(300L).setStartDelay(0L);
    }

    public static void c(final View view, final nx3 nx3Var, final boolean z, int i) {
        long j = (i & 2) != 0 ? 0L : 500L;
        if ((i & 4) != 0) {
            nx3Var = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if (view == null) {
            return;
        }
        if (view.getVisibility() != 0) {
            a(view, 1.0f, view.getTranslationY());
            view.post(new u12(nx3Var, 1));
        } else {
            a(view, view.getAlpha(), view.getTranslationY());
            view.setVisibility(0);
            view.animate().withEndAction(new Runnable() { // from class: xsna.uo2
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable = nx3Var;
                    if (runnable != null) {
                        runnable.run();
                    }
                    int i2 = z ? 8 : 4;
                    View view2 = view;
                    view2.setVisibility(i2);
                    dp2.a(view2, 1.0f, view2.getTranslationY());
                }
            }).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).setStartDelay(j);
        }
    }
}
