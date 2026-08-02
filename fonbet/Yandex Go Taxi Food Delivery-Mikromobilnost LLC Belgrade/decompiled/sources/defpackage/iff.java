package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class iff extends dha1 {
    public final long a;

    public iff(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iff) && this.a == ((iff) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "CurrentChatMessageContext(timestamp=", Extension.C_BRAKE);
    }
}
