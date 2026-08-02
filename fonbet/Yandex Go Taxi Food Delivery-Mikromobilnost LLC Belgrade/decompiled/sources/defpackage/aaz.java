package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class aaz extends caz {
    public final bd a;
    public final boolean b;

    public aaz(bd bdVar, boolean z) {
        this.a = bdVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaz)) {
            return false;
        }
        aaz aazVar = (aaz) obj;
        return jl40.l(this.a, aazVar.a) && this.b == aazVar.b;
    }

    public final int hashCode() {
        bd bdVar = this.a;
        return Boolean.hashCode(this.b) + ((bdVar == null ? 0 : bdVar.hashCode()) * 31);
    }

    public final String toString() {
        return "LocationPermissionV1Payload(acceptance=" + this.a + ", fadeAnimations=" + this.b + Extension.C_BRAKE;
    }
}
