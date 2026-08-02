package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ahp0 {
    public final float a;
    public final float b;

    public ahp0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahp0)) {
            return false;
        }
        ahp0 ahp0Var = (ahp0) obj;
        return Float.compare(this.a, ahp0Var.a) == 0 && Float.compare(this.b, ahp0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("ScrollAreaOffsets(start=", this.a, ", end=", this.b, Extension.C_BRAKE);
    }
}
