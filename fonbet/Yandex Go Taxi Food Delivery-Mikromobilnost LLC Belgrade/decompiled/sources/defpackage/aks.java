package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class aks {
    public final int a;
    public final int b;

    public aks(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aks)) {
            return false;
        }
        aks aksVar = (aks) obj;
        return this.a == aksVar.a && this.b == aksVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Size(width=", ", height=", Extension.C_BRAKE);
    }
}
