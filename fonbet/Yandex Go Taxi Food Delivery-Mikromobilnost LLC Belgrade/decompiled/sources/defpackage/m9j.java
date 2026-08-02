package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m9j {
    public final String a;
    public final String b;
    public final String c;

    public m9j(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9j)) {
            return false;
        }
        m9j m9jVar = (m9j) obj;
        return this.a.equals(m9jVar.a) && this.b.equals(m9jVar.b) && jl40.l(this.c, m9jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("RequirementUiState(id=", this.a, ", text=", this.b, ", imageTag="), this.c, Extension.C_BRAKE);
    }
}
