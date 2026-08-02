package com.yandex.passport.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.yandex.passport.internal.ui.util.SimpleTextWatcher;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.h2i0;
import defpackage.iog0;
import defpackage.lhc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ConfirmationCodeInput extends AppCompatEditText {
    private static final long CURSOR_FLASH_DELAY = 400;
    private static final int DEFAULT_DIGITS_COUNT = 6;
    private final int centralSpace;
    private final Paint charactersPaint;
    private final Paint cursorPaint;
    private final RectF cursorRect;
    private final Runnable cursorVisibilityChangeRunnable;
    private boolean cursorVisible;
    private final int cursorWidth;
    private int digitsCount;
    private boolean editable;
    private final Paint hintPaint;
    private List<a> onCodeChangedListeners;
    private final float oneCharacterSpace;
    private final int pointSize;
    private RectF[] rectBounds;
    private boolean redesignEnabled;
    private final Rect textBoundsRect;

    public ConfirmationCodeInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onCodeChangedListeners = new ArrayList();
        Paint paint = new Paint();
        this.hintPaint = paint;
        Paint paint2 = new Paint(1);
        this.charactersPaint = paint2;
        Paint paint3 = new Paint();
        this.cursorPaint = paint3;
        this.textBoundsRect = new Rect();
        this.cursorRect = new RectF();
        this.cursorVisible = true;
        com.yandex.passport.internal.ui.autologin.d dVar = new com.yandex.passport.internal.ui.autologin.d(4, this);
        this.cursorVisibilityChangeRunnable = dVar;
        this.editable = true;
        this.redesignEnabled = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize, iog0.colorAccent, R.attr.textColorPrimary, R.attr.textColorSecondary, com.yandex.passport.R.attr.passport_codeLength, com.yandex.passport.R.attr.passport_redesign}, 0, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 32);
            int color = obtainStyledAttributes.getColor(1, -16776961);
            int color2 = obtainStyledAttributes.getColor(2, ModalContentViewContainer.BASE_SHADOW_COLOR);
            int color3 = obtainStyledAttributes.getColor(3, ModalContentViewContainer.BASE_SHADOW_COLOR);
            int i2 = obtainStyledAttributes.getInt(4, 6);
            this.redesignEnabled = obtainStyledAttributes.getBoolean(5, false);
            obtainStyledAttributes.recycle();
            setCodeLength(i2);
            paint.setColor(lhc.f(color3, Color.alpha(color3) / 2));
            paint.setFlags(1);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint2.setColor(color2);
            paint2.setTextSize(dimensionPixelSize);
            paint2.setStyle(style);
            paint2.setFlags(1);
            paint2.setTextAlign(Paint.Align.CENTER);
            this.oneCharacterSpace = (int) ((paint2.measureText("0123456789") / 10.0f) * 2.0f);
            paint3.setColor(color);
            this.cursorWidth = com.yandex.passport.legacy.d.c(2, getContext());
            this.centralSpace = com.yandex.passport.legacy.d.c(20, getContext());
            this.pointSize = com.yandex.passport.legacy.d.c(6, getContext());
            postDelayed(dVar, 400L);
            setFocusableInTouchMode(true);
            setInputType(2);
            addTextChangedListener(new SimpleTextWatcher(new com.yandex.passport.internal.ui.a(15, this)));
            if (this.redesignEnabled) {
                return;
            }
            setLayoutDirection(0);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Editable editable) {
        notifyCodeChanged();
    }

    private void notifyCodeChanged() {
        invalidate();
        String code = getCode();
        Iterator<a> it = this.onCodeChangedListeners.iterator();
        while (it.hasNext()) {
            notifyCodeChanged(code, it.next());
        }
    }

    public void addOnCodeChangedListener(a aVar) {
        this.onCodeChangedListeners.add(aVar);
    }

    public String getCode() {
        return getText().toString();
    }

    public boolean isCodeComplete() {
        return getCode().length() == this.digitsCount;
    }

    public boolean isEditable() {
        return this.editable;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.redesignEnabled) {
            super.onDraw(canvas);
            return;
        }
        float measuredHeight = getMeasuredHeight();
        String substring = getText().toString().substring(0, Math.min(this.digitsCount, length()));
        int length = substring.length();
        while (true) {
            RectF[] rectFArr = this.rectBounds;
            if (length >= rectFArr.length) {
                break;
            }
            RectF rectF = rectFArr[length];
            canvas.drawCircle((rectF.right + rectF.left) / 2.0f, measuredHeight / 2.0f, this.pointSize, this.hintPaint);
            length++;
        }
        for (int i = 0; i < substring.length(); i++) {
            String valueOf = String.valueOf(substring.charAt(i));
            RectF rectF2 = this.rectBounds[i];
            this.charactersPaint.getTextBounds(valueOf, 0, 1, this.textBoundsRect);
            canvas.drawText(valueOf, (rectF2.width() / 2.0f) + rectF2.left, (((rectF2.height() / 2.0f) + rectF2.top) + (this.textBoundsRect.height() / 2)) - this.textBoundsRect.bottom, this.charactersPaint);
        }
        if (this.cursorVisible && isEditable() && hasFocus()) {
            int min = Math.min(getSelectionStart(), this.digitsCount - 1);
            RectF rectF3 = this.rectBounds[min];
            float fontSpacing = this.charactersPaint.getFontSpacing();
            this.cursorRect.top = ((rectF3.height() / 2.0f) + rectF3.top) - (fontSpacing / 2.0f);
            RectF rectF4 = this.cursorRect;
            rectF4.bottom = rectF4.top + fontSpacing;
            float width = (rectF3.width() / 2.0f) + rectF3.left;
            int i2 = this.cursorWidth;
            rectF4.left = (width - (i2 / 2)) - this.pointSize;
            RectF rectF5 = this.cursorRect;
            rectF5.right = rectF5.left + i2;
            if (min < substring.length()) {
                String valueOf2 = String.valueOf(substring.charAt(min));
                this.charactersPaint.getTextBounds(valueOf2, 0, valueOf2.length(), this.textBoundsRect);
                int width2 = (this.textBoundsRect.width() / 2) + 1;
                RectF rectF6 = this.cursorRect;
                float f = rectF6.left;
                int i3 = this.pointSize;
                rectF6.left = f + width2 + i3;
                rectF6.right += width2 + i3;
            }
            canvas.drawRect(this.cursorRect, this.cursorPaint);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.redesignEnabled) {
            super.onMeasure(i, i2);
            return;
        }
        setMeasuredDimension(((int) ((this.oneCharacterSpace * this.digitsCount) + getPaddingLeft() + getPaddingRight())) + this.centralSpace, View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        float measuredHeight = getMeasuredHeight();
        int i3 = 0;
        float f = 0.0f;
        while (true) {
            int i4 = this.digitsCount;
            if (i3 >= i4) {
                return;
            }
            RectF rectF = this.rectBounds[i3];
            rectF.top = 0.0f;
            rectF.bottom = measuredHeight;
            rectF.left = f;
            float f2 = this.oneCharacterSpace;
            rectF.right = f + f2;
            f += f2;
            if (i4 == 6 && i3 == 2) {
                f += this.centralSpace;
            }
            i3++;
        }
    }

    public void setCode(String str) {
        setText(str);
        setSelection(Math.min(str.length(), this.digitsCount));
    }

    public void setCodeLength(int i) {
        if (i == this.digitsCount) {
            return;
        }
        this.digitsCount = i;
        this.rectBounds = new RectF[i];
        int i2 = 0;
        while (true) {
            RectF[] rectFArr = this.rectBounds;
            if (i2 >= rectFArr.length) {
                setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.digitsCount)});
                invalidate();
                return;
            } else {
                rectFArr[i2] = new RectF();
                i2++;
            }
        }
    }

    public void setEditable(boolean z) {
        this.editable = z;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        this.charactersPaint.setColor(i);
        invalidate();
    }

    private void notifyCodeChanged(String str, a aVar) {
        aVar.a(str, str.length() == this.digitsCount);
    }

    public ConfirmationCodeInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h2i0.Widget_AppCompat_EditText);
    }

    public ConfirmationCodeInput(Context context) {
        this(context, null);
    }
}
