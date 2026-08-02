package xsna;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: CalendarModel.android.kt */
/* loaded from: classes11.dex */
public final class yz8 {
    public static final String a(long j, String str, Locale locale, LinkedHashMap linkedHashMap) {
        StringBuilder c = r11.c("S:", str);
        c.append(locale.toLanguageTag());
        String sb = c.toString();
        Object obj = linkedHashMap.get(sb);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(sb, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j));
    }
}
