package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: AlphaViewVisibilitySwitcher.kt */
/* loaded from: classes7.dex */
public final class kv1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kv1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                onAnimationStart(animator);
                bwt0.p0(((mv1) this.c).a, false);
                break;
            default:
                ((q5f) this.c).invoke();
                break;
        }
    }
}
