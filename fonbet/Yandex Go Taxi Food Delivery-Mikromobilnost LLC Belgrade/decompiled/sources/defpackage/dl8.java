package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dl8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dl8(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl8)) {
            return false;
        }
        dl8 dl8Var = (dl8) obj;
        return this.a == dl8Var.a && this.b == dl8Var.b && this.c == dl8Var.c && this.d == dl8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", endWidth=", Extension.C_BRAKE, b64.s(this.a, this.b, "IconAnimationState(startPadding=", ", endPadding=", ", startWidth="));
    }
}
