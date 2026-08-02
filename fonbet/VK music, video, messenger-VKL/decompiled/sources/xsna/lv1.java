package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: AlphaViewVisibilitySwitcher.kt */
/* loaded from: classes7.dex */
public final class lv1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lv1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 2:
                ((v0y0) this.c).invoke();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.b) {
            case 0:
                super.onAnimationStart(animator);
                bwt0.p0(((mv1) this.c).a, true);
                return;
            case 1:
                ((BottomAppBar) this.c).getClass();
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
