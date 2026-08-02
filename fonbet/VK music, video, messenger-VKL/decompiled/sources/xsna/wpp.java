package xsna;

import android.util.ArraySet;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: EntityMap.kt */
/* loaded from: classes.dex */
public final class wpp<Id, Value> {
    public Set<Id> a;
    public Set<Id> b;
    public HashMap c;

    public wpp() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashMap();
    }

    public final Collection<Id> a() {
        if (this.a.isEmpty() && this.b.isEmpty()) {
            return EmptySet.b;
        }
        HashSet hashSet = new HashSet(this.b.size() + this.a.size());
        hashSet.addAll(this.a);
        hashSet.addAll(this.b);
        return hashSet;
    }

    public final boolean b(Id id) {
        return this.c.containsKey(id) || this.b.contains(id) || this.a.contains(id);
    }

    public final wpp<Id, Value> c() {
        wpp<Id, Value> wppVar = new wpp<>();
        wppVar.c.clear();
        wppVar.a.clear();
        wppVar.b.clear();
        wppVar.c.putAll(this.c);
        wppVar.b.addAll(this.b);
        wppVar.a.addAll(this.a);
        return wppVar;
    }

    public final ArrayList d(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            Object obj = this.c.get(it.next());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final xpp e(Number number) {
        return new xpp(this.c.get(number), this.b.contains(number));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpp)) {
            return false;
        }
        wpp wppVar = (wpp) obj;
        return epx.f(this.a, wppVar.a) && epx.f(this.b, wppVar.b) && epx.f(this.c, wppVar.c);
    }

    public final boolean f() {
        return (this.b.isEmpty() && this.a.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArraySet g(wpp wppVar) {
        ArraySet arraySet = new ArraySet();
        for (Id id : wppVar.a) {
            if (b(id)) {
                arraySet.add(id);
            }
        }
        for (Object obj : wppVar.c.keySet()) {
            if (b(obj)) {
                arraySet.add(obj);
            }
        }
        return arraySet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Set h(LinkedHashSet linkedHashSet) {
        HashSet hashSet = null;
        for (Object obj : linkedHashSet) {
            if (b(obj)) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(obj);
            }
        }
        return hashSet == null ? EmptySet.b : hashSet;
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final boolean i() {
        return this.c.isEmpty() && this.a.isEmpty() && this.b.isEmpty();
    }

    public final boolean j(Id id) {
        return !b(id) || this.a.contains(id);
    }

    public final ArraySet k() {
        ArraySet arraySet = new ArraySet();
        arraySet.addAll(this.a);
        arraySet.addAll(this.c.keySet());
        return arraySet;
    }

    public final void l(Object obj, wpp wppVar) {
        if (wppVar.b(obj)) {
            if (!wppVar.a.contains(obj)) {
                this.a.remove(obj);
            }
            if (!wppVar.b.contains(obj)) {
                this.b.remove(obj);
            }
            Object obj2 = wppVar.c.get(obj);
            if (obj2 != null) {
                this.c.put(obj, obj2);
            } else {
                this.c.remove(obj);
            }
        }
    }

    public final void m(wpp<Id, Value> wppVar) {
        if (wppVar.i()) {
            return;
        }
        Set keySet = wppVar.c.keySet();
        this.a.removeAll(keySet);
        this.a.addAll(wppVar.a);
        this.b.removeAll(keySet);
        this.b.addAll(wppVar.b);
        this.c.putAll(wppVar.c);
    }

    public final HashSet n() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.c.keySet());
        hashSet.addAll(this.b);
        hashSet.addAll(this.a);
        return hashSet;
    }

    public final void o(wpp<Id, Value> wppVar) {
        this.c.putAll(wppVar.c);
        this.a.addAll(wppVar.a);
        this.b.addAll(wppVar.b);
    }

    public final void p(Number number, btx0 btx0Var) {
        this.c.put(number, btx0Var);
    }

    public final void q(Set<? extends Id> set) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Id id : set) {
            if (this.a.contains(id)) {
                hashSet.add(id);
            }
            if (this.b.contains(id)) {
                hashSet2.add(id);
            }
            Object obj = this.c.get(id);
            if (obj != null) {
                linkedHashMap.put(id, obj);
            }
        }
        this.a = hashSet;
        this.b = hashSet2;
        r(linkedHashMap);
    }

    public final void r(Map<Id, ? extends Value> map) {
        this.c = new LinkedHashMap(map);
    }

    public final void s(Set<? extends Id> set) {
        this.b = j5g.R0(set);
    }

    public final void t(Set<? extends Id> set) {
        this.a = j5g.R0(set);
    }

    public final String toString() {
        return "EntityMap(mMissedEntities=" + this.a + ", mExpiredEntities=" + this.b + ", mCached=" + this.c + ')';
    }

    public wpp(Map<Id, ? extends Value> map) {
        this.a = new HashSet();
        this.b = new HashSet();
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.putAll(map);
    }
}
