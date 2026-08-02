package xsna;

import android.animation.Animator;
import android.view.View;

/* compiled from: Animator.kt */
/* loaded from: classes16.dex */
public final class d96 implements Animator.AnimatorListener {
    public final /* synthetic */ b96 b;

    public d96(b96 b96Var) {
        this.b = b96Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b96 b96Var = this.b;
        b96Var.a.getBottomPanel().setVisibility(8);
        y440 y440Var = b96Var.a;
        y440Var.getCloseButtonBackground().setVisibility(8);
        y440Var.getTopButtonsPanel().setVisibility(8);
        y440Var.getEndButtonsPanel().setVisibility(8);
        y440Var.getBackgroundEditorBottomView().setTranslationY(b96.b);
        y440Var.getBackgroundEditorBottomView().setVisibility(0);
        y440Var.getBackgroundEditorTopView().setVisibility(0);
        View trashPreviewBtn = y440Var.getTrashPreviewBtn();
        if (trashPreviewBtn != null) {
            trashPreviewBtn.setVisibility(8);
        }
        y440Var.getStylePicker().setVisibility(8);
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
