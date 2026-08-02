package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class q0t implements p0t {
    public final String a;

    public q0t(int i) {
        this.a = UUID.randomUUID().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0t) && jl40.l(this.a, ((q0t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("GeoRequestUuid(rawValue=", this.a, Extension.C_BRAKE);
    }

    public q0t() {
        this(0);
    }
}
