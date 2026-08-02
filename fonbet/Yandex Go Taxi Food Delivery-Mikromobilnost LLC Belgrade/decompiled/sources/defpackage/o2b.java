package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o2b {
    public final Long a;
    public final long b;
    public final long c;

    public o2b(Long l, long j, long j2) {
        this.a = l;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2b)) {
            return false;
        }
        o2b o2bVar = (o2b) obj;
        return jl40.l(this.a, o2bVar.a) && this.b == o2bVar.b && this.c == o2bVar.c;
    }

    public final int hashCode() {
        Long l = this.a;
        return Long.hashCode(this.c) + qv10.c((l == null ? 0 : l.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalIdVersion(internalId=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        return g8e.l(this.c, ", fullInfoVersion=", Extension.C_BRAKE, sb);
    }
}
