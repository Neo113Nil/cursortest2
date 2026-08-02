package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.loader;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import defpackage.czy;
import defpackage.yg5;
import defpackage.zyy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/loader/LoaderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lczy;", "params", "<init>", "(Landroid/content/Context;Lczy;)V", "", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lyg5;", "expressionResolver", "applyExpressionResolver", "(Lyg5;)V", "Lczy;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "sweepAngle", "F", "Landroid/graphics/RectF;", "arcRect", "Landroid/graphics/RectF;", "", "durationMs", "J", "startTime", "", "isAnimating", "Z", "Companion", "zyy", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoaderView extends View {
    private static final zyy Companion = new zyy();

    @Deprecated
    public static final long DEFAULT_DURATION_MS = 1000;

    @Deprecated
    public static final float DEFAULT_LINE_WIDTH = 2.0f;

    @Deprecated
    public static final double DEFAULT_STROKE_END = 0.75d;

    @Deprecated
    public static final float FULL_CIRCLE_DEGREES = 360.0f;

    @Deprecated
    public static final float START_ANGLE = -90.0f;
    private final RectF arcRect;
    private final long durationMs;
    private boolean isAnimating;
    private final Paint paint;
    private final czy params;
    private long startTime;
    private final float sweepAngle;

    public LoaderView(Context context, czy czyVar) {
        super(context);
        this.params = czyVar;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((czyVar != null ? (float) czyVar.b : 2.0f) * getResources().getDisplayMetrics().density);
        this.paint = paint;
        this.sweepAngle = (float) ((czyVar != null ? czyVar.c : 0.75d) * 360.0d);
        this.arcRect = new RectF();
        this.durationMs = czyVar != null ? (long) (czyVar.d * 1000.0d) : 1000L;
    }

    public final void applyExpressionResolver(yg5 expressionResolver) {
        Integer resolveColor;
        czy czyVar = this.params;
        if (czyVar == null || expressionResolver == null || (resolveColor = expressionResolver.resolveColor(czyVar.e)) == null) {
            return;
        }
        this.paint.setColor(resolveColor.intValue());
        invalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAnimating = true;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.isAnimating = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.startTime == 0) {
            this.startTime = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.startTime;
        long j = this.durationMs;
        canvas.drawArc(this.arcRect, (((currentTimeMillis % j) / j) * 360.0f) - 90.0f, this.sweepAngle, false, this.paint);
        if (this.isAnimating) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float strokeWidth = this.paint.getStrokeWidth() / 2.0f;
        this.arcRect.set(strokeWidth, strokeWidth, w - strokeWidth, h - strokeWidth);
    }
}
