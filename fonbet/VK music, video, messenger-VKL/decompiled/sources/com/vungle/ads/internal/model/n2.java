package com.vungle.ads.internal.model;

import java.util.LinkedHashMap;
import xsna.on00;

/* loaded from: classes7.dex */
public enum n2 {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_ID(0),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLE_ID(1),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY(2);

    public static final LinkedHashMap b;
    public final int a;

    static {
        n2[] values = values();
        int e = on00.e(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (n2 n2Var : values) {
            linkedHashMap.put(Integer.valueOf(n2Var.a), n2Var);
        }
        b = linkedHashMap;
    }

    n2(int i) {
        this.a = i;
    }
}
