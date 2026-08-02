package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.core.view.FastScroller;

/* compiled from: FastScroller.java */
/* loaded from: classes17.dex */
public final class mlq extends AnimatorListenerAdapter {
    public final /* synthetic */ FastScroller b;

    public mlq(FastScroller fastScroller) {
        this.b = fastScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.h.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.h.setVisibility(8);
    }
}
