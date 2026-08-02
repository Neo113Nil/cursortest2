package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pp6 {
    public final String a;
    public final rr51 b;
    public final ArrayList c;

    public pp6(String str, rr51 rr51Var, ArrayList arrayList) {
        this.a = str;
        this.b = rr51Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp6)) {
            return false;
        }
        pp6 pp6Var = (pp6) obj;
        return jl40.l(this.a, pp6Var.a) && jl40.l(this.b, pp6Var.b) && this.c.equals(pp6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rr51 rr51Var = this.b;
        return this.c.hashCode() + ((hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BudgetFoundChargesSectionEntity(tabTitle=");
        sb.append(this.a);
        sb.append(", emptyDivState=");
        sb.append(this.b);
        sb.append(", items=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
