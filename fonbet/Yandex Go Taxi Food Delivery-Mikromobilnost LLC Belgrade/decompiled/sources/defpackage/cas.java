package defpackage;

import com.google.common.collect.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class cas extends das implements Map {
    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // defpackage.das
    public abstract Map delegate();

    @Override // java.util.Map
    public Set entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        Iterator it = entrySet().iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public boolean standardContainsKey(Object obj) {
        return dai0.i(new bw00(entrySet().iterator(), 0), obj);
    }

    public boolean standardContainsValue(Object obj) {
        return dai0.i(new bw00(entrySet().iterator(), 1), obj);
    }

    public boolean standardEquals(Object obj) {
        return v.b(obj, this);
    }

    public int standardHashCode() {
        return lab1.g(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Object standardRemove(Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (Objects.equals(entry.getKey(), obj)) {
                Object value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return v.c(this);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return delegate().values();
    }
}
