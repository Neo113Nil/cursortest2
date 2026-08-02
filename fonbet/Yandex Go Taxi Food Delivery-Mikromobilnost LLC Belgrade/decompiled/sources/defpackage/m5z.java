package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m5z {
    public static final m5z b = e(new LocaleList(new Locale[0]));
    public final n5z a;

    public m5z(n5z n5zVar) {
        this.a = n5zVar;
    }

    public static m5z a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i2 = l5z.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return e(new LocaleList(localeArr));
    }

    public static m5z e(LocaleList localeList) {
        return new m5z(new n5z(localeList));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean c() {
        return this.a.a.isEmpty();
    }

    public final int d() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m5z) {
            return this.a.equals(((m5z) obj).a);
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
