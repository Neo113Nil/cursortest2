package defpackage;

import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingStatus;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dzk0 {
    public final RoundingStatus a;
    public final fa4 b;
    public final rr51 c;
    public final xyk0 d;
    public final List e;

    public dzk0(RoundingStatus roundingStatus, fa4 fa4Var, rr51 rr51Var, xyk0 xyk0Var, List list) {
        this.a = roundingStatus;
        this.b = fa4Var;
        this.c = rr51Var;
        this.d = xyk0Var;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzk0)) {
            return false;
        }
        dzk0 dzk0Var = (dzk0) obj;
        return this.a == dzk0Var.a && jl40.l(this.b, dzk0Var.b) && jl40.l(this.c, dzk0Var.c) && jl40.l(this.d, dzk0Var.d) && jl40.l(this.e, dzk0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        rr51 rr51Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundingSettingsDataEntity(status=");
        sb.append(this.a);
        sb.append(", summary=");
        sb.append(this.b);
        sb.append(", topDivkitWidget=");
        sb.append(this.c);
        sb.append(", selectedOption=");
        sb.append(this.d);
        sb.append(", availableOptions=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
