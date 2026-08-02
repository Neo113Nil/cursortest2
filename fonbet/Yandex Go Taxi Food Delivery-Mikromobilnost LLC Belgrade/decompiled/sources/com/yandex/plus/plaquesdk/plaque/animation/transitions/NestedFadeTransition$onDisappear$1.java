package com.yandex.plus.plaquesdk.plaque.animation.transitions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import defpackage.cah0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/plaquesdk/plaque/animation/transitions/NestedFadeTransition$onDisappear$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NestedFadeTransition$onDisappear$1 extends AnimatorListenerAdapter {
    final /* synthetic */ View $overlayView;

    public NestedFadeTransition$onDisappear$1(View view) {
        this.$overlayView = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        View view = this.$overlayView;
        if (view != null) {
            view.setTag(cah0.plaque_sdk_corrected_fadeout, null);
        }
    }
}
