package com.yandex.go.superapp.discovery.map.impl.ui.main.explorer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import defpackage.yso;
import defpackage.zso;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00014B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ/\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001aR\u001c\u00101\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/explorer/ExplorerAnimatedBorderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "startAnimation", "()V", "stopAnimation", "onDetachedFromWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "borderStrokeWidth", "F", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "visiblePart", "transparent", CA20Status.STATUS_USER_I, "base", "orange", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "animatedPaint", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "Landroid/graphics/SweepGradient;", "gradient", "Landroid/graphics/SweepGradient;", "Landroid/graphics/Matrix;", "gradientMatrix", "Landroid/graphics/Matrix;", "rotation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animator", "Landroid/animation/ValueAnimator;", "Companion", "zso", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExplorerAnimatedBorderView extends View {
    public static final zso Companion = new zso();
    private static final long DEFAULT_ANIMATION_DURATION = 1500;
    private final Paint animatedPaint;
    private final ValueAnimator animator;
    private final Paint backgroundPaint;
    private final int base;
    private final float borderStrokeWidth;
    private final float cornerRadius;
    private SweepGradient gradient;
    private final Matrix gradientMatrix;
    private final int orange;
    private final RectF rect;
    private float rotation;
    private final int transparent;
    private final float visiblePart;

    public ExplorerAnimatedBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float x = tje.x(getContext(), 2.0f);
        this.borderStrokeWidth = x;
        this.cornerRadius = tje.x(getContext(), 100.0f);
        this.visiblePart = 0.65f;
        this.transparent = context.getColor(mqg0.transparent);
        int u = qje.u(context.getTheme(), xng0.bgMain);
        this.base = u;
        this.orange = context.getColor(mqg0.component_orange_toxic);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(x);
        paint.setColor(u);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(x);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.animatedPaint = paint2;
        this.rect = new RectF();
        this.gradientMatrix = new Matrix();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setDuration(1500L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new yso(0, this));
        this.animator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animator$lambda$0$0(ExplorerAnimatedBorderView explorerAnimatedBorderView, ValueAnimator valueAnimator) {
        explorerAnimatedBorderView.rotation = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        explorerAnimatedBorderView.invalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animator.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.rect;
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.backgroundPaint);
        this.gradientMatrix.reset();
        this.gradientMatrix.postRotate(this.rotation, getWidth() / 2.0f, getHeight() / 2.0f);
        SweepGradient sweepGradient = this.gradient;
        if (sweepGradient == null) {
            sweepGradient = null;
        }
        sweepGradient.setLocalMatrix(this.gradientMatrix);
        RectF rectF2 = this.rect;
        float f2 = this.cornerRadius;
        canvas.drawRoundRect(rectF2, f2, f2, this.animatedPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        float f = this.borderStrokeWidth / 2.0f;
        float f2 = w;
        float f3 = h;
        this.rect.set(f, f, f2 - f, f3 - f);
        float f4 = 1.0f - this.visiblePart;
        int i = this.transparent;
        int i2 = this.base;
        int[] iArr = {i, i2, this.orange, i2, i};
        float f5 = this.visiblePart;
        SweepGradient sweepGradient = new SweepGradient(f2 / 2.0f, f3 / 2.0f, iArr, new float[]{0.0f, f4, (f5 / 2.0f) + f4, f5 + f4, 1.0f});
        this.gradient = sweepGradient;
        this.animatedPaint.setShader(sweepGradient);
    }

    public final void startAnimation() {
        if (this.animator.isRunning()) {
            return;
        }
        this.animator.start();
    }

    public final void stopAnimation() {
        this.animator.cancel();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExplorerAnimatedBorderView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ExplorerAnimatedBorderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
