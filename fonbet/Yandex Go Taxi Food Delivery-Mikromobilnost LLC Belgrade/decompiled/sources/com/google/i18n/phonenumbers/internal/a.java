package com.google.i18n.phonenumbers.internal;

import defpackage.opi0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class a {
    public final opi0 a;

    public a() {
        final opi0 opi0Var = new opi0();
        final int i = HProv.PP_CONTAINER_EXTENSION_DEL;
        opi0Var.a = new LinkedHashMap<Object, Object>(i) { // from class: com.google.i18n.phonenumbers.internal.RegexCache$LRUCache$1
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
                int size = size();
                opi0.this.getClass();
                return size > 100;
            }
        };
        this.a = opi0Var;
    }

    public final Pattern a(String str) {
        Object obj;
        opi0 opi0Var = this.a;
        synchronized (opi0Var) {
            obj = opi0Var.a.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        opi0 opi0Var2 = this.a;
        synchronized (opi0Var2) {
            opi0Var2.a.put(str, compile);
        }
        return compile;
    }
}
