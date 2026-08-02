package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class lux0 {
    public final String a;
    public final Boolean b;

    public lux0(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lux0)) {
            return false;
        }
        lux0 lux0Var = (lux0) obj;
        return jl40.l(this.a, lux0Var.a) && jl40.l(this.b, lux0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SwitchModel(spendAmount=" + this.a + ", turnedOn=" + this.b + Extension.C_BRAKE;
    }
}
