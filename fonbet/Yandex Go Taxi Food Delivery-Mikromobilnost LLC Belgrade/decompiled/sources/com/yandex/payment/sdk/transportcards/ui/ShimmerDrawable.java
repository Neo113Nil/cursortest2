package com.yandex.payment.sdk.transportcards.ui;

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
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.b7p0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.img0;
import defpackage.mxp0;
import defpackage.pfc;
import defpackage.unr0;
import defpackage.xtr0;
import defpackage.y6i0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u0000 U2\u00020\u0001:\u0002VWB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR#\u0010I\u001a\n D*\u0004\u0018\u00010C0C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010+R\u0014\u0010P\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010+R\u0014\u0010T\u001a\u00020Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/ui/ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "start", "end", "percent", "offset", "(FFF)F", "Lzy11;", "updateValueAnimator", "()V", "", "colorString", "Lpfc;", "parseColorString", "(Ljava/lang/String;)Lpfc;", "", CaretView.ALPHA_PROPERTY, "changeColorAlpha", "(IF)I", "alphaPercent", "(F)I", "updateShader", "", "isLightTheme", "setShimmer", "(Z)V", "startShimmer", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/graphics/Paint;", "shimmerPaint", "Landroid/graphics/Paint;", "drawRect", "Landroid/graphics/Rect;", "Landroid/graphics/Matrix;", "shaderMatrix", "Landroid/graphics/Matrix;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/animation/ValueAnimator;", "color", "Lpfc;", "", "positions", "[F", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "defaultInterpolator$delegate", "Li3y;", "getDefaultInterpolator", "()Landroid/view/animation/Interpolator;", "defaultInterpolator", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "getBaseColor", "baseColor", "getHighlightColor", "highlightColor", "", "getColors", "()[I", "colors", "Companion", "AnimatorListener", "xtr0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShimmerDrawable extends Drawable {
    public static final float DEFAULT_BASE_ALPHA = 0.0f;
    public static final long DEFAULT_DURATION = 1250;
    public static final float DEFAULT_HIGHLIGHT_ALPHA = 0.6f;
    public static final long DEFAULT_REPEAT_DELAY = 75;
    private final Context context;
    private ValueAnimator valueAnimator;
    public static final xtr0 Companion = new xtr0();
    private static final pfc DEFAULT_SHIMMER_COLOR = new pfc(-1);
    private final Paint shimmerPaint = unr0.f(true);
    private final Rect drawRect = new Rect();
    private final Matrix shaderMatrix = new Matrix();
    private pfc color = DEFAULT_SHIMMER_COLOR;
    private final float[] positions = {0.0f, 0.5f, 1.0f};

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    private final i3y defaultInterpolator = kotlin.a.b(LazyThreadSafetyMode.NONE, new b7p0(23, this));
    private final ValueAnimator.AnimatorUpdateListener updateListener = new mxp0(9, this);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/ui/ShimmerDrawable$AnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "<init>", "(Lcom/yandex/payment/sdk/transportcards/ui/ShimmerDrawable;)V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "", "isCancelled", "Z", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class AnimatorListener implements Animator.AnimatorListener {
        private boolean isCancelled;

        public AnimatorListener() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.isCancelled = true;
            ShimmerDrawable.this.valueAnimator = null;
            ShimmerDrawable.this.updateValueAnimator();
            ShimmerDrawable.this.invalidateSelf();
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

    public ShimmerDrawable(Context context) {
        this.context = context;
    }

    private final int alphaPercent(float percent) {
        return (int) (y6i0.c(percent, 0.0f, 1.0f) * 255.0f);
    }

    private final int changeColorAlpha(int i, float f) {
        return Color.argb(alphaPercent(f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interpolator defaultInterpolator_delegate$lambda$0(ShimmerDrawable shimmerDrawable) {
        return AnimationUtils.loadInterpolator(shimmerDrawable.context, img0.paymentsdk_shimmer_interpolator);
    }

    private final int getBaseColor() {
        return changeColorAlpha(this.color.a, 0.0f);
    }

    private final int[] getColors() {
        return new int[]{getBaseColor(), getHighlightColor(), getBaseColor()};
    }

    private final Interpolator getDefaultInterpolator() {
        return (Interpolator) this.defaultInterpolator.getValue();
    }

    private final int getHighlightColor() {
        return changeColorAlpha(this.color.a, 0.6f);
    }

    private final float offset(float start, float end, float percent) {
        return g8e.b(end, start, percent, start);
    }

    private final pfc parseColorString(String colorString) {
        Object failure;
        try {
            failure = Integer.valueOf(Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(evu0.Q(ShimmerDivHandler.NUMBER_SING, colorString))));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        if (num != null) {
            return new pfc(num.intValue());
        }
        return null;
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
        ofFloat.addUpdateListener(this.updateListener);
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
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.drawRect.set(0, 0, bounds.width() * 2, bounds.height());
        updateShader();
        startShimmer();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setShimmer(boolean isLightTheme) {
        pfc parseColorString = isLightTheme ? parseColorString("#FFB6B8BF") : parseColorString("#FF777A85");
        if (parseColorString == null) {
            parseColorString = DEFAULT_SHIMMER_COLOR;
        }
        this.color = parseColorString;
        this.shimmerPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        updateShader();
        updateValueAnimator();
        invalidateSelf();
    }

    public final void startShimmer() {
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
}
