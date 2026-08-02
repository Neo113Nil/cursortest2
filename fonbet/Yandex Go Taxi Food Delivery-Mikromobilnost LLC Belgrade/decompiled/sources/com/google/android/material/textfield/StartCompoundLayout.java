package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.dfz0;
import defpackage.jvh0;
import defpackage.jx81;
import defpackage.leh0;
import defpackage.ny61;
import defpackage.org0;
import defpackage.r3b1;
import defpackage.wh;
import defpackage.z2i0;

/* loaded from: classes11.dex */
class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout textInputLayout, dfz0 dfz0Var) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(jvh0.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(dfz0Var);
        initPrefixTextView(dfz0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
        checkableImageButton.setOnFocusableChangedListener(new d(this, 2));
    }

    private void initPrefixTextView(dfz0 dfz0Var) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(leh0.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.prefixTextView.setAccessibilityLiveRegion(1);
        setPrefixTextAppearance(dfz0Var.b.getResourceId(z2i0.TextInputLayout_prefixTextAppearance, 0));
        int i = z2i0.TextInputLayout_prefixTextColor;
        TypedArray typedArray = dfz0Var.b;
        if (typedArray.hasValue(i)) {
            setPrefixTextColor(dfz0Var.a(z2i0.TextInputLayout_prefixTextColor));
        }
        setPrefixText(typedArray.getText(z2i0.TextInputLayout_prefixText));
    }

    private void initStartIconView(dfz0 dfz0Var) {
        if (jx81.z(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i = z2i0.TextInputLayout_startIconTint;
        TypedArray typedArray = dfz0Var.b;
        TypedArray typedArray2 = dfz0Var.b;
        if (typedArray.hasValue(i)) {
            this.startIconTintList = jx81.n(getContext(), dfz0Var, z2i0.TextInputLayout_startIconTint);
        }
        if (typedArray2.hasValue(z2i0.TextInputLayout_startIconTintMode)) {
            this.startIconTintMode = com.google.android.material.internal.e.j(typedArray2.getInt(z2i0.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray2.hasValue(z2i0.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(dfz0Var.b(z2i0.TextInputLayout_startIconDrawable));
            if (typedArray2.hasValue(z2i0.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(typedArray2.getText(z2i0.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(typedArray2.getBoolean(z2i0.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(typedArray2.getDimensionPixelSize(z2i0.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(org0.mtrl_min_touch_target_size)));
        if (typedArray2.hasValue(z2i0.TextInputLayout_startIconScaleType)) {
            setStartIconScaleType(r3b1.c(typedArray2.getInt(z2i0.TextInputLayout_startIconScaleType, -1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, boolean z) {
        r3b1.g(this.startIconView, getStartIconContentDescription());
    }

    private void updateVisibility() {
        int i = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility((this.startIconView.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.prefixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public int getPrefixTextStartOffset() {
        int i;
        if (isStartIconVisible()) {
            i = ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).getMarginEnd() + this.startIconView.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.prefixTextView.getPaddingStart() + getPaddingStart() + i;
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateVisibility();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePrefixTextViewPadding();
    }

    public void refreshStartIconDrawableState() {
        r3b1.d(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public void setPrefixTextAppearance(int i) {
        this.prefixTextView.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
            r3b1.g(this.startIconView, charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            r3b1.b(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    public void setStartIconMinSize(int i) {
        if (i < 0) {
            ny61.g("startIconSize cannot be less than 0");
        } else if (i != this.startIconMinSize) {
            this.startIconMinSize = i;
            CheckableImageButton checkableImageButton = this.startIconView;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.startIconView;
        View.OnLongClickListener onLongClickListener = this.startIconOnLongClickListener;
        checkableImageButton.setOnClickListener(onClickListener);
        r3b1.e(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        CheckableImageButton checkableImageButton = this.startIconView;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r3b1.e(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        this.startIconView.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            r3b1.b(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            r3b1.b(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        EditText editText;
        if (isStartIconVisible() != z) {
            if (!z && this.startIconView.hasFocus() && (editText = this.textInputLayout.getEditText()) != null) {
                editText.requestFocus();
            }
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    public void setupAccessibilityNodeInfo(wh whVar) {
        if (this.prefixTextView.getVisibility() != 0) {
            whVar.F(this.startIconView);
            return;
        }
        whVar.a.setLabelFor(this.prefixTextView);
        whVar.F(this.prefixTextView);
    }

    public void updatePrefixTextViewPadding() {
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        this.prefixTextView.setPaddingRelative(isStartIconVisible() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(org0.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
