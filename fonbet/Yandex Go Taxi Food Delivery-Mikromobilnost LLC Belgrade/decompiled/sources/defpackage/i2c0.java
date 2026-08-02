package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class i2c0 {
    public final int a;
    public final int b;

    public i2c0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2c0)) {
            return false;
        }
        i2c0 i2c0Var = (i2c0) obj;
        return this.a == i2c0Var.a && this.b == i2c0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "PinWarSizeInt(width=", ", height=", Extension.C_BRAKE);
    }
}
