package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class aae0 {
    public final Map a;

    public aae0(Map map) {
        this.a = map;
    }

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aae0) && jl40.l(this.a, ((aae0) obj).a);
    }

    public final int hashCode() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return nnm.j("PopupAnalyticsInfo(analyticsPayload=", Extension.C_BRAKE, this.a);
    }
}
