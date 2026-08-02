package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BonusesSpendViewHolder.kt */
/* loaded from: classes6.dex */
public final class jm7 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ km7 c;

    public jm7(boolean z, km7 km7Var) {
        this.b = z;
        this.c = km7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        uwt0.a(this.b ? -2 : 0, this.c.o);
    }
}
