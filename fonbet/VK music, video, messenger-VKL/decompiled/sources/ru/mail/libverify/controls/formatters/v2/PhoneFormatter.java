package ru.mail.libverify.controls.formatters.v2;

import android.content.Context;
import android.telephony.TelephonyManager;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import java.util.Arrays;
import java.util.Locale;
import ru.mail.libverify.api.PhoneCheckResultImpl;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.verify.core.utils.FileLog;
import xsna.drm0;
import xsna.zcl;

/* compiled from: PhoneWithCodeFormatter.kt */
/* loaded from: classes9.dex */
public final class PhoneFormatter {
    public static final Companion Companion = new Companion(null);
    private static final int MIN_PHONE_NUMBER_LENGTH = 3;
    private static PhoneNumberUtil phoneNumberUtil;

    /* compiled from: PhoneWithCodeFormatter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ void checkPhoneNumber$default(Companion companion, Context context, String str, String str2, VerificationApi.PhoneCheckListener phoneCheckListener, String str3, boolean z, String str4, int i, Object obj) {
            if ((i & 16) != 0) {
                str3 = null;
            }
            if ((i & 32) != 0) {
                z = true;
            }
            if ((i & 64) != 0) {
                str4 = null;
            }
            companion.checkPhoneNumber(context, str, str2, phoneCheckListener, str3, z, str4);
        }

        private final PhoneNumberUtil getPhoneNumberUtil(Context context) {
            PhoneNumberUtil phoneNumberUtil = PhoneFormatter.phoneNumberUtil;
            if (phoneNumberUtil != null) {
                return phoneNumberUtil;
            }
            PhoneNumberUtil b = PhoneNumberUtil.b(context);
            PhoneFormatter.phoneNumberUtil = b;
            return b;
        }

        private final String tryParsePhoneNumber(Context context, String str, String str2) {
            PhoneNumberUtil phoneNumberUtil = getPhoneNumberUtil(context);
            phoneNumberUtil.getClass();
            Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
            phoneNumberUtil.s(str, str2, false, phonenumber$PhoneNumber);
            String format = String.format(Locale.US, "+%d", Arrays.copyOf(new Object[]{Integer.valueOf(phonenumber$PhoneNumber.g())}, 1));
            getPhoneNumberUtil(context).getClass();
            return format.concat(PhoneNumberUtil.h(phonenumber$PhoneNumber));
        }

        public final void checkPhoneNumber(Context context, String str, String str2, VerificationApi.PhoneCheckListener phoneCheckListener, String str3, boolean z, String str4) {
            VerificationApi.PhoneCheckListener phoneCheckListener2;
            NumberParseException numberParseException;
            String str5;
            if (drm0.N(str) || str.length() <= 3) {
                phoneCheckListener.onCompleted(str, PhoneCheckResultImpl.getIncorrectPhoneResult());
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (str.charAt(0) == '+') {
                    if (str4 == null) {
                        try {
                            str4 = telephonyManager.getSimCountryIso();
                        } catch (NumberParseException e) {
                            numberParseException = e;
                            phoneCheckListener2 = phoneCheckListener;
                            FileLog.v("PhoneFormatter", "parse error", numberParseException);
                            phoneCheckListener2.onCompleted(str, PhoneCheckResultImpl.getIncorrectPhoneResult());
                        }
                    }
                    str5 = tryParsePhoneNumber(context, str, str4);
                } else {
                    str5 = str;
                }
                phoneCheckListener2 = phoneCheckListener;
                try {
                    VerificationFactory.getInstance(context).checkPhoneNumber(str3 == null ? str : str3, str2, str5, z, phoneCheckListener2);
                } catch (NumberParseException e2) {
                    e = e2;
                    numberParseException = e;
                    FileLog.v("PhoneFormatter", "parse error", numberParseException);
                    phoneCheckListener2.onCompleted(str, PhoneCheckResultImpl.getIncorrectPhoneResult());
                }
            } catch (NumberParseException e3) {
                e = e3;
                phoneCheckListener2 = phoneCheckListener;
            }
        }

        private Companion() {
        }
    }

    public static final void checkPhoneNumber(Context context, String str, String str2, VerificationApi.PhoneCheckListener phoneCheckListener, String str3, boolean z, String str4) {
        Companion.checkPhoneNumber(context, str, str2, phoneCheckListener, str3, z, str4);
    }
}
