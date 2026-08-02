package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class h611 implements h711 {
    public final String a;
    public final String b;
    public final Integer c;
    public final obm d;
    public final String e;
    public final String f;
    public final k911 g;
    public final String h;

    public h611(String str, String str2, Integer num, obm obmVar, String str3, String str4, k911 k911Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = obmVar;
        this.e = str3;
        this.f = str4;
        this.g = k911Var;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h611)) {
            return false;
        }
        h611 h611Var = (h611) obj;
        return jl40.l(this.a, h611Var.a) && jl40.l(this.b, h611Var.b) && jl40.l(this.c, h611Var.c) && jl40.l(this.d, h611Var.d) && jl40.l(this.e, h611Var.e) && jl40.l(this.f, h611Var.f) && jl40.l(this.g, h611Var.g) && jl40.l(this.h, h611Var.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        obm obmVar = this.d;
        int hashCode2 = (hashCode + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31;
        String str = this.e;
        return this.h.hashCode() + smw0.e(this.g, unr0.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f), 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.g;
    }

    public final String toString() {
        StringBuilder v = b64.v("BeginSection(title=", this.a, ", time=", this.b, ", iconRes=");
        v.append(this.c);
        v.append(", iconDrawableState=");
        v.append(this.d);
        v.append(", avatarUrl=");
        g8e.D(v, this.e, ", contentDescription=", this.f, ", transportType=");
        v.append(this.g);
        v.append(", id=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
