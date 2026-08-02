package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ba01 extends ome {
    public final String b;
    public final ky c;
    public final ldc d;
    public final ldc e;
    public final String f;
    public final Object g;

    public ba01(String str, ky kyVar, ldc ldcVar, ldc ldcVar2, String str2, Object obj) {
        super(obj);
        this.b = str;
        this.c = kyVar;
        this.d = ldcVar;
        this.e = ldcVar2;
        this.f = str2;
        this.g = obj;
    }

    @Override // defpackage.ome
    public final Object a() {
        return this.g;
    }

    @Override // defpackage.ome
    public final String b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba01)) {
            return false;
        }
        ba01 ba01Var = (ba01) obj;
        return jl40.l(this.b, ba01Var.b) && this.c.equals(ba01Var.c) && jl40.l(this.d, ba01Var.d) && jl40.l(this.e, ba01Var.e) && jl40.l(this.f, ba01Var.f) && jl40.l(this.g, ba01Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        ldc ldcVar = this.d;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.e;
        int hashCode3 = (hashCode2 + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 961;
        String str = this.f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.g;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailButtonState(text=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", textColor=");
        sb.append(this.d);
        sb.append(", buttonColor=");
        sb.append(this.e);
        sb.append(", fontWeight=null, metricaLabel=");
        return tse0.l(sb, this.f, ", meta=", this.g, Extension.C_BRAKE);
    }
}
