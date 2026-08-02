package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mdu {
    public final int a;
    public final int b;
    public final float c;

    public mdu(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdu)) {
            return false;
        }
        mdu mduVar = (mdu) obj;
        return this.a == mduVar.a && this.b == mduVar.b && Float.compare(this.c, mduVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return uw51.i(b64.s(this.a, this.b, "UiGradient(startColor=", ", endColor=", ", endLocation="), this.c, Extension.C_BRAKE);
    }
}
