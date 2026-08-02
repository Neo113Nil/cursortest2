package xsna;

import com.google.common.collect.c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: Multimaps.java */
/* loaded from: classes13.dex */
public final class h740<K, V> extends com.google.common.collect.a<K, V> {
    private static final long serialVersionUID = 0;
    public transient zhn0<? extends List<V>> g;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        this.g = (zhn0) readObject;
        Object readObject2 = objectInputStream.readObject();
        Objects.requireNonNull(readObject2);
        k((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g);
        objectOutputStream.writeObject(this.e);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.d
    public final Map<K, Collection<V>> d() {
        Map<K, Collection<V>> map = this.e;
        return map instanceof NavigableMap ? new c.d(this, (NavigableMap) this.e) : map instanceof SortedMap ? new c.g(this, (SortedMap) this.e) : new c.a(this.e);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.d
    public final Set<K> g() {
        Map<K, Collection<V>> map = this.e;
        return map instanceof NavigableMap ? new c.e(this, (NavigableMap) this.e) : map instanceof SortedMap ? new c.h(this, (SortedMap) this.e) : new c.C0131c(this.e);
    }

    @Override // com.google.common.collect.c
    public final Collection j() {
        return this.g.get();
    }
}
