package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pvs0 {
    public final boolean a;
    public final gv90 b;
    public final gv90 c;
    public final String d;
    public final boolean e;

    public pvs0(boolean z, gv90 gv90Var, gv90 gv90Var2, String str, boolean z2) {
        this.a = z;
        this.b = gv90Var;
        this.c = gv90Var2;
        this.d = str;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvs0)) {
            return false;
        }
        pvs0 pvs0Var = (pvs0) obj;
        return this.a == pvs0Var.a && jl40.l(this.b, pvs0Var.b) && jl40.l(this.c, pvs0Var.c) && jl40.l(this.d, pvs0Var.d) && this.e == pvs0Var.e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        gv90 gv90Var = this.b;
        int hashCode2 = (hashCode + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31;
        gv90 gv90Var2 = this.c;
        int hashCode3 = (hashCode2 + (gv90Var2 == null ? 0 : gv90Var2.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Switch(checked=");
        sb.append(this.a);
        sb.append(", actionOnPayload=");
        sb.append(this.b);
        sb.append(", actionOffPayload=");
        sb.append(this.c);
        sb.append(", metricaLabel=");
        sb.append(this.d);
        sb.append(", enabled=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
