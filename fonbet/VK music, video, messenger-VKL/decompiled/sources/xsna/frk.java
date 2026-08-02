package xsna;

import android.animation.Animator;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: Animator.kt */
/* loaded from: classes7.dex */
public final class frk implements Animator.AnimatorListener {
    public final /* synthetic */ Ref$BooleanRef b;

    public frk(Ref$BooleanRef ref$BooleanRef) {
        this.b = ref$BooleanRef;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.element = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
