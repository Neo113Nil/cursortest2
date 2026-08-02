package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fj20 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final v4v d;

    public fj20(String str, String str2, ArrayList arrayList, ra90 ra90Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = ra90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj20)) {
            return false;
        }
        fj20 fj20Var = (fj20) obj;
        return jl40.l(this.a, fj20Var.a) && jl40.l(this.b, fj20Var.b) && this.c.equals(fj20Var.c) && jl40.l(this.d, fj20Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = ly3.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        v4v v4vVar = this.d;
        return b + (v4vVar != null ? v4vVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MissionDescriptionBlockState(title=", this.a, ", subtitle=", this.b, ", description=");
        v.append(this.c);
        v.append(", trailIcon=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
