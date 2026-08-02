package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kt30 implements nt30 {
    public final ks30 a;

    public kt30(ks30 ks30Var) {
        this.a = ks30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt30) && this.a.equals(((kt30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPurchase(purchase=" + this.a + Extension.C_BRAKE;
    }
}
