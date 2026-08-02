package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class oet {
    public final int a;
    public final int b;

    public oet(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oet)) {
            return false;
        }
        oet oetVar = (oet) obj;
        return this.a == oetVar.a && this.b == oetVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "GetTextSuggestConfig(minLength=", ", maxLength=", Extension.C_BRAKE);
    }

    public /* synthetic */ oet(int i) {
        this(3, 500);
    }

    public oet() {
        this(0);
    }
}
