package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ej11 {
    public final float a;
    public final float b;

    public ej11(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej11)) {
            return false;
        }
        ej11 ej11Var = (ej11) obj;
        return Float.compare(this.a, ej11Var.a) == 0 && Float.compare(this.b, ej11Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("TsarButtonGradientOffsetPosition(offsetX=", this.a, ", offsetY=", this.b, Extension.C_BRAKE);
    }
}
