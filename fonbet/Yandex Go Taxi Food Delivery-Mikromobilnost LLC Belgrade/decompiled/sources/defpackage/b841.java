package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class b841 {
    public final boolean a;
    public final boolean b;

    public b841(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b841)) {
            return false;
        }
        b841 b841Var = (b841) obj;
        return this.a == b841Var.a && this.b == b841Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("WalletDocumentReloadRequest(isForce=", ", usePreview=", Extension.C_BRAKE, this.a, this.b);
    }
}
