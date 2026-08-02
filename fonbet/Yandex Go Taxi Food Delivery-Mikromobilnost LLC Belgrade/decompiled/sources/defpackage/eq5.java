package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class eq5 {
    public final Float a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public eq5(Float f, int i, String str, String str2, String str3, long j) {
        this.a = f;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq5)) {
            return false;
        }
        eq5 eq5Var = (eq5) obj;
        return jl40.l(this.a, eq5Var.a) && this.b == eq5Var.b && jl40.l(this.c, eq5Var.c) && jl40.l(this.d, eq5Var.d) && jl40.l(this.e, eq5Var.e) && this.f == eq5Var.f;
    }

    public final int hashCode() {
        Float f = this.a;
        int b = unr0.b(oyr.b(this.b, (f == null ? 0 : f.hashCode()) * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Long.hashCode(this.f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriversProgress(progress=");
        sb.append(this.a);
        sb.append(", driversSeenCount=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", subtitle=", this.d, ", collapsedTitleOverride=");
        ly3.y(this.f, this.e, ", orderStartTime=", sb);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
