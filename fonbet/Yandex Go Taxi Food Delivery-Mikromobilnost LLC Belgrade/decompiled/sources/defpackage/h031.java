package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h031 {
    public final ty21 a;
    public final ArrayList b;
    public final ArrayList c;

    public h031(ty21 ty21Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = ty21Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h031)) {
            return false;
        }
        h031 h031Var = (h031) obj;
        return jl40.l(this.a, h031Var.a) && this.b.equals(h031Var.b) && this.c.equals(h031Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationResultEntity(info=");
        sb.append(this.a);
        sb.append(", autoFundErrors=");
        sb.append(this.b);
        sb.append(", autoTopupErrors=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
