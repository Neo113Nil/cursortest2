package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cqi {
    public final String a;
    public final String b;

    public cqi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqi)) {
            return false;
        }
        cqi cqiVar = (cqi) obj;
        return jl40.l(this.a, cqiVar.a) && jl40.l(this.b, cqiVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("Contact(name=", this.a, ", phone=", this.b, Extension.C_BRAKE);
    }
}
