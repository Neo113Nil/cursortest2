package com.google.common.collect;

import com.google.common.collect.RegularImmutableMap;
import defpackage.h221;
import defpackage.lab1;
import defpackage.niv;
import defpackage.v7p;
import defpackage.y5e;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    private static final long serialVersionUID = 912559;
    public transient ImmutableSet a;
    public transient ImmutableSet b;
    public transient ImmutableCollection c;

    /* loaded from: classes11.dex */
    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            h221 it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i] = entry.getKey();
                objArr2[i] = entry.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (obj instanceof ImmutableSet) {
                ImmutableSet immutableSet = (ImmutableSet) obj;
                ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
                a aVar = new a(immutableSet.size());
                h221 it = immutableSet.iterator();
                h221 it2 = immutableCollection.iterator();
                while (it.hasNext()) {
                    aVar.b(it.next(), it2.next());
                }
                return aVar.a();
            }
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.values;
            a aVar2 = new a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                aVar2.b(objArr[i], objArr2[i]);
            }
            return aVar2.a();
        }
    }

    public static ImmutableMap a(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            return (ImmutableMap) map;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        a aVar = new a(entrySet instanceof Collection ? entrySet.size() : 4);
        aVar.c(entrySet);
        return aVar.a();
    }

    public static ImmutableMap f() {
        return RegularImmutableMap.z;
    }

    public static ImmutableMap g(Serializable serializable, Object obj) {
        y5e.h(serializable, obj);
        return RegularImmutableMap.m(1, new Object[]{serializable, obj}, null);
    }

    public static ImmutableMap h(Serializable serializable, Object obj, Serializable serializable2, Object obj2, Serializable serializable3, Object obj3, Serializable serializable4, Object obj4) {
        return RegularImmutableMap.m(4, new Object[]{serializable, obj, serializable2, obj2, serializable3, obj3, serializable4, obj4}, null);
    }

    public static ImmutableMap i(Class cls, v7p v7pVar, Class cls2, v7p v7pVar2, Class cls3, v7p v7pVar3) {
        return RegularImmutableMap.m(3, new Object[]{cls, v7pVar, cls2, v7pVar2, cls3, v7pVar3}, null);
    }

    public static ImmutableMap j(Class cls, Object obj, Class cls2, Object obj2) {
        y5e.h(cls, obj);
        y5e.h(cls2, obj2);
        return RegularImmutableMap.m(2, new Object[]{cls, obj, cls2, obj2}, null);
    }

    public static ImmutableMap k(String str, String str2, String str3, String str4, String str5) {
        return RegularImmutableMap.m(5, new Object[]{"AuthorizePurpose1", str, "AuthorizePurpose3", str2, "AuthorizePurpose4", str3, "AuthorizePurpose7", str4, "PurposeDiagnostics", str5}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.a;
        if (immutableSet != null) {
            return immutableSet;
        }
        RegularImmutableMap regularImmutableMap = (RegularImmutableMap) this;
        RegularImmutableMap.EntrySet entrySet = new RegularImmutableMap.EntrySet(regularImmutableMap, regularImmutableMap.x, regularImmutableMap.y);
        this.a = entrySet;
        return entrySet;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet keySet() {
        ImmutableSet immutableSet = this.b;
        if (immutableSet != null) {
            return immutableSet;
        }
        RegularImmutableMap regularImmutableMap = (RegularImmutableMap) this;
        RegularImmutableMap.KeySet keySet = new RegularImmutableMap.KeySet(regularImmutableMap, new RegularImmutableMap.KeysOrValuesAsList(0, regularImmutableMap.y, regularImmutableMap.x));
        this.b = keySet;
        return keySet;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return v.b(obj, this);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return lab1.g(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        RegularImmutableMap regularImmutableMap = (RegularImmutableMap) this;
        RegularImmutableMap.KeysOrValuesAsList keysOrValuesAsList = new RegularImmutableMap.KeysOrValuesAsList(1, regularImmutableMap.y, regularImmutableMap.x);
        this.c = keysOrValuesAsList;
        return keysOrValuesAsList;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return v.c(this);
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public static class a {
        public Object[] a;
        public int b;
        public r c;

        public a(int i) {
            this.a = new Object[i * 2];
            this.b = 0;
        }

        public final ImmutableMap a() {
            r rVar = this.c;
            if (rVar != null) {
                throw rVar.a();
            }
            RegularImmutableMap m = RegularImmutableMap.m(this.b, this.a, this);
            r rVar2 = this.c;
            if (rVar2 == null) {
                return m;
            }
            throw rVar2.a();
        }

        public final void b(Object obj, Object obj2) {
            int i = (this.b + 1) * 2;
            Object[] objArr = this.a;
            if (i > objArr.length) {
                this.a = Arrays.copyOf(objArr, niv.f(objArr.length, i));
            }
            y5e.h(obj, obj2);
            Object[] objArr2 = this.a;
            int i2 = this.b;
            int i3 = i2 * 2;
            objArr2[i3] = obj;
            objArr2[i3 + 1] = obj2;
            this.b = i2 + 1;
        }

        public final void c(Iterable iterable) {
            if (iterable instanceof Collection) {
                int size = (((Collection) iterable).size() + this.b) * 2;
                Object[] objArr = this.a;
                if (size > objArr.length) {
                    this.a = Arrays.copyOf(objArr, niv.f(objArr.length, size));
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                b(entry.getKey(), entry.getValue());
            }
        }

        public a() {
            this(4);
        }
    }
}
