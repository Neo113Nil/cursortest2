package xsna;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.view.linkedtext.LinkedMessageView;

/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class znb implements Animator.AnimatorListener {
    public final /* synthetic */ ynb b;

    public znb(ynb ynbVar) {
        this.b = ynbVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FrameLayout frameLayout;
        ynb ynbVar = this.b;
        LinkedMessageView linkedMessageView = ynbVar.n;
        if (linkedMessageView != null) {
            linkedMessageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        LinkedMessageView linkedMessageView2 = ynbVar.n;
        if (linkedMessageView2 != null) {
            linkedMessageView2.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        LinkedMessageView linkedMessageView3 = ynbVar.n;
        if (linkedMessageView3 != null) {
            linkedMessageView3.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        LinkedMessageView linkedMessageView4 = ynbVar.n;
        if (linkedMessageView4 == null || (frameLayout = ynbVar.o) == null) {
            return;
        }
        frameLayout.addView(linkedMessageView4);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
