package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: InterestingStoriesBlockLayout.kt */
/* loaded from: classes6.dex */
public final class lex extends AnimatorListenerAdapter {
    public final /* synthetic */ kex b;

    public lex(kex kexVar) {
        this.b = kexVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kex kexVar = this.b;
        kexVar.getLayoutParams().height = -2;
        kexVar.requestLayout();
        kexVar.f.post(new wd2(kexVar, 5));
    }
}
