package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ar3 {
    public final int a;
    public final int b;
    public final int c;

    public ar3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar3)) {
            return false;
        }
        ar3 ar3Var = (ar3) obj;
        return this.a == ar3Var.a && this.b == ar3Var.b && this.c == ar3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "DiscoConfig(jumpThresholdMeters=", ", jumpCountThreshold=", ", windowMs="));
    }
}
