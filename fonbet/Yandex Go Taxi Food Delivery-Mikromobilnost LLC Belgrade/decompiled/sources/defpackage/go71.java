package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class go71 {
    public static hn71 a(fe81 fe81Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ym11.h(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i = fe81Var.n;
        linkedHashMap.put("orientation", i != 1 ? i != 2 ? StringUtils.UNDEFINED : "landscape" : "portrait");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!ym11.h(linkedHashMap2)) {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap2.put("image_loading_automatically", Boolean.valueOf(fe81Var.m));
        return new hn71(b.n(linkedHashMap, linkedHashMap2), (no61) null);
    }
}
