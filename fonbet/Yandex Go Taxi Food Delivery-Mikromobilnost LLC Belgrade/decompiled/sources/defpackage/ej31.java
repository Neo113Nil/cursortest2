package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ej31 {
    public final ob5 a;
    public final is60 b;
    public final boolean c;

    public ej31(ob5 ob5Var, is60 is60Var, boolean z) {
        this.a = ob5Var;
        this.b = is60Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej31)) {
            return false;
        }
        ej31 ej31Var = (ej31) obj;
        return this.a.equals(ej31Var.a) && jl40.l(this.b, ej31Var.b) && this.c == ej31Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalTariffUiState(baseTariffInfoUiState=");
        sb.append(this.a);
        sb.append(", offer=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
