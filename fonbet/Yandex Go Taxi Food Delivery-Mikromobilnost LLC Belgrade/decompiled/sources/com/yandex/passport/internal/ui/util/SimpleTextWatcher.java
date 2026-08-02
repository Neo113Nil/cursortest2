package com.yandex.passport.internal.ui.util;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public class SimpleTextWatcher implements TextWatcher {
    private final com.yandex.passport.legacy.lx.a action;

    public SimpleTextWatcher(com.yandex.passport.legacy.lx.a aVar) {
        this.action = aVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.action.mo290a(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
