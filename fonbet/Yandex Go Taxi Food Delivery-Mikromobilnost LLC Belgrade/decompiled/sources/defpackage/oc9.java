package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class oc9 {
    public final List a;
    public final y2l b;
    public final boolean c;

    public oc9(List list, y2l y2lVar, boolean z) {
        this.a = list;
        this.b = y2lVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc9)) {
            return false;
        }
        oc9 oc9Var = (oc9) obj;
        return this.a.equals(oc9Var.a) && jl40.l(this.b, oc9Var.b) && this.c == oc9Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y2l y2lVar = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (y2lVar == null ? 0 : y2lVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VariablesAndPatch(variables=");
        sb.append(this.a);
        sb.append(", patch=");
        sb.append(this.b);
        sb.append(", requiredRebind=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
