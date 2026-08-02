package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h141 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public h141(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h141)) {
            return false;
        }
        h141 h141Var = (h141) obj;
        return this.a == h141Var.a && this.b == h141Var.b && this.c == h141Var.c && this.d == h141Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", buttonTextRes=", Extension.C_BRAKE, b64.s(this.a, this.b, "WalkNavErrorUiState(imageRes=", ", titleRes=", ", subtitleRes="));
    }
}
