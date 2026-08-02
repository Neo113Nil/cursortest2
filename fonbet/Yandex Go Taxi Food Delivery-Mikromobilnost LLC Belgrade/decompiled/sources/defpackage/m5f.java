package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m5f implements q5f {
    public final String a;
    public final String b;
    public final String c;

    public m5f(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5f)) {
            return false;
        }
        m5f m5fVar = (m5f) obj;
        return jl40.l(this.a, m5fVar.a) && jl40.l(this.b, m5fVar.b) && this.c.equals(m5fVar.c);
    }

    @Override // defpackage.q5f
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("FilterItem(id=", this.a, ", name=", this.b, ", avatarUri="), this.c, Extension.C_BRAKE);
    }
}
