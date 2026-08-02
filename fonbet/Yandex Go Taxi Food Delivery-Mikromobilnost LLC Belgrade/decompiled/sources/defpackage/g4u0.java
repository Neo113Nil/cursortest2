package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class g4u0 {
    public final List a;
    public final o0v0 b;
    public final u7r0 c;
    public final wk60 d;
    public final pm4 e;
    public final String f;

    public g4u0(List list, o0v0 o0v0Var, u7r0 u7r0Var, wk60 wk60Var, pm4 pm4Var) {
        String str;
        this.a = list;
        this.b = o0v0Var;
        this.c = u7r0Var;
        this.d = wk60Var;
        this.e = pm4Var;
        e841 e841Var = (e841) a.R(list);
        this.f = (e841Var == null || (str = e841Var.c) == null) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4u0)) {
            return false;
        }
        g4u0 g4u0Var = (g4u0) obj;
        return this.a.equals(g4u0Var.a) && jl40.l(this.b, g4u0Var.b) && jl40.l(this.c, g4u0Var.c) && jl40.l(this.d, g4u0Var.d) && jl40.l(this.e, g4u0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o0v0 o0v0Var = this.b;
        int hashCode2 = (hashCode + (o0v0Var == null ? 0 : o0v0Var.hashCode())) * 31;
        u7r0 u7r0Var = this.c;
        int hashCode3 = (hashCode2 + (u7r0Var == null ? 0 : u7r0Var.hashCode())) * 31;
        wk60 wk60Var = this.d;
        int hashCode4 = (hashCode3 + (wk60Var == null ? 0 : wk60Var.hashCode())) * 31;
        pm4 pm4Var = this.e;
        return hashCode4 + (pm4Var != null ? pm4Var.hashCode() : 0);
    }

    public final String toString() {
        return "StateData(wallets=" + this.a + ", subscription=" + this.b + ", settings=" + this.c + ", notifications=" + this.d + ", badgeStyle=" + this.e + Extension.C_BRAKE;
    }
}
