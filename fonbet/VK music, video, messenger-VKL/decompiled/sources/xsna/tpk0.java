package xsna;

import android.annotation.SuppressLint;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class tpk0 extends LinearLayout {
    public final TextInputLayout b;
    public final AppCompatTextView c;

    @Nullable
    public CharSequence d;
    public final CheckableImageButton e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public int h;

    @NonNull
    public ImageView.ScaleType i;
    public View.OnLongClickListener j;
    public boolean k;

    public tpk0(TextInputLayout textInputLayout, yyo0 yyo0Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.e = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.c = appCompatTextView;
        if (qm10.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.j;
        checkableImageButton.setOnClickListener(null);
        hqv.d(checkableImageButton, onLongClickListener);
        this.j = null;
        checkableImageButton.setOnLongClickListener(null);
        hqv.d(checkableImageButton, null);
        int i = R$styleable.TextInputLayout_startIconTint;
        TypedArray typedArray = yyo0Var.b;
        if (typedArray.hasValue(i)) {
            this.f = qm10.b(getContext(), yyo0Var, R$styleable.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_startIconTintMode)) {
            this.g = t1u0.e(typedArray.getInt(R$styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_startIconDrawable)) {
            b(yyo0Var.b(R$styleable.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(R$styleable.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(R$styleable.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(R$styleable.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.h) {
            this.h = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType b = hqv.b(typedArray.getInt(R$styleable.TextInputLayout_startIconScaleType, -1));
            this.i = b;
            checkableImageButton.setScaleType(b);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R$id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(R$styleable.TextInputLayout_prefixTextAppearance, 0));
        if (typedArray.hasValue(R$styleable.TextInputLayout_prefixTextColor)) {
            appCompatTextView.setTextColor(yyo0Var.a(R$styleable.TextInputLayout_prefixTextColor));
        }
        CharSequence text2 = typedArray.getText(R$styleable.TextInputLayout_prefixText);
        this.d = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.e;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return this.c.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(@Nullable Drawable drawable) {
        CheckableImageButton checkableImageButton = this.e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f;
            PorterDuff.Mode mode = this.g;
            TextInputLayout textInputLayout = this.b;
            hqv.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            hqv.c(textInputLayout, checkableImageButton, this.f);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.j;
        checkableImageButton.setOnClickListener(null);
        hqv.d(checkableImageButton, onLongClickListener);
        this.j = null;
        checkableImageButton.setOnLongClickListener(null);
        hqv.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.e;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.b.e;
        if (editText == null) {
            return;
        }
        if (this.e.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
        this.c.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.d == null || this.k) ? 8 : 0;
        setVisibility((this.e.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.c.setVisibility(i);
        this.b.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
