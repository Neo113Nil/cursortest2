package xsna;

/* compiled from: CountingMemoryCache.java */
/* loaded from: classes.dex */
public interface qyj<K, V> extends n220<K, V>, f320 {

    /* compiled from: CountingMemoryCache.java */
    /* loaded from: classes12.dex */
    public static class a<K, V> {
        public final K a;
        public final uvf<V> b;
        public int c;
        public boolean d;
        public final b<K> e;

        public a(K k, uvf<V> uvfVar, b<K> bVar, int i) {
            k.getClass();
            this.a = k;
            uvf<V> o = uvf.o(uvfVar);
            o.getClass();
            this.b = o;
            this.c = 0;
            this.d = false;
            this.e = bVar;
        }

        public static <K, V> a<K, V> a(K k, uvf<V> uvfVar, b<K> bVar) {
            return new a<>(k, uvfVar, bVar, -1);
        }
    }

    /* compiled from: CountingMemoryCache.java */
    /* loaded from: classes12.dex */
    public interface b<K> {
    }

    kcl d(Object obj, uvf uvfVar, b bVar);

    uvf e(ww8 ww8Var);
}
