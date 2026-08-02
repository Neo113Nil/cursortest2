package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class ieo {
    public static final heo Companion = new heo();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new cao(9))};
    public final String a;
    public final png b;

    public /* synthetic */ ieo(int i, String str, png pngVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, geo.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = pngVar;
    }

    public static ieo a(ieo ieoVar, png pngVar) {
        String str = ieoVar.a;
        ieoVar.getClass();
        return new ieo(str, pngVar);
    }

    public final String b() {
        return this.a;
    }

    public final png c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieo)) {
            return false;
        }
        ieo ieoVar = (ieo) obj;
        return jl40.l(this.a, ieoVar.a) && jl40.l(this.b, ieoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(capabilityId=" + this.a + ", newState=" + this.b + Extension.C_BRAKE;
    }

    public ieo(String str, png pngVar) {
        this.a = str;
        this.b = pngVar;
    }
}
