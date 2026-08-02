package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ck2;
import defpackage.ex31;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.ry01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
abstract class MaterialVisibility<P extends ex31> extends Visibility {
    private final List<ex31> additionalAnimatorProviders = new ArrayList();
    private final P primaryAnimatorProvider;
    private ex31 secondaryAnimatorProvider;

    public MaterialVisibility(P p, ex31 ex31Var) {
        this.primaryAnimatorProvider = p;
        this.secondaryAnimatorProvider = ex31Var;
    }

    private static void addAnimatorIfNeeded(List<Animator> list, ex31 ex31Var, ViewGroup viewGroup, View view, boolean z) {
        if (ex31Var == null) {
            return;
        }
        Animator b = z ? ex31Var.b(view, viewGroup) : ex31Var.a(view, viewGroup);
        if (b != null) {
            list.add(b);
        }
    }

    private Animator createAnimator(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z);
        Iterator<ex31> it = this.additionalAnimatorProviders.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, it.next(), viewGroup, view, z);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z);
        ck2.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        int O;
        int durationThemeAttrResId = getDurationThemeAttrResId(z);
        RectF rectF = ry01.a;
        if (durationThemeAttrResId != 0 && getDuration() == -1 && (O = kp50.O(context, durationThemeAttrResId, -1)) != -1) {
            setDuration(O);
        }
        int easingThemeAttrResId = getEasingThemeAttrResId(z);
        TimeInterpolator defaultEasingInterpolator = getDefaultEasingInterpolator(z);
        if (easingThemeAttrResId == 0 || getInterpolator() != null) {
            return;
        }
        setInterpolator(kp50.P(context, easingThemeAttrResId, defaultEasingInterpolator));
    }

    public void addAdditionalAnimatorProvider(ex31 ex31Var) {
        this.additionalAnimatorProviders.add(ex31Var);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return mj2.b;
    }

    public int getDurationThemeAttrResId(boolean z) {
        return 0;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return 0;
    }

    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public ex31 getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(ex31 ex31Var) {
        return this.additionalAnimatorProviders.remove(ex31Var);
    }

    public void setSecondaryAnimatorProvider(ex31 ex31Var) {
        this.secondaryAnimatorProvider = ex31Var;
    }
}
