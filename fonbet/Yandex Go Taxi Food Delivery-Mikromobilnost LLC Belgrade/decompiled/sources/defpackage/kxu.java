package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kxu {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public kxu(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxu)) {
            return false;
        }
        kxu kxuVar = (kxu) obj;
        return this.a == kxuVar.a && this.b == kxuVar.b && this.c == kxuVar.c && this.d == kxuVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", fill=", Extension.C_BRAKE, b64.s(this.a, this.b, "HubBatteryConfig(lowChargePercent=", ", mediumChargePercent=", ", multicolor="), this.c, this.d);
    }
}
