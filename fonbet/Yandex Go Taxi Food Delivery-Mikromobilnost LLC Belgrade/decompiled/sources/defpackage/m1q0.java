package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m1q0 extends o1q0 {
    public final String a;
    public final String b;
    public final gv90 c;

    public m1q0(String str, String str2, gv90 gv90Var) {
        this.a = str;
        this.b = str2;
        this.c = gv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1q0)) {
            return false;
        }
        m1q0 m1q0Var = (m1q0) obj;
        return jl40.l(this.a, m1q0Var.a) && jl40.l(this.b, m1q0Var.b) && jl40.l(this.c, m1q0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        gv90 gv90Var = this.c;
        return hashCode2 + (gv90Var != null ? gv90Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TitleSubtitle(title=", this.a, ", subtitle=", this.b, ", trailPayload=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
