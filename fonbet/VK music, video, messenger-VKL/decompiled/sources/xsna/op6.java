package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes13.dex */
public final class op6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;

    public op6(tmo tmoVar) {
        this.c = tmoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                ((BaseTransientBottomBar) this.c).d();
                break;
            default:
                tmo tmoVar = (tmo) this.c;
                tmoVar.q();
                tmoVar.r.start();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.b) {
            case 0:
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.c;
                vlj vljVar = baseTransientBottomBar.j;
                int i = baseTransientBottomBar.b;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) vljVar;
                snackbarContentLayout.b.setAlpha(1.0f);
                long j = i;
                ViewPropertyAnimator duration = snackbarContentLayout.b.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.d;
                long j2 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.c.getVisibility() == 0) {
                    snackbarContentLayout.c.setAlpha(1.0f);
                    snackbarContentLayout.c.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public op6(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.c = baseTransientBottomBar;
    }
}
