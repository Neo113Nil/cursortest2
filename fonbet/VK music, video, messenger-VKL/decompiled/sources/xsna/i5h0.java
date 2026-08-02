package xsna;

import androidx.annotation.NonNull;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: ScatterMapWrapper.java */
/* loaded from: classes3.dex */
public final class i5h0<K, V> extends LinkedHashMap<K, V> {
    g5h0<K, V> scatterMap;

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    @NonNull
    public final Set<Map.Entry<K, V>> entrySet() {
        g5h0<K, V> g5h0Var = this.scatterMap;
        g5h0Var.getClass();
        return new um00(g5h0Var).entrySet();
    }
}
