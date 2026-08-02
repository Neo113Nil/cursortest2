package defpackage;

import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nqx0 {
    public final mi31 a;
    public final TariffInfoGroupDefinition b;
    public final lmw0 c;

    public nqx0(mi31 mi31Var, TariffInfoGroupDefinition tariffInfoGroupDefinition, lmw0 lmw0Var) {
        this.a = mi31Var;
        this.b = tariffInfoGroupDefinition;
        this.c = lmw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqx0)) {
            return false;
        }
        nqx0 nqx0Var = (nqx0) obj;
        return jl40.l(this.a, nqx0Var.a) && jl40.l(this.b, nqx0Var.b) && jl40.l(this.c, nqx0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        TariffInfoGroupDefinition tariffInfoGroupDefinition = this.b;
        int hashCode2 = (hashCode + (tariffInfoGroupDefinition == null ? 0 : tariffInfoGroupDefinition.hashCode())) * 31;
        lmw0 lmw0Var = this.c;
        return hashCode2 + (lmw0Var != null ? lmw0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TariffWithRequirement(tariff=" + this.a + ", group=" + this.b + ", requirement=" + this.c + Extension.C_BRAKE;
    }
}
