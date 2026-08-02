package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dxl0 {
    public final int a;
    public final int b;

    public dxl0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxl0)) {
            return false;
        }
        dxl0 dxl0Var = (dxl0) obj;
        return this.a == dxl0Var.a && this.b == dxl0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Logo(lightThemeRes=", ", darkThemeRes=", Extension.C_BRAKE);
    }
}
