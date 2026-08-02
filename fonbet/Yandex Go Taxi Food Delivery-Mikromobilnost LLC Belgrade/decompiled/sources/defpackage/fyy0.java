package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fyy0 {
    public final long a;
    public final long b;

    public fyy0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyy0)) {
            return false;
        }
        fyy0 fyy0Var = (fyy0) obj;
        return this.a == fyy0Var.a && this.b == fyy0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "ThreadMessagesViewEntity(rowId=null, messageHistoryId=", ", threadInternalId="));
    }
}
