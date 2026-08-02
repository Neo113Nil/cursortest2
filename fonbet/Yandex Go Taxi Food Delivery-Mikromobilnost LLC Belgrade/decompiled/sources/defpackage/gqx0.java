package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gqx0 {
    public final String a;
    public final String b;
    public final eqx0 c;
    public final boolean d;

    public gqx0(String str, String str2, eqx0 eqx0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = eqx0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqx0)) {
            return false;
        }
        gqx0 gqx0Var = (gqx0) obj;
        return jl40.l(this.a, gqx0Var.a) && jl40.l(this.b, gqx0Var.b) && jl40.l(this.c, gqx0Var.c) && this.d == gqx0Var.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        eqx0 eqx0Var = this.c;
        return Boolean.hashCode(this.d) + ((b + (eqx0Var == null ? 0 : eqx0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TariffUpgradeUiState(title=", this.a, ", text=", this.b, ", image=");
        v.append(this.c);
        v.append(", isDetailsButtonVisible=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
