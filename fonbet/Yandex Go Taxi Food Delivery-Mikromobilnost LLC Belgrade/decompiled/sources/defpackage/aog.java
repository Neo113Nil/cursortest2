package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class aog implements sro {
    public final long a;
    public final long b;
    public final Object c;
    public final boolean d;

    public aog(long j, long j2, Object obj, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = obj;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aog)) {
            return false;
        }
        aog aogVar = (aog) obj;
        return this.a == aogVar.a && this.b == aogVar.b && this.c.equals(aogVar.c) && this.d == aogVar.d;
    }

    @Override // defpackage.sro
    public final long getReceivedAt() {
        return this.b;
    }

    @Override // defpackage.sro
    public final long getTtl() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + smw0.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "DataEntryEntity(ttl=", ", receivedAt=");
        w.append(this.b);
        w.append(", value=");
        w.append(this.c);
        return xra1.a(w, ", stale=", this.d, Extension.C_BRAKE);
    }
}
