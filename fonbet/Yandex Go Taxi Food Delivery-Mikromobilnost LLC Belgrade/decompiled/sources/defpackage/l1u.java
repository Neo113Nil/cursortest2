package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l1u {
    public final int a;
    public final int b;

    public l1u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1u)) {
            return false;
        }
        l1u l1uVar = (l1u) obj;
        return this.a == l1uVar.a && this.b == l1uVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "GridLayoutPositionModel(row=", ", column=", Extension.C_BRAKE);
    }
}
