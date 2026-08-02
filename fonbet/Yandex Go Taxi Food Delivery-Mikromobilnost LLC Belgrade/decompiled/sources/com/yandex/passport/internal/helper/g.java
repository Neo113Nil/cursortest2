package com.yandex.passport.internal.helper;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.yandex.passport.internal.properties.p;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class g {
    public final p a;

    public g(p pVar) {
        this.a = pVar;
    }

    public static Locale a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i));
        }
        return (Locale) arrayList.get(0);
    }

    public final Context b(Context context) {
        Locale locale = this.a.q;
        if (locale == null) {
            return context;
        }
        Configuration configuration = context.getResources().getConfiguration();
        a(configuration);
        configuration.setLocale(locale);
        LocaleList.setDefault(configuration.getLocales());
        Locale.setDefault(locale);
        return context.createConfigurationContext(configuration);
    }
}
