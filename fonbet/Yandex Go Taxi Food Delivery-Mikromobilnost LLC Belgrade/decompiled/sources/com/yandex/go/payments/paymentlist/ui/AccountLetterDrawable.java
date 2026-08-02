package com.yandex.go.payments.paymentlist.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.eja1;
import defpackage.jxi;
import defpackage.mrg0;
import defpackage.up11;
import defpackage.vng;
import defpackage.x2h0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/payments/paymentlist/ui/AccountLetterDrawable;", "Landroid/graphics/drawable/Drawable;", "", "accountLetter", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "draw", "(Landroid/graphics/Canvas;)V", "", "getIntrinsicHeight", "()I", "getIntrinsicWidth", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "Ljava/lang/String;", C0553n3.g, "Landroid/graphics/drawable/Drawable;", "Landroid/text/TextPaint;", "paint", "Landroid/text/TextPaint;", "", "textSize", "F", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountLetterDrawable extends Drawable {
    public static final int $stable = 8;
    private final String accountLetter;
    private final Drawable background;
    private final TextPaint paint;
    private final float textSize;

    public AccountLetterDrawable(String str, Context context) {
        this.accountLetter = str;
        Drawable t = vng.t(x2h0.ic_payment_bg, context);
        this.background = t;
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        this.textSize = context.getResources().getDimension(mrg0.go_design_m_space);
        if (t != null) {
            t.setBounds(0, 0, t.getIntrinsicWidth(), t.getIntrinsicHeight());
        }
        int[] iArr = up11.a;
        textPaint.setTypeface(eja1.w(3, 0));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds;
        Rect bounds2 = getBounds();
        float height = bounds2.height() / 2.0f;
        Drawable drawable = this.background;
        canvas.translate(0.0f, height - (((drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.height()) / 2.0f));
        Drawable drawable2 = this.background;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        this.paint.setTextSize(this.textSize);
        this.paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        canvas.drawText(this.accountLetter, bounds2.width() / 2.0f, ((bounds2.height() / 2.0f) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f), this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.background;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.background;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
