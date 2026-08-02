package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hbe {
    public final List a;

    public /* synthetic */ hbe(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hbe) {
            return jl40.l(this.a, ((hbe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Items(value=", Extension.C_BRAKE, this.a);
    }
}
