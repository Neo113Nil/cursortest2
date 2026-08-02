package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class n0s implements u0s {
    public final sls a;

    public n0s(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0s) && this.a.equals(((n0s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PromoButtonClicked(clickCallback=" + this.a + Extension.C_BRAKE;
    }
}
