package xsna;

import com.ironsource.B5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.kt */
/* loaded from: classes.dex */
public class m900<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final ozz lock;
    private final r900<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public m900(int i) {
        this.maxSize = i;
        if (i <= 0) {
            alk.B("maxSize <= 0");
            throw null;
        }
        this.map = new r900<>();
        this.lock = new ozz();
    }

    private final int safeSizeOf(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        alk.C("Negative size: " + k + B5.U + v);
        throw null;
    }

    public V create(K k) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final V get(K k) {
        V v;
        synchronized (this.lock) {
            V v2 = this.map.a.get(k);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V create = create(k);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v = (V) this.map.a.put(k, create);
                    if (v != null) {
                        this.map.a.put(k, v);
                    } else {
                        this.size += safeSizeOf(k, create);
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                entryRemoved(false, k, create, v);
                return v;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final V put(K k, V v) {
        V put;
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(k, v);
                put = this.map.a.put(k, v);
                if (put != null) {
                    this.size -= safeSizeOf(k, put);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            entryRemoved(false, k, put, v);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final V remove(K k) {
        V remove;
        synchronized (this.lock) {
            try {
                remove = this.map.a.remove(k);
                if (remove != null) {
                    this.size -= safeSizeOf(k, remove);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, k, remove, null);
        }
        return remove;
    }

    public void resize(int i) {
        if (!(i > 0)) {
            alk.B("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i;
            s3q0 s3q0Var = s3q0.a;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(K k, V v) {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.a.entrySet().size());
            Iterator<T> it = this.map.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        xsna.alk.C("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.a.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size <= i || this.map.a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) j5g.Z(this.map.a.entrySet());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.map.a.remove(key);
                    this.size -= safeSizeOf(key, value);
                    this.evictionCount++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }

    public void entryRemoved(boolean z, K k, V v, V v2) {
    }
}
