package com.ybsdk.core.design.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import defpackage.kp50;
import defpackage.m810;
import defpackage.qp51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0001&B1\b\u0007\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJs\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010$\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ybsdk/core/design/spans/YbBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "", "color", "", "radius", "gapAfterBullet", "gapBeforeBullet", "<init>", "(IFFF)V", "", "first", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", RemoteBioParameters.X, "dir", "top", "baseline", "bottom", "", "text", "start", "end", "Landroid/text/Layout;", "layout", "Lzy11;", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", CA20Status.STATUS_USER_I, "F", "getWantColor", "()Z", "wantColor", "Companion", "qp51", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YbBulletSpan implements LeadingMarginSpan {

    @Deprecated
    public static final int COLOR_SAME_AS_TEXT = 0;
    private static final qp51 Companion = new qp51();
    private final int color;
    private final float gapAfterBullet;
    private final float gapBeforeBullet;
    private final float radius;

    public /* synthetic */ YbBulletSpan(int i, float f, float f2, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? kp50.s(1.5f) : f, (i2 & 4) != 0 ? kp50.s(11.5f) : f2, (i2 & 8) != 0 ? kp50.s(10.5f) : f3);
    }

    private final boolean getWantColor() {
        return this.color != 0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        int i;
        if (((Spanned) text).getSpanStart(this) != start) {
            return;
        }
        Paint.Style style = paint.getStyle();
        if (getWantColor()) {
            i = paint.getColor();
            paint.setColor(this.color);
        } else {
            i = 0;
        }
        paint.setStyle(Paint.Style.FILL);
        float f = (top + bottom) / 2.0f;
        float f2 = x + dir + this.radius;
        int save = canvas.save();
        try {
            canvas.translate(this.gapBeforeBullet, 0.0f);
            canvas.drawCircle(f2, f, this.radius, paint);
            canvas.restoreToCount(save);
            if (getWantColor()) {
                paint.setColor(i);
            }
            paint.setStyle(style);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        return m810.b(this.gapAfterBullet + this.gapBeforeBullet);
    }

    public YbBulletSpan(int i) {
        this(i, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public YbBulletSpan(int i, float f) {
        this(i, f, 0.0f, 0.0f, 12, null);
    }

    public YbBulletSpan(int i, float f, float f2) {
        this(i, f, f2, 0.0f, 8, null);
    }

    public YbBulletSpan(int i, float f, float f2, float f3) {
        this.color = i;
        this.radius = f;
        this.gapAfterBullet = f2;
        this.gapBeforeBullet = f3;
    }

    public YbBulletSpan() {
        this(0, 0.0f, 0.0f, 0.0f, 15, null);
    }
}
