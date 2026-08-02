package xsna;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public final class xiv {
    public final HashMap a = new HashMap();

    @Nullable
    public Map<String, String> b;

    public final synchronized Map<String, String> a() {
        try {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
