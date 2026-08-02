package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class c8u {
    public final Long a;

    public c8u(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8u) && jl40.l(this.a, ((c8u) obj).a);
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

    public c8u() {
        this(null);
    }
}
