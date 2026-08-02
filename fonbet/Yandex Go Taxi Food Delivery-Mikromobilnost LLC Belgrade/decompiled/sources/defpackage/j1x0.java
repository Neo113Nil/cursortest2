package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j1x0 extends WeakHashMap {
    public final Object a = new Object();

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        synchronized (this.a) {
            super.clear();
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set entrySet;
        synchronized (this.a) {
            entrySet = super.entrySet();
        }
        return entrySet;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.a) {
            obj2 = super.get(obj);
        }
        return obj2;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set keySet;
        synchronized (this.a) {
            keySet = super.keySet();
        }
        return keySet;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.a) {
            put = super.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        synchronized (this.a) {
            super.putAll(map);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        if (obj == null || obj2 == null) {
            return false;
        }
        synchronized (this.a) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection values;
        synchronized (this.a) {
            values = super.values();
        }
        return values;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.a) {
            remove = super.remove(obj);
        }
        return remove;
    }
}
