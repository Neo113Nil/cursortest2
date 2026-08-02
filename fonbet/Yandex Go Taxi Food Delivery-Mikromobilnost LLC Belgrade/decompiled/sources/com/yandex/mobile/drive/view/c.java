package com.yandex.mobile.drive.view;

import androidx.transition.Transition;
import com.yandex.mobile.drive.view.AlertView;

/* loaded from: classes15.dex */
public final class c implements Transition.TransitionListener {
    public final /* synthetic */ AlertView a;

    public c(AlertView alertView) {
        this.a = alertView;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.setState(AlertView.State.Opened);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
