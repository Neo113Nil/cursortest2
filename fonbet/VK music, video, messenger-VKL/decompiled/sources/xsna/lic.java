package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes13.dex */
public final class lic extends AnimatorListenerAdapter {
    public final /* synthetic */ nic b;

    public lic(nic nicVar) {
        this.b = nicVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b.h(true);
    }
}
