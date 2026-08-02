package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class h96 extends AnimatorListenerAdapter {
    public final /* synthetic */ b96 b;

    public h96(b96 b96Var) {
        this.b = b96Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        y440 y440Var = this.b.a;
        View[] viewArr = (View[]) rl3.I(new View[]{y440Var.getCloseButtonBackground(), y440Var.getTopButtonsPanel(), y440Var.getBottomPanel(), y440Var.getEndButtonsPanel()}).toArray(new View[0]);
        View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = qq2.a;
        for (int i = 0; i < viewArr2.length; i++) {
            View view = viewArr2[i];
            if (view != null) {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                viewArr2[i].setVisibility(0);
            }
        }
        y440Var.getSideControlPanel().getMuteButton().setVisibility(8);
    }
}
