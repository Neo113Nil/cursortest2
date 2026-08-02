package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ce0;
import defpackage.eng0;
import defpackage.iog0;
import defpackage.jvh0;
import defpackage.leh0;
import defpackage.vez0;
import defpackage.z610;
import java.util.Arrays;

/* loaded from: classes11.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    private final Chip chip;
    private CharSequence chipText;
    private final EditText editText;
    private final AccessibilityDelegateCompat editTextAccessibilityDelegate;
    private boolean hasError;
    private TextView label;
    private ColorStateList originalChipBackgroundColor;
    private int originalChipStrokeColor;
    private ColorStateList originalChipTextColor;
    private ColorStateList originalEditTextColor;
    private ColorStateList originalEditTextCursorColor;
    private ColorStateList originalLabelColor;
    private final TextInputLayout textInputLayout;
    private TextWatcher watcher;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.chipText = "";
        this.hasError = false;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(jvh0.material_time_chip, (ViewGroup) this, false);
        this.chip = chip;
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(jvh0.material_time_input, (ViewGroup) this, false);
        this.textInputLayout = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.editText = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter(this, null);
        this.watcher = textFormatter;
        editText.addTextChangedListener(textFormatter);
        updateHintLocales();
        addView(chip);
        addView(textInputLayout);
        this.label = (TextView) findViewById(leh0.material_label);
        editText.setId(View.generateViewId());
        this.label.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
        this.editTextAccessibilityDelegate = new a(this);
    }

    private void applyErrorColors() {
        this.originalChipBackgroundColor = this.chip.getChipBackgroundColor();
        this.originalChipTextColor = this.chip.getTextColors();
        this.originalEditTextColor = this.editText.getTextColors();
        this.originalLabelColor = this.label.getTextColors();
        this.originalChipStrokeColor = this.textInputLayout.getBoxStrokeColor();
        int T = vez0.T(getContext(), z610.e(iog0.colorError, this));
        ColorStateList z = vez0.z(eng0.colorErrorContainer, getContext());
        ColorStateList z2 = vez0.z(eng0.colorOnErrorContainer, getContext());
        if (z == null || z2 == null) {
            return;
        }
        this.chip.setChipBackgroundColor(z);
        this.chip.setTextColor(z2);
        this.editText.setTextColor(z2);
        this.textInputLayout.setBoxStrokeColor(T);
        this.label.setTextColor(T);
        this.originalEditTextCursorColor = this.textInputLayout.getCursorColor();
        this.textInputLayout.setCursorColor(z2);
    }

    private void clearErrorColors() {
        this.chip.setChipBackgroundColor(this.originalChipBackgroundColor);
        this.chip.setTextColor(this.originalChipTextColor);
        this.editText.setTextColor(this.originalEditTextColor);
        this.textInputLayout.setBoxStrokeColor(this.originalChipStrokeColor);
        this.label.setTextColor(this.originalLabelColor);
        this.textInputLayout.setCursorColor(this.originalEditTextCursorColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatText(CharSequence charSequence) {
        return TimeModel.formatText(getResources(), charSequence);
    }

    private void updateHintLocales() {
        this.editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void addInputFilter(InputFilter inputFilter) {
        InputFilter[] filters = this.editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.editText.setFilters(inputFilterArr);
    }

    public CharSequence getChipText() {
        return this.chipText;
    }

    public TextInputLayout getTextInput() {
        return this.textInputLayout;
    }

    public boolean hasError() {
        return this.hasError;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.chip.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateHintLocales();
    }

    public void requestAccessibilityFocus() {
        if (this.editText.getVisibility() == 0) {
            this.editText.sendAccessibilityEvent(8);
        } else {
            this.chip.sendAccessibilityEvent(8);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.chip.setChecked(z);
        Chip chip = this.chip;
        if (z) {
            chip.setText("");
            this.chip.setImportantForAccessibility(2);
        } else {
            chip.setText(this.chipText);
            this.chip.setImportantForAccessibility(1);
        }
        this.editText.setVisibility(z ? 0 : 4);
        if (isChecked()) {
            EditText editText = this.editText;
            editText.requestFocus();
            editText.post(new ce0(editText, 28));
        }
    }

    public void setChipDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        androidx.core.view.b.p(this.chip, accessibilityDelegateCompat);
    }

    public void setCursorVisible(boolean z) {
        this.editText.setCursorVisible(z);
    }

    public void setError(boolean z) {
        if (this.hasError == z) {
            return;
        }
        this.hasError = z;
        if (z) {
            applyErrorColors();
        } else {
            clearErrorColors();
        }
    }

    public void setHelperText(CharSequence charSequence) {
        this.label.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.chip.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.chip.setTag(i, obj);
    }

    public void setText(CharSequence charSequence) {
        String formatText = formatText(charSequence);
        this.chipText = formatText;
        this.chip.setText(formatText);
        if (TextUtils.isEmpty(formatText)) {
            return;
        }
        this.editText.removeTextChangedListener(this.watcher);
        this.editText.setText(formatText);
        androidx.core.view.b.p(this.editText, this.editTextAccessibilityDelegate);
        this.editText.addTextChangedListener(this.watcher);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.chip.toggle();
    }

    public class TextFormatter extends TextWatcherAdapter {
        private static final String DEFAULT_TEXT = "00";

        private TextFormatter() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.chipText = chipTextInputComboView.formatText(DEFAULT_TEXT);
                return;
            }
            String formatText = chipTextInputComboView.formatText(editable);
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            if (TextUtils.isEmpty(formatText)) {
                formatText = ChipTextInputComboView.this.formatText(DEFAULT_TEXT);
            }
            chipTextInputComboView2.chipText = formatText;
        }

        public /* synthetic */ TextFormatter(ChipTextInputComboView chipTextInputComboView, a aVar) {
            this();
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }
}
