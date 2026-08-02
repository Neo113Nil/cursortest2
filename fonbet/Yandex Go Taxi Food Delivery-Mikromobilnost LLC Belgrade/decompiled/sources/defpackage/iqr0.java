package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class iqr0 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;

    public iqr0(String str, String str2, long j, String str3, long j2, int i) {
        j2 = (i & 32) != 0 ? -1L : j2;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqr0)) {
            return false;
        }
        iqr0 iqr0Var = (iqr0) obj;
        return jl40.l(this.a, iqr0Var.a) && jl40.l(this.b, iqr0Var.b) && this.c == iqr0Var.c && jl40.l(this.d, iqr0Var.d) && this.e == iqr0Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = qv10.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        return Long.hashCode(this.e) + ((c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SharingEntity(rowId=null, chatId=", this.a, ", userId=", this.b, ", orgId=");
        uw51.v(this.c, ", displayName=", this.d, v);
        return g8e.l(this.e, ", sortTime=", Extension.C_BRAKE, v);
    }
}
