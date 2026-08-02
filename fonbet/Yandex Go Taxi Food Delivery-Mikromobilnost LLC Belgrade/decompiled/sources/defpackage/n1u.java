package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n1u {
    public final int a;
    public final int b;

    public n1u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1u)) {
            return false;
        }
        n1u n1uVar = (n1u) obj;
        return this.a == n1uVar.a && this.b == n1uVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "GridLayoutSize(rows=", ", columns=", Extension.C_BRAKE);
    }
}
