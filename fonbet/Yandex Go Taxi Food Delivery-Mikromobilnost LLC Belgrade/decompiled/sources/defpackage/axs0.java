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

/* loaded from: classes11.dex */
public final class axs0 extends AbstractMap {
    public static final /* synthetic */ int A = 0;
    public final int a;
    public List b = Collections.EMPTY_LIST;
    public Map c;
    public boolean w;
    public volatile nxs0 x;
    public Map y;
    public volatile exs0 z;

    public axs0(int i) {
        this.a = i;
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.y = map;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((jxs0) this.b.get(i2)).a);
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
            int compareTo2 = comparable.compareTo(((jxs0) this.b.get(i4)).a);
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
        if (this.w) {
            w511.u();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.c.isEmpty() ? hz91.b : this.c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.y = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.x == null) {
            this.x = new nxs0(this, 0);
        }
        return this.x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axs0)) {
            return super.equals(obj);
        }
        axs0 axs0Var = (axs0) obj;
        int size = size();
        if (size == axs0Var.size()) {
            int size2 = this.b.size();
            if (size2 != axs0Var.b.size()) {
                return ((AbstractSet) entrySet()).equals(axs0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(axs0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(axs0Var.c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((jxs0) this.b.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.b.isEmpty();
        int i = this.a;
        if (isEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(i);
        }
        int i2 = -(a + 1);
        if (i2 >= i) {
            return e().put(comparable, obj);
        }
        if (this.b.size() == i) {
            jxs0 jxs0Var = (jxs0) this.b.remove(i - 1);
            e().put(jxs0Var.a, jxs0Var.b);
        }
        this.b.add(i2, new jxs0(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((jxs0) this.b.remove(i)).b;
        if (!this.c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new jxs0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((jxs0) this.b.get(a)).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((jxs0) this.b.get(i2)).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return g(a);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
