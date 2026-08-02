package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ito {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public ito(long j, long j2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ito)) {
            return false;
        }
        ito itoVar = (ito) obj;
        return this.a == itoVar.a && this.b == itoVar.b && this.c == itoVar.c && this.d == itoVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "ExplorerDiscoveredCell(hexId=", ", unlockedAt=");
        w.append(this.b);
        w.append(", isConfirmed=");
        w.append(this.c);
        return xra1.a(w, ", isViewed=", this.d, Extension.C_BRAKE);
    }
}
