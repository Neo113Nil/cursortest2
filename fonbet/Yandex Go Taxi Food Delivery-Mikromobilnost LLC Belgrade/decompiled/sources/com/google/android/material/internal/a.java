package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.search.SearchBar;
import defpackage.mj2;
import defpackage.vf2;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class a {
    public final SearchBar a;
    public final View b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public vf2 e;
    public long f;
    public int g;

    public a(SearchBar searchBar, View view) {
        this.a = searchBar;
        this.b = view;
    }

    public final AnimatorSet a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Rect b = e.b(this.g, this.a);
        View view = this.b;
        Rect b2 = e.b(0, view);
        Rect rect = new Rect(b);
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect), b, b2);
        ofObject.addUpdateListener(new vf2(6, this, rect));
        vf2 vf2Var = this.e;
        if (vf2Var != null) {
            ofObject.addUpdateListener(vf2Var);
        }
        ofObject.setDuration(this.f);
        FastOutSlowInInterpolator fastOutSlowInInterpolator = mj2.b;
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        ArrayList e = e.e(view);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(e));
        ofFloat.setDuration(this.f);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z, mj2.a));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((r2.getRight() - view.getRight()) + (view.getLeft() - r2.getLeft()), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationXListener(this.d));
        ofFloat2.setDuration(this.f);
        ofFloat2.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        animatorSet.playTogether(ofObject, ofFloat, ofFloat2);
        return animatorSet;
    }

    public final AnimatorSet b() {
        AnimatorSet a = a(false);
        a.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.b.setVisibility(8);
            }
        });
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            a.addListener((AnimatorListenerAdapter) it.next());
        }
        return a;
    }

    public final AnimatorSet c() {
        AnimatorSet a = a(true);
        a.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a.this.b.setVisibility(0);
            }
        });
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            a.addListener((AnimatorListenerAdapter) it.next());
        }
        return a;
    }
}
