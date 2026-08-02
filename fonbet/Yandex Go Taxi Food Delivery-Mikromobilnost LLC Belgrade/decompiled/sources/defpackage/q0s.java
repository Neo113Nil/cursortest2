package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q0s implements u0s {
    public final tls a;
    public final boolean b;

    public q0s(tls tlsVar, boolean z) {
        this.a = tlsVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0s)) {
            return false;
        }
        q0s q0sVar = (q0s) obj;
        return jl40.l(this.a, q0sVar.a) && this.b == q0sVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoSwitchCheckChanged(checkChangeCallback=" + this.a + ", isChecked=" + this.b + Extension.C_BRAKE;
    }
}
