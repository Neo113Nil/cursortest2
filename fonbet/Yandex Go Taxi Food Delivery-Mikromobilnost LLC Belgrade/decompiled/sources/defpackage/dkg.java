package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dkg {
    public final String a;
    public final List b;
    public final yjg c;
    public final ckg d;

    public dkg(String str, ListBuilder listBuilder, yjg yjgVar, ckg ckgVar) {
        this.a = str;
        this.b = listBuilder;
        this.c = yjgVar;
        this.d = ckgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkg)) {
            return false;
        }
        dkg dkgVar = (dkg) obj;
        return jl40.l(this.a, dkgVar.a) && jl40.l(this.b, dkgVar.b) && jl40.l(this.c, dkgVar.c) && this.d.equals(dkgVar.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        yjg yjgVar = this.c;
        return this.d.hashCode() + ((c + (yjgVar == null ? 0 : yjgVar.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("DashboardIncidentsUiState(roadName=", this.a, ", incidents=", this.b, ", commentText=");
        r.append(this.c);
        r.append(", submitButton=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
