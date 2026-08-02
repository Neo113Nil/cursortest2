package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h8n {
    public final String a;
    public final String b;
    public final fa90 c;
    public final lqi d;

    public h8n(String str, String str2, fa90 fa90Var, lqi lqiVar) {
        this.a = str;
        this.b = str2;
        this.c = fa90Var;
        this.d = lqiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8n)) {
            return false;
        }
        h8n h8nVar = (h8n) obj;
        return jl40.l(this.a, h8nVar.a) && jl40.l(this.b, h8nVar.b) && jl40.l(this.c, h8nVar.c) && jl40.l(this.d, h8nVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        fa90 fa90Var = this.c;
        int hashCode3 = (hashCode2 + (fa90Var == null ? 0 : fa90Var.hashCode())) * 31;
        lqi lqiVar = this.d;
        return hashCode3 + (lqiVar != null ? lqiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("HeaderInfo(title=", this.a, ", subtitle=", this.b, ", paidInfo=");
        v.append(this.c);
        v.append(", performerSearch=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
