package com.google.ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes11.dex */
final class u extends AnimatorListenerAdapter {
    final /* synthetic */ InstallActivity a;

    public u(InstallActivity installActivity) {
        this.a = installActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }
}
