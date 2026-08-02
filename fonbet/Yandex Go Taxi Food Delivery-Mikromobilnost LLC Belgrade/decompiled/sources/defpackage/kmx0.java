package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@gsq0
/* loaded from: classes9.dex */
public final class kmx0 {
    public static final jmx0 Companion = new jmx0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(3))};
    public final String a;
    public final RequirementsParam b;

    public /* synthetic */ kmx0(int i, String str, RequirementsParam requirementsParam) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, imx0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = requirementsParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmx0)) {
            return false;
        }
        kmx0 kmx0Var = (kmx0) obj;
        return jl40.l(this.a, kmx0Var.a) && jl40.l(this.b, kmx0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RequirementsParam requirementsParam = this.b;
        return hashCode + (requirementsParam == null ? 0 : requirementsParam.hashCode());
    }

    public final String toString() {
        return "TariffRequirementsParam(tariffClass=" + this.a + ", requirements=" + this.b + Extension.C_BRAKE;
    }

    public kmx0(String str, RequirementsParam requirementsParam) {
        this.a = str;
        this.b = requirementsParam;
    }
}
