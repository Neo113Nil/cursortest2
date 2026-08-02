package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes11.dex */
public class i extends d implements SortedMap {
    public SortedSet x;
    public final /* synthetic */ Multimaps$CustomListMultimap y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Multimaps$CustomListMultimap multimaps$CustomListMultimap, SortedMap sortedMap) {
        super(multimaps$CustomListMultimap, sortedMap);
        this.y = multimaps$CustomListMultimap;
    }

    public SortedSet b() {
        return new j(this.y, d());
    }

    @Override // com.google.common.collect.d, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.x;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b = b();
        this.x = b;
        return b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i(this.y, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.y, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.y, d().tailMap(obj));
    }
}
