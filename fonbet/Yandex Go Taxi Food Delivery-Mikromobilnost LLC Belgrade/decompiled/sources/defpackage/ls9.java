package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ls9 {
    public final ir9 a;

    public ls9(ir9 ir9Var) {
        this.a = ir9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls9) && jl40.l(this.a, ((ls9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChargersDiscountStationsPayload(discount=" + this.a + Extension.C_BRAKE;
    }
}
