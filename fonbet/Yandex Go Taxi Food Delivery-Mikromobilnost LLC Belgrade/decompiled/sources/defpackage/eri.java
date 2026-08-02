package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class eri {
    public final String a;
    public final String b;

    public eri(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eri)) {
            return false;
        }
        eri eriVar = (eri) obj;
        return jl40.l(this.a, eriVar.a) && jl40.l(this.b, eriVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("Overrides(path=", this.a, ", experiments=", this.b, Extension.C_BRAKE);
    }
}
