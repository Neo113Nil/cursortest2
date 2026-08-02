package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview.ColorModel;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.b7p0;
import defpackage.emg0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.mxp0;
import defpackage.unr0;
import defpackage.y6i0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u0000 T2\u00020\u0001:\u0002UTB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ#\u0010\u001c\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010 \u001a\u00020\fH\u0010¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0017¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010?R\u0016\u0010@\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR#\u0010K\u001a\n F*\u0004\u0018\u00010E0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010,R\u0014\u0010O\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010,R\u0014\u0010S\u001a\u00020P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableImpl;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "start", "end", "percent", "offset", "(FFF)F", "Lzy11;", "updateValueAnimator", "()V", "", CaretView.ALPHA_PROPERTY, "changeColorAlpha", "(IF)I", "alphaPercent", "(F)I", "updateShader", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;", "color", "", "animationDuration", "setShimmer$impl_18_1_0_release", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;Ljava/lang/Long;)V", "setShimmer", "startShimmer$impl_18_1_0_release", "startShimmer", "stopShimmer$impl_18_1_0_release", "stopShimmer", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/graphics/Paint;", "shimmerPaint", "Landroid/graphics/Paint;", "drawRect", "Landroid/graphics/Rect;", "Landroid/graphics/Matrix;", "shaderMatrix", "Landroid/graphics/Matrix;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/animation/ValueAnimator;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;", "duration", "J", "", "positions", "[F", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "defaultInterpolator$delegate", "Li3y;", "getDefaultInterpolator", "()Landroid/view/animation/Interpolator;", "defaultInterpolator", "getBaseColor", "baseColor", "getHighlightColor", "highlightColor", "", "getColors", "()[I", "colors", "Companion", "AnimatorListener", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ShimmerDrawableImpl extends ShimmerDrawable {

    @Deprecated
    public static final float ALPHA_MAX_VALUE = 255.0f;

    @Deprecated
    public static final float DEFAULT_BASE_ALPHA = 0.0f;

    @Deprecated
    public static final long DEFAULT_DURATION = 1250;

    @Deprecated
    public static final float DEFAULT_HIGHLIGHT_ALPHA = 0.6f;

    @Deprecated
    public static final long DEFAULT_REPEAT_DELAY = 75;

    @Deprecated
    public static final float END_POSITION = 1.0f;

    @Deprecated
    public static final float IN_PROGRESS_POSITION = 0.5f;

    @Deprecated
    public static final float MAX_ALPHA_PERCENT = 1.0f;

    @Deprecated
    public static final float MIN_ALPHA_PERCENT = 0.0f;

    @Deprecated
    public static final float START_POSITION = 0.0f;
    private final Context context;
    private ValueAnimator valueAnimator;
    private static final Companion Companion = new Companion(null);
    private static final ColorModel DEFAULT_SHIMMER_COLOR = new ColorModel(-1);
    private final Paint shimmerPaint = unr0.f(true);
    private final Rect drawRect = new Rect();
    private final Matrix shaderMatrix = new Matrix();
    private ColorModel color = DEFAULT_SHIMMER_COLOR;
    private long duration = 1250;
    private final float[] positions = {0.0f, 0.5f, 1.0f};

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    private final i3y defaultInterpolator = a.b(LazyThreadSafetyMode.NONE, new b7p0(24, this));

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableImpl$AnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "<init>", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableImpl;)V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "", "isCancelled", "Z", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnimatorListener implements Animator.AnimatorListener {
        private boolean isCancelled;

        public AnimatorListener() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.isCancelled = true;
            ShimmerDrawableImpl.this.valueAnimator = null;
            ShimmerDrawableImpl.this.updateValueAnimator();
            ShimmerDrawableImpl.this.invalidateSelf();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (this.isCancelled) {
                return;
            }
            animation.setStartDelay(75L);
            animation.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.isCancelled = false;
        }
    }

    public ShimmerDrawableImpl(Context context) {
        this.context = context;
    }

    private final int alphaPercent(float percent) {
        return (int) (y6i0.c(percent, 0.0f, 1.0f) * 255.0f);
    }

    private final int changeColorAlpha(int i, float f) {
        return Color.argb(alphaPercent(f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interpolator defaultInterpolator_delegate$lambda$1(ShimmerDrawableImpl shimmerDrawableImpl) {
        return AnimationUtils.loadInterpolator(shimmerDrawableImpl.context, emg0.finsdk_shimmer_interpolator);
    }

    private final int getBaseColor() {
        return changeColorAlpha(this.color.getValue(), 0.0f);
    }

    private final int[] getColors() {
        return new int[]{getBaseColor(), getHighlightColor(), getBaseColor()};
    }

    private final Interpolator getDefaultInterpolator() {
        return (Interpolator) this.defaultInterpolator.getValue();
    }

    private final int getHighlightColor() {
        return changeColorAlpha(this.color.getValue(), 0.6f);
    }

    private final float offset(float start, float end, float percent) {
        return g8e.b(end, start, percent, start);
    }

    private final void updateShader() {
        if (getBounds().isEmpty()) {
            return;
        }
        this.shimmerPaint.setShader(new LinearGradient(0.0f, 0.0f, this.drawRect.width(), 0.0f, getColors(), this.positions, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateValueAnimator() {
        ValueAnimator valueAnimator = this.valueAnimator;
        boolean isStarted = valueAnimator != null ? valueAnimator.isStarted() : false;
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.valueAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.valueAnimator;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(1250L);
        ofFloat.addUpdateListener(new mxp0(12, this));
        ofFloat.setInterpolator(getDefaultInterpolator());
        ofFloat.addListener(new AnimatorListener());
        if (isStarted) {
            ofFloat.start();
        }
        this.valueAnimator = ofFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Shader shader = this.shimmerPaint.getShader();
        if (shader == null) {
            return;
        }
        float width = this.drawRect.width();
        ValueAnimator valueAnimator = this.valueAnimator;
        float offset = offset(-width, getBounds().width(), valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f);
        this.shaderMatrix.reset();
        this.shaderMatrix.postTranslate(offset, 0.0f);
        shader.setLocalMatrix(this.shaderMatrix);
        canvas.drawRect(this.drawRect, this.shimmerPaint);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.drawRect.set(0, 0, bounds.width() * 2, bounds.height());
        updateShader();
        startShimmer$impl_18_1_0_release();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawable
    public void setShimmer$impl_18_1_0_release(ColorModel color, Long animationDuration) {
        if (color != null) {
            this.color = color;
        }
        if (animationDuration != null) {
            this.duration = animationDuration.longValue();
        }
        this.shimmerPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        updateShader();
        updateValueAnimator();
        invalidateSelf();
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawable
    public void startShimmer$impl_18_1_0_release() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if ((valueAnimator != null ? valueAnimator.isStarted() : false) || getCallback() == null) {
            return;
        }
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.setStartDelay(0L);
        }
        ValueAnimator valueAnimator3 = this.valueAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawable
    public void stopShimmer$impl_18_1_0_release() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableImpl$Companion;", "", "<init>", "()V", "DEFAULT_BASE_ALPHA", "", "DEFAULT_HIGHLIGHT_ALPHA", "DEFAULT_DURATION", "", "DEFAULT_REPEAT_DELAY", "START_POSITION", "IN_PROGRESS_POSITION", "END_POSITION", "MIN_ALPHA_PERCENT", "MAX_ALPHA_PERCENT", "ALPHA_MAX_VALUE", "DEFAULT_SHIMMER_COLOR", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;", "getDEFAULT_SHIMMER_COLOR", "()Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ColorModel getDEFAULT_SHIMMER_COLOR() {
            return ShimmerDrawableImpl.DEFAULT_SHIMMER_COLOR;
        }

        private Companion() {
        }
    }
}
