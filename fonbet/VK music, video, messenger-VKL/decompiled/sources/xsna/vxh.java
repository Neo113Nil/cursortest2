package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import xsna.rxh;

/* compiled from: CommunityReviewItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class vxh extends AnimatorListenerAdapter {
    public final /* synthetic */ wxh b;

    public vxh(wxh wxhVar) {
        this.b = wxhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        wxh wxhVar = this.b;
        wxhVar.itemView.setBackgroundColor(0);
        ObjectAnimator objectAnimator = wxhVar.r;
        if (objectAnimator != null) {
            objectAnimator.removeListener(this);
        }
        wxhVar.r = null;
        wxhVar.l.c(rxh.g.a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        wxh wxhVar = this.b;
        wxhVar.itemView.setBackgroundColor(0);
        ObjectAnimator objectAnimator = wxhVar.r;
        if (objectAnimator != null) {
            objectAnimator.removeListener(this);
        }
        wxhVar.r = null;
        wxhVar.l.c(rxh.g.a);
    }
}
