package defpackage;

import java.util.Locale;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes7.dex */
public final class ef81 {
    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            sb.append(LicenseUtility.SEPARATOR);
            sb.append(script);
        }
        if (country != null && country.length() != 0) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }
}
