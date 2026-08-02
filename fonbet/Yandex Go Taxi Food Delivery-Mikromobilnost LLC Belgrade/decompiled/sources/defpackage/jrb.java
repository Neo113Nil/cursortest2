package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jrb {
    public final List a = EmptyList.a;
    public final long b = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrb)) {
            return false;
        }
        jrb jrbVar = (jrb) obj;
        return jl40.l(this.a, jrbVar.a) && this.b == jrbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChooseOrganizationBrickUiState(organizations=" + this.a + ", selectedOrganizationId=" + this.b + Extension.C_BRAKE;
    }
}
