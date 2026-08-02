package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hz10 {
    public final String a;
    public final Integer b;
    public final long c;
    public final long d;
    public final long e;
    public final double f;

    public hz10(String str, Integer num, long j, long j2, long j3, double d) {
        this.a = str;
        this.b = num;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz10)) {
            return false;
        }
        hz10 hz10Var = (hz10) obj;
        return jl40.l(this.a, hz10Var.a) && jl40.l(this.b, hz10Var.b) && this.c == hz10Var.c && this.d == hz10Var.d && this.e == hz10Var.e && Double.compare(this.f, hz10Var.f) == 0;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return Double.hashCode(this.f) + qv10.c(qv10.c(qv10.c((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder q = n.q("ReducedInfo(data=", this.b, this.a, ", dataType=", ", messageHistoryId=");
        q.append(this.c);
        x4e.A(this.d, ", messageSequenceNumber=", ", messagePrevHistoryId=", q);
        q.append(this.e);
        q.append(", time=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
