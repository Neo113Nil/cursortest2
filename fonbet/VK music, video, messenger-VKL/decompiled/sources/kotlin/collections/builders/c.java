package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import xsna.xf;

/* compiled from: MapBuilder.kt */
/* loaded from: classes8.dex */
public final class c<V> extends xf<V> {
    public final MapBuilder<?, V> b;

    public c(MapBuilder<?, V> mapBuilder) {
        this.b = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // xsna.xf
    public final int getSize() {
        return this.b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        MapBuilder<?, V> mapBuilder = this.b;
        mapBuilder.getClass();
        return new MapBuilder.f(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        MapBuilder<?, V> mapBuilder = this.b;
        mapBuilder.i();
        int n = mapBuilder.n(obj);
        if (n < 0) {
            return false;
        }
        mapBuilder.s(n);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        this.b.i();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        this.b.i();
        return super.retainAll(collection);
    }
}
