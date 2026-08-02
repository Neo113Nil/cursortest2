package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m6b {
    public final long a;
    public final long b;

    public m6b(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6b)) {
            return false;
        }
        m6b m6bVar = (m6b) obj;
        return this.a == m6bVar.a && this.b == m6bVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "ChatNotificationsEntity(chatInternalId=", ", lastShownMessageTimestamp="));
    }
}
