package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ey10 {
    public final long a;
    public final long b;

    public ey10(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey10)) {
            return false;
        }
        ey10 ey10Var = (ey10) obj;
        return this.a == ey10Var.a && this.b == ey10Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "InternalIdFlagsTuple(msgInternalId=", ", flags="));
    }
}
