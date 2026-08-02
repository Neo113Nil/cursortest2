package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fy10 {
    public final Long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final double i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final long n;
    public final long o;
    public final long p;
    public final String q;

    public fy10(Long l, long j, long j2, long j3, long j4, long j5, long j6, String str, double d, String str2, String str3, String str4, String str5, long j7, long j8, long j9, String str6) {
        this.a = l;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = str;
        this.i = d;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = j7;
        this.o = j8;
        this.p = j9;
        this.q = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy10)) {
            return false;
        }
        fy10 fy10Var = (fy10) obj;
        return jl40.l(this.a, fy10Var.a) && this.b == fy10Var.b && this.c == fy10Var.c && this.d == fy10Var.d && this.e == fy10Var.e && this.f == fy10Var.f && this.g == fy10Var.g && jl40.l(this.h, fy10Var.h) && Double.compare(this.i, fy10Var.i) == 0 && jl40.l(this.j, fy10Var.j) && jl40.l(this.k, fy10Var.k) && jl40.l(this.l, fy10Var.l) && jl40.l(this.m, fy10Var.m) && this.n == fy10Var.n && this.o == fy10Var.o && this.p == fy10Var.p && jl40.l(this.q, fy10Var.q);
    }

    public final int hashCode() {
        Long l = this.a;
        int c = qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int b = unr0.b(unr0.a((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j);
        String str2 = this.k;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int c2 = qv10.c(qv10.c(qv10.c((hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.p);
        String str5 = this.q;
        return c2 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEntity(rowId=");
        sb.append(this.a);
        sb.append(", chatInternalId=");
        sb.append(this.b);
        x4e.A(this.c, ", messageHistoryId=", ", messageSeqNumber=", sb);
        sb.append(this.d);
        x4e.A(this.e, ", messagePrevHistoryId=", ", msgInternalId=", sb);
        sb.append(this.f);
        x4e.A(this.g, ", flags=", ", messageId=", sb);
        sb.append(this.h);
        sb.append(", time=");
        sb.append(this.i);
        g8e.D(sb, ", author=", this.j, ", data=", this.k);
        g8e.D(sb, ", customPayload=", this.l, ", replyData=", this.m);
        x4e.A(this.n, ", editTime=", ", viewsCount=", sb);
        sb.append(this.o);
        x4e.A(this.p, ", forwardsCount=", ", notificationMeta=", sb);
        return oyr.t(sb, this.q, Extension.C_BRAKE);
    }
}
