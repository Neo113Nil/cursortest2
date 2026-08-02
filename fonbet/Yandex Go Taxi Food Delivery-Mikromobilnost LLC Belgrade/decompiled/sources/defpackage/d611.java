package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d611 implements h711 {
    public final String a;
    public final obm b;
    public final ib11 c;
    public final k911 d;
    public final String e;

    public d611(String str, obm obmVar, ib11 ib11Var, k911 k911Var, String str2) {
        this.a = str;
        this.b = obmVar;
        this.c = ib11Var;
        this.d = k911Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d611)) {
            return false;
        }
        d611 d611Var = (d611) obj;
        return jl40.l(this.a, d611Var.a) && jl40.l(this.b, d611Var.b) && this.c.equals(d611Var.c) && jl40.l(this.d, d611Var.d) && this.e.equals(d611Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        obm obmVar = this.b;
        return this.e.hashCode() + smw0.e(this.d, (this.c.hashCode() + ((hashCode + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31)) * 31, 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlertItem(text=");
        sb.append(this.a);
        sb.append(", iconRes=null, iconDrawableState=");
        sb.append(this.b);
        sb.append(", variant=");
        sb.append(this.c);
        sb.append(", transportType=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
