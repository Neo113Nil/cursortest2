package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import defpackage.ny61;
import defpackage.wvb;
import defpackage.xvb;

/* loaded from: classes11.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet a(xvb xvbVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(xvbVar, (Property<xvb, V>) CircularRevealWidget$CircularRevealProperty.CIRCULAR_REVEAL, (TypeEvaluator) CircularRevealWidget$CircularRevealEvaluator.CIRCULAR_REVEAL, (Object[]) new wvb[]{new wvb(f, f2, f3)});
        wvb revealInfo = xvbVar.getRevealInfo();
        if (revealInfo == null) {
            ny61.r("Caller must set a non-null RevealInfo before calling this.");
            return null;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) xvbVar, (int) f, (int) f2, revealInfo.c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    public static Animator.AnimatorListener b(final xvb xvbVar) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.circularreveal.CircularRevealCompat$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                xvb.this.destroyCircularRevealCache();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                xvb.this.buildCircularRevealCache();
            }
        };
    }
}
