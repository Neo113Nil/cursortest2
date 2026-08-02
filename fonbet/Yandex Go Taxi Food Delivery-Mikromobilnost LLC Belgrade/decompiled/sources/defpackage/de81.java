package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import yads.y;

/* loaded from: classes7.dex */
public class de81 extends kr71 implements SortedMap {
    public SortedSet x;
    public final /* synthetic */ y y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de81(y yVar, SortedMap sortedMap) {
        super(yVar, sortedMap);
        this.y = yVar;
    }

    public SortedSet b() {
        return new gh81(this.y, c());
    }

    public SortedMap c() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return c().comparator();
    }

    @Override // defpackage.kr71, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
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
    public final Object firstKey() {
        return c().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new de81(this.y, c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return c().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new de81(this.y, c().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new de81(this.y, c().tailMap(obj));
    }
}
