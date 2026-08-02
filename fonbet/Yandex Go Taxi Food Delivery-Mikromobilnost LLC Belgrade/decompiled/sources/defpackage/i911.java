package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class i911 implements k911 {
    public final kdc a;

    public i911(kdc kdcVar) {
        this.a = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i911) && jl40.l(this.a, ((i911) obj).a);
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        if (kdcVar == null) {
            return 0;
        }
        return kdcVar.hashCode();
    }

    public final String toString() {
        return "Underground(color=" + this.a + Extension.C_BRAKE;
    }
}
