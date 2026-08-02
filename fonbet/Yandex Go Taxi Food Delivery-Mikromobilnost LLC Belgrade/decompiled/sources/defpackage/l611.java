package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class l611 implements h711 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final k911 e;
    public final String f;
    public final h911 g;
    public final String h;

    public l611(String str, String str2, String str3, String str4, k911 k911Var, String str5, h911 h911Var, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = k911Var;
        this.f = str5;
        this.g = h911Var;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l611)) {
            return false;
        }
        l611 l611Var = (l611) obj;
        return this.a.equals(l611Var.a) && jl40.l(this.b, l611Var.b) && jl40.l(this.c, l611Var.c) && jl40.l(this.d, l611Var.d) && this.e.equals(l611Var.e) && this.f.equals(l611Var.f) && this.g.equals(l611Var.g) && this.h.equals(l611Var.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.h.hashCode() + ((this.g.hashCode() + unr0.b(smw0.e(this.e, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EndScooterSection(title=");
        sb.append((Object) this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", parkingBadge=");
        g8e.D(sb, this.c, ", parkingIconTag=", this.d, ", nextTransportType=");
        sb.append(this.e);
        sb.append(", contentDescription=");
        sb.append(this.f);
        sb.append(", transportType=");
        sb.append(this.g);
        sb.append(", id=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
