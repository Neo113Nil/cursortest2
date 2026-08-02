package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class oov0 {
    public final g4z0 a;
    public final enm0 b;
    public final List c;
    public final List d;

    public oov0(g4z0 g4z0Var, enm0 enm0Var, List list, List list2) {
        this.a = g4z0Var;
        this.b = enm0Var;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oov0)) {
            return false;
        }
        oov0 oov0Var = (oov0) obj;
        return this.a.equals(oov0Var.a) && this.b.equals(oov0Var.b) && this.c.equals(oov0Var.c) && this.d.equals(oov0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummarySettings(ticketsButton=");
        sb.append(this.a);
        sb.append(", scheduleButton=");
        sb.append(this.b);
        sb.append(", expressBusesIds=");
        return vfc.p(sb, this.c, ", expressDestinationIds=", this.d, Extension.C_BRAKE);
    }
}
