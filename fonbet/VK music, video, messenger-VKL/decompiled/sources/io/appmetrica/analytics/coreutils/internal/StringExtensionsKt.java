package io.appmetrica.analytics.coreutils.internal;

import java.util.Locale;
import xsna.ro;

/* loaded from: classes8.dex */
public final class StringExtensionsKt {
    public static final String replaceFirstCharWithTitleCase(String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    public static final String replaceFirstCharWithTitleCase(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? ro.p(charAt, locale) : String.valueOf(charAt)));
        sb.append(str.substring(1));
        return sb.toString();
    }
}
