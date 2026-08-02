package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class m33 {
    public final float a;
    public final float b;
    public final float c;

    public m33(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m33)) {
            return false;
        }
        m33 m33Var = (m33) obj;
        return Float.compare(this.a, m33Var.a) == 0 && Float.compare(this.b, m33Var.b) == 0 && Float.compare(this.c, m33Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return uw51.i(oo31.k("ArBoxSize(heightSm=", this.a, ", widthSm=", this.b, ", depthSm="), this.c, Extension.C_BRAKE);
    }
}
