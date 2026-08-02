package defpackage;

import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;

/* loaded from: classes11.dex */
public final class jx80 extends TransitionListenerAdapter {
    public final /* synthetic */ lx80 a;
    public final /* synthetic */ ax01 b;
    public final /* synthetic */ TransitionValues c;

    public jx80(lx80 lx80Var, ax01 ax01Var, TransitionValues transitionValues) {
        this.a = lx80Var;
        this.b = ax01Var;
        this.c = transitionValues;
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ax01 ax01Var = this.b;
        if (ax01Var != null) {
            ax01Var.transitionFinished(this.c.b);
        }
        this.a.K(this);
    }
}
