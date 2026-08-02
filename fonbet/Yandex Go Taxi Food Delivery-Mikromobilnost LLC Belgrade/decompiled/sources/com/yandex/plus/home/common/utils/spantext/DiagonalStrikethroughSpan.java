package com.yandex.plus.home.common.utils.spantext;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import defpackage.tcj;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/yandex/plus/home/common/utils/spantext/DiagonalStrikethroughSpan;", "Landroid/text/style/ReplacementSpan;", "", "strokeWidth", "", "strokeColor", "textColor", "verticalPadding", "horizontalPadding", "", "overrideStruckText", "<init>", "(FILjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "F", CA20Status.STATUS_USER_I, "Ljava/lang/Integer;", "Ljava/lang/Float;", "Ljava/lang/String;", "Landroid/graphics/Rect;", "textFrame", "Landroid/graphics/Rect;", "Companion", "tcj", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiagonalStrikethroughSpan extends ReplacementSpan {
    private static final tcj Companion = new tcj();

    @Deprecated
    public static final float HORIZONTAL_PADDING = 4.0f;

    @Deprecated
    public static final float VERTICAL_PADDING = 2.0f;
    private final Float horizontalPadding;
    private final String overrideStruckText;
    private final int strokeColor;
    private final float strokeWidth;
    private final Integer textColor;
    private final Rect textFrame;
    private final Float verticalPadding;

    public /* synthetic */ DiagonalStrikethroughSpan(float f, int i, Integer num, Float f2, Float f3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? Float.valueOf(2.0f) : f2, (i2 & 16) != 0 ? Float.valueOf(4.0f) : f3, (i2 & 32) != 0 ? null : str);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Integer num = this.textColor;
        if (num != null) {
            paint.setColor(num.intValue());
        }
        String str = this.overrideStruckText;
        if (str != null) {
            paint.getTextBounds(str, 0, str.length(), this.textFrame);
            canvas.drawText(str, 0, str.length(), x, y, paint);
        } else {
            paint.getTextBounds(text.toString(), start, end, this.textFrame);
            canvas.drawText(text, start, end, x, y, paint);
        }
        paint.setColor(this.strokeColor);
        paint.setStrokeWidth(this.strokeWidth);
        Float f = this.horizontalPadding;
        if (f == null || this.verticalPadding == null) {
            return;
        }
        float floatValue = (this.textFrame.left + x) - f.floatValue();
        float f2 = y;
        canvas.drawLine(floatValue, this.textFrame.bottom + f2 + this.verticalPadding.floatValue(), x + this.textFrame.right + this.horizontalPadding.floatValue(), (f2 + this.textFrame.top) - this.verticalPadding.floatValue(), paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fontMetrics) {
        int measureText = (int) paint.measureText(text, start, end);
        String str = this.overrideStruckText;
        Integer valueOf = str != null ? Integer.valueOf((int) paint.measureText(str, 0, str.length())) : null;
        return Math.max(valueOf != null ? valueOf.intValue() : 0, measureText);
    }

    public DiagonalStrikethroughSpan(float f, int i, Integer num, Float f2, Float f3, String str) {
        this.strokeWidth = f;
        this.strokeColor = i;
        this.textColor = num;
        this.verticalPadding = f2;
        this.horizontalPadding = f3;
        this.overrideStruckText = str;
        this.textFrame = new Rect();
    }
}
