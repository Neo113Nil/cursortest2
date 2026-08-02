package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ml21 {
    public final String a;
    public boolean b = true;

    public ml21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml21) && jl40.l(this.a, ((ml21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("UserCredentials(personalGuid=", this.a, Extension.C_BRAKE);
    }
}
