package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;

/* compiled from: SuperLineHeightEditText.kt */
/* loaded from: classes7.dex */
public class SuperLineHeightEditText extends AppCompatEditText implements FixedLineHeightView {
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean horizontalScrollingEnabled;
    private boolean isDisallowInterceptTouchEvent;
    private boolean isTextFitting;

    public SuperLineHeightEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isTextFitting = true;
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    private final boolean getInterceptTouchEventNeeded() {
        return (this.horizontalScrollingEnabled || this.isTextFitting) ? false : true;
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    private final void requestDisallowInterceptTouchEvent(boolean z) {
        this.isDisallowInterceptTouchEvent = z;
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    private final void updateFittingText(int i) {
        if (getLayout() == null || i == 0) {
            return;
        }
        this.isTextFitting = (i - getCompoundPaddingTop()) - getCompoundPaddingBottom() >= TextViewsKt.textHeight(this, getLayout().getLineCount());
    }

    public static /* synthetic */ void updateFittingText$default(SuperLineHeightEditText superLineHeightEditText, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateFittingText");
        }
        if ((i2 & 1) != 0) {
            i = superLineHeightEditText.getHeight();
        }
        superLineHeightEditText.updateFittingText(i);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return this.fixedLineHeightHelper.getExtraPaddingBottom() + super.getCompoundPaddingBottom();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return this.fixedLineHeightHelper.getExtraPaddingTop() + super.getCompoundPaddingTop();
    }

    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.getLineHeight();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        TextView textView;
        int i3;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        int i4;
        int i5;
        super.onMeasure(i, i2);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        int maxLines = getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
        if (fixedLineHeightHelper.getLineHeight() == -1 || ViewsKt.isExact(i2)) {
            return;
        }
        textView = fixedLineHeightHelper.view;
        if (maxLines >= textView.getLineCount()) {
            i4 = fixedLineHeightHelper.textPaddingTop;
            i5 = fixedLineHeightHelper.textPaddingBottom;
            i3 = i5 + i4;
        } else {
            i3 = 0;
        }
        textView2 = fixedLineHeightHelper.view;
        int textHeight = TextViewsKt.textHeight(textView2, maxLines) + i3;
        textView3 = fixedLineHeightHelper.view;
        int paddingTop = textView3.getPaddingTop() + textHeight;
        textView4 = fixedLineHeightHelper.view;
        int paddingBottom = textView4.getPaddingBottom() + paddingTop;
        textView5 = fixedLineHeightHelper.view;
        int minimumHeight = textView5.getMinimumHeight();
        if (paddingBottom < minimumHeight) {
            paddingBottom = minimumHeight;
        }
        super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? ViewsKt.makeAtMostSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2))) : ViewsKt.makeExactSpec(paddingBottom));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateFittingText(i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        updateFittingText$default(this, 0, 1, null);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!getInterceptTouchEventNeeded()) {
            if (this.isDisallowInterceptTouchEvent) {
                requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i) {
        this.fixedLineHeightHelper.setLineHeight(i);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z) {
        this.horizontalScrollingEnabled = z;
        super.setHorizontallyScrolling(z);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }
}
