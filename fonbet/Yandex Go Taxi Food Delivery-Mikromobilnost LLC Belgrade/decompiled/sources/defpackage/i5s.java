package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i5s {
    public final String a;
    public final String b;

    public i5s(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5s)) {
            return false;
        }
        i5s i5sVar = (i5s) obj;
        return jl40.l(this.a, i5sVar.a) && jl40.l(this.b, i5sVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("FormOpenParams(mode=", this.a, ", scenario=", this.b, Extension.C_BRAKE);
    }
}
