package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import xsna.lzg0;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public final class klq<K, V> extends lzg0<K, V> {
    public final HashMap<K, lzg0.c<K, V>> f = new HashMap<>();

    @Override // xsna.lzg0
    @Nullable
    public final lzg0.c<K, V> a(K k) {
        return this.f.get(k);
    }

    @Override // xsna.lzg0
    public final V b(@NonNull K k) {
        V v = (V) super.b(k);
        this.f.remove(k);
        return v;
    }
}
