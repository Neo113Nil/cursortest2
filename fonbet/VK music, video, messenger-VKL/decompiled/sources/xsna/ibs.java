package xsna;

import android.transition.Transition;

/* compiled from: FragmentImpl.kt */
/* loaded from: classes17.dex */
public final class ibs implements Transition.TransitionListener {
    public final /* synthetic */ qb6 a;

    public ibs(qb6 qb6Var) {
        this.a = qb6Var;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.invoke(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
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
