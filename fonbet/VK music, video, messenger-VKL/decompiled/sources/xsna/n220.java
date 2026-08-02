package xsna;

import com.facebook.common.memory.MemoryTrimType;
import xsna.sj2;

/* compiled from: MemoryCache.kt */
/* loaded from: classes.dex */
public interface n220<K, V> extends f320 {

    /* compiled from: MemoryCache.kt */
    public interface a {
        double a(MemoryTrimType memoryTrimType);
    }

    boolean b(yzt yztVar);

    uvf<V> c(K k, uvf<V> uvfVar);

    int f(kxc0<K> kxc0Var);

    boolean g(sj2.a aVar);

    uvf<V> get(K k);
}
