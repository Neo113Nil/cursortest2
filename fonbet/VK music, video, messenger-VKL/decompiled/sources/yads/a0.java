package yads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes10.dex */
public abstract class a0 extends e0 implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map f;
    public transient int g;

    public a0(Map map) {
        oh2.a(map.isEmpty());
        this.f = map;
    }

    public static Iterator a(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final n b() {
        Map map = this.f;
        return map instanceof NavigableMap ? new r(this, (NavigableMap) this.f) : map instanceof SortedMap ? new u(this, (SortedMap) this.f) : new n(this, this.f);
    }

    public final q c() {
        Map map = this.f;
        return map instanceof NavigableMap ? new s(this, (NavigableMap) this.f) : map instanceof SortedMap ? new v(this, (SortedMap) this.f) : new q(this, this.f);
    }
}
