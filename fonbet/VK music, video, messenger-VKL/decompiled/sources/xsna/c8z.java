package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes13.dex */
public final class c8z extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c8z(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                super.onAnimationEnd(animator);
                d8z d8zVar = (d8z) this.c;
                d8zVar.a();
                lf2 lf2Var = d8zVar.j;
                if (lf2Var != null) {
                    lf2Var.a(d8zVar.a);
                    break;
                }
                break;
            default:
                ((com.vk.story.viewer.impl.presentation.stories.b) this.c).T.setVisibility(8);
                break;
        }
    }
}
