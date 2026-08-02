package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: MarketPicker.kt */
/* loaded from: classes4.dex */
public final class z910 extends AnimatorListenerAdapter {
    public final /* synthetic */ cty b;

    public z910(cty ctyVar) {
        this.b = ctyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.invoke();
    }
}
