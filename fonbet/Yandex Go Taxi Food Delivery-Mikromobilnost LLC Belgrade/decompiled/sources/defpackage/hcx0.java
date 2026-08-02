package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hcx0 {
    public final gcx0 a;
    public final gcx0 b;

    public hcx0(gcx0 gcx0Var, gcx0 gcx0Var2) {
        this.a = gcx0Var;
        this.b = gcx0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcx0)) {
            return false;
        }
        hcx0 hcx0Var = (hcx0) obj;
        return this.a.equals(hcx0Var.a) && this.b.equals(hcx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffCardHeaderConfigsUiState(carHeaderConfigUiState=" + this.a + ", backgroundHeaderConfigUiState=" + this.b + Extension.C_BRAKE;
    }
}
