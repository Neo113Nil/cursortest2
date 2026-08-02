package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ajc {
    public final long a;
    public final long b;

    public ajc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajc)) {
            return false;
        }
        ajc ajcVar = (ajc) obj;
        return this.a == ajcVar.a && this.b == ajcVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("CombinedTimestamp(monotonic=", qv10.k(this.a, "SourceTimestamp(valueMilliseconds=", Extension.C_BRAKE), ", unix=", qv10.k(this.b, "SourceTimestamp(valueMilliseconds=", Extension.C_BRAKE), Extension.C_BRAKE);
    }
}
