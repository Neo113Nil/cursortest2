package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class pnx0 implements ex1 {
    public final pex0 a;

    public pnx0(pex0 pex0Var) {
        this.a = pex0Var;
    }

    @Override // defpackage.ex1
    public final pex0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnx0) && this.a.equals(((pnx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TariffSelectorOption(tariff=" + this.a + Extension.C_BRAKE;
    }
}
