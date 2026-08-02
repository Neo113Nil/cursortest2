package xsna;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PersistentOrderedMapContentIterators.kt */
/* loaded from: classes8.dex */
public final class s0a0<K, V> implements Iterator<odz<V>>, gcy {
    public Object b;
    public final Map<K, odz<V>> c;
    public int d;

    public s0a0(Object obj, Map<K, odz<V>> map) {
        this.b = obj;
        this.c = map;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final odz<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        odz<V> odzVar = this.c.get(this.b);
        if (odzVar == null) {
            throw new ConcurrentModificationException(tk5.c(new StringBuilder("Hash code of a key ("), this.b, ") has changed after it was added to the persistent map."));
        }
        odz<V> odzVar2 = odzVar;
        this.d++;
        this.b = odzVar2.c;
        return odzVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
