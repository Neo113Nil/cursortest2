package com.yandex.passport.internal.ui.util;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;

/* loaded from: classes2.dex */
public class ShowHidePasswordClickListener implements View.OnClickListener {
    private final EditText editText;

    public ShowHidePasswordClickListener(EditText editText) {
        this.editText = editText;
    }

    private void changeVisibility(Checkable checkable, boolean z) {
        checkable.setChecked(z);
        int selectionStart = this.editText.getSelectionStart();
        boolean isChecked = checkable.isChecked();
        EditText editText = this.editText;
        if (isChecked) {
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        this.editText.setSelection(selectionStart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        changeVisibility((Checkable) view, !r2.isChecked());
    }
}
