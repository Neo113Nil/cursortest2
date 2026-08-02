package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cvi0 {
    public final Long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public cvi0(String str, String str2, String str3, boolean z, Long l) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvi0)) {
            return false;
        }
        cvi0 cvi0Var = (cvi0) obj;
        return jl40.l(this.a, cvi0Var.a) && jl40.l(this.b, cvi0Var.b) && jl40.l(this.c, cvi0Var.c) && this.d == cvi0Var.d && jl40.l(this.e, cvi0Var.e);
    }

    public final int hashCode() {
        Long l = this.a;
        int e = unr0.e(unr0.b(unr0.b((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteContactEntity(rowId=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", phoneId=");
        tse0.y(this.c, ", deleted=", ", contactName=", sb, this.d);
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
