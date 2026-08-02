package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import yads.y;

/* loaded from: classes7.dex */
public class gh81 extends y081 implements SortedSet {
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh81(y yVar, SortedMap sortedMap) {
        super(yVar, sortedMap);
        this.c = yVar;
    }

    public SortedMap a() {
        return (SortedMap) this.a;
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
        return new gh81(this.c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new gh81(this.c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new gh81(this.c, a().tailMap(obj));
    }
}
