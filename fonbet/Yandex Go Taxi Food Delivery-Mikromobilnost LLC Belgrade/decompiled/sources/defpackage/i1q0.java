package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class i1q0 implements k1q0 {
    public final u1m a;
    public final String b;
    public final String c;
    public final String d;
    public final Throwable e;

    public i1q0(u1m u1mVar, String str, String str2, String str3, Throwable th) {
        this.a = u1mVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = th;
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

    public final Throwable d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1q0)) {
            return false;
        }
        i1q0 i1q0Var = (i1q0) obj;
        return jl40.l(this.a, i1q0Var.a) && jl40.l(this.b, i1q0Var.b) && jl40.l(this.c, i1q0Var.c) && jl40.l(this.d, i1q0Var.d) && this.e.equals(i1q0Var.e);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar == null ? 0 : u1mVar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Corrupted(query=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", sectionId=");
        g8e.D(sb, this.c, ", sectionType=", this.d, ", throwable=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
