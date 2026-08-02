package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class l extends pj1 {
    public final /* synthetic */ n b;

    public l(n nVar) {
        this.b = nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.b.d.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        Set entrySet = this.b.d.entrySet();
        entrySet.getClass();
        try {
            if (!entrySet.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Objects.requireNonNull(entry);
            a0 a0Var = this.b.e;
            Object key = entry.getKey();
            Map map = a0Var.f;
            map.getClass();
            try {
                obj2 = map.remove(key);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            Collection collection = (Collection) obj2;
            if (collection == null) {
                return true;
            }
            int size = collection.size();
            collection.clear();
            a0Var.g -= size;
            return true;
        } catch (ClassCastException | NullPointerException unused2) {
            return false;
        }
    }
}
