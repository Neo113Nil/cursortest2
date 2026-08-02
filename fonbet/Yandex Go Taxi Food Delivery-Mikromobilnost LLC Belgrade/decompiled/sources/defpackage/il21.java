package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class il21 {
    public final Long a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;

    public il21(Long l, String str, long j, String str2, String str3, boolean z) {
        this.a = l;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!il21.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        il21 il21Var = (il21) obj;
        return jl40.l(this.b, il21Var.b) && this.c == il21Var.c && jl40.l(this.d, il21Var.d) && jl40.l(this.e, il21Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(qv10.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserContactEntity(rowId=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", organizationId=");
        uw51.v(this.c, ", type=", this.d, sb);
        uw51.x(", value=", this.e, ", isLegal=", sb, this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
