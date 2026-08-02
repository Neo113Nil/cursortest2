package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class d2b0 extends AbstractMap implements Map, bgx {
    public b2b0 a;
    public kx40 b = new kx40();
    public ce11 c;
    public Object w;
    public int x;
    public int y;

    public d2b0(b2b0 b2b0Var) {
        this.a = b2b0Var;
        b2b0 b2b0Var2 = this.a;
        this.c = b2b0Var2.a;
        this.y = b2b0Var2.b;
    }

    /* renamed from: a */
    public b2b0 b() {
        ce11 ce11Var = this.c;
        b2b0 b2b0Var = this.a;
        if (ce11Var != b2b0Var.a) {
            this.b = new kx40();
            b2b0Var = new b2b0(this.c, this.y);
        }
        this.a = b2b0Var;
        return b2b0Var;
    }

    public /* bridge */ b2b0 b() {
        return b();
    }

    public final void c(int i) {
        this.y = i;
        this.x++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = ce11.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new f2b0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g2b0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.w = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b2b0 b2b0Var = null;
        b2b0 b2b0Var2 = map instanceof b2b0 ? (b2b0) map : null;
        if (b2b0Var2 == null) {
            d2b0 d2b0Var = map instanceof d2b0 ? (d2b0) map : null;
            if (d2b0Var != null) {
                b2b0Var = d2b0Var.b();
            }
        } else {
            b2b0Var = b2b0Var2;
        }
        if (b2b0Var == null) {
            super.putAll(map);
            return;
        }
        dwi dwiVar = new dwi(0);
        int i = this.y;
        this.c = this.c.m(b2b0Var.a, 0, dwiVar, this);
        int i2 = (b2b0Var.b + i) - dwiVar.a;
        if (i != i2) {
            c(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.y;
        ce11 o = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = ce11.e;
        }
        this.c = o;
        return i != this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i2b0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.w = null;
        ce11 n = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = ce11.e;
        }
        this.c = n;
        return this.w;
    }
}
