package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class go01 {
    public final int a;
    public final int b;

    public go01(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go01)) {
            return false;
        }
        go01 go01Var = (go01) obj;
        return this.a == go01Var.a && this.b == go01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Rule(minLen=", ", maxDistance=", Extension.C_BRAKE);
    }
}
