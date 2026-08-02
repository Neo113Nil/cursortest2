package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import xsna.d0a0;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes11.dex */
public final class hbk0<K, V> implements muk0, Map<K, V>, kcy {
    public a b;
    public final rak0 c;
    public final sak0 d;
    public final uak0 e;

    /* compiled from: SnapshotStateMap.kt */
    public static final class a<K, V> extends puk0 {
        public d0a0<K, ? extends V> c;
        public int d;

        public a(long j, d0a0<K, ? extends V> d0a0Var) {
            super(j);
            this.c = d0a0Var;
        }

        @Override // xsna.puk0
        public final void a(puk0 puk0Var) {
            a aVar = (a) puk0Var;
            synchronized (bis.b) {
                this.c = aVar.c;
                this.d = aVar.d;
                s3q0 s3q0Var = s3q0.a;
            }
        }

        @Override // xsna.puk0
        public final puk0 b() {
            return new a(qak0.j().g(), this.c);
        }

        @Override // xsna.puk0
        public final puk0 c(long j) {
            return new a(j, this.c);
        }
    }

    public hbk0() {
        wy90 wy90Var = wy90.d;
        dak0 j = qak0.j();
        a aVar = new a(j.g(), wy90Var);
        if (!(j instanceof k2u)) {
            aVar.b = new a(1, wy90Var);
        }
        this.b = aVar;
        this.c = new rak0(this);
        this.d = new sak0(this);
        this.e = new uak0(this);
    }

    public static final boolean a(hbk0 hbk0Var, a aVar, int i, d0a0 d0a0Var) {
        boolean z;
        synchronized (bis.b) {
            int i2 = aVar.d;
            if (i2 == i) {
                aVar.c = d0a0Var;
                z = true;
                aVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final a<K, V> b() {
        return (a) qak0.t(this.b, this);
    }

    @Override // java.util.Map
    public final void clear() {
        dak0 j;
        a aVar = (a) qak0.h(this.b);
        wy90 wy90Var = wy90.d;
        if (wy90Var != aVar.c) {
            a aVar2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                a aVar3 = (a) qak0.w(aVar2, this, j);
                synchronized (bis.b) {
                    aVar3.c = wy90Var;
                    aVar3.d++;
                }
            }
            qak0.n(j, this);
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
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return b().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().c.isEmpty();
    }

    @Override // xsna.muk0
    public final puk0 j() {
        return this.b;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.d;
    }

    @Override // xsna.muk0
    public final void n(puk0 puk0Var) {
        this.b = (a) puk0Var;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        d0a0<K, ? extends V> d0a0Var;
        int i;
        V v2;
        dak0 j;
        boolean a2;
        do {
            synchronized (bis.b) {
                a aVar = (a) qak0.h(this.b);
                d0a0Var = aVar.c;
                i = aVar.d;
                s3q0 s3q0Var = s3q0.a;
            }
            az90 az90Var = (az90) d0a0Var.builder();
            v2 = (V) az90Var.put(k, v);
            d0a0<K, V> build = az90Var.build();
            if (epx.f(build, d0a0Var)) {
                break;
            }
            a aVar2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                a2 = a(this, (a) qak0.w(aVar2, this, j), i, build);
            }
            qak0.n(j, this);
        } while (!a2);
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        d0a0<K, ? extends V> d0a0Var;
        int i;
        dak0 j;
        boolean a2;
        do {
            synchronized (bis.b) {
                a aVar = (a) qak0.h(this.b);
                d0a0Var = aVar.c;
                i = aVar.d;
                s3q0 s3q0Var = s3q0.a;
            }
            az90 az90Var = (az90) d0a0Var.builder();
            az90Var.putAll(map);
            d0a0<K, V> build = az90Var.build();
            if (epx.f(build, d0a0Var)) {
                return;
            }
            a aVar2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                a2 = a(this, (a) qak0.w(aVar2, this, j), i, build);
            }
            qak0.n(j, this);
        } while (!a2);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        d0a0<K, ? extends V> d0a0Var;
        int i;
        V remove;
        dak0 j;
        boolean a2;
        do {
            synchronized (bis.b) {
                a aVar = (a) qak0.h(this.b);
                d0a0Var = aVar.c;
                i = aVar.d;
                s3q0 s3q0Var = s3q0.a;
            }
            d0a0.a<K, ? extends V> builder = d0a0Var.builder();
            remove = builder.remove(obj);
            d0a0<K, ? extends V> build = builder.build();
            if (epx.f(build, d0a0Var)) {
                break;
            }
            a aVar2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                a2 = a(this, (a) qak0.w(aVar2, this, j), i, build);
            }
            qak0.n(j, this);
        } while (!a2);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().c.size();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((a) qak0.h(this.b)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.e;
    }
}
