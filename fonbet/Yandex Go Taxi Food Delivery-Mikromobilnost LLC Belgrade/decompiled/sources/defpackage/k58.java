package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k58 {
    public final pvi0 a;
    public final float b;
    public final int c;
    public final int d;

    public k58(pvi0 pvi0Var, float f, int i, int i2) {
        this.a = pvi0Var;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k58)) {
            return false;
        }
        k58 k58Var = (k58) obj;
        return this.a.equals(k58Var.a) && Float.compare(this.b, k58Var.b) == 0 && this.c == k58Var.c && this.d == k58Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, g8e.c(this.b, this.a.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarImageUiState(image=");
        sb.append(this.a);
        sb.append(", fallbackImageRes=null, iconAlpha=");
        sb.append(this.b);
        sb.append(", width=");
        return ly3.k(this.c, this.d, ", offsetX=", Extension.C_BRAKE, sb);
    }
}
