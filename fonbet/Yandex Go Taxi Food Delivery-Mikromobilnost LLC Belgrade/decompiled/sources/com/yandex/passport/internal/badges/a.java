package com.yandex.passport.internal.badges;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a {
    public final String a;
    public final Map b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public a(String str, HashMap hashMap, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = str;
        this.b = hashMap;
        this.c = linkedHashMap;
        this.d = linkedHashMap2;
    }

    public static String a(String str, Map map) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) map.get(Locale.ENGLISH.getLanguage());
        if (str3 != null) {
            return str3;
        }
        String str4 = (String) kotlin.collections.a.Q(map.values());
        return str4 == null ? "" : str4;
    }

    public static String b(a aVar) {
        Locale locale = Locale.getDefault();
        return a(locale.getLanguage(), aVar.b);
    }
}
