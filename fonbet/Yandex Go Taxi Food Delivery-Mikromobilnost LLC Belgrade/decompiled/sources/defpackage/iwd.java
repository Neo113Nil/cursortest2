package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class iwd {
    public final int a;
    public final int b;

    public iwd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwd)) {
            return false;
        }
        iwd iwdVar = (iwd) obj;
        return this.a == iwdVar.a && this.b == iwdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "CompressionInfo(compressionsCount=", ", imageSizeBytes=", Extension.C_BRAKE);
    }
}
