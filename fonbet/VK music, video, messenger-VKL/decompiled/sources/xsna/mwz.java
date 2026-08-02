package xsna;

import android.os.LocaleList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class mwz {
    public static final mwz b = b(new LocaleList(new Locale[0]));
    public final owz a;

    public mwz(owz owzVar) {
        this.a = owzVar;
    }

    public static mwz a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(StringUtils.COMMA, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return b(new LocaleList(localeArr));
    }

    public static mwz b(LocaleList localeList) {
        return new mwz(new owz(localeList));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mwz) {
            return this.a.equals(((mwz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
