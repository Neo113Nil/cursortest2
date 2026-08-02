package xsna;

import android.transition.Transition;

/* compiled from: MessageTranslateScreenOldVc.kt */
/* loaded from: classes6.dex */
public final class sb20 implements Transition.TransitionListener {
    public final /* synthetic */ com.vk.translate.impl.views.b a;

    public sb20(com.vk.translate.impl.views.b bVar) {
        this.a = bVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.a.j = false;
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.j = false;
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
