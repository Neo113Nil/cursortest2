package com.yandex.plus.home.common.utils.spantext;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import defpackage.ujf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000 +2\u00020\u0001:\u0001,B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/yandex/plus/home/common/utils/spantext/CustomImageSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "verticalAlignment", "", "updateFontMetrics", "drawAsTextColor", "<init>", "(Landroid/graphics/drawable/Drawable;IZZ)V", "applyDrawableBounds", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", CA20Status.STATUS_USER_I, "getVerticalAlignment", "()I", "Z", "value", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Companion", "ujf", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public class CustomImageSpan extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final ujf Companion = new ujf();
    private final boolean drawAsTextColor;
    private Drawable drawable;
    private final boolean updateFontMetrics;
    private final int verticalAlignment;

    public /* synthetic */ CustomImageSpan(Drawable drawable, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }

    private final Drawable applyDrawableBounds(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        if (mutate.getBounds().isEmpty()) {
            mutate.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return mutate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        int i;
        int i2;
        canvas.save();
        int height = this.drawable.getBounds().height();
        int i3 = this.verticalAlignment;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = (y - top) - height;
            } else if (i3 != 2) {
                i2 = 0;
            } else {
                i = (bottom - top) / 2;
                height /= 2;
            }
            if (this.drawAsTextColor) {
                this.drawable.setTint(paint.getColor());
            }
            canvas.translate(x, top + i2);
            this.drawable.draw(canvas);
            canvas.restore();
        }
        i = bottom - top;
        i2 = i - height;
        if (this.drawAsTextColor) {
        }
        canvas.translate(x, top + i2);
        this.drawable.draw(canvas);
        canvas.restore();
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Rect bounds = this.drawable.getBounds();
        if (fm != null) {
            paint.getFontMetricsInt(fm);
            if (this.updateFontMetrics) {
                int i = this.verticalAlignment;
                if (i == 0) {
                    fm.top = fm.bottom - bounds.height();
                } else if (i == 1) {
                    fm.top = -bounds.height();
                } else if (i == 2) {
                    fm.top = (fm.ascent / 2) - (bounds.height() / 2);
                    fm.bottom = (bounds.height() / 2) + (fm.ascent / 2);
                }
            }
        }
        return bounds.width();
    }

    public final int getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final void setDrawable(Drawable drawable) {
        this.drawable = applyDrawableBounds(drawable);
    }

    public CustomImageSpan(Drawable drawable, int i) {
        this(drawable, i, false, false, 12, null);
    }

    public CustomImageSpan(Drawable drawable, int i, boolean z) {
        this(drawable, i, z, false, 8, null);
    }

    public CustomImageSpan(Drawable drawable) {
        this(drawable, 0, false, false, 14, null);
    }

    public CustomImageSpan(Drawable drawable, int i, boolean z, boolean z2) {
        this.verticalAlignment = i;
        this.updateFontMetrics = z;
        this.drawAsTextColor = z2;
        this.drawable = applyDrawableBounds(drawable);
    }
}
