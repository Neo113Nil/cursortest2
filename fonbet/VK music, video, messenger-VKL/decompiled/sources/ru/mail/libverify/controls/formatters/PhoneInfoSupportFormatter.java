package ru.mail.libverify.controls.formatters;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import java.util.Locale;
import ru.mail.libverify.api.VerificationApi;

/* loaded from: classes9.dex */
public abstract class PhoneInfoSupportFormatter extends PhoneFormatter {
    protected final TextView countryCode;
    protected final TextView phoneInfo;
    private boolean phoneNumberValid;

    public PhoneInfoSupportFormatter(@NonNull TextView textView, @NonNull EditText editText, @NonNull TextView textView2, @NonNull String str, @NonNull VerificationApi.PhoneNumberCheckSession phoneNumberCheckSession) {
        super(editText, str, phoneNumberCheckSession);
        this.countryCode = textView;
        this.phoneInfo = textView2;
        textView.addTextChangedListener(new TextWatcher() { // from class: ru.mail.libverify.controls.formatters.PhoneInfoSupportFormatter.1
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                PhoneInfoSupportFormatter.this.update();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    private void updateDoneButton() {
        onButtonStateChanged((TextUtils.isEmpty(this.countryCode.getText()) || TextUtils.isEmpty(this.phoneNumber.getText()) || !this.phoneNumberValid) ? false : true);
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public String getCountryCodeValue() {
        return getDefaultCountryCodeValue(this.countryCode.getText());
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public boolean isFixedLineNumberBlockEnabled() {
        return true;
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public boolean isModifyPhoneNumberBlockEnabled() {
        return false;
    }

    public abstract void onButtonStateChanged(boolean z);

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void onPhoneInfoChanged(String str, boolean z, boolean z2) {
        this.phoneInfo.setText(str);
        onPhoneInfoChanged(z, z2);
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void onTextChanged() {
        updateDoneButton();
    }

    public abstract void onWarningStateChanged(boolean z);

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public boolean phoneCheckRequired() {
        return true;
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void setCountryCodeValue(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.countryCode.setText(str);
    }

    public void setPhoneNumberWithCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            PhoneNumberUtil phoneNumberUtil = this.phoneNumberUtil;
            phoneNumberUtil.getClass();
            Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
            phoneNumberUtil.s(str, null, false, phonenumber$PhoneNumber);
            TextView textView = this.countryCode;
            Locale locale = Locale.US;
            textView.setText("+" + phonenumber$PhoneNumber.g());
            EditText editText = this.phoneNumber;
            this.phoneNumberUtil.getClass();
            editText.setText(PhoneNumberUtil.h(phonenumber$PhoneNumber));
        } catch (NumberParseException unused) {
        }
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void onPhoneInfoChanged(boolean z, boolean z2) {
        this.phoneNumberValid = z;
        updateDoneButton();
        onWarningStateChanged(z2);
    }

    @Override // ru.mail.libverify.controls.formatters.PhoneFormatter
    public void onPhoneInfoChanged(String str) {
        this.phoneInfo.setText(str);
    }
}
