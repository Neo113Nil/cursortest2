package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class y86 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y86(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                b96 b96Var = (b96) this.c;
                y440 y440Var = b96Var.a;
                y440 y440Var2 = b96Var.a;
                View topDrawingControlsPanel = y440Var.getTopDrawingControlsPanel();
                if (topDrawingControlsPanel != null) {
                    topDrawingControlsPanel.setVisibility(8);
                }
                View sizeSeekBar = y440Var2.getSizeSeekBar();
                if (sizeSeekBar != null) {
                    sizeSeekBar.setVisibility(8);
                }
                y440Var2.getDrawingBottomPanel().setVisibility(8);
                View drawingUndoContainer = y440Var2.getDrawingUndoContainer();
                if (drawingUndoContainer != null) {
                    drawingUndoContainer.setVisibility(8);
                }
                View trashPreviewBtn = y440Var2.getTrashPreviewBtn();
                if (trashPreviewBtn != null) {
                    trashPreviewBtn.setVisibility(0);
                }
                y440Var2.getBottomPanel().setVisibility(0);
                y440Var2.getBottomPanel().setTranslationY(b96.c);
                y440Var2.getCloseButtonBackground().setVisibility(0);
                y440Var2.getCloseButtonBackground().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                y440Var2.getTopButtonsPanel().setVisibility(0);
                y440Var2.getTopButtonsPanel().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                y440Var2.getEndButtonsPanel().setVisibility(0);
                y440Var2.getEndButtonsPanel().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            default:
                uwt0.a(-2, (View) this.c);
                break;
        }
    }
}
