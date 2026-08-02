package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cia0 {
    public final rfa0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public cia0(rfa0 rfa0Var, long j, long j2, long j3, long j4) {
        this.a = rfa0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cia0)) {
            return false;
        }
        cia0 cia0Var = (cia0) obj;
        return jl40.l(this.a, cia0Var.a) && this.b == cia0Var.b && this.c == cia0Var.c && this.d == cia0Var.d && this.e == cia0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + qv10.c(qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentRouteStatsParams(paymentParam=");
        sb.append(this.a);
        sb.append(", lastUserYbDismissTimestamp=");
        sb.append(this.b);
        x4e.A(this.c, ", changedLoyaltyProgramTimestamp=", ", lastOverridePaymentChangeTimestamp=", sb);
        sb.append(this.d);
        return g8e.l(this.e, ", lastUserAcceptSelectorOfferTimestamp=", Extension.C_BRAKE, sb);
    }
}
