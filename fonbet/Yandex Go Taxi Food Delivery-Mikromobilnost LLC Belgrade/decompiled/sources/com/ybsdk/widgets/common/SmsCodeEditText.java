package com.ybsdk.widgets.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.d0t0;
import defpackage.kp50;
import defpackage.rcc;
import defpackage.scc;
import defpackage.t8;
import defpackage.tje;
import defpackage.ung0;
import defpackage.zp31;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u0001:\u00012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001eR\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/ybsdk/widgets/common/SmsCodeEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/text/TextPaint;", "calculateMaxWidthSingleNumber", "(Landroid/text/TextPaint;)I", "Lzy11;", "onAttachedToWindow", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "digitsCount", "getWidthForDigits", "(I)I", "codeLength", "setCodeLength", "(I)V", CA20Status.STATUS_USER_I, "", "Landroid/graphics/RectF;", "rectBounds", "Ljava/util/List;", "oneCharacterWidth", "oneCharacterSpace", "Landroid/graphics/Rect;", "textBoundsRect", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "cursorPaint", "Landroid/graphics/Paint;", "cursorRect", "Landroid/graphics/RectF;", "cursorWidth", "", "cursorVisible", "Z", "Companion", "d0t0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmsCodeEditText extends AppCompatEditText {

    @Deprecated
    public static final long CURSOR_FLASH_DELAY = 600;
    private static final d0t0 Companion = new d0t0();

    @Deprecated
    public static final float SCALE_HEIGHT = 1.1f;
    private final Paint cursorPaint;
    private final RectF cursorRect;
    private boolean cursorVisible;
    private final int cursorWidth;
    private int digitsCount;
    private final int oneCharacterSpace;
    private int oneCharacterWidth;
    private List<? extends RectF> rectBounds;
    private final Rect textBoundsRect;

    public SmsCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rectBounds = EmptyList.a;
        this.oneCharacterSpace = kp50.r(4);
        this.textBoundsRect = new Rect();
        Paint paint = new Paint(1);
        this.cursorPaint = paint;
        this.cursorRect = new RectF();
        this.cursorWidth = kp50.r(1);
        this.cursorVisible = true;
        this.oneCharacterWidth = calculateMaxWidthSingleNumber(getPaint());
        setCodeLength(this.digitsCount);
        paint.setColor(com.ybsdk.core.utils.ext.view.b.g(ung0.ybColor_textIcon_primary, this));
        setOnTouchListener(new t8(20, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(SmsCodeEditText smsCodeEditText, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = 0;
        if (action != 0 && action != 2) {
            return false;
        }
        float x = motionEvent.getX();
        float f = 0.0f;
        int i2 = 0;
        for (Object obj : smsCodeEditText.rectBounds) {
            int i3 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            RectF rectF = (RectF) obj;
            float f2 = (rectF.left + rectF.right) / 2.0f;
            if (Math.abs(x - f2) < Math.abs(x - f)) {
                i2 = i;
                f = f2;
            }
            i = i3;
        }
        Editable text = smsCodeEditText.getText();
        if (text == null || i2 >= text.length()) {
            return true;
        }
        smsCodeEditText.setSelection(i2);
        return true;
    }

    private final int calculateMaxWidthSingleNumber(TextPaint textPaint) {
        int i = 0;
        for (int i2 = 0; i2 < "0123456789".length(); i2++) {
            int measureText = (int) textPaint.measureText(String.valueOf("0123456789".charAt(i2)));
            if (i < measureText) {
                i = measureText;
            }
        }
        return (this.oneCharacterSpace / 2) + i;
    }

    public final int getWidthForDigits(int digitsCount) {
        return getPaddingEnd() + getPaddingStart() + (this.oneCharacterSpace * digitsCount) + (this.oneCharacterWidth * digitsCount);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tje.N(zp31.a(this), null, null, new SmsCodeEditText$onAttachedToWindow$1(this, null), 3);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setColor(getCurrentTextColor());
        String valueOf = String.valueOf(getText());
        int i = this.digitsCount;
        int length = length();
        if (i > length) {
            i = length;
        }
        String substring = valueOf.substring(0, i);
        int i2 = 0;
        int i3 = 0;
        while (i2 < substring.length()) {
            int i4 = i3 + 1;
            String valueOf2 = String.valueOf(substring.charAt(i2));
            RectF rectF = this.rectBounds.get(i3);
            getPaint().getTextBounds(valueOf2, 0, 1, this.textBoundsRect);
            canvas.drawText(valueOf2, ((rectF.width() / 2.0f) - (getPaint().measureText(valueOf2) / 2.0f)) + rectF.left, (((rectF.height() / 2.0f) + rectF.top) + (this.textBoundsRect.height() / 2)) - this.textBoundsRect.bottom, getPaint());
            i2++;
            i3 = i4;
        }
        if (this.cursorVisible && hasFocus()) {
            int selectionStart = getSelectionStart();
            int i5 = this.digitsCount - 1;
            if (selectionStart > i5) {
                selectionStart = i5;
            }
            RectF rectF2 = this.rectBounds.get(selectionStart);
            float fontSpacing = getPaint().getFontSpacing();
            this.cursorRect.top = ((rectF2.height() / 2.0f) + rectF2.top) - (fontSpacing / 2.0f);
            RectF rectF3 = this.cursorRect;
            rectF3.bottom = rectF3.top + fontSpacing;
            rectF3.left = rectF2.left;
            Editable text = getText();
            if (text != null && text.length() == 0) {
                RectF rectF4 = this.cursorRect;
                RectF rectF5 = (RectF) kotlin.collections.a.R(this.rectBounds);
                rectF4.left = rectF5 != null ? rectF5.left : 0.0f;
            }
            if (getSelectionStart() == this.digitsCount) {
                RectF rectF6 = this.cursorRect;
                RectF rectF7 = (RectF) kotlin.collections.a.b0(this.rectBounds);
                rectF6.left = rectF7 != null ? rectF7.right : 0.0f;
            }
            RectF rectF8 = this.cursorRect;
            rectF8.right = rectF8.left + this.cursorWidth;
            canvas.drawRect(rectF8, this.cursorPaint);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = this.oneCharacterWidth;
        int i2 = this.digitsCount;
        int paddingEnd = getPaddingEnd() + getPaddingStart() + (this.oneCharacterSpace * i2) + (i * i2);
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        setMeasuredDimension(paddingEnd, (int) ((fontMetrics.descent - fontMetrics.ascent) * 1.1f));
        float measuredHeight = getMeasuredHeight();
        float paddingStart = getPaddingStart();
        for (RectF rectF : this.rectBounds) {
            rectF.top = 0.0f;
            rectF.bottom = measuredHeight;
            rectF.left = paddingStart;
            int i3 = this.oneCharacterWidth;
            rectF.right = i3 + paddingStart;
            paddingStart += i3 + this.oneCharacterSpace;
        }
    }

    public final void setCodeLength(int codeLength) {
        if (this.digitsCount == codeLength) {
            return;
        }
        this.digitsCount = codeLength;
        ListBuilder a = rcc.a();
        int i = this.digitsCount;
        for (int i2 = 0; i2 < i; i2++) {
            a.add(new RectF());
        }
        this.rectBounds = a.j();
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.digitsCount)});
        requestLayout();
    }

    public SmsCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SmsCodeEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SmsCodeEditText(Context context) {
        this(context, null, 0, 6, null);
    }
}
