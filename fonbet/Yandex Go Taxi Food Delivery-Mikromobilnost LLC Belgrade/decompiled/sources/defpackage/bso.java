package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bso implements dso {
    public final int a;
    public final int b;

    public bso(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bso)) {
            return false;
        }
        bso bsoVar = (bso) obj;
        return this.a == bsoVar.a && this.b == bsoVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "NonEmpty(month=", ", year=", Extension.C_BRAKE);
    }
}
