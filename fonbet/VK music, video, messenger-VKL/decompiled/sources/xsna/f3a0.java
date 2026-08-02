package xsna;

import android.content.Context;
import android.telephony.TelephonyManager;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: PhoneFormatUtils.kt */
/* loaded from: classes17.dex */
public final class f3a0 {
    public static final f3a0 a = new f3a0();
    public static volatile PhoneNumberUtil b = null;
    public static volatile String c = "RU";

    /* compiled from: PhoneFormatUtils.kt */
    public static final class a implements ti20 {
        public final Context b;

        public a(Context context) {
            this.b = context.getApplicationContext();
        }

        @Override // xsna.ti20
        public final InputStream d(String str) {
            try {
                String str2 = (String) j5g.i0(drm0.b0(str, new char[]{'/'}, 0, 6));
                return this.b.getAssets().open("phone-metadata/" + str2);
            } catch (Exception unused) {
                return a.class.getResourceAsStream(str);
            }
        }
    }

    public final PhoneNumberUtil a(Context context) {
        String simCountryIso;
        PhoneNumberUtil phoneNumberUtil = b;
        if (phoneNumberUtil != null) {
            return phoneNumberUtil;
        }
        synchronized (this) {
            try {
                PhoneNumberUtil phoneNumberUtil2 = b;
                if (phoneNumberUtil2 != null) {
                    return phoneNumberUtil2;
                }
                PhoneNumberUtil c2 = PhoneNumberUtil.c(new a(context));
                Object systemService = context.getSystemService("phone");
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                if (telephonyManager != null && (simCountryIso = telephonyManager.getSimCountryIso()) != null && simCountryIso.length() > 0) {
                    c = simCountryIso.toUpperCase(Locale.ROOT);
                }
                b = c2;
                return c2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
