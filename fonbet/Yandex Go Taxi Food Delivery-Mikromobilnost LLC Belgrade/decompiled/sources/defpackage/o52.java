package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class o52 {
    public final float a;
    public final float b;

    public o52(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o52)) {
            return false;
        }
        o52 o52Var = (o52) obj;
        return Float.compare(this.a, o52Var.a) == 0 && Float.compare(this.b, o52Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("Anchor(x=", this.a, ", y=", this.b, Extension.C_BRAKE);
    }
}
