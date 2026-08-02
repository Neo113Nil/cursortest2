package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o9u implements r9u {
    public final Map a;

    public o9u(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9u) && jl40.l(this.a, ((o9u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("ClearHeaderGradientConfig(segments=", Extension.C_BRAKE, this.a);
    }
}
