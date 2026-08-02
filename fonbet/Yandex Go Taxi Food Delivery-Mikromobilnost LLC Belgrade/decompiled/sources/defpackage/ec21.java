package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ec21 extends ic21 {
    public final int a;
    public final int b;

    public ec21(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec21)) {
            return false;
        }
        ec21 ec21Var = (ec21) obj;
        return this.a == ec21Var.a && this.b == ec21Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Progress(currentProgress=", ", totalProgress=", Extension.C_BRAKE);
    }
}
