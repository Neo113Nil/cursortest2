package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class oh30 implements wh30 {
    public final ks30 a;

    public oh30(ks30 ks30Var) {
        this.a = ks30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh30) && this.a.equals(((oh30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PurchaseTapped(purchase=" + this.a + Extension.C_BRAKE;
    }
}
