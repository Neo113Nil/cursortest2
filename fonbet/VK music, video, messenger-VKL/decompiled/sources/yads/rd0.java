package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.rbz0;
import xsna.sbz0;

/* loaded from: classes10.dex */
public final class rd0 extends px0 {
    public final Map b;

    public rd0(Map map) {
        this.b = map;
    }

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = (Iterator) oh2.a(((lx) entrySet()).iterator());
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.px0, java.util.Map
    public final Set entrySet() {
        return pz2.a(super.entrySet(), (ph2) new rbz0());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((mz2) entrySet()).equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return pz2.a(entrySet());
    }

    @Override // yads.px0, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && this.b.containsKey(null));
    }

    @Override // yads.px0, java.util.Map
    public final Set keySet() {
        return pz2.a(super.keySet(), (ph2) new sbz0());
    }

    @Override // yads.px0, java.util.Map
    public final int size() {
        return super.size() - (this.b.containsKey(null) ? 1 : 0);
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getKey() != null;
    }
}
