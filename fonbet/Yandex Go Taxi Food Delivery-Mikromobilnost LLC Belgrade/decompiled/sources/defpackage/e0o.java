package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e0o implements m1j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final k911 e;
    public final String f;
    public final h911 g;
    public final String h;

    public e0o(String str, String str2, String str3, String str4, k911 k911Var, String str5, h911 h911Var, String str6) {
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
        if (!(obj instanceof e0o)) {
            return false;
        }
        e0o e0oVar = (e0o) obj;
        return this.a.equals(e0oVar.a) && jl40.l(this.b, e0oVar.b) && jl40.l(this.c, e0oVar.c) && jl40.l(this.d, e0oVar.d) && this.e.equals(e0oVar.e) && this.f.equals(e0oVar.f) && this.g.equals(e0oVar.g) && this.h.equals(e0oVar.h);
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
