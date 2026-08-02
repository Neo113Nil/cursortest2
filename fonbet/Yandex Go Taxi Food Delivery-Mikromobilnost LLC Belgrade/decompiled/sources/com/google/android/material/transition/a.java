package com.google.android.material.transition;

import android.view.View;
import androidx.transition.Transition;
import com.google.android.material.transition.MaterialContainerTransform;
import defpackage.ky01;

/* loaded from: classes11.dex */
public final class a extends ky01 {
    public final /* synthetic */ View a;
    public final /* synthetic */ MaterialContainerTransform.TransitionDrawable b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View w;
    public final /* synthetic */ MaterialContainerTransform x;

    public a(MaterialContainerTransform materialContainerTransform, View view, MaterialContainerTransform.TransitionDrawable transitionDrawable, View view2, View view3) {
        this.x = materialContainerTransform;
        this.a = view;
        this.b = transitionDrawable;
        this.c = view2;
        this.w = view3;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.x.K(this);
        this.c.setAlpha(1.0f);
        this.w.setAlpha(1.0f);
        this.a.getOverlay().remove(this.b);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a.getOverlay().add(this.b);
        this.c.setAlpha(0.0f);
        this.w.setAlpha(0.0f);
    }
}
