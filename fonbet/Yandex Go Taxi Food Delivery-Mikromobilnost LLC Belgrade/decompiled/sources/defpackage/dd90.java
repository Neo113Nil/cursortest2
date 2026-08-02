package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class dd90 implements Iterable, xfx {
    public static final dd90 b = new dd90();
    public final Map a;

    public dd90() {
        this(b.f());
    }

    public final Map a() {
        Map map = this.a;
        if (map.isEmpty()) {
            return b.f();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = ((gd90) entry.getValue()).b;
            if (str != null) {
                linkedHashMap.put(entry.getKey(), str);
            }
        }
        return linkedHashMap;
    }

    public final Object b(String str) {
        gd90 gd90Var = (gd90) this.a.get(str);
        if (gd90Var != null) {
            return gd90Var.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dd90) {
            return jl40.l(this.a, ((dd90) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), (gd90) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("Parameters(entries="), this.a, ')');
    }

    public dd90(Map map) {
        this.a = map;
    }

    public static final class a {
        public final LinkedHashMap a;

        public a(dd90 dd90Var) {
            this.a = new LinkedHashMap(dd90Var.a);
        }

        public a() {
            this.a = new LinkedHashMap();
        }
    }
}
