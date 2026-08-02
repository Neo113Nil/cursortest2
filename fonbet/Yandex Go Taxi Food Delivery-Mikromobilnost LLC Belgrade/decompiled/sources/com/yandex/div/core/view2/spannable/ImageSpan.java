package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import defpackage.afv;
import defpackage.bfv;
import defpackage.jl40;
import defpackage.m810;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002\n7BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJW\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010&\u001a\u00020(2\u0006\u0010%\u001a\u00020(¢\u0006\u0004\b&\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R.\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00105\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ImageSpan;", "Lcom/yandex/div/internal/spannable/PositionAwareReplacementSpan;", "Landroid/graphics/drawable/Drawable;", "image", "", "width", "height", "lineHeight", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "alignment", "Lafv;", "accessibility", "<init>", "(Landroid/graphics/drawable/Drawable;IIILcom/yandex/div/core/view2/spannable/TextVerticalAlignment;Lafv;)V", "Landroid/graphics/Canvas;", "Lzy11;", "drawImage", "(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "adjustSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "Landroid/graphics/Rect;", "rect", "getBoundsInText", "(Landroid/graphics/Rect;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "(Landroid/graphics/RectF;)Landroid/graphics/RectF;", CA20Status.STATUS_USER_I, "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "Lafv;", "getAccessibility$div_release", "()Lafv;", "value", "Landroid/graphics/drawable/Drawable;", "getImage", "()Landroid/graphics/drawable/Drawable;", "setImage", "(Landroid/graphics/drawable/Drawable;)V", "boundsInText", "Landroid/graphics/RectF;", "int0", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageSpan extends PositionAwareReplacementSpan {
    private final afv accessibility;
    private final TextVerticalAlignment alignment;
    private final RectF boundsInText;
    private final int height;
    private Drawable image;
    private final int lineHeight;
    private final int width;

    public ImageSpan(Drawable drawable, int i, int i2, int i3, TextVerticalAlignment textVerticalAlignment, afv afvVar) {
        this.width = i;
        this.height = i2;
        this.lineHeight = i3;
        this.alignment = textVerticalAlignment;
        this.accessibility = afvVar;
        this.image = drawable;
        this.boundsInText = new RectF();
    }

    private final void drawImage(Canvas canvas, Drawable drawable) {
        if (!(drawable instanceof PictureDrawable)) {
            drawable.draw(canvas);
            return;
        }
        float min = Math.min(r4.getBounds().width() / r4.getIntrinsicWidth(), r4.getBounds().height() / r4.getIntrinsicHeight());
        canvas.scale(min, min);
        canvas.drawPicture(((PictureDrawable) drawable).getPicture());
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Rect bounds;
        Rect bounds2;
        if (fm == null || this.lineHeight > 0) {
            return this.width;
        }
        int b = m810.b(paint.ascent());
        int b2 = m810.b(paint.descent());
        Drawable drawable = this.image;
        int height = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? this.height : bounds2.height();
        int i = bfv.a[this.alignment.ordinal()];
        if (i == 1) {
            b2 = b + height;
        } else if (i == 2) {
            b2 = ((b + b2) + height) / 2;
        } else if (i == 3) {
            b2 = 0;
        } else if (i != 4) {
            w511.b();
            return 0;
        }
        int i2 = b2 - height;
        int i3 = fm.top;
        int i4 = fm.ascent;
        int i5 = fm.bottom - fm.descent;
        fm.ascent = Math.min(i2, i4);
        int max = Math.max(b2, fm.descent);
        fm.descent = max;
        fm.top = fm.ascent + (i3 - i4);
        fm.bottom = max + i5;
        Drawable drawable2 = this.image;
        return (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? this.width : bounds.width();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Drawable drawable = this.image;
        if (drawable == null) {
            return;
        }
        canvas.save();
        int height = drawable.getBounds().height();
        int i = bfv.a[this.alignment.ordinal()];
        if (i == 1) {
            y = top + height;
        } else if (i == 2) {
            y = ((top + bottom) + height) / 2;
        } else if (i != 3) {
            if (i != 4) {
                w511.b();
                return;
            }
            y = bottom;
        }
        float f = y - height;
        this.boundsInText.set(drawable.getBounds());
        this.boundsInText.offset(x, f);
        canvas.translate(x, f);
        drawImage(canvas, drawable);
        canvas.restore();
    }

    /* renamed from: getAccessibility$div_release, reason: from getter */
    public final afv getAccessibility() {
        return this.accessibility;
    }

    public final Rect getBoundsInText(Rect rect) {
        rect.set(m810.b(this.boundsInText.left), m810.b(this.boundsInText.top), m810.b(this.boundsInText.right), m810.b(this.boundsInText.bottom));
        return rect;
    }

    public final Drawable getImage() {
        return this.image;
    }

    public final void setImage(Drawable drawable) {
        if (jl40.l(this.image, drawable)) {
            return;
        }
        this.image = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.width, this.height);
        }
        this.boundsInText.setEmpty();
    }

    public /* synthetic */ ImageSpan(Drawable drawable, int i, int i2, int i3, TextVerticalAlignment textVerticalAlignment, afv afvVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, i, i2, (i4 & 8) != 0 ? 0 : i3, textVerticalAlignment, afvVar);
    }

    public final RectF getBoundsInText(RectF rect) {
        rect.set(this.boundsInText);
        return rect;
    }
}
