package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class bc21 extends dc21 {
    public final int a;
    public final int b;

    public bc21(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc21)) {
            return false;
        }
        bc21 bc21Var = (bc21) obj;
        return this.a == bc21Var.a && this.b == bc21Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Progress(currentBytes=", ", totalBytes=", Extension.C_BRAKE);
    }
}
