package com.yandex.passport.common.ui.lang;

import java.util.Locale;

/* loaded from: classes15.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        a(4, "en");
    }

    public static Locale a(int i, String str) {
        return new Locale(str, (i & 2) != 0 ? "" : "US", "");
    }

    public static final String b(Locale locale) {
        return locale.getLanguage();
    }
}
