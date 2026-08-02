package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;

/* compiled from: SuperLineHeightTextView.kt */
/* loaded from: classes7.dex */
public class SuperLineHeightTextView extends AppCompatTextView implements FixedLineHeightView {
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean isTightenWidth;

    public SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
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

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
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
        int min = Math.min(getLineCount(), getMaxLines());
        if (fixedLineHeightHelper.getLineHeight() != -1 && !ViewsKt.isExact(i2)) {
            textView = fixedLineHeightHelper.view;
            if (min >= textView.getLineCount()) {
                i4 = fixedLineHeightHelper.textPaddingTop;
                i5 = fixedLineHeightHelper.textPaddingBottom;
                i3 = i5 + i4;
            } else {
                i3 = 0;
            }
            textView2 = fixedLineHeightHelper.view;
            int textHeight = TextViewsKt.textHeight(textView2, min) + i3;
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
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && this.isTightenWidth && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -3 && divLayoutParams.getMaxWidth() != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i6 = 0; i6 < lineCount; i6++) {
                f = Math.max(f, getLayout().getLineWidth(i6));
            }
            int ceil = (int) Math.ceil(f + getCompoundPaddingRight() + getCompoundPaddingLeft());
            if (ceil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(ceil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i) {
        this.fixedLineHeightHelper.setLineHeight(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }

    public final void setTightenWidth(boolean z) {
        boolean z2 = this.isTightenWidth;
        this.isTightenWidth = z;
        if (z2 != z) {
            requestLayout();
        }
    }
}
