package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class nep0 {
    public final float a;
    public final float b;

    public nep0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nep0)) {
            return false;
        }
        nep0 nep0Var = (nep0) obj;
        return y7m.b(this.a, nep0Var.a) && y7m.b(this.b, nep0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("ScreenSize(width=", y7m.c(this.a), ", height=", y7m.c(this.b), Extension.C_BRAKE);
    }
}
