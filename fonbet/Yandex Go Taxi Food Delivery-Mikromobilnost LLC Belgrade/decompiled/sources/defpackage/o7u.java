package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o7u {
    public final Long a;

    public o7u(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7u) && jl40.l(this.a, ((o7u) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "Params(organizationId=" + this.a + Extension.C_BRAKE;
    }

    public o7u() {
        this(null);
    }
}
