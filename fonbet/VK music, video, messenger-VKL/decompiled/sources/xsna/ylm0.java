package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: StoryViewDialog.java */
/* loaded from: classes6.dex */
public final class ylm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ sqs b;

    public ylm0(sqs sqsVar) {
        this.b = sqsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.b.invoke(null, null, null, null);
    }
}
