package com.yandex.go.safety.center.instruction;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import defpackage.bdc;
import defpackage.kdc;
import defpackage.nwy0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101¨\u00065"}, d2 = {"Lcom/yandex/go/safety/center/instruction/NumberInCircleView;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "", "number", "<init>", "(Landroid/content/Context;I)V", "Lzy11;", "updateColors", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", CA20Status.STATUS_USER_I, "Lkdc;", "circleColor", "Lkdc;", "textColor", "numberSize", "numberPadding", "padding", "Landroid/graphics/Paint;", "circlePaint", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Rect;", "textBounds", "Landroid/graphics/Rect;", "", "centerX", "F", "centerY", "radius", "textY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NumberInCircleView extends View implements nwy0 {
    private float centerX;
    private float centerY;
    private final kdc circleColor;
    private final Paint circlePaint;
    private final int number;
    private final int numberPadding;
    private final int numberSize;
    private final int padding;
    private float radius;
    private final Rect textBounds;
    private final kdc textColor;
    private final Paint textPaint;
    private float textY;

    public NumberInCircleView(Context context, int i) {
        super(context);
        this.number = i;
        bdc bdcVar = new bdc(xng0.textMain);
        this.circleColor = bdcVar;
        bdc bdcVar2 = new bdc(xng0.bgMain);
        this.textColor = bdcVar2;
        int v = tje.v(getContext(), 16.0f);
        this.numberSize = v;
        this.numberPadding = tje.v(getContext(), 4.0f);
        this.padding = tje.v(getContext(), 18.0f);
        Paint paint = new Paint(1);
        paint.setColor(s8o.m(bdcVar, getContext()));
        paint.setStyle(Paint.Style.FILL);
        this.circlePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(s8o.m(bdcVar2, getContext()));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint2.setTextSize(v);
        this.textPaint = paint2;
        this.textBounds = new Rect();
        setContentDescription(String.valueOf(i));
    }

    private final void updateColors() {
        this.circlePaint.setColor(s8o.m(this.circleColor, getContext()));
        this.textPaint.setColor(s8o.m(this.textColor, getContext()));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateColors();
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.centerX, this.centerY, this.radius, this.circlePaint);
        canvas.drawText(String.valueOf(this.number), this.centerX, this.textY, this.textPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.centerX = getWidth() / 2.0f;
        this.centerY = getHeight() / 2.0f;
        this.radius = (getWidth() - (this.padding * 2)) / 2.0f;
        this.textY = this.centerY - ((this.textPaint.ascent() + this.textPaint.descent()) / 2.0f);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        String valueOf = String.valueOf(this.number);
        this.textPaint.getTextBounds(valueOf, 0, valueOf.length(), this.textBounds);
        int max = (this.numberPadding * 2) + Math.max(this.textBounds.width(), this.textBounds.height());
        int i = this.padding;
        setMeasuredDimension((i * 2) + max, (i * 2) + max);
    }
}
