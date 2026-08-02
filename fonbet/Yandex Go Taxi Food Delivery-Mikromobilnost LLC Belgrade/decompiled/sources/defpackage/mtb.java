package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mtb {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final boolean f;
    public final ldc g;
    public final ldc h;
    public final boolean i;
    public final boolean j;
    public final ltb k;

    public mtb(String str, String str2, String str3, Integer num, String str4, ldc ldcVar, ldc ldcVar2, boolean z, boolean z2, ltb ltbVar, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        num = (i & 8) != 0 ? null : num;
        boolean z3 = (i & 32) == 0;
        ldc ldcVar3 = (i & 128) != 0 ? null : ldcVar;
        ldc ldcVar4 = (i & 256) == 0 ? ldcVar2 : null;
        boolean z4 = (i & 512) == 0 ? z : true;
        boolean z5 = (i & 1024) == 0 ? z2 : false;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = z3;
        this.g = ldcVar3;
        this.h = ldcVar4;
        this.i = z4;
        this.j = z5;
        this.k = ltbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtb)) {
            return false;
        }
        mtb mtbVar = (mtb) obj;
        return jl40.l(this.a, mtbVar.a) && jl40.l(this.b, mtbVar.b) && jl40.l(this.c, mtbVar.c) && jl40.l(this.d, mtbVar.d) && jl40.l(this.e, mtbVar.e) && this.f == mtbVar.f && jl40.l(this.g, mtbVar.g) && jl40.l(this.h, mtbVar.h) && this.i == mtbVar.i && this.j == mtbVar.j && this.k.equals(mtbVar.k);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.e;
        int e = unr0.e((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 961, this.f);
        ldc ldcVar = this.g;
        int hashCode5 = (e + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.h;
        return this.k.hashCode() + unr0.e(unr0.e((hashCode5 + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder v = b64.v("CircleButtonModel(title=", this.a, ", badgeText=", this.b, ", imageUrl=");
        vfc.w(this.d, this.c, ", iconResId=", ", contentDescription=", v);
        tse0.y(this.e, ", disabledForAccessibility=", ", backgroundDrawable=null, badgeBackgroundColor=", v, this.f);
        v.append(this.g);
        v.append(", badgeTextColor=");
        v.append(this.h);
        v.append(", enabled=");
        nnm.v(", titleShimmeringEnabled=", ", payload=", v, this.i, this.j);
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
