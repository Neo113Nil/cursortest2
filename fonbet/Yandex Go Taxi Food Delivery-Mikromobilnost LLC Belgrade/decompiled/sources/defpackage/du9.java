package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class du9 {
    public final lt9 a;
    public final cy9 b;
    public final boolean c;

    public du9(lt9 lt9Var, cy9 cy9Var, boolean z) {
        this.a = lt9Var;
        this.b = cy9Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du9)) {
            return false;
        }
        du9 du9Var = (du9) obj;
        return this.a.equals(du9Var.a) && jl40.l(this.b, du9Var.b) && this.c == du9Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cy9 cy9Var = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (cy9Var == null ? 0 : cy9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersDiscountsActivateUiState(content=");
        sb.append(this.a);
        sb.append(", error=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
