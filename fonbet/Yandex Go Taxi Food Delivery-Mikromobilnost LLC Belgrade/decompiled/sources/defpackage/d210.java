package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d210 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public d210(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d210)) {
            return false;
        }
        d210 d210Var = (d210) obj;
        return this.a == d210Var.a && this.b == d210Var.b && this.c == d210Var.c && this.d == d210Var.d && this.e == d210Var.e && this.f == d210Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ScanSettings(maxVehiclesCount=", ", batchSize=", ", beaconTtlSeconds=");
        vfc.u(this.c, this.d, ", rssiThreshold=", ", enableIbeacon=", s);
        return smw0.k(", enableEddystone=", Extension.C_BRAKE, s, this.e, this.f);
    }
}
