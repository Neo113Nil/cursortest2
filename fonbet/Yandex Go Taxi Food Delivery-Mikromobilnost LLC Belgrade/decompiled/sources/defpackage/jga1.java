package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public final class jga1 extends AbstractMap {
    public static final /* synthetic */ int z = 0;
    public Object[] a;
    public int b;
    public Map c;
    public boolean w;
    public volatile nxs0 x;
    public Map y;

    public jga1() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.y = map;
    }

    public final int a() {
        return this.b;
    }

    public final Set b() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int e = e(comparable);
        if (e >= 0) {
            return ((qga1) this.a[e]).setValue(obj);
        }
        h();
        if (this.a == null) {
            this.a = new Object[16];
        }
        int i = -(e + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.b == 16) {
            qga1 qga1Var = (qga1) this.a[15];
            this.b = 15;
            g().put(qga1Var.a, qga1Var.b);
        }
        Object[] objArr = this.a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.a[i] = new qga1(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
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
        return e(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final qga1 d(int i) {
        if (i < this.b) {
            return (qga1) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final int e(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((qga1) this.a[i2]).a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((qga1) this.a[i4]).a);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.x == null) {
            this.x = new nxs0(this, 3);
        }
        return this.x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jga1)) {
            return super.equals(obj);
        }
        jga1 jga1Var = (jga1) obj;
        int size = size();
        if (size == jga1Var.size()) {
            int i = this.b;
            if (i != jga1Var.b) {
                return entrySet().equals(jga1Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (d(i2).equals(jga1Var.d(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(jga1Var.c);
            }
            return true;
        }
        return false;
    }

    public final Object f(int i) {
        h();
        Object[] objArr = this.a;
        Object obj = ((qga1) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new qga1(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.y = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        return e >= 0 ? ((qga1) this.a[e]).b : this.c.get(comparable);
    }

    public final void h() {
        if (this.w) {
            w511.u();
        }
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
        h();
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return f(e);
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
