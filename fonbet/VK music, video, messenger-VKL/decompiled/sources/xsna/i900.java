package xsna;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes12.dex */
public final class i900 implements cl3 {
    public final tmu<a, Object> a = new tmu<>();
    public final b b = new b(0);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    /* compiled from: LruArrayPool.java */
    public static final class a implements hvb0 {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // xsna.hvb0
        public final void a() {
            this.a.r(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    public static final class b extends of6 {
        public final hvb0 B() {
            return new a(this);
        }
    }

    public i900(int i) {
        this.e = i;
    }

    @Override // xsna.cl3
    public final synchronized void a() {
        f(0);
    }

    @Override // xsna.cl3
    public final synchronized void b(int i) {
        try {
            if (i >= 40) {
                a();
            } else if (i >= 20 || i == 15) {
                f(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cl3
    public final synchronized <T> T c(int i, Class<T> cls) {
        a aVar;
        int i2;
        try {
            Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && ceilingKey.intValue() > i * 8)) {
                b bVar = this.b;
                hvb0 hvb0Var = (hvb0) ((ArrayDeque) bVar.a).poll();
                if (hvb0Var == null) {
                    hvb0Var = bVar.B();
                }
                aVar = (a) hvb0Var;
                aVar.b = i;
                aVar.c = cls;
            }
            b bVar2 = this.b;
            int intValue = ceilingKey.intValue();
            hvb0 hvb0Var2 = (hvb0) ((ArrayDeque) bVar2.a).poll();
            if (hvb0Var2 == null) {
                hvb0Var2 = bVar2.B();
            }
            aVar = (a) hvb0Var2;
            aVar.b = intValue;
            aVar.c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return (T) h(aVar, cls);
    }

    @Override // xsna.cl3
    public final synchronized Object d() {
        a aVar;
        b bVar = this.b;
        hvb0 hvb0Var = (hvb0) ((ArrayDeque) bVar.a).poll();
        if (hvb0Var == null) {
            hvb0Var = bVar.B();
        }
        aVar = (a) hvb0Var;
        aVar.b = 8;
        aVar.c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> i2 = i(cls);
        Integer num = i2.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                i2.remove(Integer.valueOf(i));
                return;
            } else {
                i2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void f(int i) {
        while (this.f > i) {
            Object c = this.a.c();
            nr2.q(c);
            fk3 g = g(c.getClass());
            this.f -= g.b() * g.a(c);
            e(g.a(c), c.getClass());
            if (Log.isLoggable(g.getTag(), 2)) {
                g.a(c);
            }
        }
    }

    public final <T> fk3<T> g(Class<T> cls) {
        fk3<T> mt8Var;
        HashMap hashMap = this.d;
        fk3<T> fk3Var = (fk3) hashMap.get(cls);
        if (fk3Var != null) {
            return fk3Var;
        }
        if (cls.equals(int[].class)) {
            mt8Var = new t9x();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            mt8Var = new mt8();
        }
        hashMap.put(cls, mt8Var);
        return mt8Var;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        fk3<T> g = g(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f -= g.b() * g.a(t);
            e(g.a(t), cls);
        }
        return t == null ? g.newArray(aVar.b) : t;
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    @Override // xsna.cl3
    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        fk3<T> g = g(cls);
        int a2 = g.a(t);
        int b2 = g.b() * a2;
        if (b2 <= this.e / 2) {
            b bVar = this.b;
            hvb0 hvb0Var = (hvb0) ((ArrayDeque) bVar.a).poll();
            if (hvb0Var == null) {
                hvb0Var = bVar.B();
            }
            a aVar = (a) hvb0Var;
            aVar.b = a2;
            aVar.c = cls;
            this.a.b(aVar, t);
            NavigableMap<Integer, Integer> i = i(cls);
            Integer num = i.get(Integer.valueOf(aVar.b));
            Integer valueOf = Integer.valueOf(aVar.b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            i.put(valueOf, Integer.valueOf(i2));
            this.f += b2;
            f(this.e);
        }
    }
}
