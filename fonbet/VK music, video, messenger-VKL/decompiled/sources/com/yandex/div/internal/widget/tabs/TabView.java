package com.yandex.div.internal.widget.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightTextView;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.eu;
import xsna.iut0;
import xsna.ptn0;

/* loaded from: classes7.dex */
public final class TabView extends SuperLineHeightTextView {

    @Nullable
    private DivTypefaceType mActiveTypefaceType;
    private boolean mBoldTextOnSelection;
    private boolean mEllipsizeEnabled;

    @Nullable
    private DivTypefaceType mInactiveTypefaceType;

    @Nullable
    private InputFocusTracker mInputFocusTracker;
    private boolean mIsActiveType;

    @NonNull
    private MaxWidthProvider mMaxWidthProvider;

    @Nullable
    private OnUpdateListener mOnUpdateListener;

    @Nullable
    private BaseIndicatorTabLayout.Tab mTab;
    private int mTextAppearance;

    @Nullable
    private DivTypefaceProvider mTypefaceProvider;

    public interface MaxWidthProvider {
        int getMaxWidth();
    }

    public interface OnUpdateListener {
    }

    public TabView(@NonNull Context context) {
        this(context, null);
    }

    @SuppressLint({"WrongCall"})
    private void fixTextEllipsis(int i, int i2) {
        BaseIndicatorTabLayout.Tab tab;
        CharSequence text;
        TextPaint paint;
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (tab = this.mTab) == null || (text = tab.getText()) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            text = transformationMethod.getTransformation(text, this);
        }
        if (text == null) {
            return;
        }
        setText(TextUtils.ellipsize(text, paint, ((int) layout.getLineMax(0)) - paint.measureText("..."), TextUtils.TruncateAt.END));
        super.onMeasure(i, i2);
    }

    @Nullable
    private Typeface getDefaultTypeface() {
        DivTypefaceProvider divTypefaceProvider = this.mTypefaceProvider;
        if (divTypefaceProvider != null) {
            if (this.mIsActiveType) {
                DivTypefaceType divTypefaceType = this.mActiveTypefaceType;
                if (divTypefaceType != null) {
                    return divTypefaceType.getTypeface(divTypefaceProvider);
                }
            } else {
                DivTypefaceType divTypefaceType2 = this.mInactiveTypefaceType;
                if (divTypefaceType2 != null) {
                    return divTypefaceType2.getTypeface(divTypefaceProvider);
                }
            }
        }
        if (divTypefaceProvider != null) {
            return divTypefaceProvider.getMedium();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0() {
        return Integer.MAX_VALUE;
    }

    private void setupTypeface() {
        if (isSelected()) {
            return;
        }
        setTextAppearance(getContext(), this.mTextAppearance);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return eu.c.class.getName();
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Typeface defaultTypeface;
        TextPaint paint = getPaint();
        if (paint != null && (defaultTypeface = getDefaultTypeface()) != null) {
            paint.setTypeface(defaultTypeface);
        }
        if (!this.mEllipsizeEnabled) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int maxWidth = this.mMaxWidthProvider.getMaxWidth();
        if (maxWidth > 0 && (mode == 0 || size > maxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        fixTextEllipsis(i, i2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        InputFocusTracker inputFocusTracker = this.mInputFocusTracker;
        if (inputFocusTracker != null) {
            BaseDivViewExtensionsKt.clearFocusOnClick(this, inputFocusTracker);
        }
        BaseIndicatorTabLayout.Tab tab = this.mTab;
        if (tab == null) {
            return performClick;
        }
        tab.select();
        return true;
    }

    public void reset() {
        setTab(null);
        setSelected(false);
    }

    public void setActiveTypefaceType(@Nullable DivTypefaceType divTypefaceType) {
        this.mActiveTypefaceType = divTypefaceType;
    }

    public void setBoldTextOnSelection(boolean z) {
        this.mBoldTextOnSelection = z;
    }

    public void setEllipsizeEnabled(boolean z) {
        this.mEllipsizeEnabled = z;
        setEllipsize(z ? TextUtils.TruncateAt.END : null);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.2f);
    }

    public void setInactiveTypefaceType(@Nullable DivTypefaceType divTypefaceType) {
        this.mInactiveTypefaceType = divTypefaceType;
    }

    public void setInputFocusTracker(InputFocusTracker inputFocusTracker) {
        this.mInputFocusTracker = inputFocusTracker;
    }

    public void setMaxWidthProvider(@NonNull MaxWidthProvider maxWidthProvider) {
        this.mMaxWidthProvider = maxWidthProvider;
    }

    public void setOnUpdateListener(@Nullable OnUpdateListener onUpdateListener) {
        this.mOnUpdateListener = onUpdateListener;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        setTypefaceType(z);
        if (this.mBoldTextOnSelection && z2) {
            setupTypeface();
        }
    }

    public void setTab(@Nullable BaseIndicatorTabLayout.Tab tab) {
        if (tab != this.mTab) {
            this.mTab = tab;
            update();
        }
    }

    public void setTabPadding(int i, int i2, int i3, int i4) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setPaddingRelative(i, i2, i3, i4);
    }

    public void setTextColorList(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTextTypeface(@Nullable DivTypefaceProvider divTypefaceProvider, int i) {
        this.mTypefaceProvider = divTypefaceProvider;
        this.mTextAppearance = i;
        setupTypeface();
    }

    public void setTypefaceType(boolean z) {
        boolean z2 = this.mIsActiveType != z;
        this.mIsActiveType = z;
        if (z2) {
            requestLayout();
        }
    }

    public void update() {
        BaseIndicatorTabLayout.Tab tab = this.mTab;
        setText(tab == null ? null : tab.getText());
        OnUpdateListener onUpdateListener = this.mOnUpdateListener;
        if (onUpdateListener != null) {
            ((c) onUpdateListener).a.onTabViewUpdated(this);
        }
    }

    public TabView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxWidthProvider = new f();
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new ptn0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(View view) {
    }
}
