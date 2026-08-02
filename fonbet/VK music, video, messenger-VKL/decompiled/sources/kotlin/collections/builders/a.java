package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import xsna.mf;

/* compiled from: MapBuilder.kt */
/* loaded from: classes11.dex */
public final class a<K, V> extends mf<Map.Entry<K, V>, K, V> {
    public final MapBuilder<K, V> b;

    public a(MapBuilder<K, V> mapBuilder) {
        this.b = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        MapBuilder<K, V> mapBuilder = this.b;
        mapBuilder.getClass();
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!mapBuilder.k((Map.Entry) obj)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.ag
    public final int getSize() {
        return this.b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        MapBuilder<K, V> mapBuilder = this.b;
        mapBuilder.getClass();
        return new MapBuilder.b(mapBuilder);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        this.b.i();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        this.b.i();
        return super.retainAll(collection);
    }
}
