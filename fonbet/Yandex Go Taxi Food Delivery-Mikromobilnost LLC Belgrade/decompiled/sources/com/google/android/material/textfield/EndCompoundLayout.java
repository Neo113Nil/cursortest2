package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import defpackage.dfz0;
import defpackage.hpy0;
import defpackage.ipy0;
import defpackage.jvh0;
import defpackage.jx81;
import defpackage.kxh0;
import defpackage.leh0;
import defpackage.ny61;
import defpackage.org0;
import defpackage.oyr;
import defpackage.pb60;
import defpackage.r3b1;
import defpackage.unr0;
import defpackage.vng;
import defpackage.z2i0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
class EndCompoundLayout extends LinearLayout {
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<ipy0> endIconChangedListeners;
    private final f endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final hpy0 onEditTextAttachedListener;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    public EndCompoundLayout(TextInputLayout textInputLayout, dfz0 dfz0Var) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().a();
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EndCompoundLayout.this.getEndIconDelegate().b();
            }
        };
        e eVar = new e(this);
        this.onEditTextAttachedListener = eVar;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton createIconView = createIconView(this, from, leh0.text_input_error_icon);
        this.errorIconView = createIconView;
        CheckableImageButton createIconView2 = createIconView(frameLayout, from, leh0.text_input_end_icon);
        this.endIconView = createIconView2;
        this.endIconDelegates = new f(this, dfz0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.suffixTextView = appCompatTextView;
        initErrorIconView(dfz0Var);
        initEndIconView(dfz0Var);
        initSuffixTextView(dfz0Var);
        frameLayout.addView(createIconView2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(createIconView);
        createIconView.setOnFocusableChangedListener(new d(this, 0));
        createIconView2.setOnFocusableChangedListener(new d(this, 1));
        textInputLayout.addOnEditTextAttachedListener(eVar);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null || !isAttachedToWindow()) {
            return;
        }
        this.accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(jvh0.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (jx81.z(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator<ipy0> it = this.endIconChangedListeners.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    private int getIconResId(g gVar) {
        int i = this.endIconDelegates.c;
        return i == 0 ? gVar.d() : i;
    }

    private void initEndIconView(dfz0 dfz0Var) {
        int i = z2i0.TextInputLayout_passwordToggleEnabled;
        TypedArray typedArray = dfz0Var.b;
        TypedArray typedArray2 = dfz0Var.b;
        if (!typedArray.hasValue(i)) {
            if (typedArray2.hasValue(z2i0.TextInputLayout_endIconTint)) {
                this.endIconTintList = jx81.n(getContext(), dfz0Var, z2i0.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(z2i0.TextInputLayout_endIconTintMode)) {
                this.endIconTintMode = com.google.android.material.internal.e.j(typedArray2.getInt(z2i0.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray2.hasValue(z2i0.TextInputLayout_endIconMode)) {
            setEndIconMode(typedArray2.getInt(z2i0.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(z2i0.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(typedArray2.getText(z2i0.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(typedArray2.getBoolean(z2i0.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(z2i0.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(z2i0.TextInputLayout_passwordToggleTint)) {
                this.endIconTintList = jx81.n(getContext(), dfz0Var, z2i0.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(z2i0.TextInputLayout_passwordToggleTintMode)) {
                this.endIconTintMode = com.google.android.material.internal.e.j(typedArray2.getInt(z2i0.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            setEndIconMode(typedArray2.getBoolean(z2i0.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconContentDescription(typedArray2.getText(z2i0.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(typedArray2.getDimensionPixelSize(z2i0.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(org0.mtrl_min_touch_target_size)));
        if (typedArray2.hasValue(z2i0.TextInputLayout_endIconScaleType)) {
            setEndIconScaleType(r3b1.c(typedArray2.getInt(z2i0.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void initErrorIconView(dfz0 dfz0Var) {
        int i = z2i0.TextInputLayout_errorIconTint;
        TypedArray typedArray = dfz0Var.b;
        TypedArray typedArray2 = dfz0Var.b;
        if (typedArray.hasValue(i)) {
            this.errorIconTintList = jx81.n(getContext(), dfz0Var, z2i0.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(z2i0.TextInputLayout_errorIconTintMode)) {
            this.errorIconTintMode = com.google.android.material.internal.e.j(typedArray2.getInt(z2i0.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray2.hasValue(z2i0.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(dfz0Var.b(z2i0.TextInputLayout_errorIconDrawable));
        }
        this.errorIconView.setContentDescription(getResources().getText(kxh0.error_icon_content_description));
        this.errorIconView.setImportantForAccessibility(2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setCheckable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(dfz0 dfz0Var) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(leh0.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.suffixTextView.setAccessibilityLiveRegion(1);
        setSuffixTextAppearance(dfz0Var.b.getResourceId(z2i0.TextInputLayout_suffixTextAppearance, 0));
        int i = z2i0.TextInputLayout_suffixTextColor;
        TypedArray typedArray = dfz0Var.b;
        if (typedArray.hasValue(i)) {
            setSuffixTextColor(dfz0Var.a(z2i0.TextInputLayout_suffixTextColor));
        }
        setSuffixText(typedArray.getText(z2i0.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, boolean z) {
        CheckableImageButton checkableImageButton = this.errorIconView;
        r3b1.g(checkableImageButton, checkableImageButton.getContentDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, boolean z) {
        r3b1.g(this.endIconView, getEndIconContentDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(g gVar) {
        if (this.editText == null) {
            return;
        }
        if (gVar.e() != null) {
            this.editText.setOnFocusChangeListener(gVar.e());
        }
        if (gVar.g() != null) {
            this.endIconView.setOnFocusChangeListener(gVar.g());
        }
    }

    private void setUpDelegate(g gVar) {
        gVar.q();
        this.touchExplorationStateChangeListener = gVar.h();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(g gVar) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        gVar.r();
    }

    private void tintEndIconOnError(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            r3b1.b(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            return;
        }
        Drawable mutate = getEndIconDrawable().mutate();
        mutate.setTint(this.textInputLayout.getErrorCurrentTextColors());
        this.endIconView.setImageDrawable(mutate);
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility((isEndIconVisible() || isErrorIconVisible() || !((this.suffixText == null || this.hintExpanded) ? 8 : false)) ? 0 : 8);
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().o(i == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    public void addOnEndIconChangedListener(ipy0 ipy0Var) {
        this.endIconChangedListeners.add(ipy0Var);
    }

    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public g getEndIconDelegate() {
        g bVar;
        f fVar = this.endIconDelegates;
        int i = this.endIconMode;
        SparseArray sparseArray = fVar.a;
        g gVar = (g) sparseArray.get(i);
        if (gVar != null) {
            return gVar;
        }
        EndCompoundLayout endCompoundLayout = fVar.b;
        if (i == -1) {
            bVar = new b(endCompoundLayout);
        } else if (i == 0) {
            bVar = new pb60(endCompoundLayout);
        } else if (i == 1) {
            bVar = new i(endCompoundLayout, fVar.d);
        } else if (i == 2) {
            bVar = new a(endCompoundLayout);
        } else {
            if (i != 3) {
                ny61.g(oyr.i(i, "Invalid end icon mode: "));
                return null;
            }
            bVar = new c(endCompoundLayout);
        }
        sparseArray.append(i, bVar);
        return bVar;
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public int getSuffixTextEndOffset() {
        return this.suffixTextView.getPaddingEnd() + getPaddingEnd() + ((isEndIconVisible() || isErrorIconVisible()) ? this.endIconView.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams()).getMarginStart() : 0);
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateSuffixTextVisibility();
    }

    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        g endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof c) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    public void refreshEndIconDrawableState() {
        r3b1.d(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        r3b1.d(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    public void refreshIconState(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        g endIconDelegate = getEndIconDelegate();
        boolean z3 = true;
        if (!endIconDelegate.j() || (isChecked = this.endIconView.isChecked()) == endIconDelegate.k()) {
            z2 = false;
        } else {
            this.endIconView.setChecked(!isChecked);
            z2 = true;
        }
        if (!(endIconDelegate instanceof c) || (isActivated = this.endIconView.isActivated()) == ((c) endIconDelegate).l) {
            z3 = z2;
        } else {
            setEndIconActivated(!isActivated);
        }
        if (z || z3) {
            refreshEndIconDrawableState();
        }
    }

    public void removeOnEndIconChangedListener(ipy0 ipy0Var) {
        this.endIconChangedListeners.remove(ipy0Var);
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
            r3b1.g(this.endIconView, charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            r3b1.b(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    public void setEndIconMinSize(int i) {
        if (i < 0) {
            ny61.g("endIconSize cannot be less than 0");
            return;
        }
        if (i != this.endIconMinSize) {
            this.endIconMinSize = i;
            CheckableImageButton checkableImageButton = this.endIconView;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = this.errorIconView;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        if (this.endIconMode == i) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        g endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconCheckable(endIconDelegate.j());
        if (!endIconDelegate.i(this.textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        setUpDelegate(endIconDelegate);
        setEndIconOnClickListener(endIconDelegate.f());
        setEndIconContentDescription(endIconDelegate.c());
        EditText editText = this.editText;
        if (editText != null) {
            endIconDelegate.l(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate);
        }
        r3b1.b(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
        refreshIconState(true);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.endIconView;
        View.OnLongClickListener onLongClickListener = this.endIconOnLongClickListener;
        checkableImageButton.setOnClickListener(onClickListener);
        r3b1.e(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        CheckableImageButton checkableImageButton = this.endIconView;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r3b1.e(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        this.endIconView.setScaleType(scaleType);
        this.errorIconView.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            r3b1.b(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            r3b1.b(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        EditText editText;
        if (isEndIconVisible() != z) {
            if (!z && this.endIconView.hasFocus() && (editText = this.editText) != null) {
                editText.requestFocus();
            }
            this.endIconView.setVisibility(z ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        r3b1.b(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.errorIconView;
        View.OnLongClickListener onLongClickListener = this.errorIconOnLongClickListener;
        checkableImageButton.setOnClickListener(onClickListener);
        r3b1.e(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        CheckableImageButton checkableImageButton = this.errorIconView;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r3b1.e(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            r3b1.b(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            r3b1.b(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? vng.t(i, getContext()) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        r3b1.b(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        r3b1.b(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int i) {
        this.suffixTextView.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void togglePasswordVisibilityToggle(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void updateSuffixTextViewPadding() {
        if (this.textInputLayout.editText == null) {
            return;
        }
        this.suffixTextView.setPaddingRelative(getContext().getResources().getDimensionPixelSize(org0.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : this.textInputLayout.editText.getPaddingEnd(), this.textInputLayout.editText.getPaddingBottom());
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? vng.t(i, getContext()) : null);
        refreshErrorIconDrawableState();
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? vng.t(i, getContext()) : null);
    }
}
