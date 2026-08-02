package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.internal.widget.SuperLineHeightTextView;
import defpackage.e5x0;
import defpackage.f5x0;
import defpackage.h5x0;
import defpackage.jzv;
import defpackage.lml;
import defpackage.p25;
import defpackage.r25;
import defpackage.yci0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class TabView extends SuperLineHeightTextView {
    private static final String ELLIPSIS_PLACEHOLDER_TO_MEASURE_WIDTH = "...";
    private DivTypefaceType mActiveTypefaceType;
    private Integer mActiveTypefaceWeight;
    private boolean mBoldTextOnSelection;
    private boolean mEllipsizeEnabled;
    private DivTypefaceType mInactiveTypefaceType;
    private Integer mInactiveTypefaceWeight;
    private jzv mInputFocusTracker;
    private boolean mIsActiveType;
    private f5x0 mMaxWidthProvider;
    private h5x0 mOnUpdateListener;
    private r25 mTab;
    private int mTextAppearance;
    private lml mTypefaceProvider;

    public TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxWidthProvider = new yci0();
        setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new e5x0());
    }

    private void fixTextEllipsis(int i, int i2) {
        r25 r25Var;
        CharSequence h;
        TextPaint paint;
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (r25Var = this.mTab) == null || (h = r25Var.h()) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            h = transformationMethod.getTransformation(h, this);
        }
        if (h == null) {
            return;
        }
        setText(TextUtils.ellipsize(h, paint, ((int) layout.getLineMax(0)) - paint.measureText(ELLIPSIS_PLACEHOLDER_TO_MEASURE_WIDTH), TextUtils.TruncateAt.END));
        super.onMeasure(i, i2);
    }

    private Typeface getDefaultTypeface() {
        if (this.mTypefaceProvider != null) {
            if (this.mIsActiveType) {
                Integer num = this.mActiveTypefaceWeight;
                if (num != null && num.intValue() > 0) {
                    return this.mTypefaceProvider.d(this.mActiveTypefaceWeight.intValue());
                }
                DivTypefaceType divTypefaceType = this.mActiveTypefaceType;
                if (divTypefaceType != null) {
                    return divTypefaceType.a(this.mTypefaceProvider);
                }
            } else {
                Integer num2 = this.mInactiveTypefaceWeight;
                if (num2 != null && num2.intValue() > 0) {
                    return this.mTypefaceProvider.d(this.mInactiveTypefaceWeight.intValue());
                }
                DivTypefaceType divTypefaceType2 = this.mInactiveTypefaceType;
                if (divTypefaceType2 != null) {
                    return divTypefaceType2.a(this.mTypefaceProvider);
                }
            }
        }
        lml lmlVar = this.mTypefaceProvider;
        if (lmlVar != null) {
            return lmlVar.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0() {
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(View view) {
    }

    private void setupTypeface() {
        if (isSelected()) {
            return;
        }
        setTextAppearance(getContext(), this.mTextAppearance);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ActionBar.a.class.getName();
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
        jzv jzvVar = this.mInputFocusTracker;
        if (jzvVar != null) {
            com.yandex.div.core.view2.divs.a.m(this, jzvVar);
        }
        r25 r25Var = this.mTab;
        if (r25Var == null) {
            return performClick;
        }
        r25Var.i();
        return true;
    }

    public void reset() {
        setTab(null);
        setSelected(false);
    }

    public void setActiveTypefaceType(DivTypefaceType divTypefaceType) {
        this.mActiveTypefaceType = divTypefaceType;
    }

    public void setActiveTypefaceWeight(Integer num) {
        this.mActiveTypefaceWeight = num;
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

    public void setInactiveTypefaceType(DivTypefaceType divTypefaceType) {
        this.mInactiveTypefaceType = divTypefaceType;
    }

    public void setInactiveTypefaceWeight(Integer num) {
        this.mInactiveTypefaceWeight = num;
    }

    public void setInputFocusTracker(jzv jzvVar) {
        this.mInputFocusTracker = jzvVar;
    }

    public void setMaxWidthProvider(f5x0 f5x0Var) {
        this.mMaxWidthProvider = f5x0Var;
    }

    public void setOnUpdateListener(h5x0 h5x0Var) {
        this.mOnUpdateListener = h5x0Var;
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

    public void setTab(r25 r25Var) {
        if (r25Var != this.mTab) {
            this.mTab = r25Var;
            update();
        }
    }

    public void setTabPadding(int i, int i2, int i3, int i4) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        setPaddingRelative(i, i2, i3, i4);
    }

    public void setTextColorList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTextTypeface(lml lmlVar, int i) {
        this.mTypefaceProvider = lmlVar;
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
        r25 r25Var = this.mTab;
        setText(r25Var == null ? null : r25Var.h());
        h5x0 h5x0Var = this.mOnUpdateListener;
        if (h5x0Var != null) {
            ((p25) h5x0Var).a(this);
        }
    }

    public TabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabView(Context context) {
        this(context, null);
    }
}
