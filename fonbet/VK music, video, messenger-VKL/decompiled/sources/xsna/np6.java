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
public final class np6 extends AnimatorListenerAdapter {
    public final /* synthetic */ BaseTransientBottomBar b;

    public np6(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.b;
        vlj vljVar = baseTransientBottomBar.j;
        int i = baseTransientBottomBar.c;
        int i2 = baseTransientBottomBar.a;
        int i3 = i - i2;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) vljVar;
        snackbarContentLayout.b.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        long j = i2;
        ViewPropertyAnimator duration = snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.d;
        long j2 = i3;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (snackbarContentLayout.c.getVisibility() == 0) {
            snackbarContentLayout.c.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            snackbarContentLayout.c.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
