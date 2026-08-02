package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class a implements Runnable {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final b bVar = this.a;
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = bVar.i;
        if (baseTransientBottomBar$SnackbarBaseLayout == null) {
            return;
        }
        if (baseTransientBottomBar$SnackbarBaseLayout.getParent() != null) {
            baseTransientBottomBar$SnackbarBaseLayout.setVisibility(0);
        }
        if (baseTransientBottomBar$SnackbarBaseLayout.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(bVar.d);
            ofFloat.addUpdateListener(new BaseTransientBottomBar$11(bVar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(bVar.f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    b.this.i.setScaleX(floatValue);
                    b.this.i.setScaleY(floatValue);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(bVar.a);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    b.this.c();
                }
            });
            animatorSet.start();
            return;
        }
        int height = baseTransientBottomBar$SnackbarBaseLayout.getHeight();
        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        baseTransientBottomBar$SnackbarBaseLayout.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(bVar.e);
        valueAnimator.setDuration(bVar.c);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$13
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                b.this.c();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                b bVar2 = b.this;
                SnackbarContentLayout snackbarContentLayout = bVar2.j;
                int i = bVar2.c;
                int i2 = bVar2.a;
                snackbarContentLayout.animateContentIn(i - i2, i2);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$14
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.this.i.setTranslationY(((Integer) valueAnimator2.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.start();
    }
}
