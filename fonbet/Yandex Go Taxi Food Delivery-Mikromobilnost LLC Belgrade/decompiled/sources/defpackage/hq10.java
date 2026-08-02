package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hq10 {
    public final List a;

    public hq10(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq10) && jl40.l(this.a, ((hq10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MerchantOffersSearchSuggestsEntity(screenItems=", Extension.C_BRAKE, this.a);
    }
}
