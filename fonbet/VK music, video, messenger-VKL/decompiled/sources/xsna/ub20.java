package xsna;

import android.transition.Transition;

/* compiled from: MessageTranslateScreenVc.kt */
/* loaded from: classes6.dex */
public final class ub20 implements Transition.TransitionListener {
    public final /* synthetic */ vb20 a;

    public ub20(vb20 vb20Var) {
        this.a = vb20Var;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.a.r = false;
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.r = false;
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
