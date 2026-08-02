package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public final class mi31 {
    public final pex0 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;

    public mi31(pex0 pex0Var, String str, String str2, String str3, boolean z) {
        this.a = pex0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = pex0Var.b;
        wu1 wu1Var = pex0Var.O;
        this.g = wu1Var != null ? wu1Var.a() : null;
    }

    public static mi31 a(mi31 mi31Var, pex0 pex0Var, String str, int i) {
        if ((i & 1) != 0) {
            pex0Var = mi31Var.a;
        }
        pex0 pex0Var2 = pex0Var;
        if ((i & 2) != 0) {
            str = mi31Var.b;
        }
        String str2 = mi31Var.c;
        String str3 = mi31Var.d;
        boolean z = mi31Var.e;
        mi31Var.getClass();
        return new mi31(pex0Var2, str, str2, str3, z);
    }

    public final kb5 b() {
        pex0 pex0Var = this.a;
        String str = pex0Var.b;
        TariffOrderFlow tariffOrderFlow = pex0Var.u0;
        return new kb5(this.b, str, pex0Var.O, tariffOrderFlow, pex0Var.K0, pex0Var.J0.b);
    }

    public final String c() {
        String str = this.c;
        if (str != null && !evu0.J(str)) {
            return str;
        }
        String str2 = this.a.l;
        return str2 == null ? "" : str2;
    }

    public final mi31 d(String str) {
        return a(this, null, str, 29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi31)) {
            return false;
        }
        mi31 mi31Var = (mi31) obj;
        return jl40.l(this.a, mi31Var.a) && jl40.l(this.b, mi31Var.b) && jl40.l(this.c, mi31Var.c) && jl40.l(this.d, mi31Var.d) && this.e == mi31Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalTariff(tariff=");
        sb.append(this.a);
        sb.append(", verticalId=");
        sb.append(this.b);
        sb.append(", name=");
        g8e.D(sb, this.c, ", description=", this.d, ", useTariffTitleInsteadVertical=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ mi31(pex0 pex0Var, String str) {
        this(pex0Var, str, "", "", false);
    }
}
