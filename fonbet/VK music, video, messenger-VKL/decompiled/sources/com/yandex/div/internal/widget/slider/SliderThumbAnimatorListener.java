package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SliderThumbAnimatorListener.kt */
/* loaded from: classes7.dex */
public final class SliderThumbAnimatorListener implements Animator.AnimatorListener {
    private boolean hasCanceled;
    private final izs<Boolean, s3q0> onAnimationEnd;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderThumbAnimatorListener(izs<? super Boolean, s3q0> izsVar) {
        this.onAnimationEnd = izsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.hasCanceled = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.onAnimationEnd.invoke(Boolean.valueOf(this.hasCanceled));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.hasCanceled = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }
}
