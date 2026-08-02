package xsna;

import io.jsonwebtoken.JwtParser;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: CalendarLocale.jvm.kt */
/* loaded from: classes11.dex */
public final class vz8 {
    public static final WeakHashMap<String, NumberFormat> a = new WeakHashMap<>();

    public static String a(int i, Locale locale, int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : 2;
        if ((i2 & 8) != 0) {
            locale = null;
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String str = i3 + JwtParser.SEPARATOR_CHAR + 40 + JwtParser.SEPARATOR_CHAR + false + JwtParser.SEPARATOR_CHAR + locale.toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = a;
        NumberFormat numberFormat = weakHashMap.get(str);
        if (numberFormat == null) {
            numberFormat = NumberFormat.getIntegerInstance(locale);
            numberFormat.setGroupingUsed(false);
            numberFormat.setMinimumIntegerDigits(i3);
            numberFormat.setMaximumIntegerDigits(40);
            weakHashMap.put(str, numberFormat);
        }
        return numberFormat.format(Integer.valueOf(i));
    }
}
