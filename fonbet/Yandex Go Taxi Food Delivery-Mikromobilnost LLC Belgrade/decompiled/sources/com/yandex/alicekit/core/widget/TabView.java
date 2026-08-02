package com.yandex.alicekit.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.g5x0;
import defpackage.i5x0;
import defpackage.il51;
import defpackage.ml51;
import defpackage.mp11;
import defpackage.od8;
import defpackage.s2u0;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class TabView extends AppCompatTextView {
    private static final String ELLIPSIS_PLACEHOLDER_TO_MEASURE_WIDTH = "...";
    private boolean mBoldTextOnSelection;
    private TypefaceType mDefaultTypefaceType;
    private boolean mEllipsizeEnabled;
    private g5x0 mMaxWidthProvider;
    private i5x0 mOnUpdateListener;
    private ml51 mTab;
    private int mTextAppearance;
    private mp11 mTypefaceProvider;

    public TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxWidthProvider = new s2u0(6);
        setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new od8(8));
    }

    private void fixTextEllipsis(int i, int i2) {
        ml51 ml51Var;
        CharSequence charSequence;
        TextPaint paint;
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (ml51Var = this.mTab) == null || (charSequence = ml51Var.a) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        if (charSequence == null) {
            return;
        }
        setText(TextUtils.ellipsize(charSequence, paint, ((int) layout.getLineMax(0)) - paint.measureText(ELLIPSIS_PLACEHOLDER_TO_MEASURE_WIDTH), TextUtils.TruncateAt.END));
        super.onMeasure(i, i2);
    }

    private Typeface getDefaultTypeface() {
        TypefaceType typefaceType;
        mp11 mp11Var = this.mTypefaceProvider;
        if (mp11Var != null && (typefaceType = this.mDefaultTypefaceType) != null) {
            int ordinal = typefaceType.ordinal();
            return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? mp11Var.a() : mp11Var.getLight() : mp11Var.c() : mp11Var.b();
        }
        if (mp11Var != null) {
            return mp11Var.b();
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ActionBar.a.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ActionBar.a.class.getName());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
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
        ml51 ml51Var = this.mTab;
        if (ml51Var == null) {
            return performClick;
        }
        ml51Var.a();
        return true;
    }

    public void reset() {
        setTab(null);
        setSelected(false);
    }

    public void setBoldTextOnSelection(boolean z) {
        this.mBoldTextOnSelection = z;
    }

    public void setDefaultTypefaceType(TypefaceType typefaceType) {
        this.mDefaultTypefaceType = typefaceType;
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

    public void setMaxWidthProvider(g5x0 g5x0Var) {
        this.mMaxWidthProvider = g5x0Var;
    }

    public void setOnUpdateListener(i5x0 i5x0Var) {
        this.mOnUpdateListener = i5x0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (this.mBoldTextOnSelection && z2) {
            setupTypeface();
        }
        if (z2 && z) {
            sendAccessibilityEvent(4);
        }
    }

    public void setTab(ml51 ml51Var) {
        if (ml51Var != this.mTab) {
            this.mTab = ml51Var;
            update();
        }
    }

    public void setTabPadding(int i, int i2, int i3, int i4) {
        WeakHashMap weakHashMap = b.a;
        setPaddingRelative(i, i2, i3, i4);
    }

    public void setTextColorList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTextTypeface(mp11 mp11Var, int i) {
        this.mTypefaceProvider = mp11Var;
        this.mTextAppearance = i;
        setupTypeface();
    }

    public void update() {
        ml51 ml51Var = this.mTab;
        setText(ml51Var == null ? null : ml51Var.a);
        i5x0 i5x0Var = this.mOnUpdateListener;
        if (i5x0Var != null) {
            ((il51) i5x0Var).a.onTabViewUpdated(this);
        }
    }

    public TabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabView(Context context) {
        this(context, null);
    }
}
