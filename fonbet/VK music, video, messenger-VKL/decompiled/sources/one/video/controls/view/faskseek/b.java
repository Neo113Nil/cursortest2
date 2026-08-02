package one.video.controls.view.faskseek;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: FastSeekViewAnimator.kt */
/* loaded from: classes8.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b.c();
    }
}
