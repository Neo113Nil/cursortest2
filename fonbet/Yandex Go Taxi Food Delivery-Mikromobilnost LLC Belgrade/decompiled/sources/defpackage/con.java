package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class con extends n351 {
    public final List c;
    public final boolean d;
    public final vu0 e;
    public final String f;
    public final String g;

    public con(List list, boolean z, vu0 vu0Var, String str, String str2) {
        super("editable-route-widgets", false, 14);
        this.c = list;
        this.d = z;
        this.e = vu0Var;
        this.f = str;
        this.g = str2;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof con)) {
            return false;
        }
        con conVar = (con) obj;
        return jl40.l(this.c, conVar.c) && this.d == conVar.d && jl40.l(this.e, conVar.e) && jl40.l(this.f, conVar.f) && jl40.l(this.g, conVar.g);
    }

    public final int hashCode() {
        int e = unr0.e(this.c.hashCode() * 31, 31, this.d);
        vu0 vu0Var = this.e;
        int hashCode = (e + (vu0Var == null ? 0 : vu0Var.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditableRouteModel(routePointWidgets=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", addressFlow=");
        sb.append(this.e);
        sb.append(", metricaLabel=");
        sb.append(this.f);
        sb.append(", id=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
