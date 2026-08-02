package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kwm {
    public final long a;
    public final String b;

    public kwm(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwm)) {
            return false;
        }
        kwm kwmVar = (kwm) obj;
        return this.a == kwmVar.a && jl40.l(this.b, kwmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("CacheKey(dueTimeMillis=", this.a, ", scheduledOrderId=", this.b);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
