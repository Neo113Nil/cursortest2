package com.google.common.collect;

import defpackage.n8;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class m extends AbstractCollection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((n) obj).clear();
                break;
            default:
                ((CompactHashMap) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((n) this.b).b(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new n8((AbstractMapBasedMultimap) ((n) obj));
            default:
                CompactHashMap compactHashMap = (CompactHashMap) obj;
                Map c = compactHashMap.c();
                return c != null ? c.values().iterator() : new o(compactHashMap, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((n) obj).size();
            default:
                return ((CompactHashMap) obj).size();
        }
    }
}
