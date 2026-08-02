package com.yandex.plus.plaquesdk.plaque.animation.transitions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.yandex.plus.plaquesdk.plaque.api.models.display.MicroWidgetDrawable;
import defpackage.sls;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"com/yandex/plus/plaquesdk/plaque/animation/transitions/BackgroundTransition$AnimationStateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/AnimatorListenerAdapter;", "", "needAnimateAlpha", "needAnimateCorners", "Landroid/graphics/drawable/Drawable;", "animationDrawable", "Lcom/yandex/plus/plaquesdk/plaque/api/models/display/MicroWidgetDrawable;", "startBackground", "endBackground", "Lkotlin/Function0;", "Lzy11;", "onEnd", "<init>", "(ZZLandroid/graphics/drawable/Drawable;Lcom/yandex/plus/plaquesdk/plaque/api/models/display/MicroWidgetDrawable;Lcom/yandex/plus/plaquesdk/plaque/api/models/display/MicroWidgetDrawable;Lsls;)V", "Landroid/animation/ValueAnimator;", "animation", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Landroid/animation/Animator;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Z", "Landroid/graphics/drawable/Drawable;", "Lcom/yandex/plus/plaquesdk/plaque/api/models/display/MicroWidgetDrawable;", "Lsls;", "", "", "diffCornerRadii", "Ljava/util/List;", "getDiffCornerRadii", "()Ljava/util/List;", "", "startCornerRadii", "[F", "getStartCornerRadii", "()[F", "endCornerRadii", "getEndCornerRadii", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BackgroundTransition$AnimationStateListener extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private final Drawable animationDrawable;
    private final List<Float> diffCornerRadii = new ArrayList();
    private final MicroWidgetDrawable endBackground;
    private final float[] endCornerRadii;
    private final boolean needAnimateAlpha;
    private final boolean needAnimateCorners;
    private final sls onEnd;
    private final MicroWidgetDrawable startBackground;
    private final float[] startCornerRadii;

    public BackgroundTransition$AnimationStateListener(boolean z, boolean z2, Drawable drawable, MicroWidgetDrawable microWidgetDrawable, MicroWidgetDrawable microWidgetDrawable2, sls slsVar) {
        this.needAnimateAlpha = z;
        this.needAnimateCorners = z2;
        this.animationDrawable = drawable;
        this.startBackground = microWidgetDrawable;
        this.endBackground = microWidgetDrawable2;
        this.onEnd = slsVar;
        float[] initialCornerRadii = microWidgetDrawable.getInitialCornerRadii();
        this.startCornerRadii = initialCornerRadii;
        float[] initialCornerRadii2 = microWidgetDrawable2.getInitialCornerRadii();
        this.endCornerRadii = initialCornerRadii2;
        int min = Math.min(initialCornerRadii.length, initialCornerRadii2.length);
        for (int i = 0; i < min; i++) {
            this.diffCornerRadii.add(Float.valueOf(this.endCornerRadii[i] - this.startCornerRadii[i]));
        }
        this.endBackground.setCornerRadii(this.startCornerRadii);
        this.endBackground.setAlpha(255);
    }

    public final List<Float> getDiffCornerRadii() {
        return this.diffCornerRadii;
    }

    public final float[] getEndCornerRadii() {
        return this.endCornerRadii;
    }

    public final float[] getStartCornerRadii() {
        return this.startCornerRadii;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        super.onAnimationEnd(animation);
        this.onEnd.invoke();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        Object animatedValue = animation.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        int intValue = num != null ? num.intValue() : 255;
        if (this.needAnimateAlpha) {
            this.startBackground.setAlpha(255 - intValue);
        }
        if (this.needAnimateCorners && this.diffCornerRadii.size() == 8) {
            float[] fArr = this.startCornerRadii;
            ArrayList arrayList = new ArrayList(fArr.length);
            int length = fArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                arrayList.add(Float.valueOf((this.diffCornerRadii.get(i2).floatValue() * (intValue / 255.0f)) + fArr[i]));
                i++;
                i2++;
            }
            float[] G0 = a.G0(arrayList);
            this.startBackground.setCornerRadii(G0);
            this.endBackground.setCornerRadii(G0);
        }
        this.animationDrawable.invalidateSelf();
    }
}
