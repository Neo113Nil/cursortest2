package com.yandex.div.internal.util;

import java.util.Map;
import java.util.NoSuchElementException;
import xsna.p7f0;

/* compiled from: Utils.kt */
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final <K, V> V getOrThrow(Map<? extends K, ? extends V> map, K k, String str) {
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ Object getOrThrow$default(Map map, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return getOrThrow(map, obj, str);
    }

    public static final <T> p7f0<Object, T> weak(T t) {
        return new WeakRef(t);
    }
}
