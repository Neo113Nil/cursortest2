package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dta0 {
    public final long a;
    public final String b;
    public final int c;
    public final int d;
    public final Long e;
    public final String f;

    public dta0(long j, String str, int i, int i2, Long l, String str2) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = l;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dta0)) {
            return false;
        }
        dta0 dta0Var = (dta0) obj;
        return this.a == dta0Var.a && jl40.l(this.b, dta0Var.b) && this.c == dta0Var.c && this.d == dta0Var.d && jl40.l(this.e, dta0Var.e) && jl40.l(this.f, dta0Var.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, oyr.b(this.c, unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
        Long l = this.e;
        int hashCode = (b + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = x4e.k("PendingPollVoteEntity(messageTimestamp=", this.a, ", chatId=", this.b);
        k.append(", choices=");
        k.append(this.c);
        k.append(", operationType=");
        k.append(this.d);
        k.append(", forwardMessageTimestamp=");
        k.append(this.e);
        k.append(", forwardChatId=");
        k.append(this.f);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
