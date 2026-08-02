package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class l3t0 implements g5u0, Map, bgx {
    public k3t0 a;
    public final s2t0 b;
    public final s2t0 c;
    public final s2t0 w;

    public l3t0() {
        b2b0 b2b0Var = b2b0.c;
        i2t0 j = q2t0.j();
        k3t0 k3t0Var = new k3t0(j.g(), b2b0Var);
        if (!(j instanceof akt)) {
            k3t0Var.b = new k3t0(1L, b2b0Var);
        }
        this.a = k3t0Var;
        this.b = new s2t0(this, 0);
        this.c = new s2t0(this, 1);
        this.w = new s2t0(this, 2);
    }

    public static final boolean a(l3t0 l3t0Var, k3t0 k3t0Var, int i, b2b0 b2b0Var) {
        boolean z;
        synchronized (yz91.a) {
            int i2 = k3t0Var.d;
            if (i2 == i) {
                k3t0Var.c = b2b0Var;
                z = true;
                k3t0Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final k3t0 b() {
        return (k3t0) q2t0.t(this.a, this);
    }

    @Override // java.util.Map
    public final void clear() {
        i2t0 j;
        k3t0 k3t0Var = (k3t0) q2t0.h(this.a);
        b2b0 b2b0Var = b2b0.c;
        if (b2b0Var != k3t0Var.c) {
            k3t0 k3t0Var2 = this.a;
            synchronized (q2t0.c) {
                j = q2t0.j();
                k3t0 k3t0Var3 = (k3t0) q2t0.w(k3t0Var2, this, j);
                synchronized (yz91.a) {
                    k3t0Var3.c = b2b0Var;
                    k3t0Var3.d++;
                }
            }
            q2t0.n(j, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return b().c.get(obj);
    }

    @Override // defpackage.g5u0
    public final j5u0 getFirstStateRecord() {
        return this.a;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // defpackage.g5u0
    public final void prependStateRecord(j5u0 j5u0Var) {
        this.a = (k3t0) j5u0Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b2b0 b2b0Var;
        int i;
        Object put;
        i2t0 j;
        boolean a;
        do {
            synchronized (yz91.a) {
                k3t0 k3t0Var = (k3t0) q2t0.h(this.a);
                b2b0Var = k3t0Var.c;
                i = k3t0Var.d;
            }
            d2b0 b = b2b0Var.b();
            put = b.put(obj, obj2);
            b2b0 b2 = b.b();
            if (jl40.l(b2, b2b0Var)) {
                break;
            }
            k3t0 k3t0Var2 = this.a;
            synchronized (q2t0.c) {
                j = q2t0.j();
                a = a(this, (k3t0) q2t0.w(k3t0Var2, this, j), i, b2);
            }
            q2t0.n(j, this);
        } while (!a);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b2b0 b2b0Var;
        int i;
        i2t0 j;
        boolean a;
        do {
            synchronized (yz91.a) {
                k3t0 k3t0Var = (k3t0) q2t0.h(this.a);
                b2b0Var = k3t0Var.c;
                i = k3t0Var.d;
            }
            d2b0 b = b2b0Var.b();
            b.putAll(map);
            b2b0 b2 = b.b();
            if (jl40.l(b2, b2b0Var)) {
                return;
            }
            k3t0 k3t0Var2 = this.a;
            synchronized (q2t0.c) {
                j = q2t0.j();
                a = a(this, (k3t0) q2t0.w(k3t0Var2, this, j), i, b2);
            }
            q2t0.n(j, this);
        } while (!a);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b2b0 b2b0Var;
        int i;
        V remove;
        i2t0 j;
        boolean a;
        do {
            synchronized (yz91.a) {
                k3t0 k3t0Var = (k3t0) q2t0.h(this.a);
                b2b0Var = k3t0Var.c;
                i = k3t0Var.d;
            }
            d2b0 b = b2b0Var.b();
            remove = b.remove(obj);
            b2b0 b2 = b.b();
            if (jl40.l(b2, b2b0Var)) {
                break;
            }
            k3t0 k3t0Var2 = this.a;
            synchronized (q2t0.c) {
                j = q2t0.j();
                a = a(this, (k3t0) q2t0.w(k3t0Var2, this, j), i, b2);
            }
            q2t0.n(j, this);
        } while (!a);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().c.size();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((k3t0) q2t0.h(this.a)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.w;
    }
}
