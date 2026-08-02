package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class cxs0 extends AbstractMap {
    public static final /* synthetic */ int z = 0;
    public List a;
    public Map b;
    public boolean c;
    public volatile nxs0 w;
    public Map x;
    public volatile gxs0 y;

    public static cxs0 f() {
        cxs0 cxs0Var = new cxs0();
        cxs0Var.a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        cxs0Var.b = map;
        cxs0Var.x = map;
        return cxs0Var;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.a.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((lxs0) this.a.get(i2)).a());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((lxs0) this.a.get(i4)).a());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (this.c) {
            w511.u();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Set d() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.x = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.w == null) {
            this.w = new nxs0(this, 2);
        }
        return this.w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxs0)) {
            return super.equals(obj);
        }
        cxs0 cxs0Var = (cxs0) obj;
        int size = size();
        if (size == cxs0Var.size()) {
            int size2 = this.a.size();
            if (size2 != cxs0Var.a.size()) {
                return ((AbstractSet) entrySet()).equals(cxs0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(cxs0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.b.equals(cxs0Var.b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((lxs0) this.a.get(a)).setValue(obj);
        }
        b();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(16);
        }
        int i = -(a + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            lxs0 lxs0Var = (lxs0) this.a.remove(15);
            e().put(lxs0Var.a(), lxs0Var.getValue());
        }
        this.a.add(i, new lxs0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((lxs0) this.a.get(a)).getValue() : this.b.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object value = ((lxs0) this.a.remove(i)).getValue();
        if (!this.b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            this.a.add(new lxs0(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((lxs0) this.a.get(i2)).hashCode();
        }
        return this.b.size() > 0 ? this.b.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.size() + this.a.size();
    }
}
