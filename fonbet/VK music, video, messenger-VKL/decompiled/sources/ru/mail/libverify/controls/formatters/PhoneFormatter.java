package ru.mail.libverify.controls.formatters;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.a;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.Utils;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public abstract class PhoneFormatter {
    private static final int BLOCK_PHONE_NUMBER_ENTER_AFTER_LENGTH = 20;
    private static final int CLEAR_PREVIOUS_TEXT_TIMEOUT = 300;
    private static final String LOG_TAG = "PhoneFormatter";
    private static final int MAX_CHECK_PHONE_NUMBER_WAIT = 10000;
    private static final int MAX_PHONE_NUMBER_LENGTH = 15;
    private static final int MIN_PHONE_NUMBER_LENGTH = 3;
    private a formatter;
    private final PhoneCheckListenerImpl phoneCheckListener;
    private String phoneCheckService;
    protected final EditText phoneNumber;
    private VerificationApi.PhoneNumberCheckSession phoneNumberCheckSession;
    protected final PhoneNumberUtil phoneNumberUtil;
    private boolean processingNumber;
    private final TextWatcherImpl textWatcher;
    private TextAction lastTextAction = TextAction.UNKNOWN;
    private final Runnable clearTextRunnable = new Runnable() { // from class: ru.mail.libverify.controls.formatters.PhoneFormatter.1
        @Override // java.lang.Runnable
        public void run() {
            PhoneFormatter.this.onPhoneInfoChanged(null);
        }
    };
    private final Runnable unblockRunnable = new Runnable() { // from class: ru.mail.libverify.controls.formatters.PhoneFormatter.2
        @Override // java.lang.Runnable
        public void run() {
            PhoneFormatter.this.onPhoneInfoChanged(null, true, false);
        }
    };

    public class PhoneCheckListenerImpl implements VerificationApi.PhoneCheckListener {
        public /* synthetic */ PhoneCheckListenerImpl(PhoneFormatter phoneFormatter, int i) {
            this();
        }

        @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckListener
        public void onCompleted(@NonNull final String str, @NonNull final VerificationApi.PhoneCheckResult phoneCheckResult) {
            Utils.uiHandler.post(new Runnable() { // from class: ru.mail.libverify.controls.formatters.PhoneFormatter.PhoneCheckListenerImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    PhoneFormatter phoneFormatter = PhoneFormatter.this;
                    if (TextUtils.equals(phoneFormatter.getPhoneWithCode(phoneFormatter.phoneNumber.getText()), str)) {
                        Utils.uiHandler.removeCallbacks(PhoneFormatter.this.clearTextRunnable);
                        if (!phoneCheckResult.isApproximate()) {
                            Utils.uiHandler.removeCallbacks(PhoneFormatter.this.unblockRunnable);
                        }
                        boolean z = true;
                        if (phoneCheckResult.getReason() != VerificationApi.FailReason.OK) {
                            PhoneFormatter.this.onPhoneInfoChanged(null, true, false);
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (phoneCheckResult.getPrintableText() != null) {
                            for (String str2 : phoneCheckResult.getPrintableText()) {
                                if (!TextUtils.isEmpty(sb)) {
                                    sb.append("\n");
                                }
                                sb.append(str2);
                            }
                        }
                        VerificationApi.PhoneCheckResult.ExtendedInfo extendedInfo = phoneCheckResult.getExtendedInfo();
                        boolean z2 = (extendedInfo != null && extendedInfo.isFixedLine()) && !(extendedInfo != null && extendedInfo.isMobile()) && PhoneFormatter.this.isFixedLineNumberBlockEnabled();
                        boolean z3 = phoneCheckResult.isValid() && !z2;
                        if (!phoneCheckResult.isWarning() && !z2) {
                            z = false;
                        }
                        if (!phoneCheckResult.isApproximate() || z) {
                            PhoneFormatter.this.onPhoneInfoChanged(sb.toString(), z3, z);
                        } else {
                            Utils.uiHandler.postDelayed(PhoneFormatter.this.clearTextRunnable, 300L);
                            PhoneFormatter.this.onPhoneInfoChanged(z3, false);
                        }
                        if (PhoneFormatter.this.isModifyPhoneNumberBlockEnabled() || phoneCheckResult.isApproximate() || phoneCheckResult.getExtendedInfo() == null || PhoneFormatter.this.lastTextAction != TextAction.ADD) {
                            return;
                        }
                        String modifiedPhoneNumber = phoneCheckResult.getExtendedInfo().getModifiedPhoneNumber();
                        String modifiedPrefix = phoneCheckResult.getExtendedInfo().getModifiedPrefix();
                        if (TextUtils.isEmpty(modifiedPrefix) || TextUtils.isEmpty(modifiedPhoneNumber)) {
                            return;
                        }
                        PhoneFormatter phoneFormatter2 = PhoneFormatter.this;
                        if (TextUtils.equals(PhoneNumberUtil.q(modifiedPhoneNumber), PhoneNumberUtil.q(phoneFormatter2.getPhoneWithCode(phoneFormatter2.phoneNumber.getText())))) {
                            return;
                        }
                        String substring = modifiedPhoneNumber.substring(modifiedPrefix.length());
                        PhoneFormatter phoneFormatter3 = PhoneFormatter.this;
                        phoneFormatter3.phoneNumber.setText(phoneFormatter3.getFormattedPhoneNumber(substring));
                        EditText editText = PhoneFormatter.this.phoneNumber;
                        editText.setSelection(editText.length());
                        PhoneFormatter.this.setCountryCodeValue(modifiedPrefix);
                    }
                }
            });
        }

        private PhoneCheckListenerImpl() {
        }
    }

    public enum TextAction {
        UNKNOWN,
        ADD,
        REMOVE
    }

    public class TextWatcherImpl implements TextWatcher {
        public /* synthetic */ TextWatcherImpl(PhoneFormatter phoneFormatter, int i) {
            this();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PhoneFormatter.this.onTextChanged();
            if (PhoneFormatter.this.processingNumber) {
                return;
            }
            PhoneFormatter.this.processingNumber = true;
            if (i2 > i3) {
                PhoneFormatter.this.lastTextAction = TextAction.REMOVE;
            } else {
                PhoneFormatter.this.lastTextAction = TextAction.ADD;
            }
            boolean z = PhoneFormatter.this.phoneNumber.getSelectionStart() == charSequence.length();
            String q = PhoneNumberUtil.q(PhoneFormatter.this.getCountryCodeValue() + charSequence.toString());
            boolean z2 = q.length() >= 15;
            boolean z3 = charSequence.length() >= 3;
            if (q.length() > 20 && i3 > 0) {
                PhoneFormatter.this.phoneNumber.getText().delete(i, i3 + i);
            }
            if (z3) {
                String formattedPhoneNumber = PhoneFormatter.this.getFormattedPhoneNumber(charSequence);
                if (z || z2) {
                    PhoneFormatter.this.phoneNumber.getText().clear();
                    PhoneFormatter.this.phoneNumber.append(formattedPhoneNumber);
                }
                PhoneFormatter phoneFormatter = PhoneFormatter.this;
                phoneFormatter.checkPhoneNumber(phoneFormatter.getPhoneWithCode(phoneFormatter.phoneNumber.getText()));
            } else {
                PhoneFormatter.this.onPhoneInfoChanged(null, false, false);
            }
            PhoneFormatter.this.processingNumber = false;
        }

        private TextWatcherImpl() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public PhoneFormatter(@NonNull EditText editText, @Nullable String str, @Nullable VerificationApi.PhoneNumberCheckSession phoneNumberCheckSession) {
        int i = 0;
        this.processingNumber = false;
        this.textWatcher = new TextWatcherImpl(this, i);
        this.phoneCheckListener = new PhoneCheckListenerImpl(this, i);
        this.processingNumber = false;
        this.phoneNumber = editText;
        PhoneNumberUtil b = PhoneNumberUtil.b(editText.getContext());
        this.phoneNumberUtil = b;
        this.formatter = new a(b, "");
        editText.setSelection(editText.length(), editText.length());
        this.phoneCheckService = str;
        this.phoneNumberCheckSession = phoneNumberCheckSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPhoneNumber(String str) {
        VerificationApi.PhoneNumberCheckSession phoneNumberCheckSession;
        if (!phoneCheckRequired() || TextUtils.isEmpty(str) || (phoneNumberCheckSession = this.phoneNumberCheckSession) == null) {
            return;
        }
        phoneNumberCheckSession.checkPhoneNumber(this.phoneCheckService, str, true, this.phoneCheckListener);
        Utils.uiHandler.removeCallbacks(this.unblockRunnable);
        Utils.uiHandler.postDelayed(this.unblockRunnable, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getFormattedPhoneNumber(CharSequence charSequence) {
        if (charSequence == null) {
            FileLog.e(LOG_TAG, "could not format number: number is null");
            return "";
        }
        String countryCodeValue = getCountryCodeValue();
        if (countryCodeValue == null) {
            FileLog.e(LOG_TAG, "could not format number: pattern is null");
            return charSequence.toString();
        }
        String phoneWithCode = getPhoneWithCode(charSequence);
        String str = "";
        for (int i = 0; i < phoneWithCode.length(); i++) {
            char charAt = phoneWithCode.charAt(i);
            if (Character.isDigit(charAt) || charAt == '+') {
                str = this.formatter.i(charAt);
            }
        }
        String trim = str.substring(1).replaceFirst(countryCodeValue, "").trim();
        this.formatter.f();
        return trim;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPhoneWithCode(CharSequence charSequence) {
        if (charSequence == null) {
            FileLog.e(LOG_TAG, "could not get phone with code: phone is null");
        }
        return "+" + getCountryCodeValue() + ((Object) charSequence);
    }

    public void attach() {
        EditText editText = this.phoneNumber;
        editText.setSelection(editText.length(), this.phoneNumber.length());
        this.textWatcher.onTextChanged(this.phoneNumber.getText(), 0, 0, 0);
        this.phoneNumber.addTextChangedListener(this.textWatcher);
    }

    public void detach() {
        this.phoneNumber.removeTextChangedListener(this.textWatcher);
    }

    public abstract String getCountryCodeValue();

    public final String getDefaultCountryCodeValue(@NonNull CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? "" : charSequence.toString().substring(1);
    }

    public abstract boolean isFixedLineNumberBlockEnabled();

    public abstract boolean isModifyPhoneNumberBlockEnabled();

    public abstract void onPhoneInfoChanged(String str);

    public abstract void onPhoneInfoChanged(String str, boolean z, boolean z2);

    public abstract void onPhoneInfoChanged(boolean z, boolean z2);

    public abstract boolean phoneCheckRequired();

    public abstract void setCountryCodeValue(@NonNull String str);

    public void update() {
        checkPhoneNumber(getPhoneWithCode(this.phoneNumber.getText()));
    }

    public void onTextChanged() {
    }
}
