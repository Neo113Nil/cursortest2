package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l3z0 implements q3z0 {
    public final List a;

    public l3z0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3z0) && jl40.l(this.a, ((l3z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DeactivatePromoButtonClicked(extraActions=", Extension.C_BRAKE, this.a);
    }
}
