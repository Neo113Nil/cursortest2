package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class b1w {
    public final int a;
    public final int b;

    public b1w(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1w)) {
            return false;
        }
        b1w b1wVar = (b1w) obj;
        return this.a == b1wVar.a && this.b == b1wVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "InputValueStep(value=", ", step=", Extension.C_BRAKE);
    }
}
