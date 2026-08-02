package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l59 {
    public final int a;
    public final int b;

    public l59(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l59)) {
            return false;
        }
        l59 l59Var = (l59) obj;
        return this.a == l59Var.a && this.b == l59Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "CategorySize(width=", ", height=", Extension.C_BRAKE);
    }
}
