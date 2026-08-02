package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i69 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final wp2 e;

    public i69(int i, int i2, int i3, int i4, wp2 wp2Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i69)) {
            return false;
        }
        i69 i69Var = (i69) obj;
        return this.a == i69Var.a && this.b == i69Var.b && this.c == i69Var.c && this.d == i69Var.d && jl40.l(this.e, i69Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, oyr.b(0, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "CellUiState(minWidth=", ", paddingTop=0, paddingBottom=", ", paddingStart=");
        vfc.u(this.c, this.d, ", paddingEnd=", ", backgroundColor=", s);
        s.append(this.e);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
