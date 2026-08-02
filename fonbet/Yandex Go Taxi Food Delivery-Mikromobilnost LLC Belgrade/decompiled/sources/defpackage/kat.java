package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kat {
    public final Long a;
    public final boolean b;

    public kat(Long l, boolean z) {
        this.a = l;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kat)) {
            return false;
        }
        kat katVar = (kat) obj;
        return jl40.l(this.a, katVar.a) && this.b == katVar.b;
    }

    public final int hashCode() {
        Long l = this.a;
        return Boolean.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "Params(orgId=" + this.a + ", readOnMainThread=" + this.b + Extension.C_BRAKE;
    }

    public kat() {
        this(null, true);
    }
}
