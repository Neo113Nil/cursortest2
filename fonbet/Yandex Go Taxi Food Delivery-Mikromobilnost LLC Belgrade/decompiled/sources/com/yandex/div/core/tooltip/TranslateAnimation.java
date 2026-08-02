package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div2.DivTooltip$Position;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J(\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/tooltip/TranslateAnimation;", "Landroid/transition/Visibility;", "position", "Lcom/yandex/div2/DivTooltip$Position;", "percentage", "", "(Lcom/yandex/div2/DivTooltip$Position;Ljava/lang/Float;)V", "Ljava/lang/Float;", "onAppear", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "startValues", "Landroid/transition/TransitionValues;", "endValues", "onDisappear", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TranslateAnimation extends Visibility {
    private final Float percentage;
    private final DivTooltip$Position position;

    public /* synthetic */ TranslateAnimation(DivTooltip$Position divTooltip$Position, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(divTooltip$Position, (i & 2) != 0 ? null : f);
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        float h = a.h(this.position);
        float i = a.i(this.position);
        view.setTranslationX(h * (this.percentage != null ? this.percentage.floatValue() * view.getWidth() : a.g(view)));
        view.setTranslationY(i * (this.percentage != null ? this.percentage.floatValue() * view.getHeight() : a.g(view)));
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f));
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f, a.h(this.position) * (this.percentage != null ? this.percentage.floatValue() * view.getWidth() : a.g(view))), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, a.i(this.position) * (this.percentage != null ? this.percentage.floatValue() * view.getHeight() : a.g(view))));
    }

    public TranslateAnimation(DivTooltip$Position divTooltip$Position, Float f) {
        this.position = divTooltip$Position;
        this.percentage = f;
    }
}
