package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pez0 {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final Boolean e;

    public pez0(String str, long j, long j2, String str2, Boolean bool) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = bool;
    }

    public final String a() {
        return this.d;
    }

    public final Boolean b() {
        return this.e;
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pez0)) {
            return false;
        }
        pez0 pez0Var = (pez0) obj;
        return jl40.l(this.a, pez0Var.a) && this.b == pez0Var.b && this.c == pez0Var.c && jl40.l(this.d, pez0Var.d) && this.e.equals(pez0Var.e);
    }

    public final int hashCode() {
        int c = qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Timeslot(title=", this.a, ", timestampFrom=", this.b);
        x4e.A(this.c, ", timestampTo=", ", priceSubtitle=", l);
        l.append(this.d);
        l.append(", shouldShowPaymentMethod=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
