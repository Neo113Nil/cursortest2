package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class mi3 {
    public final String a;
    public final String b;

    public mi3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi3)) {
            return false;
        }
        mi3 mi3Var = (mi3) obj;
        return this.a.equals(mi3Var.a) && this.b.equals(mi3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AuthCredentials(clientID=", this.a, ", clientSecret=", this.b, Extension.C_BRAKE);
    }
}
