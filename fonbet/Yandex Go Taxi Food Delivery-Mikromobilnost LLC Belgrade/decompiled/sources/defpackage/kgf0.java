package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kgf0 implements egf0 {
    public final long a;

    public kgf0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgf0) && this.a == ((kgf0) obj).a;
    }

    @Override // defpackage.egf0
    public final long getUid() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "UidChanged(uid=", Extension.C_BRAKE);
    }
}
