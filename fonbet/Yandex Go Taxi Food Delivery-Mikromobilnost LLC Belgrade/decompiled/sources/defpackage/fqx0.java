package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fqx0 {
    public final float a;
    public final float b;
    public final float c;

    public fqx0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqx0)) {
            return false;
        }
        fqx0 fqx0Var = (fqx0) obj;
        return Float.compare(this.a, fqx0Var.a) == 0 && Float.compare(this.b, fqx0Var.b) == 0 && Float.compare(this.c, fqx0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return uw51.i(oo31.k("ImageTransformation(viewTranslation=", this.a, ", bitmapTranslation=", this.b, ", width="), this.c, Extension.C_BRAKE);
    }
}
