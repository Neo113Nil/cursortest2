package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class efe0 {
    public final wee0 a;
    public final cfe0 b;
    public final cfe0 c;
    public final List d;
    public final vee0 e;
    public final ffe0 f;
    public final dfe0 g;

    public efe0(wee0 wee0Var, cfe0 cfe0Var, cfe0 cfe0Var2, ArrayList arrayList, vee0 vee0Var, ffe0 ffe0Var, dfe0 dfe0Var) {
        this.a = wee0Var;
        this.b = cfe0Var;
        this.c = cfe0Var2;
        this.d = arrayList;
        this.e = vee0Var;
        this.f = ffe0Var;
        this.g = dfe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efe0)) {
            return false;
        }
        efe0 efe0Var = (efe0) obj;
        return jl40.l(this.a, efe0Var.a) && jl40.l(this.b, efe0Var.b) && jl40.l(this.c, efe0Var.c) && jl40.l(this.d, efe0Var.d) && jl40.l(this.e, efe0Var.e) && jl40.l(this.f, efe0Var.f) && jl40.l(this.g, efe0Var.g);
    }

    public final int hashCode() {
        wee0 wee0Var = this.a;
        int hashCode = (wee0Var == null ? 0 : wee0Var.hashCode()) * 31;
        cfe0 cfe0Var = this.b;
        int hashCode2 = (hashCode + (cfe0Var == null ? 0 : cfe0Var.hashCode())) * 31;
        cfe0 cfe0Var2 = this.c;
        int hashCode3 = (hashCode2 + (cfe0Var2 == null ? 0 : cfe0Var2.hashCode())) * 31;
        List list = this.d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        vee0 vee0Var = this.e;
        int hashCode5 = (hashCode4 + (vee0Var == null ? 0 : vee0Var.a.hashCode())) * 31;
        ffe0 ffe0Var = this.f;
        int hashCode6 = (hashCode5 + (ffe0Var == null ? 0 : ffe0Var.hashCode())) * 31;
        dfe0 dfe0Var = this.g;
        return hashCode6 + (dfe0Var != null ? dfe0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OrderDetailsFormLayout(header=" + this.a + ", source=" + this.b + ", destination=" + this.c + ", extraFields=" + this.d + ", button=" + this.e + ", photoCommentsConfig=" + this.f + ", verticalBarData=" + this.g + Extension.C_BRAKE;
    }
}
