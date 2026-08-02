package com.yandex.messaging.ui.badges;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.cn4;
import defpackage.fxa1;
import defpackage.kjs0;
import defpackage.n;
import defpackage.vw00;
import defpackage.wuj0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001IB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0019\u0010+\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00100R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00100R\u0014\u0010=\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00100R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00100R\u0014\u0010?\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00104R\u0016\u0010E\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00104R\u0016\u0010F\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00104R\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00104¨\u0006J"}, d2 = {"Lcom/yandex/messaging/ui/badges/MarkedBadgeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "", "badgeBackgroundColor", "badgeTextColor", "", "badgeText", "<init>", "(Landroid/content/Context;IILjava/lang/String;)V", "Lcn4;", "badgeViewData", "(Landroid/content/Context;Lcn4;)V", "Landroid/graphics/Paint$FontMetrics;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetrics;", "", "getTextHeight", "()F", "maxWidth", "calculateWidth", "(F)F", "calculateHeight", "typeface", "Lzy11;", "setTypeface", "(I)V", "size", "setTextSize", "(F)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/content/Context;", CA20Status.STATUS_USER_I, "Ljava/lang/String;", "displayText", "displayMaxWidth", "F", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "radius", "verticalPadding", "horizontalPadding", "baselinePadding", "textBounds", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "bgRect", "Landroid/graphics/RectF;", "left", "top", "right", "bottom", "Companion", "vw00", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MarkedBadgeDrawable extends Drawable {
    public static final int $stable = 8;
    public static final vw00 Companion = new vw00();
    public static final int HORIZONTAL_PADDING = 4;
    public static final int VERTICAL_PADDING = 3;
    private final Paint backgroundPaint;
    private final int badgeBackgroundColor;
    private final String badgeText;
    private final int badgeTextColor;
    private final int baselinePadding;
    private final RectF bgRect;
    private float bottom;
    private final Context context;
    private float displayMaxWidth;
    private String displayText;
    private final int horizontalPadding;
    private float left;
    private final int radius;
    private float right;
    private final Rect textBounds;
    private final TextPaint textPaint;
    private float top;
    private final int verticalPadding;

    public MarkedBadgeDrawable(Context context, int i, int i2, String str) {
        this.context = context;
        this.badgeBackgroundColor = i;
        this.badgeTextColor = i2;
        this.badgeText = str;
        this.displayText = str;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        this.backgroundPaint = paint;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(kjs0.e(12));
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setAntiAlias(true);
        textPaint.setColor(i2);
        this.textPaint = textPaint;
        this.radius = kjs0.b(4);
        this.verticalPadding = kjs0.b(3);
        this.horizontalPadding = kjs0.b(4);
        this.baselinePadding = kjs0.b(1);
        this.textBounds = new Rect();
        this.bgRect = new RectF();
    }

    private final Paint.FontMetrics getFontMetrics() {
        return this.textPaint.getFontMetrics();
    }

    private final float getTextHeight() {
        return getFontMetrics().descent - getFontMetrics().ascent;
    }

    public final float calculateHeight() {
        this.top = getBounds().top - this.verticalPadding;
        float textSize = this.textPaint.getTextSize() + getBounds().top + this.verticalPadding;
        this.bottom = textSize;
        return textSize - this.top;
    }

    public final float calculateWidth(float maxWidth) {
        this.displayMaxWidth = maxWidth;
        float f = maxWidth - (this.horizontalPadding * 2);
        String obj = (maxWidth <= 0.0f || this.textPaint.measureText(this.badgeText) <= f) ? this.badgeText : TextUtils.ellipsize(this.badgeText, this.textPaint, f, TextUtils.TruncateAt.END).toString();
        this.displayText = obj;
        this.textPaint.getTextBounds(obj, 0, obj.length(), this.textBounds);
        this.left = getBounds().left - this.horizontalPadding;
        float width = this.textBounds.width() + getBounds().left + this.horizontalPadding;
        this.right = width;
        return width - this.left;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.bgRect;
        rectF.left = this.left;
        rectF.top = this.top;
        rectF.right = this.right;
        rectF.bottom = this.bottom;
        int i = this.radius;
        canvas.drawRoundRect(rectF, i, i, this.backgroundPaint);
        String str = this.displayText;
        RectF rectF2 = this.bgRect;
        canvas.drawText(str, rectF2.left + this.horizontalPadding, (n.a(rectF2.height(), getTextHeight(), 2.0f, rectF2.top) - getFontMetrics().ascent) - this.baselinePadding, this.textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        calculateHeight();
        calculateWidth(this.displayMaxWidth);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(alpha);
        this.textPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.backgroundPaint.setColorFilter(colorFilter);
        this.textPaint.setColorFilter(colorFilter);
    }

    public final void setTextSize(float size) {
        this.textPaint.setTextSize(size);
    }

    public final void setTypeface(int typeface) {
        this.textPaint.setTypeface(wuj0.b(typeface, this.context));
    }

    public MarkedBadgeDrawable(Context context, cn4 cn4Var) {
        this(context, fxa1.c(cn4Var.b(), context).data, fxa1.c(cn4Var.c(), context).data, cn4Var.a(context.getResources()));
    }
}
