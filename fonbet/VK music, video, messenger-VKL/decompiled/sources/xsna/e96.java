package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class e96 extends AnimatorListenerAdapter {
    public final /* synthetic */ b96 b;

    public e96(b96 b96Var) {
        this.b = b96Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b96 b96Var = this.b;
        b96Var.a.getBottomPanel().setVisibility(8);
        y440 y440Var = b96Var.a;
        View trashPreviewBtn = y440Var.getTrashPreviewBtn();
        if (trashPreviewBtn != null) {
            trashPreviewBtn.setVisibility(8);
        }
        y440Var.getCloseButtonBackground().setVisibility(8);
        y440Var.getTopButtonsPanel().setVisibility(8);
        y440Var.getEndButtonsPanel().setVisibility(8);
        y440Var.getDrawingBottomPanel().setTranslationY(b96.c);
        y440Var.getDrawingBottomPanel().setVisibility(0);
        ajo drawToolControlsDelegate = y440Var.getDrawToolControlsDelegate();
        djo djoVar = drawToolControlsDelegate instanceof djo ? (djo) drawToolControlsDelegate : null;
        if (djoVar != null) {
            SizeSeekBarView j = djoVar.j();
            if (j != null) {
                j.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            SizeSeekBarView j2 = djoVar.j();
            if (j2 != null) {
                j2.postDelayed(new o93(djoVar, 12), 800L);
            }
        }
        View sizeSeekBar = y440Var.getSizeSeekBar();
        if (sizeSeekBar != null) {
            sizeSeekBar.setVisibility(0);
        }
        View topDrawingControlsPanel = y440Var.getTopDrawingControlsPanel();
        if (topDrawingControlsPanel != null) {
            topDrawingControlsPanel.setVisibility(0);
        }
        View drawingUndoContainer = y440Var.getDrawingUndoContainer();
        if (drawingUndoContainer != null) {
            drawingUndoContainer.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        View drawingUndoContainer2 = y440Var.getDrawingUndoContainer();
        if (drawingUndoContainer2 != null) {
            drawingUndoContainer2.setVisibility(0);
        }
    }
}
