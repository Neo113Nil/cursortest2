package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes12.dex */
public class l900<T, Y> {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;

    /* compiled from: LruCache.java */
    public static final class a<Y> {
        public final Y a;
        public final int b;

        public a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public l900(long j) {
        this.b = j;
    }

    @Nullable
    public final synchronized Y a(@NonNull T t) {
        a aVar;
        aVar = (a) this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public int b(@Nullable Y y) {
        return 1;
    }

    @Nullable
    public final synchronized Y d(@NonNull T t, @Nullable Y y) {
        int b = b(y);
        long j = b;
        if (j >= this.b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.c += j;
        }
        a aVar = (a) this.a.put(t, y == null ? null : new a(y, b));
        if (aVar != null) {
            this.c -= aVar.b;
            if (!aVar.a.equals(y)) {
                c(t, aVar.a);
            }
        }
        e(this.b);
        return aVar != null ? aVar.a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.c -= aVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.a);
        }
    }

    public void c(@NonNull T t, @Nullable Y y) {
    }
}
