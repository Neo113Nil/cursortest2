package com.yandex.mobile.drive.scan.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.state.db.StateEntry;
import defpackage.crg0;
import defpackage.dtg0;
import defpackage.ur7;
import defpackage.vs11;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0016\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0019\u0010\u001aR.\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u0006-"}, d2 = {"Lcom/yandex/mobile/drive/scan/ui/CameraPatternView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "wPadding", "hPadding", "whRatio", "Lkotlin/Pair;", "calcBounds", "(FFF)Lkotlin/Pair;", "Landroid/graphics/Canvas;", "width", "height", "marginLeft", "marginTop", "radius", "Lzy11;", "drawInverseRoundRect", "(Landroid/graphics/Canvas;FFFFF)V", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/yandex/mobile/drive/scan/ui/CameraPattern;", "value", "pattern", "Lcom/yandex/mobile/drive/scan/ui/CameraPattern;", "getPattern", "()Lcom/yandex/mobile/drive/scan/ui/CameraPattern;", "setPattern", "(Lcom/yandex/mobile/drive/scan/ui/CameraPattern;)V", "stroke", "F", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "overlayPaint", "Landroid/graphics/Paint;", "strokePaint", "dashPaint", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CameraPatternView extends View {
    private final Paint dashPaint;
    private final float hPadding;
    private final Paint overlayPaint;
    private final Path path;
    private CameraPattern pattern;
    private final float stroke;
    private final Paint strokePaint;

    public CameraPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = vs11.a;
        float f2 = 2.0f * f;
        this.stroke = f2;
        this.hPadding = context.getResources().getDimension(dtg0.topBarHeight);
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        this.path = path;
        Paint paint = new Paint();
        paint.setColor(context.getColor(crg0.black_alpha_60));
        paint.setStyle(Paint.Style.FILL);
        this.overlayPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(f2);
        paint2.setColor(context.getColor(crg0.white_alpha_50));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.strokePaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStrokeWidth(f2);
        paint3.setColor(context.getColor(crg0.white_alpha_50));
        paint3.setStyle(style);
        paint3.setPathEffect(new DashPathEffect(new float[]{10.0f * f, 10.0f * f}, 0.0f));
        paint3.setStrokeJoin(Paint.Join.ROUND);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        this.dashPaint = paint3;
    }

    private final Pair<Float, Float> calcBounds(float wPadding, float hPadding, float whRatio) {
        float min = Math.min(getHeight() - (2.0f * hPadding), (getWidth() - (wPadding * 2.0f)) * whRatio);
        return new Pair<>(Float.valueOf(min / whRatio), Float.valueOf(min));
    }

    private final void drawInverseRoundRect(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        this.path.reset();
        this.path.addRoundRect(f3, f4, f3 + f, f4 + f2, f5, f5, Path.Direction.CW);
        canvas.drawPath(this.path, this.overlayPaint);
    }

    public final CameraPattern getPattern() {
        return this.pattern;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int save;
        CameraPattern cameraPattern = this.pattern;
        if (cameraPattern == null) {
            return;
        }
        int i = ur7.a[cameraPattern.ordinal()];
        if (i == 1) {
            float f = vs11.a;
            float f2 = 10.0f * f;
            Pair<Float, Float> calcBounds = calcBounds(19.0f * f, this.hPadding, 0.6666667f);
            float floatValue = ((Number) calcBounds.getFirst()).floatValue();
            float floatValue2 = ((Number) calcBounds.getSecond()).floatValue();
            float width = (getWidth() / 2.0f) - (floatValue / 2.0f);
            float height = (getHeight() / 2.0f) - (floatValue2 / 2.0f);
            save = canvas.save();
            canvas.translate(width, height);
            try {
                canvas.drawRoundRect(0.0f, 0.0f, floatValue, floatValue2, f2, f2, this.strokePaint);
                canvas.restoreToCount(save);
                drawInverseRoundRect(canvas, floatValue, floatValue2, width, height, f2);
                return;
            } finally {
            }
        }
        if (i != 2) {
            w511.b();
            return;
        }
        float f3 = vs11.a;
        float f4 = 10.0f * f3;
        Pair<Float, Float> calcBounds2 = calcBounds(26.0f * f3, this.hPadding, 1.4f);
        float floatValue3 = ((Number) calcBounds2.getFirst()).floatValue();
        float floatValue4 = ((Number) calcBounds2.getSecond()).floatValue();
        float width2 = (getWidth() / 2.0f) - (floatValue3 / 2.0f);
        float f5 = floatValue4 / 2.0f;
        float height2 = (getHeight() / 2.0f) - f5;
        save = canvas.save();
        canvas.translate(width2, height2);
        try {
            canvas.drawRoundRect(0.0f, 0.0f, floatValue3, floatValue4, f4, f4, this.strokePaint);
            canvas.drawLine(0.0f, f5, floatValue3, f5, this.dashPaint);
            canvas.restoreToCount(save);
            drawInverseRoundRect(canvas, floatValue3, floatValue4, width2, height2, f4);
        } finally {
        }
    }

    public final void setPattern(CameraPattern cameraPattern) {
        if (this.pattern != cameraPattern) {
            this.pattern = cameraPattern;
            invalidate();
        }
    }
}
