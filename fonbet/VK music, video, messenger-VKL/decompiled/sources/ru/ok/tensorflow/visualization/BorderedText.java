package ru.ok.tensorflow.visualization;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes9.dex */
public class BorderedText {
    private final Paint exteriorPaint;
    private final Paint interiorPaint;
    private final Rect rect;
    private final Paint.FontMetrics textMetrics;
    private final float textSize;

    public BorderedText(float f) {
        this(-1, -16777216, f);
    }

    private float getTextBaselineOffset() {
        Paint.FontMetrics fontMetrics = this.textMetrics;
        return (fontMetrics.ascent + fontMetrics.descent) * 0.5f;
    }

    public void drawCenteredText(@NonNull Canvas canvas, @NonNull RectF rectF, String str, Paint paint) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float measureText = this.interiorPaint.measureText(str);
        float textBaselineOffset = getTextBaselineOffset();
        if (paint != null) {
            float min = Math.min(Math.max(0.7f * measureText, 1.1f * textBaselineOffset), Math.min(rectF.width() * 0.5f, rectF.height() * 0.5f));
            Paint paint2 = new Paint(paint);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAlpha(90);
            canvas.drawCircle(centerX, centerY, min, paint2);
        }
        this.interiorPaint.setColor(-1);
        canvas.drawText(str, centerX - (measureText * 0.5f), centerY - textBaselineOffset, this.interiorPaint);
    }

    public void drawLines(Canvas canvas, float f, float f2, Vector<String> vector) {
        Iterator<String> it = vector.iterator();
        int i = 0;
        while (it.hasNext()) {
            drawText(canvas, f, f2 - (getTextSize() * ((vector.size() - i) - 1)), it.next());
            i++;
        }
    }

    public void drawText(Canvas canvas, float f, float f2, String str) {
        canvas.drawText(str, f, f2, this.exteriorPaint);
        canvas.drawText(str, f, f2, this.interiorPaint);
    }

    public void getTextBounds(String str, int i, int i2, Rect rect) {
        this.interiorPaint.getTextBounds(str, i, i2, rect);
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setAlpha(int i) {
        this.interiorPaint.setAlpha(i);
        this.exteriorPaint.setAlpha(i);
    }

    public void setExteriorColor(int i) {
        this.exteriorPaint.setColor(i);
    }

    public void setInteriorColor(int i) {
        this.interiorPaint.setColor(i);
    }

    public void setTextAlign(Paint.Align align) {
        this.interiorPaint.setTextAlign(align);
        this.exteriorPaint.setTextAlign(align);
    }

    public void setTypeface(Typeface typeface) {
        this.interiorPaint.setTypeface(typeface);
        this.interiorPaint.getFontMetrics(this.textMetrics);
        this.exteriorPaint.setTypeface(typeface);
    }

    public BorderedText(int i, int i2, float f) {
        Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
        this.textMetrics = fontMetrics;
        this.rect = new Rect();
        Paint paint = new Paint();
        this.interiorPaint = paint;
        paint.setTextSize(f);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(false);
        paint.setAlpha(255);
        paint.getFontMetrics(fontMetrics);
        Paint paint2 = new Paint();
        this.exteriorPaint = paint2;
        paint2.setTextSize(f);
        paint2.setColor(i2);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setStrokeWidth(f / 8.0f);
        paint2.setAntiAlias(false);
        paint2.setAlpha(255);
        this.textSize = f;
    }

    public void drawText(Canvas canvas, float f, float f2, String str, Paint paint) {
        float measureText = this.exteriorPaint.measureText(str);
        float textSize = this.exteriorPaint.getTextSize();
        Paint paint2 = new Paint(paint);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(160);
        canvas.drawRect(f, f2 + ((int) textSize), f + ((int) measureText), f2, paint2);
        canvas.drawText(str, f, f2 + textSize, this.interiorPaint);
    }
}
