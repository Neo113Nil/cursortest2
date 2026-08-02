package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class j5p {
    public static final j5p b = new g5p().a();
    public final Map a;

    public j5p(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5p) && jl40.l(this.a, ((j5p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("Extras(data=", Extension.C_BRAKE, this.a);
    }
}
