package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public final class bxs0 extends AbstractMap {
    public static final /* synthetic */ int z = 0;
    public Object[] a;
    public int b;
    public Map c;
    public boolean w;
    public volatile nxs0 x;
    public Map y;

    public static bxs0 f() {
        bxs0 bxs0Var = new bxs0();
        Map map = Collections.EMPTY_MAP;
        bxs0Var.c = map;
        bxs0Var.y = map;
        return bxs0Var;
    }

    public final int a(Comparable comparable) {
        int i;
        int i2 = this.b;
        int i3 = i2 - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((kxs0) this.a[i3]).a);
            if (compareTo > 0) {
                i = i2 + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = comparable.compareTo(((kxs0) this.a[i5]).a);
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        i = i4 + 1;
        return -i;
    }

    public final void b() {
        if (this.w) {
            w511.u();
        }
    }

    public final kxs0 c(int i) {
        if (i < this.b) {
            return (kxs0) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
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

    public final Set d() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
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
            this.x = new nxs0(this, 1);
        }
        return this.x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxs0)) {
            return super.equals(obj);
        }
        bxs0 bxs0Var = (bxs0) obj;
        int size = size();
        if (size == bxs0Var.size()) {
            int i = this.b;
            if (i != bxs0Var.b) {
                return ((AbstractSet) entrySet()).equals(bxs0Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (c(i2).equals(bxs0Var.c(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(bxs0Var.c);
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
            return ((kxs0) this.a[a]).setValue(obj);
        }
        b();
        if (this.a == null) {
            this.a = new Object[16];
        }
        int i = -(a + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        int i2 = this.b;
        if (i2 == 16) {
            kxs0 kxs0Var = (kxs0) this.a[15];
            this.b = i2 - 1;
            e().put(kxs0Var.a, kxs0Var.b);
        }
        Object[] objArr = this.a;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.a[i] = new kxs0(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((kxs0) this.a[a]).b : this.c.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object[] objArr = this.a;
        Object obj = ((kxs0) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new kxs0(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.a[i3].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + i2 : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}
