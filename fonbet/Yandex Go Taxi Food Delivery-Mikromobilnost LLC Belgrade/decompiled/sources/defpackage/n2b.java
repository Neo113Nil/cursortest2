package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class n2b {
    public final long a;
    public final String b;

    public n2b(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2b)) {
            return false;
        }
        n2b n2bVar = (n2b) obj;
        return this.a == n2bVar.a && jl40.l(this.b, n2bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("InternalIdChatId(internalId=", this.a, ", chatId=", this.b);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
