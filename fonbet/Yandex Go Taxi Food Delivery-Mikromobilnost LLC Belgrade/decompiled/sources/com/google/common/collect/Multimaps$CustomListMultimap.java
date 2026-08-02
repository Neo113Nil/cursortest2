package com.google.common.collect;

import defpackage.ffx;
import defpackage.rhw0;
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

/* loaded from: classes11.dex */
final class Multimaps$CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
    private static final long serialVersionUID = 0;
    public transient rhw0 y;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        this.y = (rhw0) readObject;
        Object readObject2 = objectInputStream.readObject();
        Objects.requireNonNull(readObject2);
        Map map = (Map) readObject2;
        this.w = map;
        this.x = 0;
        for (V v : map.values()) {
            ffx.m(!v.isEmpty());
            this.x = v.size() + this.x;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.y);
        objectOutputStream.writeObject(this.w);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Map c() {
        Map map = this.w;
        return map instanceof NavigableMap ? new g(this, (NavigableMap) this.w) : map instanceof SortedMap ? new i(this, (SortedMap) this.w) : new d(this, this.w);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection f() {
        return (List) this.y.get();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Set g() {
        Map map = this.w;
        return map instanceof NavigableMap ? new h(this, (NavigableMap) this.w) : map instanceof SortedMap ? new j(this, (SortedMap) this.w) : new f(this, this.w);
    }
}
