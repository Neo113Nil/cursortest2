package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kce0 {
    public final float a;
    public final float b;

    public kce0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kce0)) {
            return false;
        }
        kce0 kce0Var = (kce0) obj;
        return Float.compare(this.a, kce0Var.a) == 0 && Float.compare(this.b, kce0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("Position(left=", this.a, ", top=", this.b, Extension.C_BRAKE);
    }
}
