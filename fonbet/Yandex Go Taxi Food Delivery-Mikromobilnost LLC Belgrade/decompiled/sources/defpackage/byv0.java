package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class byv0 {
    public final List a;

    public byv0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byv0) && jl40.l(this.a, ((byv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("SuperAppDiscoveryMapUiState(mapCategoryFilters=", Extension.C_BRAKE, this.a);
    }
}
