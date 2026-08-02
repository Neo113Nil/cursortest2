package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fao {
    public final int a;
    public final int b;
    public final int c;
    public final nvi0 d;

    public fao(int i, int i2, int i3, ovi0 ovi0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ovi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fao)) {
            return false;
        }
        fao faoVar = (fao) obj;
        return this.a == faoVar.a && this.b == faoVar.b && this.c == faoVar.c && jl40.l(this.d, faoVar.d);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        nvi0 nvi0Var = this.d;
        return b + (nvi0Var == null ? 0 : nvi0Var.hashCode());
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ErrorUiState(titleRes=", ", buttonTextRes=", ", subtitleRes=");
        s.append(this.c);
        s.append(", image=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
