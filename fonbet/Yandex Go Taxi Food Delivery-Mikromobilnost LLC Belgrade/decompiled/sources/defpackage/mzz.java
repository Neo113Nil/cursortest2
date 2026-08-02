package defpackage;

import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes.dex */
public class mzz {
    public final int a;
    public final ozz b;
    public final ndz c;
    public int d;
    public int e;
    public int f;

    public mzz(int i) {
        this.a = i;
        if (i <= 0) {
            xva1.b("maxSize <= 0");
            throw null;
        }
        this.b = new ozz(0);
        this.c = new ndz();
    }

    public Object a(Object obj) {
        return null;
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final Object c(Object obj) {
        Object put;
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object a = a(obj);
            if (a == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    put = this.b.a.put(obj, a);
                    if (put != null) {
                        this.b.a.put(obj, put);
                    } else {
                        this.d += f(obj, a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                b(false, obj, a, put);
                return put;
            }
            h(this.a);
            return a;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        synchronized (this.c) {
            this.d += f(obj, obj2);
            put = this.b.a.put(obj, obj2);
            if (put != null) {
                this.d -= f(obj, put);
            }
        }
        if (put != null) {
            b(false, obj, put, obj2);
        }
        h(this.a);
        return put;
    }

    public final Object e(Object obj) {
        Object remove;
        synchronized (this.c) {
            remove = this.b.a.remove(obj);
            if (remove != null) {
                this.d -= f(obj, remove);
            }
        }
        if (remove != null) {
            b(false, obj, remove, null);
        }
        return remove;
    }

    public final int f(Object obj, Object obj2) {
        int g = g(obj, obj2);
        if (g >= 0) {
            return g;
        }
        xva1.c("Negative size: " + obj + '=' + obj2);
        throw null;
    }

    public int g(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        defpackage.xva1.c("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) a.Q(this.b.a.entrySet());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.b.a.remove(key);
                    this.d -= f(key, value);
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
