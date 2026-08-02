package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kri extends uri {
    public final zp1 a;

    public kri(zp1 zp1Var) {
        this.a = zp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kri) && this.a == ((kri) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Header(title=" + this.a + Extension.C_BRAKE;
    }
}
