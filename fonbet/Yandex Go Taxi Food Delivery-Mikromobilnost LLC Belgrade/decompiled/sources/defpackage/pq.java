package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pq extends lr {
    public final String a;
    public final hki b;

    public pq(String str, hki hkiVar) {
        this.a = str;
        this.b = hkiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        return jl40.l(this.a, pqVar.a) && jl40.l(this.b, pqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhotocommentDeleted(uuid=" + this.a + ", pointType=" + this.b + Extension.C_BRAKE;
    }
}
