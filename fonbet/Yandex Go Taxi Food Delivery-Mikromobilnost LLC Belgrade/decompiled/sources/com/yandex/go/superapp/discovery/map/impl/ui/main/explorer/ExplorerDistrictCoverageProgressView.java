package com.yandex.go.superapp.discovery.map.impl.ui.main.explorer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import defpackage.b64;
import defpackage.m810;
import defpackage.oto;
import defpackage.pto;
import defpackage.tje;
import defpackage.y6i0;
import defpackage.yso;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 C2\u00020\u0001:\u0002\rDB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010!\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0012¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0012¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b.\u0010/R\u0016\u00100\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010;\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>¨\u0006E"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/explorer/ExplorerDistrictCoverageProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "w", "h", "Lpto;", "computeProgressGeometry", "(FF)Lpto;", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawBackground", "(Landroid/graphics/Canvas;FF)V", "geometry", "drawProgress", "(Landroid/graphics/Canvas;Lpto;)V", "drawText", "(Landroid/graphics/Canvas;FLpto;)V", "backgroundFillColor", "backgroundStrokeColor", "progressFillColor", "progressStrokeColor", "textColor", "Landroid/graphics/Typeface;", "textTypeface", "setColorsAndTextStyles", "(IIIIILandroid/graphics/Typeface;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setFinishedImage", "(Landroid/graphics/drawable/Drawable;)V", "", "coverage", "setCoverage", "(D)V", "show", "()V", "hide", "onDraw", "(Landroid/graphics/Canvas;)V", "currentCoverage", CA20Status.STATUS_REQUEST_D, "finishedImageDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/animation/ValueAnimator;", "coverageAnimator", "Landroid/animation/ValueAnimator;", "backgroundStrokeWidth", "F", "progressStrokeWidth", "progressInset", "finishedImageGapPx", "Landroid/graphics/Paint;", "backgroundFillPaint", "Landroid/graphics/Paint;", "backgroundStrokePaint", "progressFillPaint", "progressStrokePaint", "textPaint", "Companion", "oto", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ExplorerDistrictCoverageProgressView extends View {
    private static final long COVERAGE_ANIMATION_DURATION_MS = 300;
    public static final oto Companion = new oto();
    private final Paint backgroundFillPaint;
    private final Paint backgroundStrokePaint;
    private float backgroundStrokeWidth;
    private ValueAnimator coverageAnimator;
    private double currentCoverage;
    private Drawable finishedImageDrawable;
    private final float finishedImageGapPx;
    private final Paint progressFillPaint;
    private float progressInset;
    private final Paint progressStrokePaint;
    private float progressStrokeWidth;
    private final Paint textPaint;

    public ExplorerDistrictCoverageProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.backgroundStrokeWidth = tje.w(1, getContext());
        this.progressStrokeWidth = tje.w(2, getContext());
        this.progressInset = tje.w(5, getContext());
        this.finishedImageGapPx = tje.w(3, getContext());
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.backgroundFillPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(tje.w(1, getContext()));
        this.backgroundStrokePaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.progressFillPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style2);
        paint4.setStrokeWidth(tje.w(2, getContext()));
        this.progressStrokePaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setTextSize(tje.b0(getContext(), 20.0f));
        this.textPaint = paint5;
    }

    private final pto computeProgressGeometry(float w, float h) {
        float f = this.progressStrokeWidth;
        float f2 = f / 2.0f;
        float f3 = this.progressInset;
        float f4 = f3 + f2;
        float f5 = (h - f3) - f2;
        float f6 = f5 - f4;
        float f7 = f6 / 2.0f;
        float f8 = f6 + f;
        return new pto(new RectF(f4, f4, (((((w - (2.0f * f3)) - f8) * ((float) this.currentCoverage)) + f8) + f3) - f2, f5), f7);
    }

    private final void drawBackground(Canvas canvas, float w, float h) {
        float f = this.backgroundStrokeWidth / 2.0f;
        float f2 = h / 2.0f;
        RectF rectF = new RectF(f, f, w - f, h - f);
        canvas.drawRoundRect(rectF, f2, f2, this.backgroundFillPaint);
        canvas.drawRoundRect(rectF, f2, f2, this.backgroundStrokePaint);
    }

    private final void drawProgress(Canvas canvas, pto geometry) {
        RectF rectF = geometry.a;
        float f = geometry.b;
        canvas.drawRoundRect(rectF, f, f, this.progressFillPaint);
        canvas.drawRoundRect(geometry.a, f, f, this.progressStrokePaint);
    }

    private final void drawText(Canvas canvas, float h, pto geometry) {
        RectF rectF = geometry.a;
        float f = (rectF.left + rectF.right) / 2.0f;
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f2 = h / 2.0f;
        float f3 = f2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String e = b64.e(m810.a(this.currentCoverage * 100.0d), "%");
        Drawable drawable = this.finishedImageDrawable;
        if (this.currentCoverage != 1.0d || drawable == null) {
            canvas.drawText(e, f, f3, this.textPaint);
            return;
        }
        float measureText = this.textPaint.measureText(e);
        float f4 = this.finishedImageGapPx;
        int i = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i2 = 1;
        if (i < 1) {
            i = 1;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            i2 = i;
        } else {
            int i3 = (intrinsicWidth * i) / intrinsicHeight;
            if (i3 >= 1) {
                i2 = i3;
            }
        }
        float f5 = f - (((measureText + f4) + i2) / 2.0f);
        canvas.drawText(e, (measureText / 2.0f) + f5, f3, this.textPaint);
        int i4 = (int) (f5 + measureText + f4);
        int i5 = (int) (f2 - (i / 2.0f));
        drawable.setBounds(i4, i5, i2 + i4, i + i5);
        drawable.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCoverage$lambda$0$0(ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView, ValueAnimator valueAnimator) {
        explorerDistrictCoverageProgressView.currentCoverage = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        explorerDistrictCoverageProgressView.invalidate();
    }

    public final void hide() {
        animate().alpha(0.0f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerAnimUtilsKt$shortFadeOutAndGone$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                this.setVisibility(8);
            }
        }).start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        pto computeProgressGeometry = computeProgressGeometry(width, height);
        drawBackground(canvas, width, height);
        drawProgress(canvas, computeProgressGeometry);
        drawText(canvas, height, computeProgressGeometry);
    }

    public final void setColorsAndTextStyles(int backgroundFillColor, int backgroundStrokeColor, int progressFillColor, int progressStrokeColor, int textColor, Typeface textTypeface) {
        this.backgroundFillPaint.setColor(backgroundFillColor);
        this.backgroundStrokePaint.setColor(backgroundStrokeColor);
        this.progressFillPaint.setColor(progressFillColor);
        this.progressStrokePaint.setColor(progressStrokeColor);
        this.textPaint.setColor(textColor);
        this.textPaint.setTypeface(textTypeface);
        invalidate();
    }

    public final void setCoverage(double coverage) {
        final double b = y6i0.b(coverage, 0.0d, 1.0d);
        if (b == this.currentCoverage) {
            return;
        }
        ValueAnimator valueAnimator = this.coverageAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) this.currentCoverage, (float) b);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new yso(1, this));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerDistrictCoverageProgressView$setCoverage$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                ExplorerDistrictCoverageProgressView.this.currentCoverage = b;
                ExplorerDistrictCoverageProgressView.this.coverageAnimator = null;
                ExplorerDistrictCoverageProgressView.this.invalidate();
            }
        });
        ofFloat.start();
        this.coverageAnimator = ofFloat;
    }

    public final void setFinishedImage(Drawable drawable) {
        this.finishedImageDrawable = drawable;
    }

    public final void show() {
        animate().alpha(1.0f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerAnimUtilsKt$shortFadeInAndShow$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                this.setVisibility(0);
            }
        }).start();
    }

    public ExplorerDistrictCoverageProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ExplorerDistrictCoverageProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ExplorerDistrictCoverageProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
