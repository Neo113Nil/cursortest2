package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ks81 {
    public static final ks81 b = new ks81(null);
    public final LinkedHashMap a;

    public ks81(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks81) && jl40.l(this.a, ((ks81) obj).a);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.hashCode();
    }

    public final String toString() {
        return "DesignAnalytics(analyticsParameters=" + this.a + Extension.C_BRAKE;
    }
}
