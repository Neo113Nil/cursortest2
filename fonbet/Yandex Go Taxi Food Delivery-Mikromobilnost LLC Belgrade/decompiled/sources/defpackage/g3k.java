package defpackage;

import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionSet;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public final class g3k extends TransitionListenerAdapter {
    public final /* synthetic */ TransitionSet a;

    public g3k(TransitionSet transitionSet, o430 o430Var, Div2View div2View, omk omkVar) {
        this.a = transitionSet;
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.K(this);
    }
}
