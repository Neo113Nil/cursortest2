package yads;

import java.util.Locale;

/* loaded from: classes10.dex */
public final class xh1 {
    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            sb.append('-');
            sb.append(script);
        }
        if (country != null && country.length() != 0) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }
}
