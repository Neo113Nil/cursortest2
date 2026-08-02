package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class cs51 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public cs51(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs51)) {
            return false;
        }
        cs51 cs51Var = (cs51) obj;
        return this.a == cs51Var.a && this.b == cs51Var.b && this.c == cs51Var.c && this.d == cs51Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", popExit=", Extension.C_BRAKE, b64.s(this.a, this.b, "ScreenAnimations(enter=", ", exit=", ", popEnter="));
    }
}
