package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class p7z extends t7z {
    public final jv20 a;

    public p7z(jv20 jv20Var) {
        this.a = jv20Var;
    }

    public final jv20 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7z) && this.a.equals(((p7z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MobilityHub(deeplink=" + this.a + Extension.C_BRAKE;
    }
}
