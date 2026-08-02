package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.vk.attachpicker.fragment.gallery.FastScroller;

/* compiled from: FastScroller.kt */
/* loaded from: classes15.dex */
public final class nlq extends AnimatorListenerAdapter {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ FastScroller c;

    public nlq(TextView textView, FastScroller fastScroller) {
        this.b = textView;
        this.c = fastScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setVisibility(8);
        this.c.p = false;
    }
}
