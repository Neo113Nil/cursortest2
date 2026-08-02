package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.editor.StickerDeleteAreaView;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class b96 {
    public static final float b = cn70.c(98);
    public static final float c = cn70.c(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
    public final y440 a;

    /* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ StickerDeleteAreaView b;

        public a(StickerDeleteAreaView stickerDeleteAreaView) {
            this.b = stickerDeleteAreaView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.setVisibility(8);
        }
    }

    /* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.b.setVisibility(0);
        }
    }

    public b96(y440 y440Var) {
        this.a = y440Var;
    }

    public static void c(b96 b96Var) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        y440 y440Var = b96Var.a;
        y440Var.getCloseButtonBackground().animate().setDuration(195L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
        y440Var.getTopButtonsPanel().animate().setDuration(195L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
        View bottomPanel = y440Var.getBottomPanel();
        bottomPanel.animate().setDuration(195L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new c96(bottomPanel, b96Var)).start();
        View trashPreviewBtn = y440Var.getTrashPreviewBtn();
        if (trashPreviewBtn != null && (animate = trashPreviewBtn.animate()) != null && (duration = animate.setDuration(195L)) != null && (alpha = duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
            alpha.start();
        }
        y440Var.getEndButtonsPanel().animate().setDuration(195L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
        y440Var.getStylePicker().animate().setDuration(195L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
        y440Var.Q();
    }

    public static void e(b96 b96Var) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator withEndAction;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator startDelay2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator startDelay3;
        ViewPropertyAnimator alpha3;
        y440 y440Var = b96Var.a;
        y440Var.getDrawingBottomPanel().animate().setDuration(195L).setStartDelay(0L).alpha(1.0f).start();
        View drawingUndoButton = y440Var.getDrawingUndoButton();
        if (drawingUndoButton != null && (animate3 = drawingUndoButton.animate()) != null && (duration3 = animate3.setDuration(195L)) != null && (startDelay3 = duration3.setStartDelay(0L)) != null && (alpha3 = startDelay3.alpha(1.0f)) != null) {
            alpha3.start();
        }
        View sizeSeekBar = y440Var.getSizeSeekBar();
        if (sizeSeekBar != null && (animate2 = sizeSeekBar.animate()) != null && (duration2 = animate2.setDuration(195L)) != null && (startDelay2 = duration2.setStartDelay(0L)) != null && (alpha2 = startDelay2.alpha(1.0f)) != null) {
            alpha2.start();
        }
        View topDrawingControlsPanel = y440Var.getTopDrawingControlsPanel();
        if (topDrawingControlsPanel == null || (animate = topDrawingControlsPanel.animate()) == null || (duration = animate.setDuration(195L)) == null || (startDelay = duration.setStartDelay(0L)) == null || (alpha = startDelay.alpha(1.0f)) == null || (withEndAction = alpha.withEndAction(null)) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void a() {
        StickerDeleteAreaView stickerDeleteArea = this.a.getStickerDeleteArea();
        if (stickerDeleteArea.getVisibility() == 8) {
            return;
        }
        stickerDeleteArea.setAlpha(1.0f);
        stickerDeleteArea.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setInterpolator(qq2.c).setListener(new a(stickerDeleteArea)).setDuration(195L).start();
    }

    public final void b(krh krhVar) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator startDelay2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator startDelay3;
        ViewPropertyAnimator alpha3;
        y440 y440Var = this.a;
        y440Var.getDrawingBottomPanel().animate().setDuration(195L).setStartDelay(100L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
        View drawingUndoButton = y440Var.getDrawingUndoButton();
        if (drawingUndoButton != null && (animate3 = drawingUndoButton.animate()) != null && (duration3 = animate3.setDuration(195L)) != null && (startDelay3 = duration3.setStartDelay(100L)) != null && (alpha3 = startDelay3.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
            alpha3.start();
        }
        View sizeSeekBar = y440Var.getSizeSeekBar();
        if (sizeSeekBar != null && (animate2 = sizeSeekBar.animate()) != null && (duration2 = animate2.setDuration(195L)) != null && (startDelay2 = duration2.setStartDelay(100L)) != null && (alpha2 = startDelay2.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
            alpha2.start();
        }
        View topDrawingControlsPanel = y440Var.getTopDrawingControlsPanel();
        if (topDrawingControlsPanel == null || (animate = topDrawingControlsPanel.animate()) == null || (duration = animate.setDuration(195L)) == null || (startDelay = duration.setStartDelay(100L)) == null || (alpha = startDelay.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) == null) {
            return;
        }
        ViewPropertyAnimator withEndAction = alpha.withEndAction(krhVar != null ? new v86(0, krhVar) : null);
        if (withEndAction != null) {
            withEndAction.start();
        }
    }

    public final void d() {
        fov stickersView = this.a.getStickersView();
        if (stickersView == null || !stickersView.isVisible()) {
            return;
        }
        stickersView.hide();
    }

    public final void f() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        y440 y440Var = this.a;
        y440Var.getCloseButtonBackground().animate().setDuration(195L).alpha(1.0f).start();
        ViewGroup topButtonsPanel = y440Var.getTopButtonsPanel();
        int childCount = topButtonsPanel.getChildCount();
        for (int i = 0; i < childCount; i++) {
            topButtonsPanel.getChildAt(i).setAlpha(1.0f);
        }
        topButtonsPanel.animate().setDuration(195L).alpha(1.0f).start();
        y440Var.getBottomPanel().animate().setDuration(195L).alpha(1.0f).start();
        View trashPreviewBtn = y440Var.getTrashPreviewBtn();
        if (trashPreviewBtn != null && (animate = trashPreviewBtn.animate()) != null && (duration = animate.setDuration(195L)) != null && (alpha = duration.alpha(1.0f)) != null) {
            alpha.start();
        }
        y440Var.getEndButtonsPanel().animate().setDuration(195L).alpha(1.0f).start();
        y440Var.getRequirePresenter().N5().q().start();
        View bottomPanel = y440Var.getBottomPanel();
        bottomPanel.animate().setDuration(195L).alpha(1.0f).setListener(new b(bottomPanel)).start();
        if (y440Var.V()) {
            y440Var.getStylePicker().animate().setDuration(195L).alpha(1.0f).start();
        }
    }
}
