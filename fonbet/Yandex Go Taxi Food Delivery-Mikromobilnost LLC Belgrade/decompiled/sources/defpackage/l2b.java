package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class l2b {
    public final long a;
    public final long b;
    public final long c;

    public l2b(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2b)) {
            return false;
        }
        l2b l2bVar = (l2b) obj;
        return this.a == l2bVar.a && this.b == l2bVar.b && this.c == l2bVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "ChatEditHistoryTimestampsEntity(chatInternalId=", ", serverMaxTimestamp=");
        w.append(this.b);
        return g8e.l(this.c, ", clientMaxTimestamp=", Extension.C_BRAKE, w);
    }
}
