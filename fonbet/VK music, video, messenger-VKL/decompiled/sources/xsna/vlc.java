package xsna;

import android.animation.Animator;

/* compiled from: ClipActionButtonFooterHolder.kt */
/* loaded from: classes4.dex */
public final class vlc implements Animator.AnimatorListener {
    public final /* synthetic */ ulc b;
    public final /* synthetic */ Integer c;

    public vlc(ulc ulcVar, Integer num) {
        this.b = ulcVar;
        this.c = num;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b7(this.c);
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
