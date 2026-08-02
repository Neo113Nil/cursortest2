package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h39 {
    public final Text a;
    public final rbv b;
    public final Text.Constant c;
    public final Text d;
    public final kao e;
    public final List f;
    public final a5b1 g;

    public h39(Text text, rbv rbvVar, Text.Constant constant, Text text2, kao kaoVar, List list, a5b1 a5b1Var) {
        this.a = text;
        this.b = rbvVar;
        this.c = constant;
        this.d = text2;
        this.e = kaoVar;
        this.f = list;
        this.g = a5b1Var;
    }

    public final Text a() {
        return this.c;
    }

    public final rbv b() {
        return this.b;
    }

    public final Text c() {
        return this.a;
    }

    public final Text d() {
        return this.d;
    }

    public final kao e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h39)) {
            return false;
        }
        h39 h39Var = (h39) obj;
        return jl40.l(this.a, h39Var.a) && jl40.l(this.b, h39Var.b) && this.c.equals(h39Var.c) && jl40.l(this.d, h39Var.d) && jl40.l(this.e, h39Var.e) && jl40.l(this.f, h39Var.f) && jl40.l(this.g, h39Var.g);
    }

    public final List f() {
        return this.f;
    }

    public final a5b1 g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        int c = n.c(this.d, xvz.d(this.c, (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31), 31);
        kao kaoVar = this.e;
        return this.g.hashCode() + unr0.c((c + (kaoVar != null ? kaoVar.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        return "CashbackDashboardViewState(cashbackTitle=" + this.a + ", cashbackImage=" + this.b + ", cashbackAmount=" + this.c + ", dashboardDescription=" + this.d + ", errorState=" + this.e + ", items=" + this.f + ", state=" + this.g + Extension.C_BRAKE;
    }
}
