package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ius {
    public final String a;
    public final List b;

    public ius(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ius)) {
            return false;
        }
        ius iusVar = (ius) obj;
        return jl40.l(this.a, iusVar.a) && this.b.equals(iusVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("GasStationsFiltersListPayload(gasStationServiceId=", this.a, ", filters=", Extension.C_BRAKE, this.b);
    }
}
