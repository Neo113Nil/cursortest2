package com.yandex.passport.internal.common;

import java.util.Locale;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes8.dex */
public final class j {
    public static String a(Locale locale) {
        String language = locale.getLanguage();
        int hashCode = language.hashCode();
        return hashCode != 3139 ? hashCode != 3247 ? hashCode != 3267 ? hashCode != 3424 ? hashCode != 3464 ? hashCode != 3466 ? hashCode != 3580 ? hashCode != 3710 ? (hashCode == 3734 && language.equals("uk")) ? "ua" : ClearCryptoProPrefs.COUNTRY : !language.equals("tr") ? ClearCryptoProPrefs.COUNTRY : "com.tr" : !language.equals("pl") ? ClearCryptoProPrefs.COUNTRY : "pl" : !language.equals("lv") ? ClearCryptoProPrefs.COUNTRY : "lv" : !language.equals("lt") ? ClearCryptoProPrefs.COUNTRY : "lt" : !language.equals("kk") ? ClearCryptoProPrefs.COUNTRY : "kz" : !language.equals("fi") ? ClearCryptoProPrefs.COUNTRY : "fi" : !language.equals("et") ? ClearCryptoProPrefs.COUNTRY : "ee" : !language.equals("be") ? ClearCryptoProPrefs.COUNTRY : "by";
    }
}
