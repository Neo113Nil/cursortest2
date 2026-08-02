package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p2b {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final boolean f;
    public final Long g;
    public final Long h;

    public p2b(long j, String str, String str2, long j2, String str3, boolean z, Long l, Long l2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = str3;
        this.f = z;
        this.g = l;
        this.h = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2b)) {
            return false;
        }
        p2b p2bVar = (p2b) obj;
        return this.a == p2bVar.a && jl40.l(this.b, p2bVar.b) && jl40.l(this.c, p2bVar.c) && this.d == p2bVar.d && jl40.l(this.e, p2bVar.e) && this.f == p2bVar.f && jl40.l(this.g, p2bVar.g) && jl40.l(this.h, p2bVar.h);
    }

    public final int hashCode() {
        int b = unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int c = qv10.c((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int e = unr0.e((c + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        Long l = this.g;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = x4e.k("PersistentChatFields(internalId=", this.a, ", chatId=", this.b);
        x4e.C(k, ", addresseeId=", this.c, ", flags=");
        uw51.v(this.d, ", currentProfileId=", this.e, k);
        k.append(", isTransient=");
        k.append(this.f);
        k.append(", parentInternalId=");
        k.append(this.g);
        k.append(", parentMessageTimestamp=");
        k.append(this.h);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
