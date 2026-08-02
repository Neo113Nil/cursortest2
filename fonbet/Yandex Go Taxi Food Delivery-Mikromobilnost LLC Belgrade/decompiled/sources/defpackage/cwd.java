package defpackage;

import com.yandex.go.zone.model.Zone;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cwd {
    public static final cwd g;
    public final Zone a;
    public final yal0 b;
    public final List c;
    public final List d;
    public final Set e;
    public final boolean f;

    static {
        Zone.Companion.getClass();
        Zone zone = Zone.H;
        EmptySet emptySet = EmptySet.a;
        EmptyList emptyList = EmptyList.a;
        g = new cwd(zone, null, emptyList, emptyList, emptySet, false);
    }

    public cwd(Zone zone, yal0 yal0Var, List list, List list2, Set set, boolean z) {
        this.a = zone;
        this.b = yal0Var;
        this.c = list;
        this.d = list2;
        this.e = set;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwd)) {
            return false;
        }
        cwd cwdVar = (cwd) obj;
        return jl40.l(this.a, cwdVar.a) && jl40.l(this.b, cwdVar.b) && jl40.l(this.c, cwdVar.c) && jl40.l(this.d, cwdVar.d) && jl40.l(this.e, cwdVar.e) && this.f == cwdVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yal0 yal0Var = this.b;
        return Boolean.hashCode(this.f) + g8e.e(this.e, unr0.c(unr0.c((hashCode + (yal0Var == null ? 0 : yal0Var.hashCode())) * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompoundTariffsInfo(zone=");
        sb.append(this.a);
        sb.append(", routeStats=");
        sb.append(this.b);
        sb.append(", descriptions=");
        nnm.w(sb, this.c, ", tariffOverrides=", this.d, ", offers=");
        sb.append(this.e);
        sb.append(", hasTolls=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
