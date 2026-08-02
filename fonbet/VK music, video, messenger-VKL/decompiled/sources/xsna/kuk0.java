package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes11.dex */
public final class kuk0<K, V> extends juk0<K, V> implements Iterator<K>, gcy {
    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<? extends K, ? extends V> entry = this.f;
        if (entry == null) {
            throw new IllegalStateException();
        }
        a();
        return entry.getKey();
    }
}
