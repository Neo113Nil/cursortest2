package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class njc implements ex1 {
    public final pex0 a;

    public njc(pex0 pex0Var) {
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
        return (obj instanceof njc) && this.a.equals(((njc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComboOption(tariff=" + this.a + Extension.C_BRAKE;
    }
}
