package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class gzb0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gzb0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzb0)) {
            return false;
        }
        gzb0 gzb0Var = (gzb0) obj;
        return Float.compare(this.a, gzb0Var.a) == 0 && Float.compare(this.b, gzb0Var.b) == 0 && Float.compare(this.c, gzb0Var.c) == 0 && Float.compare(this.d, gzb0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.q(oo31.k("BB(x=", this.a, ", y=", this.b, ", w="), this.c, ", h=", this.d, Extension.C_BRAKE);
    }
}
