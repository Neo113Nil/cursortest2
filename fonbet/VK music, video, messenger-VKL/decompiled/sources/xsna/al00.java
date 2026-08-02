package xsna;

import com.ironsource.B5;
import java.util.Map;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes11.dex */
public class al00<K, V> implements Map.Entry<K, V>, gcy {
    public final K b;
    public final V c;

    public al00(K k, V v) {
        this.b = k;
        this.c = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && epx.f(entry.getKey(), this.b) && epx.f(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.b;
        int hashCode = k != null ? k.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(B5.U);
        sb.append(getValue());
        return sb.toString();
    }
}
