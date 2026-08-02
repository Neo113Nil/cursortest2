package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class iuc {
    public static final huc Companion = new huc();
    public final double a;
    public final double b;

    public /* synthetic */ iuc(double d, double d2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, guc.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuc)) {
            return false;
        }
        iuc iucVar = (iuc) obj;
        return Double.compare(this.a, iucVar.a) == 0 && Double.compare(this.b, iucVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "CommunicationsRequestLocation(latitude=", ", longitude="), this.b, Extension.C_BRAKE);
    }

    public iuc(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
