package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dy10 {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final double f;

    public dy10(long j, String str, long j2, long j3, long j4, double d) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy10)) {
            return false;
        }
        dy10 dy10Var = (dy10) obj;
        return this.a == dy10Var.a && jl40.l(this.b, dy10Var.b) && this.c == dy10Var.c && this.d == dy10Var.d && this.e == dy10Var.e && Double.compare(this.f, dy10Var.f) == 0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Double.hashCode(this.f) + qv10.c(qv10.c(qv10.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder k = x4e.k("IdsTimeTuple(msgInternalId=", this.a, ", messageId=", this.b);
        x4e.A(this.c, ", messageSequenceNumber=", ", messagePrevHistoryId=", k);
        k.append(this.d);
        x4e.A(this.e, ", messageHistoryId=", ", time=", k);
        return nzs.c(k, this.f, Extension.C_BRAKE);
    }
}
