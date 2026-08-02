package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lcc {
    public final float a;
    public final float b;

    public lcc(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcc)) {
            return false;
        }
        lcc lccVar = (lcc) obj;
        return Float.compare(this.a, lccVar.a) == 0 && Float.compare(this.b, lccVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("CollectionScrollPadding(start=", this.a, ", end=", this.b, Extension.C_BRAKE);
    }
}
