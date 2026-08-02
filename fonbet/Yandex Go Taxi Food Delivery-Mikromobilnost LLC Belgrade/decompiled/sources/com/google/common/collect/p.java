package com.google.common.collect;

import defpackage.tob1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class p extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ CompactHashMap b;

    public /* synthetic */ p(CompactHashMap compactHashMap, int i) {
        this.a = i;
        this.b = compactHashMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        CompactHashMap compactHashMap = this.b;
        switch (i) {
            case 0:
                compactHashMap.clear();
                break;
            default:
                compactHashMap.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        CompactHashMap compactHashMap = this.b;
        switch (i) {
            case 0:
                Map c = compactHashMap.c();
                if (c != null) {
                    return c.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = compactHashMap.g(entry.getKey());
                    if (g != -1 && Objects.equals(compactHashMap.n()[g], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return compactHashMap.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        CompactHashMap compactHashMap = this.b;
        switch (i) {
            case 0:
                Map c = compactHashMap.c();
                return c != null ? c.entrySet().iterator() : new o(compactHashMap, 1);
            default:
                Map c2 = compactHashMap.c();
                return c2 != null ? c2.keySet().iterator() : new o(compactHashMap, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        CompactHashMap compactHashMap = this.b;
        switch (i) {
            case 0:
                Map c = compactHashMap.c();
                if (c == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!compactHashMap.j()) {
                            int f = compactHashMap.f();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = compactHashMap.a;
                            Objects.requireNonNull(obj2);
                            int f2 = tob1.f(key, value, f, obj2, compactHashMap.l(), compactHashMap.m(), compactHashMap.n());
                            if (f2 != -1) {
                                compactHashMap.i(f2, f);
                                compactHashMap.y--;
                                compactHashMap.x += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map c2 = compactHashMap.c();
                if (c2 == null) {
                    if (compactHashMap.k(obj) != CompactHashMap.C) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        CompactHashMap compactHashMap = this.b;
        switch (i) {
        }
        return compactHashMap.size();
    }
}
