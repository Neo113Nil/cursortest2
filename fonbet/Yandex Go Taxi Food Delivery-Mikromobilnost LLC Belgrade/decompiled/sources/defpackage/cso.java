package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cso implements eso {
    public final int a;
    public final int b;

    public cso(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cso)) {
            return false;
        }
        cso csoVar = (cso) obj;
        return this.a == csoVar.a && this.b == csoVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "NonEmpty(month=", ", year=", Extension.C_BRAKE);
    }
}
