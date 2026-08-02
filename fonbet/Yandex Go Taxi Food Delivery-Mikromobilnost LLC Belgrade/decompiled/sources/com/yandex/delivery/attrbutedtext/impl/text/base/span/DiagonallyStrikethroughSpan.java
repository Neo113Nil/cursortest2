package com.yandex.delivery.attrbutedtext.impl.text.base.span;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import defpackage.e991;
import defpackage.ilf;
import defpackage.vcj;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010*\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+¨\u00060"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/impl/text/base/span/DiagonallyStrikethroughSpan;", "Landroid/text/style/ReplacementSpan;", "Lilf;", "Landroid/content/Context;", "context", "", "strikethroughColor", "textColor", "<init>", "(Landroid/content/Context;II)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "width", "setStrokeWidth", "(F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/content/Context;", CA20Status.STATUS_USER_I, "tiltStartRatio", "F", "tiltEndRatio", "strokeWidth", "Companion", "vcj", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiagonallyStrikethroughSpan extends ReplacementSpan implements ilf {
    public static final int $stable = 8;
    public static final vcj Companion = new vcj();
    private static final float DEFAULT_STROKE_WIDTH_DP = 1.5f;
    private final Context context;
    private final int strikethroughColor;
    private float strokeWidth;
    private final int textColor;
    private final float tiltStartRatio = 0.5f;
    private final float tiltEndRatio = 1.5f;

    public DiagonallyStrikethroughSpan(Context context, int i, int i2) {
        this.context = context;
        this.strikethroughColor = i;
        this.textColor = i2;
        this.strokeWidth = TypedValue.applyDimension(1, 1.5f, context.getResources().getDisplayMetrics());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Paint paint2;
        Rect rect = new Rect();
        paint.getTextBounds(text.toString(), start, end, rect);
        boolean b = e991.b(this.context);
        int color = paint.getColor();
        float strokeWidth = paint.getStrokeWidth();
        paint.setColor(this.textColor);
        float f = y;
        canvas.drawText(text, start, end, x, f, paint);
        paint.setStrokeWidth(this.strokeWidth);
        paint.setColor(this.strikethroughColor);
        if (b) {
            canvas.drawLine(x + rect.right, (rect.exactCenterY() * this.tiltEndRatio) + f, x + rect.left, (rect.exactCenterY() * this.tiltStartRatio) + f, paint);
            paint2 = paint;
        } else {
            canvas.drawLine(x + rect.left, (rect.exactCenterY() * this.tiltStartRatio) + f, x + rect.right, (rect.exactCenterY() * this.tiltEndRatio) + f, paint);
            paint2 = paint;
        }
        paint2.setColor(color);
        paint2.setStrokeWidth(strokeWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DiagonallyStrikethroughSpan.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DiagonallyStrikethroughSpan diagonallyStrikethroughSpan = (DiagonallyStrikethroughSpan) other;
        return this.strikethroughColor == diagonallyStrikethroughSpan.strikethroughColor && this.textColor == diagonallyStrikethroughSpan.textColor;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        if (fm != null) {
            paint.getFontMetricsInt(fm);
        }
        return (int) paint.measureText(text, start, end);
    }

    public int hashCode() {
        return (this.strikethroughColor * 31) + this.textColor;
    }

    public final void setStrokeWidth(float width) {
        this.strokeWidth = width;
    }
}
