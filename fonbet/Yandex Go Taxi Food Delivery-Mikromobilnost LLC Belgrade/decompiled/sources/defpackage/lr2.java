package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class lr2 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static m5z b(Configuration configuration) {
        return m5z.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(m5z m5zVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(m5zVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, m5z m5zVar) {
        configuration.setLocales(LocaleList.forLanguageTags(m5zVar.a.a.toLanguageTags()));
    }
}
