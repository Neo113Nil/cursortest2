package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PhonePodcastPageToolbarViewController.kt */
/* loaded from: classes3.dex */
public final class l3a0 extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public l3a0(View view, float f) {
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setAlpha(this.c);
    }
}
