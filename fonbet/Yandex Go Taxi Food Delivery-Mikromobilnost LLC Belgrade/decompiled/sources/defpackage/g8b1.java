package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public final class g8b1 extends AbstractMap {
    public Object[] a;
    public int b;
    public Map c;
    public boolean w;
    public volatile nxs0 x;
    public Map y;

    public g8b1() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.y = map;
    }

    public final int a() {
        return this.b;
    }

    public final j8b1 b(int i) {
        if (i < this.b) {
            return (j8b1) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set c() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
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
        return f(comparable) >= 0 || this.c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int f = f(comparable);
        if (f >= 0) {
            return ((j8b1) this.a[f]).setValue(obj);
        }
        g();
        if (this.a == null) {
            this.a = new Object[16];
        }
        int i = -(f + 1);
        if (i >= 16) {
            return h().put(comparable, obj);
        }
        if (this.b == 16) {
            j8b1 j8b1Var = (j8b1) this.a[15];
            this.b = 15;
            h().put(j8b1Var.a, j8b1Var.b);
        }
        Object[] objArr = this.a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.a[i] = new j8b1(this, comparable, obj);
        this.b++;
        return null;
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.a;
        Object obj = ((j8b1) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new j8b1(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.x == null) {
            this.x = new nxs0(this, 4);
        }
        return this.x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8b1)) {
            return super.equals(obj);
        }
        g8b1 g8b1Var = (g8b1) obj;
        int size = size();
        if (size == g8b1Var.size()) {
            int i = this.b;
            if (i != g8b1Var.b) {
                return entrySet().equals(g8b1Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (b(i2).equals(g8b1Var.b(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(g8b1Var.c);
            }
            return true;
        }
        return false;
    }

    public final int f(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((j8b1) this.a[i2]).a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((j8b1) this.a[i4]).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final void g() {
        if (this.w) {
            w511.u();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        return f >= 0 ? ((j8b1) this.a[f]).b : this.c.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.y = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
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
        g();
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return e(f);
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
