package xsna;

import java.util.Map;
import java.util.Map.Entry;

/* compiled from: MapBuilder.kt */
/* loaded from: classes11.dex */
public abstract class mf<E extends Map.Entry<? extends K, ? extends V>, K, V> extends ag<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return ((kotlin.collections.builders.a) this).b.k((Map.Entry) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return ((kotlin.collections.builders.a) this).b.r((Map.Entry) obj);
    }
}
