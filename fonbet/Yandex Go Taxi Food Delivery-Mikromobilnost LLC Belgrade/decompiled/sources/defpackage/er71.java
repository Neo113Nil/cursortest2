package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class er71 {
    public final LinkedHashMap a;

    public er71(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er71) && jl40.l(this.a, ((er71) obj).a);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.hashCode();
    }

    public final String toString() {
        return "NativeAnalytics(analyticsParameters=" + this.a + Extension.C_BRAKE;
    }
}
