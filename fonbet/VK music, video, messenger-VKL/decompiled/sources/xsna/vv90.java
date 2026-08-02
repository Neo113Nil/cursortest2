package xsna;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PercentileTimeToFirstByteEstimator.java */
/* loaded from: classes12.dex */
public final class vv90 {
    public final a a;
    public final b2k0 b;
    public final float c;
    public final ypn0 d;
    public boolean e;

    /* compiled from: PercentileTimeToFirstByteEstimator.java */
    public static class a<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize = 10;

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.maxSize;
        }
    }

    public vv90(int i) {
        fxc0.p(i > 0);
        this.c = 0.5f;
        this.d = dvf.a;
        this.a = new a();
        this.b = new b2k0(i);
        this.e = true;
    }
}
