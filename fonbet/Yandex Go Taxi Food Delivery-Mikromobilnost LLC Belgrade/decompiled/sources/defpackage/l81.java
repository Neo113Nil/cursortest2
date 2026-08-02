package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class l81 implements n81 {
    public final ov0 a;
    public final v81 b;
    public final String c;

    public l81(ov0 ov0Var, v81 v81Var, String str) {
        this.a = ov0Var;
        this.b = v81Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l81)) {
            return false;
        }
        l81 l81Var = (l81) obj;
        return this.a.equals(l81Var.a) && this.b.equals(l81Var.b) && jl40.l(this.c, l81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageButtonUiState(addressImageUiState=");
        sb.append(this.a);
        sb.append(", addressUiAction=");
        sb.append(this.b);
        sb.append(", clickActionLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
