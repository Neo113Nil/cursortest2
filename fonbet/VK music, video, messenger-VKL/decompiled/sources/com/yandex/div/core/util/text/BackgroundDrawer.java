package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawerKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.ec;
import com.yandex.div2.va;
import com.yandex.div2.zb;
import xsna.bpn;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes7.dex */
final class BackgroundDrawer {
    private final zb background;
    private final ec border;
    private final Paint borerPaint;
    private final Canvas canvas;
    private final DisplayMetrics metrics;
    private final float[] radii;
    private final ExpressionResolver resolver;

    public BackgroundDrawer(DisplayMetrics displayMetrics, ec ecVar, zb zbVar, Canvas canvas, ExpressionResolver expressionResolver) {
        float[] cornerRadii;
        Expression<Integer> expression;
        this.metrics = displayMetrics;
        this.border = ecVar;
        this.background = zbVar;
        this.canvas = canvas;
        this.resolver = expressionResolver;
        Paint paint = new Paint();
        this.borerPaint = paint;
        if (ecVar == null) {
            this.radii = null;
            return;
        }
        cornerRadii = DivTextRangesBackgroundRendererKt.getCornerRadii(ecVar, displayMetrics, expressionResolver);
        this.radii = cornerRadii;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(DivBorderDrawerKt.widthPx(ecVar.b, expressionResolver, displayMetrics));
        va vaVar = ecVar.b;
        if (vaVar == null || (expression = vaVar.a) == null) {
            return;
        }
        paint.setColor(expression.evaluate(expressionResolver).intValue());
    }

    private final void drawBorder(float[] fArr, float f, float f2, float f3, float f4) {
        ec ecVar = this.border;
        if ((ecVar != null ? ecVar.b : null) == null) {
            return;
        }
        RectF rectF = new RectF();
        float widthPx = DivBorderDrawerKt.widthPx(this.border.b, this.resolver, this.metrics) / 2.0f;
        rectF.set(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f + widthPx), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 + widthPx), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3 - widthPx), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4 - widthPx));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i = 0; i < length; i++) {
                fArr2[i] = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr[i] - widthPx);
            }
        }
        this.canvas.drawPath(getPath(fArr2, rectF), this.borerPaint);
    }

    private final Path getPath(float[] fArr, RectF rectF) {
        Path path = new Path();
        path.reset();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        path.close();
        return path;
    }

    public final void drawBackground(float f, float f2, float f3, float f4) {
        drawBackground(this.radii, f, f2, f3, f4);
    }

    public final void drawBackgroundEnd(float f, float f2, float f3, float f4) {
        float[] fArr = new float[8];
        float[] fArr2 = this.radii;
        if (fArr2 != null) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        drawBackground(fArr, f, f2, f3, f4);
    }

    public final void drawBackgroundMiddle(float f, float f2, float f3, float f4) {
        drawBackground(new float[8], f, f2, f3, f4);
    }

    public final void drawBackgroundStart(float f, float f2, float f3, float f4) {
        float[] fArr = new float[8];
        float[] fArr2 = this.radii;
        if (fArr2 != null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
        }
        drawBackground(fArr, f, f2, f3, f4);
    }

    private final void drawBackground(float[] fArr, float f, float f2, float f3, float f4) {
        RectF rectF = new RectF();
        rectF.set(f, f2, f3, f4);
        zb zbVar = this.background;
        Object a = zbVar != null ? zbVar.a() : null;
        if (a instanceof bpn) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(((bpn) a).a.evaluate(this.resolver).intValue());
            this.canvas.drawPath(getPath(fArr, rectF), paint);
        }
        drawBorder(fArr, f, f2, f3, f4);
    }
}
