package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b4j {
    public final List a;
    public final kdc b;

    public b4j(List list, kdc kdcVar) {
        this.a = list;
        this.b = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4j)) {
            return false;
        }
        b4j b4jVar = (b4j) obj;
        return this.a.equals(b4jVar.a) && jl40.l(this.b, b4jVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        return hashCode + (kdcVar == null ? 0 : kdcVar.hashCode());
    }

    public final String toString() {
        return "DetailedPriceUiState(items=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
