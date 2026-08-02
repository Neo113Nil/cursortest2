package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class irm0 {
    public final List a;

    public final boolean equals(Object obj) {
        if (obj instanceof irm0) {
            return jl40.l(this.a, ((irm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ScootersActivePassesUiState(listItems=", Extension.C_BRAKE, this.a);
    }
}
