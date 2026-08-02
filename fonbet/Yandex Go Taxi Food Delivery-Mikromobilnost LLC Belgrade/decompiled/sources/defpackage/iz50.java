package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class iz50 {
    public final String a;
    public final String b;
    public final zu50 c;
    public final j5p d;

    public iz50(String str, String str2, zu50 zu50Var, j5p j5pVar) {
        this.a = str;
        this.b = str2;
        this.c = zu50Var;
        this.d = j5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz50)) {
            return false;
        }
        iz50 iz50Var = (iz50) obj;
        return jl40.l(this.a, iz50Var.a) && jl40.l(this.b, iz50Var.b) && jl40.l(this.c, iz50Var.c) && jl40.l(this.d, iz50Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + unr0.d(unr0.b(this.a.hashCode() * 31, 31, this.b), 961, this.c.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        v.append(this.c);
        v.append(", body=null, extras=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
