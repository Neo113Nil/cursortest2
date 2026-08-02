package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class b5o {
    public final String a;
    public final String b;

    public b5o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5o)) {
            return false;
        }
        b5o b5oVar = (b5o) obj;
        return jl40.l(this.a, b5oVar.a) && jl40.l(this.b, b5oVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("EnvironmentHosts(production=", this.a, ", testing=", this.b, Extension.C_BRAKE);
    }

    public b5o() {
        this(null, null);
    }
}
