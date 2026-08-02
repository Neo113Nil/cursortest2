package xsna;

import io.reactivex.rxjava3.internal.schedulers.ScheduledRunnable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import xsna.tup;
import xsna.vl00.i;
import xsna.vl00.m;

/* compiled from: MapMakerInternalMap.java */
/* loaded from: classes13.dex */
public final class vl00<K, V, E extends i<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final a i = new a();
    private static final long serialVersionUID = 5;
    public final transient int b;
    public final transient int c;
    final int concurrencyLevel;
    public final transient m<K, V, E, S>[] d;
    public final transient j<K, V, E, S> e;
    public transient l f;
    public transient u g;
    public transient g h;
    final tup<Object> keyEquivalence;

    /* compiled from: MapMakerInternalMap.java */
    public interface a0<K, V, E extends i<K, V, E>> {
        E a();

        a0 b(ReferenceQueue referenceQueue, z zVar);

        void clear();

        V get();
    }

    /* compiled from: MapMakerInternalMap.java */
    public static abstract class b<K, V> extends f9s<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        public transient AbstractMap c;
        final int concurrencyLevel;
        final tup<Object> keyEquivalence;
        final o keyStrength;
        final tup<Object> valueEquivalence;
        final o valueStrength;

        public b(o oVar, o oVar2, tup tupVar, tup tupVar2, int i, vl00 vl00Var) {
            this.keyStrength = oVar;
            this.valueStrength = oVar2;
            this.keyEquivalence = tupVar;
            this.valueEquivalence = tupVar2;
            this.concurrencyLevel = i;
            this.c = vl00Var;
        }

        @Override // xsna.x9s
        public final Object delegate() {
            return this.c;
        }

        @Override // xsna.w9s, xsna.x9s
        public final Map delegate() {
            return this.c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static final class b0<K, V, E extends i<K, V, E>> extends WeakReference<V> implements a0<K, V, E> {
        public final E b;

        public b0(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.b = e;
        }

        @Override // xsna.vl00.a0
        public final E a() {
            return this.b;
        }

        @Override // xsna.vl00.a0
        public final a0 b(ReferenceQueue referenceQueue, z zVar) {
            return new b0(referenceQueue, get(), zVar);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static abstract class c<K, V, E extends i<K, V, E>> implements i<K, V, E> {
        public final K b;
        public final int c;

        public c(K k, int i) {
            this.b = k;
            this.c = i;
        }

        @Override // xsna.vl00.i
        public final int a() {
            return this.c;
        }

        @Override // xsna.vl00.i
        public E c() {
            return null;
        }

        @Override // xsna.vl00.i
        public final K getKey() {
            return this.b;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public final class c0 extends nf<K, V> {
        public final K b;
        public V c;

        public c0(K k, V v) {
            this.b = k;
            this.c = v;
        }

        @Override // xsna.nf, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.b.equals(entry.getKey()) && this.c.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // xsna.nf, java.util.Map.Entry
        public final int hashCode() {
            return this.b.hashCode() ^ this.c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) vl00.this.put(this.b, v);
            this.c = v;
            return v2;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static abstract class d<K, V, E extends i<K, V, E>> extends WeakReference<K> implements i<K, V, E> {
        public final int b;

        public d(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(k, referenceQueue);
            this.b = i;
        }

        @Override // xsna.vl00.i
        public final int a() {
            return this.b;
        }

        @Override // xsna.vl00.i
        public E c() {
            return null;
        }

        @Override // xsna.vl00.i
        public final K getKey() {
            return get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static final class e implements i<Object, Object, e> {
        public e() {
            throw new AssertionError();
        }

        @Override // xsna.vl00.i
        public final int a() {
            throw new AssertionError();
        }

        @Override // xsna.vl00.i
        public final e c() {
            throw new AssertionError();
        }

        @Override // xsna.vl00.i
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // xsna.vl00.i
        public final Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public final class f extends vl00<K, V, E, S>.h<Map.Entry<K, V>> {
    }

    /* compiled from: MapMakerInternalMap.java */
    public final class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            vl00.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            vl00 vl00Var;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (vl00Var = vl00.this).get(key)) != null && vl00Var.e.c().h().c(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return vl00.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && vl00.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return vl00.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public abstract class h<T> implements Iterator<T> {
        public int b;
        public int c = -1;
        public m<K, V, E, S> d;
        public AtomicReferenceArray<E> e;
        public E f;
        public vl00<K, V, E, S>.c0 g;
        public vl00<K, V, E, S>.c0 h;

        public h() {
            this.b = vl00.this.d.length - 1;
            a();
        }

        public final void a() {
            this.g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i = this.b;
                if (i < 0) {
                    return;
                }
                m<K, V, E, S>[] mVarArr = vl00.this.d;
                this.b = i - 1;
                m<K, V, E, S> mVar = mVarArr[i];
                this.d = mVar;
                if (mVar.count != 0) {
                    this.e = this.d.table;
                    this.c = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(E e) {
            vl00 vl00Var = vl00.this;
            try {
                Object key = e.getKey();
                Object value = e.getKey() == null ? null : e.getValue();
                if (value == null) {
                    this.d.i();
                    return false;
                }
                this.g = new c0(key, value);
                this.d.i();
                return true;
            } catch (Throwable th) {
                this.d.i();
                throw th;
            }
        }

        public final vl00<K, V, E, S>.c0 c() {
            vl00<K, V, E, S>.c0 c0Var = this.g;
            if (c0Var == null) {
                throw new NoSuchElementException();
            }
            this.h = c0Var;
            a();
            return this.h;
        }

        public final boolean d() {
            E e = this.f;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f = (E) e.c();
                E e2 = this.f;
                if (e2 == null) {
                    return false;
                }
                if (b(e2)) {
                    return true;
                }
                e = this.f;
            }
        }

        public final boolean e() {
            while (true) {
                int i = this.c;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                this.c = i - 1;
                E e = atomicReferenceArray.get(i);
                this.f = e;
                if (e != null && (b(e) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.g != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            fxc0.A(this.h != null, "no calls to next() since the last call to remove()");
            vl00.this.remove(this.h.b);
            this.h = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public interface i<K, V, E extends i<K, V, E>> {
        int a();

        E c();

        K getKey();

        V getValue();
    }

    /* compiled from: MapMakerInternalMap.java */
    public interface j<K, V, E extends i<K, V, E>, S extends m<K, V, E, S>> {
        E a(S s, K k, int i, E e);

        o b();

        o c();

        S d(vl00<K, V, E, S> vl00Var, int i);

        E e(S s, E e, E e2);

        void f(S s, E e, V v);
    }

    /* compiled from: MapMakerInternalMap.java */
    public final class k extends vl00<K, V, E, S>.h<K> {
        @Override // xsna.vl00.h, java.util.Iterator
        public final K next() {
            return c().b;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public final class l extends AbstractSet<K> {
        public l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            vl00.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return vl00.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return vl00.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return vl00.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return vl00.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static final class n<K, V> extends b<K, V> {
        private static final long serialVersionUID = 3;

        /* JADX WARN: Multi-variable type inference failed */
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            int readInt = objectInputStream.readInt();
            ul00 ul00Var = new ul00();
            fxc0.p(readInt >= 0);
            ul00Var.b = readInt;
            o oVar = this.keyStrength;
            o oVar2 = ul00Var.d;
            fxc0.y(oVar2, "Key strength was already set to %s", oVar2 == null);
            oVar.getClass();
            ul00Var.d = oVar;
            o oVar3 = o.STRONG;
            if (oVar != oVar3) {
                ul00Var.a = true;
            }
            o oVar4 = this.valueStrength;
            o oVar5 = ul00Var.e;
            fxc0.y(oVar5, "Value strength was already set to %s", oVar5 == null);
            oVar4.getClass();
            ul00Var.e = oVar4;
            if (oVar4 != oVar3) {
                ul00Var.a = true;
            }
            tup<Object> tupVar = this.keyEquivalence;
            tup<Object> tupVar2 = ul00Var.f;
            fxc0.y(tupVar2, "key equivalence was already set to %s", tupVar2 == null);
            tupVar.getClass();
            ul00Var.f = tupVar;
            ul00Var.a = true;
            int i = this.concurrencyLevel;
            int i2 = ul00Var.c;
            fxc0.x(i2, "concurrency level was already set to %s", i2 == -1);
            fxc0.p(i > 0);
            ul00Var.c = i;
            this.c = (AbstractMap) ul00Var.a();
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                } else {
                    this.c.put(readObject, objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.c;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.c.size());
            for (Map.Entry<K, V> entry : this.c.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    public static abstract class o {
        private static final /* synthetic */ o[] $VALUES;
        public static final o STRONG;
        public static final o WEAK;

        /* compiled from: MapMakerInternalMap.java */
        public enum a extends o {
            public a() {
                super("STRONG", 0);
            }

            @Override // xsna.vl00.o
            public final tup<Object> h() {
                return tup.a.b;
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        public enum b extends o {
            public b() {
                super("WEAK", 1);
            }

            @Override // xsna.vl00.o
            public final tup<Object> h() {
                return tup.b.b;
            }
        }

        static {
            a aVar = new a();
            STRONG = aVar;
            b bVar = new b();
            WEAK = bVar;
            $VALUES = new o[]{aVar, bVar};
        }

        public o() {
            throw null;
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) $VALUES.clone();
        }

        public abstract tup<Object> h();
    }

    /* compiled from: MapMakerInternalMap.java */
    public static class p<K, V> extends c<K, V, p<K, V>> {
        public volatile V d;

        /* compiled from: MapMakerInternalMap.java */
        public static final class a<K, V> implements j<K, V, p<K, V>, q<K, V>> {
            public static final a<?, ?> a = new a<>();

            @Override // xsna.vl00.j
            public final i a(m mVar, Object obj, int i, i iVar) {
                p pVar = (p) iVar;
                return pVar == null ? new p(obj, i) : new b(obj, i, pVar);
            }

            @Override // xsna.vl00.j
            public final o b() {
                return o.STRONG;
            }

            @Override // xsna.vl00.j
            public final o c() {
                return o.STRONG;
            }

            @Override // xsna.vl00.j
            public final m d(vl00 vl00Var, int i) {
                return new q(vl00Var, i);
            }

            @Override // xsna.vl00.j
            public final i e(m mVar, i iVar, i iVar2) {
                p pVar = (p) iVar;
                p pVar2 = (p) iVar2;
                K k = pVar.b;
                int i = pVar.c;
                p pVar3 = pVar2 == null ? new p(k, i) : new b(k, i, pVar2);
                pVar3.d = pVar.d;
                return pVar3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.vl00.j
            public final void f(m mVar, i iVar, Object obj) {
                ((p) iVar).d = obj;
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        public static final class b<K, V> extends p<K, V> {
            public final p<K, V> e;

            public b(K k, int i, p<K, V> pVar) {
                super(k, i);
                this.e = pVar;
            }

            @Override // xsna.vl00.c, xsna.vl00.i
            public final i c() {
                return this.e;
            }
        }

        public p() {
            throw null;
        }

        public p(Object obj, int i) {
            super(obj, i);
            this.d = null;
        }

        @Override // xsna.vl00.i
        public final V getValue() {
            return this.d;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static class r<K, V> extends c<K, V, r<K, V>> implements z<K, V, r<K, V>> {
        public volatile a0<K, V, r<K, V>> d;

        /* compiled from: MapMakerInternalMap.java */
        public static final class a<K, V> implements j<K, V, r<K, V>, s<K, V>> {
            public static final a<?, ?> a = new a<>();

            @Override // xsna.vl00.j
            public final i a(m mVar, Object obj, int i, i iVar) {
                r rVar = (r) iVar;
                return rVar == null ? new r(obj, i) : new b(obj, i, rVar);
            }

            @Override // xsna.vl00.j
            public final o b() {
                return o.STRONG;
            }

            @Override // xsna.vl00.j
            public final o c() {
                return o.WEAK;
            }

            @Override // xsna.vl00.j
            public final m d(vl00 vl00Var, int i) {
                return new s(vl00Var, i);
            }

            @Override // xsna.vl00.j
            public final i e(m mVar, i iVar, i iVar2) {
                s sVar = (s) mVar;
                r rVar = (r) iVar;
                r rVar2 = (r) iVar2;
                int i = m.b;
                if (rVar.getValue() == null) {
                    return null;
                }
                K k = rVar.b;
                int i2 = rVar.c;
                r rVar3 = rVar2 == null ? new r(k, i2) : new b(k, i2, rVar2);
                rVar3.d = rVar.d.b(sVar.queueForValues, rVar3);
                return rVar3;
            }

            @Override // xsna.vl00.j
            public final void f(m mVar, i iVar, Object obj) {
                r rVar = (r) iVar;
                a0<K, V, r<K, V>> a0Var = rVar.d;
                rVar.d = new b0(((s) mVar).queueForValues, obj, rVar);
                a0Var.clear();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        public static final class b<K, V> extends r<K, V> {
            public final r<K, V> e;

            public b(K k, int i, r<K, V> rVar) {
                super(k, i);
                this.e = rVar;
            }

            @Override // xsna.vl00.c, xsna.vl00.i
            public final i c() {
                return this.e;
            }
        }

        public r() {
            throw null;
        }

        public r(Object obj, int i) {
            super(obj, i);
            this.d = vl00.i;
        }

        @Override // xsna.vl00.z
        public final a0<K, V, r<K, V>> b() {
            return this.d;
        }

        @Override // xsna.vl00.i
        public final V getValue() {
            return this.d.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public final class t extends vl00<K, V, E, S>.h<V> {
        @Override // xsna.vl00.h, java.util.Iterator
        public final V next() {
            return c().c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public final class u extends AbstractCollection<V> {
        public u() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            vl00.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return vl00.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return vl00.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new t();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return vl00.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static class v<K, V> extends d<K, V, v<K, V>> {
        public volatile V c;

        /* compiled from: MapMakerInternalMap.java */
        public static final class a<K, V> implements j<K, V, v<K, V>, w<K, V>> {
            public static final a<?, ?> a = new a<>();

            @Override // xsna.vl00.j
            public final i a(m mVar, Object obj, int i, i iVar) {
                w wVar = (w) mVar;
                v vVar = (v) iVar;
                return vVar == null ? new v(wVar.queueForKeys, obj, i) : new b(wVar.queueForKeys, obj, i, vVar);
            }

            @Override // xsna.vl00.j
            public final o b() {
                return o.WEAK;
            }

            @Override // xsna.vl00.j
            public final o c() {
                return o.STRONG;
            }

            @Override // xsna.vl00.j
            public final m d(vl00 vl00Var, int i) {
                return new w(vl00Var, i);
            }

            @Override // xsna.vl00.j
            public final i e(m mVar, i iVar, i iVar2) {
                w wVar = (w) mVar;
                v vVar = (v) iVar;
                v vVar2 = (v) iVar2;
                K k = vVar.get();
                if (k == null) {
                    return null;
                }
                int i = vVar.b;
                v vVar3 = vVar2 == null ? new v(wVar.queueForKeys, k, i) : new b(wVar.queueForKeys, k, i, vVar2);
                vVar3.c = vVar.c;
                return vVar3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.vl00.j
            public final void f(m mVar, i iVar, Object obj) {
                ((v) iVar).c = obj;
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        public static final class b<K, V> extends v<K, V> {
            public final v<K, V> d;

            public b(ReferenceQueue referenceQueue, Object obj, int i, v vVar) {
                super(referenceQueue, obj, i);
                this.d = vVar;
            }

            @Override // xsna.vl00.d, xsna.vl00.i
            public final i c() {
                return this.d;
            }
        }

        public v() {
            throw null;
        }

        public v(ReferenceQueue referenceQueue, Object obj, int i) {
            super(referenceQueue, obj, i);
            this.c = null;
        }

        @Override // xsna.vl00.i
        public final V getValue() {
            return this.c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static class x<K, V> extends d<K, V, x<K, V>> implements z<K, V, x<K, V>> {
        public volatile a0<K, V, x<K, V>> c;

        /* compiled from: MapMakerInternalMap.java */
        public static final class a<K, V> implements j<K, V, x<K, V>, y<K, V>> {
            public static final a<?, ?> a = new a<>();

            @Override // xsna.vl00.j
            public final i a(m mVar, Object obj, int i, i iVar) {
                y yVar = (y) mVar;
                x xVar = (x) iVar;
                return xVar == null ? new x(yVar.queueForKeys, obj, i) : new b(yVar.queueForKeys, obj, i, xVar);
            }

            @Override // xsna.vl00.j
            public final o b() {
                return o.WEAK;
            }

            @Override // xsna.vl00.j
            public final o c() {
                return o.WEAK;
            }

            @Override // xsna.vl00.j
            public final m d(vl00 vl00Var, int i) {
                return new y(vl00Var, i);
            }

            @Override // xsna.vl00.j
            public final i e(m mVar, i iVar, i iVar2) {
                y yVar = (y) mVar;
                x xVar = (x) iVar;
                x xVar2 = (x) iVar2;
                K k = xVar.get();
                if (k == null) {
                    return null;
                }
                int i = m.b;
                if (xVar.c.get() == null) {
                    return null;
                }
                int i2 = xVar.b;
                x xVar3 = xVar2 == null ? new x(yVar.queueForKeys, k, i2) : new b(yVar.queueForKeys, k, i2, xVar2);
                xVar3.c = xVar.c.b(yVar.queueForValues, xVar3);
                return xVar3;
            }

            @Override // xsna.vl00.j
            public final void f(m mVar, i iVar, Object obj) {
                x xVar = (x) iVar;
                a0<K, V, x<K, V>> a0Var = xVar.c;
                xVar.c = new b0(((y) mVar).queueForValues, obj, xVar);
                a0Var.clear();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        public static final class b<K, V> extends x<K, V> {
            public final x<K, V> d;

            public b(ReferenceQueue<K> referenceQueue, K k, int i, x<K, V> xVar) {
                super(referenceQueue, k, i);
                this.d = xVar;
            }

            @Override // xsna.vl00.d, xsna.vl00.i
            public final i c() {
                return this.d;
            }
        }

        public x(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.c = vl00.i;
        }

        @Override // xsna.vl00.z
        public final a0<K, V, x<K, V>> b() {
            return this.c;
        }

        @Override // xsna.vl00.i
        public final V getValue() {
            return this.c.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public interface z<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        a0<K, V, E> b();
    }

    public vl00(ul00 ul00Var, j<K, V, E, S> jVar) {
        int i2 = ul00Var.c;
        this.concurrencyLevel = Math.min(i2 == -1 ? 4 : i2, 65536);
        tup<Object> tupVar = ul00Var.f;
        o oVar = ul00Var.d;
        o oVar2 = o.STRONG;
        if (oVar == null) {
            if (oVar2 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            oVar = oVar2;
        }
        tup<Object> h2 = oVar.h();
        if (tupVar == null) {
            if (h2 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            tupVar = h2;
        }
        this.keyEquivalence = tupVar;
        this.e = jVar;
        int i3 = ul00Var.b;
        int min = Math.min(i3 == -1 ? 16 : i3, 1073741824);
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        int i7 = 1;
        while (i7 < this.concurrencyLevel) {
            i6++;
            i7 <<= 1;
        }
        this.c = 32 - i6;
        this.b = i7 - 1;
        this.d = new m[i7];
        int i8 = min / i7;
        while (i5 < (i7 * i8 < min ? i8 + 1 : i8)) {
            i5 <<= 1;
        }
        while (true) {
            m<K, V, E, S>[] mVarArr = this.d;
            if (i4 >= mVarArr.length) {
                return;
            }
            mVarArr[i4] = this.e.d(this, i5);
            i4++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int a(Object obj) {
        int b2 = this.keyEquivalence.b(obj);
        int i2 = b2 + ((b2 << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    public final m<K, V, E, S> b(int i2) {
        return this.d[(i2 >>> this.c) & this.b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (m<K, V, E, S> mVar : this.d) {
            if (mVar.count != 0) {
                mVar.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = mVar.table;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    mVar.g();
                    mVar.readCount.set(0);
                    mVar.modCount++;
                    mVar.count = 0;
                    mVar.unlock();
                } catch (Throwable th) {
                    mVar.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        m<K, V, E, S> b2 = b(a2);
        b2.getClass();
        try {
            if (b2.count == 0) {
                return false;
            }
            i e2 = b2.e(a2, obj);
            if (e2 != null) {
                if (e2.getValue() != null) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            b2.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        if (obj != null) {
            m<K, V, E, S>[] mVarArr = this.d;
            long j2 = -1;
            int i2 = 0;
            while (i2 < 3) {
                long j3 = 0;
                for (m<K, V, E, S> mVar : mVarArr) {
                    int i3 = mVar.count;
                    AtomicReferenceArray<E> atomicReferenceArray = mVar.table;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        for (E e2 = atomicReferenceArray.get(i4); e2 != null; e2 = e2.c()) {
                            if (e2.getKey() == null) {
                                mVar.o();
                            } else {
                                value = e2.getValue();
                                if (value == null) {
                                    mVar.o();
                                }
                                if (value == null && this.e.c().h().c(obj, value)) {
                                    return true;
                                }
                            }
                            value = null;
                            if (value == null) {
                            }
                        }
                    }
                    j3 += mVar.modCount;
                }
                if (j3 == j2) {
                    return false;
                }
                i2++;
                j2 = j3;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        g gVar = this.h;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        this.h = gVar2;
        return gVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        m<K, V, E, S> b2 = b(a2);
        b2.getClass();
        try {
            i e2 = b2.e(a2, obj);
            if (e2 == null) {
                return null;
            }
            V v2 = (V) e2.getValue();
            if (v2 == null) {
                b2.o();
            }
            return v2;
        } finally {
            b2.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        m<K, V, E, S>[] mVarArr = this.d;
        long j2 = 0;
        for (int i2 = 0; i2 < mVarArr.length; i2++) {
            if (mVarArr[i2].count != 0) {
                return false;
            }
            j2 += mVarArr[i2].modCount;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < mVarArr.length; i3++) {
            if (mVarArr[i3].count != 0) {
                return false;
            }
            j2 -= mVarArr[i3].modCount;
        }
        return j2 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        l lVar = this.f;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l();
        this.f = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v2) {
        k2.getClass();
        v2.getClass();
        int a2 = a(k2);
        return (V) b(a2).j(k2, v2, false, a2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k2, V v2) {
        k2.getClass();
        v2.getClass();
        int a2 = a(k2);
        return (V) b(a2).j(k2, v2, true, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        m<K, V, E, S> b2 = b(a2);
        b2.lock();
        try {
            b2.l();
            AtomicReferenceArray<E> atomicReferenceArray = b2.table;
            int length = (atomicReferenceArray.length() - 1) & a2;
            i iVar = (i) atomicReferenceArray.get(length);
            for (i iVar2 = iVar; iVar2 != null; iVar2 = iVar2.c()) {
                Object key = iVar2.getKey();
                if (iVar2.a() == a2 && key != null && b2.map.keyEquivalence.c(obj, key)) {
                    V v2 = (V) iVar2.getValue();
                    if (v2 == null && iVar2.getValue() != null) {
                        return null;
                    }
                    b2.modCount++;
                    i k2 = b2.k(iVar, iVar2);
                    int i2 = b2.count - 1;
                    atomicReferenceArray.set(length, k2);
                    b2.count = i2;
                    return v2;
                }
            }
            return null;
        } finally {
            b2.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k2, V v2) {
        k2.getClass();
        v2.getClass();
        int a2 = a(k2);
        m<K, V, E, S> b2 = b(a2);
        b2.lock();
        try {
            b2.l();
            AtomicReferenceArray<E> atomicReferenceArray = b2.table;
            int length = (atomicReferenceArray.length() - 1) & a2;
            i iVar = (i) atomicReferenceArray.get(length);
            for (i iVar2 = iVar; iVar2 != null; iVar2 = iVar2.c()) {
                Object key = iVar2.getKey();
                if (iVar2.a() == a2 && key != null && b2.map.keyEquivalence.c(k2, key)) {
                    V v3 = (V) iVar2.getValue();
                    if (v3 != null) {
                        b2.modCount++;
                        b2.n(iVar2, v2);
                        return v3;
                    }
                    if (iVar2.getValue() == null) {
                        b2.modCount++;
                        i k3 = b2.k(iVar, iVar2);
                        int i2 = b2.count - 1;
                        atomicReferenceArray.set(length, k3);
                        b2.count = i2;
                    }
                    return null;
                }
            }
            return null;
        } finally {
            b2.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j2 = 0;
        for (int i2 = 0; i2 < this.d.length; i2++) {
            j2 += r0[i2].count;
        }
        return ipx.w(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        u uVar = this.g;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        this.g = uVar2;
        return uVar2;
    }

    public Object writeReplace() {
        j<K, V, E, S> jVar = this.e;
        return new n(jVar.b(), jVar.c(), this.keyEquivalence, jVar.c().h(), this.concurrencyLevel, this);
    }

    /* compiled from: MapMakerInternalMap.java */
    public class a implements a0<Object, Object, e> {
        @Override // xsna.vl00.a0
        public final /* bridge */ /* synthetic */ e a() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vl00.a0
        public final a0 b(ReferenceQueue referenceQueue, z zVar) {
            return this;
        }

        @Override // xsna.vl00.a0
        public final Object get() {
            return null;
        }

        @Override // xsna.vl00.a0
        public final void clear() {
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static abstract class m<K, V, E extends i<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock {
        public static final /* synthetic */ int b = 0;
        volatile int count;
        final vl00<K, V, E, S> map;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        volatile AtomicReferenceArray<E> table;
        int threshold;

        public m(vl00<K, V, E, S> vl00Var, int i) {
            this.map = vl00Var;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i);
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                i iVar = (i) poll;
                vl00<K, V, E, S> vl00Var = this.map;
                vl00Var.getClass();
                int a = iVar.a();
                m<K, V, E, S> b2 = vl00Var.b(a);
                b2.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = b2.table;
                    int length = a & (atomicReferenceArray.length() - 1);
                    i iVar2 = (i) atomicReferenceArray.get(length);
                    i iVar3 = iVar2;
                    while (true) {
                        if (iVar3 == null) {
                            break;
                        }
                        if (iVar3 == iVar) {
                            b2.modCount++;
                            i k = b2.k(iVar2, iVar3);
                            int i2 = b2.count - 1;
                            atomicReferenceArray.set(length, k);
                            b2.count = i2;
                            break;
                        }
                        iVar3 = iVar3.c();
                    }
                    i++;
                } finally {
                    b2.unlock();
                }
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                a0<K, V, E> a0Var = (a0) poll;
                vl00<K, V, E, S> vl00Var = this.map;
                vl00Var.getClass();
                E a = a0Var.a();
                int a2 = a.a();
                m<K, V, E, S> b2 = vl00Var.b(a2);
                Object key = a.getKey();
                b2.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = b2.table;
                    int length = (atomicReferenceArray.length() - 1) & a2;
                    i iVar = (i) atomicReferenceArray.get(length);
                    i iVar2 = iVar;
                    while (true) {
                        if (iVar2 == null) {
                            break;
                        }
                        Object key2 = iVar2.getKey();
                        if (iVar2.a() != a2 || key2 == null || !b2.map.keyEquivalence.c(key, key2)) {
                            iVar2 = iVar2.c();
                        } else if (((z) iVar2).b() == a0Var) {
                            b2.modCount++;
                            i k = b2.k(iVar, iVar2);
                            int i2 = b2.count - 1;
                            atomicReferenceArray.set(length, k);
                            b2.count = i2;
                        }
                    }
                    i++;
                } finally {
                    b2.unlock();
                }
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            ScheduledRunnable scheduledRunnable = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.threshold = (scheduledRunnable.length() * 3) / 4;
            int length2 = scheduledRunnable.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E e = atomicReferenceArray.get(i2);
                if (e != null) {
                    i c = e.c();
                    int a = e.a() & length2;
                    if (c == null) {
                        scheduledRunnable.set(a, e);
                    } else {
                        i iVar = e;
                        while (c != null) {
                            int a2 = c.a() & length2;
                            if (a2 != a) {
                                iVar = c;
                                a = a2;
                            }
                            c = c.c();
                        }
                        scheduledRunnable.set(a, iVar);
                        while (e != iVar) {
                            int a3 = e.a() & length2;
                            i e2 = this.map.e.e(m(), e, (i) scheduledRunnable.get(a3));
                            if (e2 != null) {
                                scheduledRunnable.set(a3, e2);
                            } else {
                                i--;
                            }
                            e = e.c();
                        }
                    }
                }
            }
            this.table = scheduledRunnable;
            this.count = i;
        }

        public final i e(int i, Object obj) {
            if (this.count == 0) {
                return null;
            }
            for (E e = this.table.get((r0.length() - 1) & i); e != null; e = e.c()) {
                if (e.a() == i) {
                    Object key = e.getKey();
                    if (key == null) {
                        o();
                    } else if (this.map.keyEquivalence.c(obj, key)) {
                        return e;
                    }
                }
            }
            return null;
        }

        public final void i() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                l();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object j(Object obj, Object obj2, boolean z, int i) {
            lock();
            try {
                l();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    d();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                i iVar = (i) atomicReferenceArray.get(length);
                for (i iVar2 = iVar; iVar2 != null; iVar2 = iVar2.c()) {
                    Object key = iVar2.getKey();
                    if (iVar2.a() == i && key != null && this.map.keyEquivalence.c(obj, key)) {
                        Object value = iVar2.getValue();
                        if (value == null) {
                            this.modCount++;
                            n(iVar2, obj2);
                            this.count = this.count;
                            unlock();
                            return null;
                        }
                        if (z) {
                            unlock();
                            return value;
                        }
                        this.modCount++;
                        n(iVar2, obj2);
                        unlock();
                        return value;
                    }
                }
                this.modCount++;
                i a = this.map.e.a(m(), obj, i, iVar);
                n(a, obj2);
                atomicReferenceArray.set(length, a);
                this.count = i2;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        public final E k(E e, E e2) {
            int i = this.count;
            E e3 = (E) e2.c();
            while (e != e2) {
                Object e4 = this.map.e.e(m(), e, e3);
                if (e4 != null) {
                    e3 = (E) e4;
                } else {
                    i--;
                }
                e = (E) e.c();
            }
            this.count = i;
            return e3;
        }

        public final void l() {
            if (tryLock()) {
                try {
                    h();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S m();

        public final void n(E e, V v) {
            this.map.e.f(m(), e, v);
        }

        public final void o() {
            if (tryLock()) {
                try {
                    h();
                } finally {
                    unlock();
                }
            }
        }

        public void g() {
        }

        public void h() {
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static final class q<K, V> extends m<K, V, p<K, V>, q<K, V>> {
        public q() {
            throw null;
        }

        @Override // xsna.vl00.m
        public final m m() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static final class s<K, V> extends m<K, V, r<K, V>, s<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        public s(vl00<K, V, r<K, V>, s<K, V>> vl00Var, int i) {
            super(vl00Var, i);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // xsna.vl00.m
        public final void g() {
            while (this.queueForValues.poll() != null) {
            }
        }

        @Override // xsna.vl00.m
        public final void h() {
            b(this.queueForValues);
        }

        @Override // xsna.vl00.m
        public final m m() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static final class w<K, V> extends m<K, V, v<K, V>, w<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        public w(vl00<K, V, v<K, V>, w<K, V>> vl00Var, int i) {
            super(vl00Var, i);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // xsna.vl00.m
        public final void g() {
            while (this.queueForKeys.poll() != null) {
            }
        }

        @Override // xsna.vl00.m
        public final void h() {
            a(this.queueForKeys);
        }

        @Override // xsna.vl00.m
        public final m m() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    public static final class y<K, V> extends m<K, V, x<K, V>, y<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        public y(vl00<K, V, x<K, V>, y<K, V>> vl00Var, int i) {
            super(vl00Var, i);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // xsna.vl00.m
        public final void g() {
            while (this.queueForKeys.poll() != null) {
            }
        }

        @Override // xsna.vl00.m
        public final void h() {
            a(this.queueForKeys);
            b(this.queueForValues);
        }

        @Override // xsna.vl00.m
        public final m m() {
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z2 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        m<K, V, E, S> b2 = b(a2);
        b2.lock();
        try {
            b2.l();
            AtomicReferenceArray<E> atomicReferenceArray = b2.table;
            int length = (atomicReferenceArray.length() - 1) & a2;
            i iVar = (i) atomicReferenceArray.get(length);
            for (i iVar2 = iVar; iVar2 != null; iVar2 = iVar2.c()) {
                Object key = iVar2.getKey();
                if (iVar2.a() == a2 && key != null && b2.map.keyEquivalence.c(obj, key)) {
                    if (b2.map.e.c().h().c(obj2, iVar2.getValue())) {
                        z2 = true;
                    } else if (iVar2.getValue() != null) {
                        return false;
                    }
                    b2.modCount++;
                    i k2 = b2.k(iVar, iVar2);
                    int i2 = b2.count - 1;
                    atomicReferenceArray.set(length, k2);
                    b2.count = i2;
                    return z2;
                }
            }
            return false;
        } finally {
            b2.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k2, V v2, V v3) {
        k2.getClass();
        v3.getClass();
        if (v2 == null) {
            return false;
        }
        int a2 = a(k2);
        m<K, V, E, S> b2 = b(a2);
        b2.lock();
        try {
            b2.l();
            AtomicReferenceArray<E> atomicReferenceArray = b2.table;
            int length = (atomicReferenceArray.length() - 1) & a2;
            i iVar = (i) atomicReferenceArray.get(length);
            for (i iVar2 = iVar; iVar2 != null; iVar2 = iVar2.c()) {
                Object key = iVar2.getKey();
                if (iVar2.a() == a2 && key != null && b2.map.keyEquivalence.c(k2, key)) {
                    Object value = iVar2.getValue();
                    if (value == null) {
                        if (iVar2.getValue() == null) {
                            b2.modCount++;
                            i k3 = b2.k(iVar, iVar2);
                            int i2 = b2.count - 1;
                            atomicReferenceArray.set(length, k3);
                            b2.count = i2;
                        }
                        return false;
                    }
                    if (!b2.map.e.c().h().c(v2, value)) {
                        return false;
                    }
                    b2.modCount++;
                    b2.n(iVar2, v3);
                    return true;
                }
            }
            return false;
        } finally {
            b2.unlock();
        }
    }
}
