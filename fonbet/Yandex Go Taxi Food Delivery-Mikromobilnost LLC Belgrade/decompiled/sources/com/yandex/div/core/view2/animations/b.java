package com.yandex.div.core.view2.animations;

import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;

/* loaded from: classes11.dex */
public final class b extends TransitionListenerAdapter {
    public final /* synthetic */ Transition a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ SceneRootWatcher$OnDetachListener c;

    public b(Transition transition, ViewGroup viewGroup, SceneRootWatcher$OnDetachListener sceneRootWatcher$OnDetachListener) {
        this.a = transition;
        this.b = viewGroup;
        this.c = sceneRootWatcher$OnDetachListener;
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.b.removeOnAttachStateChangeListener(this.c);
        this.a.K(this);
    }
}
