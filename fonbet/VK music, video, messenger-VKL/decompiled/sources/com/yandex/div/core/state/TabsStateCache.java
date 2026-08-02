package com.yandex.div.core.state;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: TabsStateCache.kt */
/* loaded from: classes7.dex */
public final class TabsStateCache {
    private final Map<String, Map<String, Integer>> temporaryCache = new LinkedHashMap();

    public final Integer getSelectedTab(String str, String str2) {
        Map<String, Integer> map = this.temporaryCache.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final void putSelectedTab(String str, String str2, int i) {
        Map<String, Map<String, Integer>> map = this.temporaryCache;
        Map<String, Integer> map2 = map.get(str);
        if (map2 == null) {
            map2 = new LinkedHashMap<>();
            map.put(str, map2);
        }
        map2.put(str2, Integer.valueOf(i));
    }
}
