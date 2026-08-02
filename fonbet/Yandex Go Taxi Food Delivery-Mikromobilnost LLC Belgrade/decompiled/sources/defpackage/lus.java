package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lus {
    public final String a;
    public final ArrayList b;

    public lus(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lus)) {
            return false;
        }
        lus lusVar = (lus) obj;
        return jl40.l(this.a, lusVar.a) && this.b.equals(lusVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("GasStationsFiltersListUiState(gasStationServiceId=", this.a, ", services=", Extension.C_BRAKE, this.b);
    }
}
