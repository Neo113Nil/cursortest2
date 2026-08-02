package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fce0 extends s1a1 {
    public final float b;
    public final float c;

    public fce0(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fce0)) {
            return false;
        }
        fce0 fce0Var = (fce0) obj;
        return Float.compare(this.b, fce0Var.b) == 0 && Float.compare(this.c, fce0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        return x4e.e("Absolute(x=", this.b, ", y=", this.c, Extension.C_BRAKE);
    }
}
