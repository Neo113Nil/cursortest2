package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hug extends er31 {
    public final zv51 a;

    public hug(zv51 zv51Var) {
        this.a = zv51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hug) && this.a.equals(((hug) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopupWalletActionPayload(topupAmount=" + this.a + Extension.C_BRAKE;
    }
}
