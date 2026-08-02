package com.yandex.plus.home.animation;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import defpackage.hvr0;
import defpackage.vf2;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001(B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0013¨\u0006)"}, d2 = {"Lcom/yandex/plus/home/animation/ShimmeringPaint;", "Landroid/graphics/Paint;", "", "centerColor", "edgeColor", "", "gradientWidth", "", "isRtl", "<init>", "(IIFZ)V", "Lzy11;", "setAnimatorValues", "()V", "Landroid/view/View;", "view", "updateOffset", "(Landroid/view/View;)V", "updateShimmering", "F", "Z", "", "colors", "[I", "", "positions", "[F", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "Landroid/graphics/LinearGradient;", "linearGradient", "Landroid/graphics/LinearGradient;", "", "startTime", "J", "absolutePosition", CA20Status.STATUS_USER_I, "screenWidth", "Companion", "hvr0", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShimmeringPaint extends Paint {

    @Deprecated
    public static final float CENTER_GRADIENT_POSITION = 0.5f;
    private static final hvr0 Companion = new hvr0();

    @Deprecated
    public static final long DEFAULT_ANIMATION_DURATION = 1500;

    @Deprecated
    public static final float END_GRADIENT_POSITION = 1.0f;

    @Deprecated
    public static final float START_GRADIENT_POSITION = 0.0f;
    private int absolutePosition;
    private final ValueAnimator animator;
    private final int[] colors;
    private final float gradientWidth;
    private final boolean isRtl;
    private final LinearGradient linearGradient;
    private final float[] positions;
    private float screenWidth;
    private final long startTime;

    public ShimmeringPaint(int i, int i2, float f, boolean z) {
        this.gradientWidth = f;
        this.isRtl = z;
        int[] iArr = {i2, i, i2};
        this.colors = iArr;
        float[] fArr = {0.0f, 0.5f, 1.0f};
        this.positions = fArr;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.animator = valueAnimator;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
        this.linearGradient = linearGradient;
        this.startTime = AnimationUtils.currentAnimationTimeMillis();
        Matrix matrix = new Matrix();
        linearGradient.setLocalMatrix(matrix);
        setShader(linearGradient);
        valueAnimator.addUpdateListener(new vf2(18, this, matrix));
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ShimmeringPaint shimmeringPaint, Matrix matrix, ValueAnimator valueAnimator) {
        matrix.setTranslate(((Float) valueAnimator.getAnimatedValue()).floatValue() - shimmeringPaint.absolutePosition, 0.0f);
        shimmeringPaint.linearGradient.setLocalMatrix(matrix);
    }

    private final void setAnimatorValues() {
        boolean z = this.isRtl;
        ValueAnimator valueAnimator = this.animator;
        if (z) {
            valueAnimator.setFloatValues(this.screenWidth, -this.gradientWidth);
        } else {
            float f = this.gradientWidth;
            valueAnimator.setFloatValues(-f, this.screenWidth + f);
        }
    }

    public final void updateOffset(View view) {
        if (this.screenWidth == 0.0f) {
            this.screenWidth = view.getRootView().getWidth();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.absolutePosition = iArr[0];
        setAnimatorValues();
    }

    public final void updateShimmering() {
        if (this.animator.getValues() == null || this.animator.getValues().length == 0) {
            return;
        }
        this.animator.setCurrentPlayTime(AnimationUtils.currentAnimationTimeMillis() - this.startTime);
    }
}
