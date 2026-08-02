package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pju0 {
    public final wls a;
    public final wls b;

    public pju0(wls wlsVar, wls wlsVar2) {
        this.a = wlsVar;
        this.b = wlsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pju0)) {
            return false;
        }
        pju0 pju0Var = (pju0) obj;
        return this.a == pju0Var.a && this.b == pju0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StoreContext(reduce=" + this.a + ", postSideEffect=" + this.b + Extension.C_BRAKE;
    }
}
