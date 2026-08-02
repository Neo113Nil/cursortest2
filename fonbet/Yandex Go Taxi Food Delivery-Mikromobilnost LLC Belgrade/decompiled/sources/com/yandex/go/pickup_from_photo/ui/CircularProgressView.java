package com.yandex.go.pickup_from_photo.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.tje;
import defpackage.uvb;
import defpackage.y6i0;
import defpackage.yi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001GB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u001eJ\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010%J\u001d\u0010)\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\r¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0014¢\u0006\u0004\b.\u0010\fR\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u00105\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00103R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010<\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00103R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00103R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/yandex/go/pickup_from_photo/ui/CircularProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setupPaints", "()V", "", "from", "to", "animateProgress", "(FF)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "progress", "setProgress", "(I)V", "", "animate", "(IZ)V", CspBioProgressConstants.MAX, "setMaxProgress", "getProgress", "()I", "getMaxProgress", "progressColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "setColors", "(II)V", "width", "setStrokeWidth", "(F)V", "onDetachedFromWindow", "currentProgress", CA20Status.STATUS_USER_I, "maxProgress", "circleRadius", "F", "strokeWidth", "centerX", "centerY", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "progressPaint", "textPaint", "textSize", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "animatedProgress", "Landroid/animation/ValueAnimator;", "progressAnimator", "Landroid/animation/ValueAnimator;", "isAnimating", "Z", "Companion", "uvb", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CircularProgressView extends View {
    public static final int $stable = 8;
    public static final uvb Companion = new uvb();
    private static final long PROGRESS_ANIMATION_DURATION = 400;
    private float animatedProgress;
    private final Paint backgroundPaint;
    private float centerX;
    private float centerY;
    private float circleRadius;
    private int currentProgress;
    private boolean isAnimating;
    private int maxProgress;
    private ValueAnimator progressAnimator;
    private final Paint progressPaint;
    private final RectF rect;
    private float strokeWidth;
    private final Paint textPaint;
    private float textSize;

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.backgroundPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.textPaint = new Paint(1);
        this.textSize = tje.w(13, getContext());
        this.rect = new RectF();
        setupPaints();
    }

    private final void animateProgress(float from, final float to) {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.isAnimating = true;
        this.animatedProgress = from;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new yi(14, this));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.pickup_from_photo.ui.CircularProgressView$animateProgress$1$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                CircularProgressView.this.isAnimating = false;
                CircularProgressView.this.animatedProgress = to;
                CircularProgressView.this.invalidate();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                CircularProgressView.this.isAnimating = false;
                CircularProgressView.this.animatedProgress = to;
                CircularProgressView.this.invalidate();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
            }
        });
        this.progressAnimator = ofFloat;
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateProgress$lambda$0$0(CircularProgressView circularProgressView, ValueAnimator valueAnimator) {
        circularProgressView.animatedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        circularProgressView.invalidate();
    }

    private final void setupPaints() {
        Paint paint = this.backgroundPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = this.progressPaint;
        paint2.setStyle(style);
        paint2.setColor(-1);
        paint2.setStrokeCap(cap);
        Paint paint3 = this.textPaint;
        paint3.setColor(-1);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setFakeBoldText(true);
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    /* renamed from: getProgress, reason: from getter */
    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.progressAnimator = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.rect, 0.0f, 360.0f, false, this.backgroundPaint);
        float f = this.animatedProgress;
        if (f > 0.0f) {
            canvas.drawArc(this.rect, -90.0f, (f / this.maxProgress) * 360.0f, false, this.progressPaint);
        }
        String str = this.currentProgress + "/" + this.maxProgress;
        this.textPaint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, this.centerX, ((r1.height() / 2.0f) + this.centerY) - r1.bottom, this.textPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float min = Math.min(w, h);
        float f = 0.08f * min;
        this.strokeWidth = f;
        float f2 = (min - f) / 2.0f;
        this.circleRadius = f2;
        float f3 = w / 2.0f;
        this.centerX = f3;
        float f4 = h / 2.0f;
        this.centerY = f4;
        this.rect.set(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
        this.backgroundPaint.setStrokeWidth(this.strokeWidth);
        this.progressPaint.setStrokeWidth(this.strokeWidth);
        this.textPaint.setTextSize(this.textSize);
    }

    public final void setColors(int progressColor, int backgroundColor) {
        this.progressPaint.setColor(progressColor);
        this.backgroundPaint.setColor(backgroundColor);
        invalidate();
    }

    public final void setMaxProgress(int max) {
        if (max <= 0 || this.maxProgress == max) {
            return;
        }
        this.maxProgress = max;
        if (this.currentProgress > max) {
            this.currentProgress = max;
        }
        invalidate();
    }

    public final void setProgress(int progress, boolean animate) {
        int d = y6i0.d(progress, 0, this.maxProgress);
        int i = this.currentProgress;
        if (i != d) {
            this.currentProgress = d;
            if (animate) {
                animateProgress(i, d);
            } else {
                this.animatedProgress = d;
                invalidate();
            }
        }
    }

    public final void setStrokeWidth(float width) {
        if (this.strokeWidth != width && width > 0.0f) {
            this.strokeWidth = width;
            this.backgroundPaint.setStrokeWidth(width);
            this.progressPaint.setStrokeWidth(this.strokeWidth);
            invalidate();
        }
    }

    public final void setProgress(int progress) {
        setProgress(progress, true);
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircularProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CircularProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
