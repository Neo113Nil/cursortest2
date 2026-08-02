package com.yandex.messaging.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.fxa1;
import defpackage.jl40;
import defpackage.jng0;
import defpackage.k3i0;
import defpackage.ny61;
import defpackage.sf2;
import defpackage.tf2;
import defpackage.tj91;
import defpackage.uf2;
import defpackage.w511;
import defpackage.yi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b)\u0010\fR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010/\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010;\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b?\u0010<\"\u0004\b@\u0010>R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010<\"\u0004\b\u0016\u0010>R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010,R\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR&\u0010M\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/yandex/messaging/views/AnimatedProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateProgressPath", "()V", "width", "height", "recalcIntrinsics", "(II)V", "refreshProgressGradient", "", "progress", "", "animate", "setProgress", "(FZ)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroid/graphics/Paint;", "progressPaint", "Landroid/graphics/Paint;", "Luf2;", "value", "progressColor", "Luf2;", "getProgressColor", "()Luf2;", "setProgressColor", "(Luf2;)V", "defaultBgColor", CA20Status.STATUS_USER_I, "defaultProgressColor", "Landroid/graphics/RectF;", "bgRect", "Landroid/graphics/RectF;", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "setCornerRadius", "(F)V", "progressCornerRadius", "setProgressCornerRadius", "Landroid/graphics/Path;", "shapePath", "Landroid/graphics/Path;", "progressPath", "bgPaint", "Landroid/animation/ValueAnimator;", "progressAnimation", "Landroid/animation/ValueAnimator;", "getApvBackgroundColor", "()I", "setApvBackgroundColor", "(I)V", "apvBackgroundColor", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AnimatedProgressView extends View {
    public static final int $stable = 8;
    private final Paint bgPaint;
    private final RectF bgRect;
    private float cornerRadius;
    private final int defaultBgColor;
    private final int defaultProgressColor;
    private float progress;
    private ValueAnimator progressAnimation;
    private uf2 progressColor;
    private float progressCornerRadius;
    private final Paint progressPaint;
    private final Path progressPath;
    private final Path shapePath;

    public AnimatedProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.progressPaint = paint;
        this.progressColor = new tf2(paint.getColor());
        int i2 = fxa1.c(jng0.messagingCommonBackgroundColor, context).data;
        this.defaultBgColor = i2;
        int i3 = fxa1.c(jng0.messagingCommonAccentColor, context).data;
        this.defaultProgressColor = i3;
        this.bgRect = new RectF();
        this.shapePath = new Path();
        this.progressPath = new Path();
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        this.bgPaint = paint2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k3i0.AnimatedProgressView, i, 0);
        try {
            setCornerRadius(obtainStyledAttributes.getDimension(k3i0.AnimatedProgressView_apvCornerRadius, 0.0f));
            setProgressCornerRadius(obtainStyledAttributes.getDimension(k3i0.AnimatedProgressView_apvProgressCornerRadius, 0.0f));
            paint2.setColor(obtainStyledAttributes.getColor(k3i0.AnimatedProgressView_apvBackgroundColor, i2));
            paint.setColor(obtainStyledAttributes.getColor(k3i0.AnimatedProgressView_apvProgressColor, i3));
            int color = obtainStyledAttributes.getColor(k3i0.AnimatedProgressView_apvProgressGradientStartColor, 0);
            int color2 = obtainStyledAttributes.getColor(k3i0.AnimatedProgressView_apvProgressGradientEndColor, 0);
            setProgressColor((color == 0 || color2 == 0) ? new tf2(paint.getColor()) : new sf2(color, color2));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void recalcIntrinsics(int width, int height) {
        RectF rectF = this.bgRect;
        rectF.top = 0.0f;
        rectF.bottom = height;
        rectF.left = 0.0f;
        rectF.right = width;
        this.shapePath.reset();
        Path path = this.shapePath;
        RectF rectF2 = this.bgRect;
        float f = this.cornerRadius;
        path.addRoundRect(rectF2, f, f, Path.Direction.CCW);
    }

    private final void refreshProgressGradient() {
        uf2 uf2Var = this.progressColor;
        if (uf2Var instanceof sf2) {
            sf2 sf2Var = (sf2) uf2Var;
            setProgressColor(new sf2(sf2Var.a, sf2Var.b));
        }
    }

    private final void setCornerRadius(float f) {
        if (this.cornerRadius == f) {
            return;
        }
        this.cornerRadius = f;
        recalcIntrinsics(getWidth(), getHeight());
        invalidate();
    }

    public static /* synthetic */ void setProgress$default(AnimatedProgressView animatedProgressView, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        animatedProgressView.setProgress(f, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgress$lambda$6$lambda$3(AnimatedProgressView animatedProgressView, ValueAnimator valueAnimator) {
        animatedProgressView.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        animatedProgressView.postInvalidateOnAnimation();
    }

    private final void setProgressCornerRadius(float f) {
        if (this.progressCornerRadius == f) {
            return;
        }
        this.progressCornerRadius = f;
        invalidate();
    }

    private final void updateProgressPath() {
        float width = this.bgRect.width();
        float height = this.bgRect.height();
        float f = tj91.b(this) ? width - (this.progress * width) : 0.0f;
        if (!tj91.b(this)) {
            width *= this.progress;
        }
        float f2 = width;
        this.progressPath.reset();
        Path path = this.progressPath;
        float f3 = this.progressCornerRadius;
        path.addRoundRect(f, 0.0f, f2, height, f3, f3, Path.Direction.CCW);
        this.progressPath.close();
    }

    public final int getApvBackgroundColor() {
        return this.bgPaint.getColor();
    }

    public final uf2 getProgressColor() {
        return this.progressColor;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.progressAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.progressAnimation = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        updateProgressPath();
        Path path = this.shapePath;
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            canvas.drawRect(this.bgRect, this.bgPaint);
            canvas.drawPath(this.progressPath, this.progressPaint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed && (this.progressColor instanceof sf2)) {
            refreshProgressGradient();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this.progressColor instanceof sf2) {
            refreshProgressGradient();
        }
        recalcIntrinsics(w, h);
    }

    public final void setApvBackgroundColor(int i) {
        this.bgPaint.setColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        if (r3 < 0.0f) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setProgress(final float progress, boolean animate) {
        ValueAnimator valueAnimator = this.progressAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.progressAnimation = null;
        float f = progress <= 1.0f ? 0.0f : 1.0f;
        progress = f;
        if (!animate) {
            setProgress(progress);
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.progress, progress);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new yi(3, this));
        ofFloat.addListener(new Animator.AnimatorListener(progress, this, progress) { // from class: com.yandex.messaging.views.AnimatedProgressView$setProgress$lambda$6$$inlined$addListener$default$1
            final /* synthetic */ float $newValue$inlined;
            final /* synthetic */ float $newValue$inlined$1;

            {
                this.$newValue$inlined$1 = progress;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AnimatedProgressView.this.setProgress(this.$newValue$inlined$1);
                AnimatedProgressView.this.invalidate();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AnimatedProgressView.this.setProgress(this.$newValue$inlined);
                AnimatedProgressView.this.invalidate();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        this.progressAnimation = ofFloat;
    }

    public final void setProgressColor(uf2 uf2Var) {
        if (uf2Var instanceof tf2) {
            if (jl40.l(this.progressColor, uf2Var)) {
                return;
            }
            this.progressPaint.setShader(null);
            this.progressPaint.setColor(((tf2) uf2Var).a);
        } else {
            if (!(uf2Var instanceof sf2)) {
                w511.b();
                return;
            }
            sf2 sf2Var = (sf2) uf2Var;
            this.progressPaint.setShader(new LinearGradient(0.0f, 0.0f, getWidth() * this.progress, 0.0f, sf2Var.a, sf2Var.b, Shader.TileMode.CLAMP));
        }
        this.progressColor = uf2Var;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgress(float f) {
        if (0.0f <= f && f <= 1.0f) {
            this.progress = f;
            refreshProgressGradient();
        } else {
            ny61.g("progress must ne in range [0 .. 1]");
        }
    }

    public AnimatedProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AnimatedProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AnimatedProgressView(Context context) {
        this(context, null, 0, 6, null);
    }
}
