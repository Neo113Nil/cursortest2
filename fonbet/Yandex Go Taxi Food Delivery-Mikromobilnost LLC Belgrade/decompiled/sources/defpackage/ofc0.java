package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ofc0 {
    public final int a;
    public final int b;

    public ofc0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofc0)) {
            return false;
        }
        ofc0 ofc0Var = (ofc0) obj;
        return this.a == ofc0Var.a && this.b == ofc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "PlacesSocialPinDimensions(width=", ", height=", Extension.C_BRAKE);
    }
}
