package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class j1q0 implements k1q0 {
    public final u1m a;
    public final String b;
    public final String c;
    public final String d;

    public j1q0(u1m u1mVar, String str, String str2, String str3) {
        this.a = u1mVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final u1m a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1q0)) {
            return false;
        }
        j1q0 j1q0Var = (j1q0) obj;
        return jl40.l(this.a, j1q0Var.a) && jl40.l(this.b, j1q0Var.b) && jl40.l(this.c, j1q0Var.c) && this.d.equals(j1q0Var.d);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar == null ? 0 : u1mVar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Unsupported(query=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", sectionId=");
        return g8e.r(sb, this.c, ", sectionType=", this.d, Extension.C_BRAKE);
    }
}
