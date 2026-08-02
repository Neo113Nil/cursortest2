package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.widget.EditText;
import defpackage.hpy0;

/* loaded from: classes11.dex */
public final class e implements hpy0 {
    public final /* synthetic */ EndCompoundLayout a;

    public e(EndCompoundLayout endCompoundLayout) {
        this.a = endCompoundLayout;
    }

    public final void a(TextInputLayout textInputLayout) {
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        TextWatcher textWatcher;
        EditText editText6;
        TextWatcher textWatcher2;
        EditText editText7;
        EditText editText8;
        EndCompoundLayout endCompoundLayout = this.a;
        editText = endCompoundLayout.editText;
        if (editText == textInputLayout.getEditText()) {
            return;
        }
        editText2 = endCompoundLayout.editText;
        if (editText2 != null) {
            editText6 = endCompoundLayout.editText;
            textWatcher2 = endCompoundLayout.editTextWatcher;
            editText6.removeTextChangedListener(textWatcher2);
            editText7 = endCompoundLayout.editText;
            if (editText7.getOnFocusChangeListener() == endCompoundLayout.getEndIconDelegate().e()) {
                editText8 = endCompoundLayout.editText;
                editText8.setOnFocusChangeListener(null);
            }
        }
        endCompoundLayout.editText = textInputLayout.getEditText();
        editText3 = endCompoundLayout.editText;
        if (editText3 != null) {
            editText5 = endCompoundLayout.editText;
            textWatcher = endCompoundLayout.editTextWatcher;
            editText5.addTextChangedListener(textWatcher);
        }
        g endIconDelegate = endCompoundLayout.getEndIconDelegate();
        editText4 = endCompoundLayout.editText;
        endIconDelegate.l(editText4);
        endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
    }
}
