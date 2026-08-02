package com.google.ar.core;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
final class o extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
