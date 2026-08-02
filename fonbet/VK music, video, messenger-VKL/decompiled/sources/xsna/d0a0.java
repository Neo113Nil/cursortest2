package xsna;

import java.util.Map;

/* compiled from: ImmutableMap.kt */
/* loaded from: classes11.dex */
public interface d0a0<K, V> extends Map, gcy {

    /* compiled from: ImmutableMap.kt */
    public interface a<K, V> extends Map<K, V>, kcy {
        d0a0<K, V> build();
    }

    a<K, V> builder();
}
