package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class co2 {
    public final String a;
    public final boolean b;
    public final List c;

    public co2(String str, List list, boolean z) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co2)) {
            return false;
        }
        co2 co2Var = (co2) obj;
        return jl40.l(this.a, co2Var.a) && this.b == co2Var.b && this.c.equals(co2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(oo31.l("ApiNameAvailabilityCheckOrder(apiName=", this.a, ", forceNextPhase=", ", checkPhases=", this.b), this.c, Extension.C_BRAKE);
    }
}
