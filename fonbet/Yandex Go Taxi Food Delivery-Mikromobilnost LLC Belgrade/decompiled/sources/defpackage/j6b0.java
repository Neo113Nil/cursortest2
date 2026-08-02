package defpackage;

import com.yandex.go.zone.model.Zone;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class j6b0 {
    public final String a;
    public final Zone b;
    public final Map c;
    public final np40 d;
    public final String e;
    public final List f;
    public final cu g;

    public j6b0(String str, Zone zone, Map map, np40 np40Var, String str2, List list, cu cuVar) {
        this.a = str;
        this.b = zone;
        this.c = map;
        this.d = np40Var;
        this.e = str2;
        this.f = list;
        this.g = cuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6b0)) {
            return false;
        }
        j6b0 j6b0Var = (j6b0) obj;
        return jl40.l(this.a, j6b0Var.a) && jl40.l(this.b, j6b0Var.b) && jl40.l(this.c, j6b0Var.c) && jl40.l(this.d, j6b0Var.d) && jl40.l(this.e, j6b0Var.e) && jl40.l(this.f, j6b0Var.f) && jl40.l(this.g, j6b0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Zone zone = this.b;
        int d = unr0.d((hashCode + (zone == null ? 0 : zone.hashCode())) * 31, 31, this.c);
        np40 np40Var = this.d;
        int hashCode2 = (d + (np40Var == null ? 0 : np40Var.hashCode())) * 31;
        String str2 = this.e;
        int c = unr0.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        cu cuVar = this.g;
        return c + (cuVar != null ? cuVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersonalStateData(selectedClass=");
        sb.append(this.a);
        sb.append(", zone=");
        sb.append(this.b);
        sb.append(", selectedOptionsInVerticals=");
        sb.append(this.c);
        sb.append(", multiclassOptionsState=");
        sb.append(this.d);
        sb.append(", selectedVerticalId=");
        tse0.x(this.e, ", tariffs=", ", action=", sb, this.f);
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
