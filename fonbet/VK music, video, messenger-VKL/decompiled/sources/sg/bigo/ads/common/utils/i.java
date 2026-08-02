package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class i<V> {
    private final HashMap<String, V> a = new HashMap<>();

    @Nullable
    public final V a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.a.get(str.toLowerCase());
    }

    @Nullable
    public final V b(@Nullable String str) {
        return this.a.remove(str.toLowerCase());
    }

    @Nullable
    public final V a(String str, V v) {
        if (str == null || v == null) {
            return null;
        }
        return this.a.put(str.toLowerCase(), v);
    }

    public final void a(@NonNull Map<? extends String, ? extends V> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }
}
