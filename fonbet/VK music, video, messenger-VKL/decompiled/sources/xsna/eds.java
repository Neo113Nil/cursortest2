package xsna;

import android.transition.Transition;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes12.dex */
public final class eds implements Transition.TransitionListener {
    public final /* synthetic */ wq8 a;

    public eds(wq8 wq8Var) {
        this.a = wq8Var;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.run();
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
