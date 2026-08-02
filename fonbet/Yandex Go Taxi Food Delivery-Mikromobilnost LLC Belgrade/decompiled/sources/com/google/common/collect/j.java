package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes11.dex */
public class j extends f implements SortedSet {
    public final /* synthetic */ Multimaps$CustomListMultimap w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Multimaps$CustomListMultimap multimaps$CustomListMultimap, SortedMap sortedMap) {
        super(multimaps$CustomListMultimap, sortedMap);
        this.w = multimaps$CustomListMultimap;
    }

    public SortedMap a() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new j(this.w, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j(this.w, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j(this.w, a().tailMap(obj));
    }
}
