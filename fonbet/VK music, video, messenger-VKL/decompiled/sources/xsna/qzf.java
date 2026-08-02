package xsna;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CodecParameters.java */
/* loaded from: classes12.dex */
public final class qzf {
    public static final qzf b = new qzf(new HashMap());
    public final Map<String, Object> a;

    public qzf() {
        throw null;
    }

    public qzf(HashMap hashMap) {
        this.a = Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qzf) {
            return this.a.equals(((qzf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
