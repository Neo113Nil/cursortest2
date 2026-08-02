package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ciy implements eiy {
    public final kdc a;

    public ciy(kdc kdcVar) {
        this.a = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ciy) && jl40.l(this.a, ((ciy) obj).a);
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
