package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.DecimalFormat;
import java.text.ParseException;

/* compiled from: NumberTextWatcher.java */
/* loaded from: classes3.dex */
public final class in70 implements TextWatcher {
    public DecimalFormat b;
    public EditText c;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DecimalFormat decimalFormat = this.b;
        EditText editText = this.c;
        editText.removeTextChangedListener(this);
        try {
            int length = editText.getText().length();
            Number parse = decimalFormat.parse(editable.toString().replace(String.valueOf(decimalFormat.getDecimalFormatSymbols().getGroupingSeparator()), ""));
            int selectionStart = editText.getSelectionStart();
            editText.setText(decimalFormat.format(parse));
            int length2 = (editText.getText().length() - length) + selectionStart;
            if (length2 <= 0 || length2 > editText.getText().length()) {
                editText.setSelection(editText.getText().length() - 1);
            } else {
                editText.setSelection(length2);
            }
        } catch (NumberFormatException | ParseException unused) {
        }
        editText.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
