package defpackage;

import java.security.PublicKey;

/* loaded from: classes4.dex */
public final class kfz {
    public final PublicKey a;
    public final Long b;
    public final byte[] c;

    public kfz(PublicKey publicKey, Long l) {
        this.a = publicKey;
        this.b = l;
        this.c = aba1.d(publicKey);
    }

    public final byte[] a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfz)) {
            return false;
        }
        kfz kfzVar = (kfz) obj;
        return this.a.equals(kfzVar.a) && jl40.l(this.b, kfzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogServer(key=");
        sb.append(this.a);
        sb.append(", validUntil=");
        return qv10.q(sb, this.b, ')');
    }
}
