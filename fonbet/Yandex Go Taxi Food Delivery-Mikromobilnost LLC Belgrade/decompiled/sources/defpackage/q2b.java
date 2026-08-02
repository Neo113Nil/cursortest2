package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class q2b {
    public final Long a;
    public final long b;

    public q2b(long j, Long l) {
        this.a = l;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2b)) {
            return false;
        }
        q2b q2bVar = (q2b) obj;
        return jl40.l(this.a, q2bVar.a) && this.b == q2bVar.b;
    }

    public final int hashCode() {
        Long l = this.a;
        return Long.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "SeenMarkerVersionField(seenMarker=" + this.a + ", ownerSeenMarkerVersion=" + this.b + Extension.C_BRAKE;
    }
}
