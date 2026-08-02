package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class e implements Iterator {
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator w = Iterators$EmptyModifiableIterator.INSTANCE;
    public final /* synthetic */ AbstractMapBasedMultimap x;

    public e(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        this.x = abstractMapBasedMultimap;
        this.a = abstractMapBasedMultimap.w.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.w.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.w = collection.iterator();
        }
        return this.w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.w.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.x;
        abstractMapBasedMultimap.x--;
    }
}
