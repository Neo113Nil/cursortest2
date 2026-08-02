package xsna;

import android.animation.Animator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Animator.kt */
/* loaded from: classes16.dex */
public final class w86 implements Animator.AnimatorListener {
    public final /* synthetic */ b96 b;

    public w86(b96 b96Var) {
        this.b = b96Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b96 b96Var = this.b;
        b96Var.a.getBackgroundEditorTopView().setVisibility(8);
        y440 y440Var = b96Var.a;
        y440Var.getBackgroundEditorBottomView().setVisibility(8);
        y440Var.getBottomPanel().setVisibility(0);
        y440Var.getBottomPanel().setTranslationY(b96.c);
        y440Var.getCloseButtonBackground().setVisibility(0);
        y440Var.getCloseButtonBackground().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        y440Var.getTopButtonsPanel().setVisibility(0);
        y440Var.getTopButtonsPanel().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        y440Var.getEndButtonsPanel().setVisibility(0);
        y440Var.getEndButtonsPanel().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View trashPreviewBtn = y440Var.getTrashPreviewBtn();
        if (trashPreviewBtn != null) {
            trashPreviewBtn.setVisibility(0);
        }
        y440Var.getStylePicker().setVisibility(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
