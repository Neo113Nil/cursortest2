package com.google.common.collect;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class q implements Map.Entry {
    public final Object a;
    public int b;
    public final /* synthetic */ CompactHashMap c;

    public q(CompactHashMap compactHashMap, int i) {
        this.c = compactHashMap;
        Object obj = CompactHashMap.C;
        this.a = compactHashMap.m()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        CompactHashMap compactHashMap = this.c;
        if (i != -1 && i < compactHashMap.size()) {
            if (Objects.equals(obj, compactHashMap.m()[this.b])) {
                return;
            }
        }
        Object obj2 = CompactHashMap.C;
        this.b = compactHashMap.g(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        CompactHashMap compactHashMap = this.c;
        Map c = compactHashMap.c();
        if (c != null) {
            return c.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return compactHashMap.n()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        CompactHashMap compactHashMap = this.c;
        Map c = compactHashMap.c();
        Object obj2 = this.a;
        if (c != null) {
            return c.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            compactHashMap.put(obj2, obj);
            return null;
        }
        Object obj3 = compactHashMap.n()[i];
        compactHashMap.n()[this.b] = obj;
        return obj3;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
