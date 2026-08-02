package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.gq1;

@gsq0
/* loaded from: classes7.dex */
public final class iq71 {
    public static final ce71 Companion = new ce71();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, gq1.w)};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public iq71(String str, int i, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, r771.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq71)) {
            return false;
        }
        iq71 iq71Var = (iq71) obj;
        return jl40.l(this.a, iq71Var.a) && jl40.l(this.b, iq71Var.b) && jl40.l(this.c, iq71Var.c) && jl40.l(this.d, iq71Var.d);
    }

    public final int hashCode() {
        int a = z2a1.a(this.a.hashCode() * 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return tse0.j(this.c, ", adapters=", Extension.C_BRAKE, b64.v("MediationNetworkData(name=", this.a, ", id=", this.b, ", version="), this.d);
    }

    public iq71(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }
}
