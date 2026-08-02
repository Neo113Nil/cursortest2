package xsna;

import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes8.dex */
public abstract class kf<E extends Map.Entry<? extends K, ? extends V>, K, V> extends ag<E> {
    public abstract boolean a(Map.Entry<? extends K, ? extends V> entry);

    public abstract boolean b(Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return a((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }
}
