package com.yandex.messaging.internal.view.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.kjs0;
import defpackage.tls;
import defpackage.tye;
import defpackage.wtb1;
import defpackage.wuj0;
import defpackage.x4h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001LB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\f*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000bH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u001b\u001a\u00020\f*\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\nH\u0014¢\u0006\u0004\b(\u0010)R*\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/yandex/messaging/internal/view/timeline/CountableImageButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lzy11;", "block", "translatedToCounter", "(Landroid/graphics/Canvas;Ltls;)V", "invalidateBounds", "()V", "colorRes", "color", "(I)I", "attrRes", "colorByAttr", "Landroid/graphics/RectF;", "bounds", "Landroid/graphics/Paint;", "paint", "drawCounterBubble", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "left", "top", "right", "bottom", "layout", "(IIII)V", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "value", "count", "J", "getCount", "()J", "setCount", "(J)V", "Landroid/graphics/Typeface;", "countTypeface", "Landroid/graphics/Typeface;", "Landroid/graphics/Rect;", "textBounds", "Landroid/graphics/Rect;", "Landroid/graphics/PointF;", "textPosition", "Landroid/graphics/PointF;", "ovalBounds", "Landroid/graphics/RectF;", "borderPaint", "Landroid/graphics/Paint;", "fillPaint", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "", "getShouldDrawCount", "()Z", "shouldDrawCount", "", "getText", "()Ljava/lang/String;", "text", "Companion", "tye", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CountableImageButton extends AppCompatImageButton {
    public static final int $stable = 8;
    private static final tye Companion = new tye();

    @Deprecated
    public static final int UPPER_PADDING = 24;
    private final Paint borderPaint;
    private long count;
    private final Typeface countTypeface;
    private final Paint fillPaint;
    private final RectF ovalBounds;
    private final Rect textBounds;
    private final TextPaint textPaint;
    private final PointF textPosition;

    public CountableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface b = wuj0.b(x4h0.ya_medium, context);
        b = b == null ? Typeface.DEFAULT : b;
        this.countTypeface = b;
        this.textBounds = new Rect();
        this.textPosition = new PointF();
        RectF rectF = new RectF();
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = kjs0.d(24);
        rectF.bottom = kjs0.d(24);
        this.ovalBounds = rectF;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(kjs0.d(2));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(fxa1.c(jng0.messagingCommonBackgroundColor, context).data);
        this.borderPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(colorByAttr(jng0.messagingIncomingBackgroundColor));
        this.fillPaint = paint2;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(colorByAttr(jng0.messagingCommonTextSecondaryColor));
        textPaint.setTypeface(b);
        textPaint.setTextSize(kjs0.d(12));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint = textPaint;
    }

    private final int color(int colorRes) {
        return getContext().getResources().getColor(colorRes, null);
    }

    private final int colorByAttr(int attrRes) {
        return fxa1.c(attrRes, getContext()).data;
    }

    private final void drawCounterBubble(Canvas canvas, RectF rectF, Paint paint) {
        getContext();
        canvas.drawRoundRect(rectF, kjs0.d(12), kjs0.d(12), paint);
    }

    private final boolean getShouldDrawCount() {
        return this.count > 0;
    }

    private final String getText() {
        return getShouldDrawCount() ? wtb1.a((int) this.count) : "";
    }

    private final void invalidateBounds() {
        this.textPaint.getTextBounds(getText(), 0, getText().length(), this.textBounds);
        int length = getText().length();
        RectF rectF = this.ovalBounds;
        if (length > 1) {
            rectF.right = rectF.left + (kjs0.b(6) * 2) + this.textBounds.width();
        } else {
            rectF.right = rectF.height() + rectF.left;
        }
        PointF pointF = this.textPosition;
        pointF.x = this.ovalBounds.centerX();
        pointF.y = (this.ovalBounds.height() + this.textBounds.height()) / 2.0f;
    }

    private final void translatedToCounter(Canvas canvas, tls tlsVar) {
        canvas.save();
        getContext();
        canvas.translate(kjs0.d(20), kjs0.d(-12));
        tlsVar.invoke(canvas);
        canvas.restore();
    }

    public final long getCount() {
        return this.count;
    }

    @Override // android.view.View
    public void layout(int left, int top, int right, int bottom) {
        if (getShouldDrawCount()) {
            top += kjs0.b(24);
        }
        super.layout(left, top, right, bottom);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getShouldDrawCount()) {
            canvas.save();
            getContext();
            canvas.translate(kjs0.d(20), kjs0.d(-12));
            drawCounterBubble(canvas, this.ovalBounds, this.fillPaint);
            drawCounterBubble(canvas, this.ovalBounds, this.borderPaint);
            String text = getText();
            PointF pointF = this.textPosition;
            canvas.drawText(text, pointF.x, pointF.y, this.textPaint);
            canvas.restore();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getShouldDrawCount()) {
            heightMeasureSpec += kjs0.b(24);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setCount(long j) {
        boolean shouldDrawCount = getShouldDrawCount();
        this.count = j;
        invalidateBounds();
        invalidate();
        if (getShouldDrawCount() != shouldDrawCount) {
            requestLayout();
        }
    }

    public CountableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CountableImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CountableImageButton(Context context) {
        this(context, null, 0, 6, null);
    }
}
