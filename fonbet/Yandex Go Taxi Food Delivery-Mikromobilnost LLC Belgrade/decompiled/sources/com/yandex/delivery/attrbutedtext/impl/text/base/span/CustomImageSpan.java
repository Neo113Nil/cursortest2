package com.yandex.delivery.attrbutedtext.impl.text.base.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import defpackage.jl40;
import defpackage.wjf;
import defpackage.yjf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0017\u0018\u0000 72\u00020\u0001:\u00028\u000bBG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJW\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R*\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/impl/text/base/span/CustomImageSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "verticalAlignment", "", "offset", "", "updateFontMetrics", "drawAsTextColor", "Lyjf;", "compareInfo", "<init>", "(Landroid/graphics/drawable/Drawable;ILjava/lang/Float;ZZLyjf;)V", "applyDrawableBounds", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", CA20Status.STATUS_USER_I, "getVerticalAlignment", "Ljava/lang/Float;", "getOffset", "()Ljava/lang/Float;", "Z", "Lyjf;", "value", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Companion", "wjf", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public class CustomImageSpan extends ReplacementSpan {
    public static final int $stable = 8;
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final wjf Companion = new wjf();
    private final yjf compareInfo;
    private final boolean drawAsTextColor;
    private Drawable drawable;
    private final Float offset;
    private final boolean updateFontMetrics;
    private final int verticalAlignment;

    public /* synthetic */ CustomImageSpan(Drawable drawable, int i, Float f, boolean z, boolean z2, yjf yjfVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : f, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : yjfVar);
    }

    private final Drawable applyDrawableBounds(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        if (mutate.getBounds().isEmpty()) {
            mutate.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return mutate;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0004, B:10:0x0028, B:12:0x002c, B:13:0x0035, B:15:0x003b, B:16:0x0041, B:22:0x001a, B:23:0x001d, B:24:0x0022, B:25:0x0026), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0004, B:10:0x0028, B:12:0x002c, B:13:0x0035, B:15:0x003b, B:16:0x0041, B:22:0x001a, B:23:0x001d, B:24:0x0022, B:25:0x0026), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        int i;
        int i2;
        int save = canvas.save();
        try {
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
                float f = top + i2;
                Float f2 = this.offset;
                canvas.translate(x, f - (f2 == null ? f2.floatValue() : 0.0f));
                this.drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
            i = bottom - top;
            i2 = i - height;
            if (this.drawAsTextColor) {
            }
            float f3 = top + i2;
            Float f22 = this.offset;
            canvas.translate(x, f3 - (f22 == null ? f22.floatValue() : 0.0f));
            this.drawable.draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        yjf yjfVar = this.compareInfo;
        if (yjfVar == null) {
            return this == other;
        }
        CustomImageSpan customImageSpan = other instanceof CustomImageSpan ? (CustomImageSpan) other : null;
        return jl40.l(yjfVar, customImageSpan != null ? customImageSpan.compareInfo : null);
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final Float getOffset() {
        return this.offset;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Rect bounds = this.drawable.getBounds();
        if (fm != null) {
            paint.getFontMetricsInt(fm);
            if (this.updateFontMetrics) {
                int i = this.verticalAlignment;
                if (i == 0) {
                    fm.ascent = fm.descent - bounds.height();
                } else if (i == 1) {
                    fm.ascent = -bounds.height();
                } else if (i == 2) {
                    float f = (fm.ascent + fm.descent) / 2.0f;
                    fm.ascent = (int) (f - (bounds.height() / 2));
                    fm.descent = (int) (f + (bounds.height() / 2));
                }
                fm.top = fm.ascent;
                fm.bottom = fm.descent;
            }
        }
        return bounds.width();
    }

    public final int getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        yjf yjfVar = this.compareInfo;
        return yjfVar != null ? yjfVar.a.hashCode() : super.hashCode();
    }

    public final void setDrawable(Drawable drawable) {
        this.drawable = applyDrawableBounds(drawable);
    }

    public CustomImageSpan(Drawable drawable, int i) {
        this(drawable, i, null, false, false, null, 60, null);
    }

    public CustomImageSpan(Drawable drawable, int i, Float f) {
        this(drawable, i, f, false, false, null, 56, null);
    }

    public CustomImageSpan(Drawable drawable, int i, Float f, boolean z) {
        this(drawable, i, f, z, false, null, 48, null);
    }

    public CustomImageSpan(Drawable drawable, int i, Float f, boolean z, boolean z2) {
        this(drawable, i, f, z, z2, null, 32, null);
    }

    public CustomImageSpan(Drawable drawable, int i, Float f, boolean z, boolean z2, yjf yjfVar) {
        this.verticalAlignment = i;
        this.offset = f;
        this.updateFontMetrics = z;
        this.drawAsTextColor = z2;
        this.compareInfo = yjfVar;
        this.drawable = applyDrawableBounds(drawable);
    }

    public CustomImageSpan(Drawable drawable) {
        this(drawable, 0, null, false, false, null, 62, null);
    }
}
