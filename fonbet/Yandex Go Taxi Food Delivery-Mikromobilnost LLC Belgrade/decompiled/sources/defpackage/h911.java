package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class h911 implements k911 {
    public final kdc a;

    public h911(kdc kdcVar) {
        this.a = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h911) && jl40.l(this.a, ((h911) obj).a);
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        if (kdcVar == null) {
            return 0;
        }
        return kdcVar.hashCode();
    }

    public final String toString() {
        return "Transport(color=" + this.a + Extension.C_BRAKE;
    }
}
