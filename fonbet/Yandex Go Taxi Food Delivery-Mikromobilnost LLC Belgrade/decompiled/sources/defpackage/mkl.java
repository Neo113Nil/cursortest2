package defpackage;

import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionSet;

/* loaded from: classes11.dex */
public final class mkl extends TransitionListenerAdapter {
    public final /* synthetic */ TransitionSet a;
    public final /* synthetic */ nkl b;

    public mkl(TransitionSet transitionSet, nkl nklVar) {
        this.a = transitionSet;
        this.b = nklVar;
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.b.c.clear();
        this.a.K(this);
    }
}
