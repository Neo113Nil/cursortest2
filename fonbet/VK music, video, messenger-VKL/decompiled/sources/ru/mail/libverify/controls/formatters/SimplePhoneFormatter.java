package ru.mail.libverify.controls.formatters;

import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class SimplePhoneFormatter extends PhoneFormatter {
    private final TextView countryCode;

    public SimplePhoneFormatter(@NonNull EditText editText, @NonNull TextView textView) {
        super(editText, null, null);
        this.countryCode = textView;
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public String getCountryCodeValue() {
        return getDefaultCountryCodeValue(this.countryCode.getText());
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public boolean isFixedLineNumberBlockEnabled() {
        return false;
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public boolean isModifyPhoneNumberBlockEnabled() {
        return false;
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void onPhoneInfoChanged(String str) {
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public boolean phoneCheckRequired() {
        return false;
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void setCountryCodeValue(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.countryCode.setText(str);
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void onPhoneInfoChanged(String str, boolean z, boolean z2) {
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void onPhoneInfoChanged(boolean z, boolean z2) {
    }
}
