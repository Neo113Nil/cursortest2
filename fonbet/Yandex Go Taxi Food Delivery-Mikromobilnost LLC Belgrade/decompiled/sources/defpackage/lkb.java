package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lkb implements nkb {
    public final Map a;

    public lkb(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkb) && jl40.l(this.a, ((lkb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("TicketingSystemContextParameter(context=", Extension.C_BRAKE, this.a);
    }
}
