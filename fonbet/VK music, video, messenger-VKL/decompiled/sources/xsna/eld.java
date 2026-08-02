package xsna;

import android.animation.Animator;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.feed.view.subs.ClipsCanvasSubtitleView;

/* compiled from: ClipsCanvasSubtitleView.kt */
/* loaded from: classes17.dex */
public final class eld implements Animator.AnimatorListener {
    public final /* synthetic */ ClipsCanvasSubtitleView b;

    public eld(ClipsCanvasSubtitleView clipsCanvasSubtitleView) {
        this.b = clipsCanvasSubtitleView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ClipsCanvasSubtitleView clipsCanvasSubtitleView = this.b;
        RectF rectF = clipsCanvasSubtitleView.l;
        rectF.right += clipsCanvasSubtitleView.n;
        rectF.bottom += clipsCanvasSubtitleView.m;
        clipsCanvasSubtitleView.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        clipsCanvasSubtitleView.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        clipsCanvasSubtitleView.t = null;
        clipsCanvasSubtitleView.invalidate();
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
