package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dey0 {
    public final o0k a;

    public dey0(o0k o0kVar) {
        this.a = o0kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dey0) && jl40.l(this.a, ((dey0) obj).a);
    }

    public final int hashCode() {
        o0k o0kVar = this.a;
        if (o0kVar == null) {
            return 0;
        }
        return o0kVar.hashCode();
    }

    public final String toString() {
        return "NameApprovingBanner(userData=" + this.a + Extension.C_BRAKE;
    }
}
