package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class a3b {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final Long e;
    public final long f;
    public final Long g;
    public final long h;
    public final Long i;
    public final boolean j;
    public final Long k;
    public final Long l;

    public a3b(String str, long j, long j2, long j3, Long l, long j4, Long l2, long j5, Long l3, boolean z, Long l4, Long l5) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = l;
        this.f = j4;
        this.g = l2;
        this.h = j5;
        this.i = l3;
        this.j = z;
        this.k = l4;
        this.l = l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3b)) {
            return false;
        }
        a3b a3bVar = (a3b) obj;
        return jl40.l(this.a, a3bVar.a) && this.b == a3bVar.b && this.c == a3bVar.c && this.d == a3bVar.d && jl40.l(this.e, a3bVar.e) && this.f == a3bVar.f && jl40.l(this.g, a3bVar.g) && this.h == a3bVar.h && jl40.l(this.i, a3bVar.i) && this.j == a3bVar.j && jl40.l(this.k, a3bVar.k) && jl40.l(this.l, a3bVar.l);
    }

    public final int hashCode() {
        int c = qv10.c(qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        int c2 = qv10.c((c + (l == null ? 0 : l.hashCode())) * 31, 31, this.f);
        Long l2 = this.g;
        int c3 = qv10.c((c2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.h);
        Long l3 = this.i;
        int e = unr0.e((c3 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.j);
        Long l4 = this.k;
        int hashCode = (e + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.l;
        return hashCode + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = x4e.l("ChatHistoryEntity(chatId=", this.a, ", ownerSeenMarker=", this.b);
        x4e.A(this.c, ", ownerLastSeenSequenceNumber=", ", otherSeenMarker=", l);
        l.append(this.d);
        l.append(", lastMessageTimestamp=");
        l.append(this.e);
        x4e.A(this.f, ", flags=", ", minMessageTimestamp=", l);
        l.append(this.g);
        l.append(", lastEditTimestamp=");
        l.append(this.h);
        l.append(", participantCount=");
        l.append(this.i);
        l.append(", approvedByMe=");
        l.append(this.j);
        l.append(", pinMessageTs=");
        l.append(this.k);
        l.append(", myRoleVersion=");
        l.append(this.l);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
