package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: DiscoverStoryView.kt */
/* loaded from: classes6.dex */
public final class z9n extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public z9n(View view, float f) {
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setAlpha(this.c);
    }
}
