package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class lzg0<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> b;
    public c<K, V> c;
    public final WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    /* compiled from: SafeIterableMap.java */
    public static class a<K, V> extends e<K, V> {
        @Override // xsna.lzg0.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.e;
        }

        @Override // xsna.lzg0.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public static class b<K, V> extends e<K, V> {
        @Override // xsna.lzg0.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // xsna.lzg0.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public static class c<K, V> implements Map.Entry<K, V> {

        @NonNull
        public final K b;

        @NonNull
        public final V c;
        public c<K, V> d;
        public c<K, V> e;

        public c(@NonNull K k, @NonNull V v) {
            this.b = k;
            this.c = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && this.c.equals(cVar.c);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.b.hashCode() ^ this.c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.b + "=" + this.c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> b;
        public boolean c = true;

        public d() {
        }

        @Override // xsna.lzg0.f
        public final void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e;
                this.b = cVar3;
                this.c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c) {
                return lzg0.this.b != null;
            }
            c<K, V> cVar = this.b;
            return (cVar == null || cVar.d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.c) {
                this.c = false;
                this.b = lzg0.this.b;
            } else {
                c<K, V> cVar = this.b;
                this.b = cVar != null ? cVar.d : null;
            }
            return this.b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> b;
        public c<K, V> c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.b = cVar2;
            this.c = cVar;
        }

        @Override // xsna.lzg0.f
        public final void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.b == cVar && cVar == this.c) {
                this.c = null;
                this.b = null;
            }
            c<K, V> cVar3 = this.b;
            if (cVar3 == cVar) {
                this.b = b(cVar3);
            }
            c<K, V> cVar4 = this.c;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.b;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.c = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.c;
            c<K, V> cVar2 = this.b;
            this.c = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public static abstract class f<K, V> {
        public abstract void a(@NonNull c<K, V> cVar);
    }

    @Nullable
    public c<K, V> a(K k) {
        c<K, V> cVar = this.b;
        while (cVar != null && !cVar.b.equals(k)) {
            cVar = cVar.d;
        }
        return cVar;
    }

    public V b(@NonNull K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.e--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(a2);
            }
        }
        c<K, V> cVar = a2.e;
        if (cVar != null) {
            cVar.d = a2.d;
        } else {
            this.b = a2.d;
        }
        c<K, V> cVar2 = a2.d;
        if (cVar2 != null) {
            cVar2.e = cVar;
        } else {
            this.c = cVar;
        }
        a2.d = null;
        a2.e = null;
        return a2.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((xsna.lzg0.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lzg0)) {
            return false;
        }
        lzg0 lzg0Var = (lzg0) obj;
        if (this.e != lzg0Var.e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = lzg0Var.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    @NonNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.b, this.c);
        this.d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append(X3.j.e);
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
