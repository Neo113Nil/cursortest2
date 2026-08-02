package com.yandex.runtime.bindings.internal;

import com.yandex.runtime.bindings.Serializable;
import defpackage.g8e;
import defpackage.kbs;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class GuidRegister {
    private static final Map<String, Class<? extends Serializable>> guidsToClassesMap = new HashMap();
    private static final Map<Class<? extends Serializable>, String> classesToGuidsMap = new HashMap();

    public static Class<? extends Serializable> getClass(String str) {
        Class<? extends Serializable> cls = guidsToClassesMap.get(str);
        if (cls != null) {
            return cls;
        }
        kbs.g(g8e.o("Unregistered guid ", str));
        return null;
    }

    public static String getGuid(Class<? extends Serializable> cls) {
        String str = classesToGuidsMap.get(cls);
        if (str != null) {
            return str;
        }
        kbs.g("Unknown guid for class ".concat(cls.getName()));
        return null;
    }

    public static void registerGuid(Class<? extends Serializable> cls, String str) {
        guidsToClassesMap.put(str, cls);
        classesToGuidsMap.put(cls, str);
    }
}
