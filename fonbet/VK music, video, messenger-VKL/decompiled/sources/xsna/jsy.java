package xsna;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public abstract class jsy<K, V> {
    private final Map zza = new HashMap();

    @NonNull
    public abstract V create(@NonNull K k);

    @NonNull
    public V get(@NonNull K k) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k)) {
                    return (V) this.zza.get(k);
                }
                V create = create(k);
                this.zza.put(k, create);
                return create;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
