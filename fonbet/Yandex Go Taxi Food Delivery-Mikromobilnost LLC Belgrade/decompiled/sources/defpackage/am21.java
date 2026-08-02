package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class am21 {
    public final Long a;
    public final Long b;

    public am21(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am21)) {
            return false;
        }
        am21 am21Var = (am21) obj;
        return jl40.l(this.a, am21Var.a) && jl40.l(this.b, am21Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "Version(fullVersion=" + this.a + ", reducedVersion=" + this.b + Extension.C_BRAKE;
    }
}
