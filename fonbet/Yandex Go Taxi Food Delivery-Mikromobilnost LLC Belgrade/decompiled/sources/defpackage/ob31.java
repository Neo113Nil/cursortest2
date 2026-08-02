package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ob31 {
    public final String a;
    public final String b;
    public final boolean c;
    public final oeq0 d;
    public final vl4 e;
    public final String f;
    public final String g;

    public ob31(String str, String str2, boolean z, oeq0 oeq0Var, vl4 vl4Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = oeq0Var;
        this.e = vl4Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob31)) {
            return false;
        }
        ob31 ob31Var = (ob31) obj;
        return jl40.l(this.a, ob31Var.a) && jl40.l(this.b, ob31Var.b) && this.c == ob31Var.c && this.d.equals(ob31Var.d) && jl40.l(this.e, ob31Var.e) && jl40.l(this.f, ob31Var.f) && jl40.l(this.g, ob31Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        vl4 vl4Var = this.e;
        return this.g.hashCode() + unr0.b((hashCode + (vl4Var == null ? 0 : vl4Var.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("VerticalHeaderModel(verticalId=", this.a, ", title=", this.b, ", selected=");
        v.append(this.c);
        v.append(", scrollMode=");
        v.append(this.d);
        v.append(", badge=");
        v.append(this.e);
        v.append(", contentDescription=");
        v.append(this.f);
        v.append(", stateDescription=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
