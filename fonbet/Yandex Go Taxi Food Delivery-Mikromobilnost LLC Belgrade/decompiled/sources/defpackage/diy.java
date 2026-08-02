package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class diy implements fiy {
    public final kdc a;

    public diy(kdc kdcVar) {
        this.a = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof diy) && jl40.l(this.a, ((diy) obj).a);
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        if (kdcVar == null) {
            return 0;
        }
        return kdcVar.hashCode();
    }

    public final String toString() {
        return "Solid(color=" + this.a + Extension.C_BRAKE;
    }
}
