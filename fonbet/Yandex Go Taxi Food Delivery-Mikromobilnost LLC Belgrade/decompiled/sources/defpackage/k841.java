package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class k841 {
    public final nhr a;
    public final l131 b;

    public k841(nhr nhrVar, l131 l131Var) {
        this.a = nhrVar;
        this.b = l131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k841) {
            k841 k841Var = (k841) obj;
            return this.a.equals(k841Var.a) && this.b == k841Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WalletFlexFullscreenConfig(config=" + this.a + ", requestDocumentReload=" + this.b + Extension.C_BRAKE;
    }
}
