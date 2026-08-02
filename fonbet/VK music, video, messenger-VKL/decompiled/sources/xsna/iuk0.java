package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes11.dex */
public final class iuk0<K, V> extends juk0<K, V> implements Iterator<Map.Entry<K, V>>, gcy {
    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (this.e != null) {
            return new huk0(this);
        }
        throw new IllegalStateException();
    }
}
