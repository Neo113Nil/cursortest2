package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ot5 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public ot5(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot5)) {
            return false;
        }
        ot5 ot5Var = (ot5) obj;
        return jl40.l(this.a, ot5Var.a) && jl40.l(this.b, ot5Var.b) && this.c.equals(ot5Var.c) && this.d == ot5Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("BinRequestContext(cardNumber=", this.a, ", prefix=", this.b, ", requestId=");
        ly3.y(this.d, this.c, ", startTime=", v);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
