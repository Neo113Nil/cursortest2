package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class e5v0 {
    public static final d5v0 Companion = new d5v0();
    public final zzs a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ e5v0(int i, zzs zzsVar, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, c5v0.a.getDescriptor());
            throw null;
        }
        this.a = zzsVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5v0)) {
            return false;
        }
        e5v0 e5v0Var = (e5v0) obj;
        return jl40.l(this.a, e5v0Var.a) && jl40.l(this.b, e5v0Var.b) && jl40.l(this.c, e5v0Var.c) && jl40.l(this.d, e5v0Var.d) && jl40.l(this.e, e5v0Var.e) && jl40.l(this.f, e5v0Var.f);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        int b = unr0.b((zzsVar == null ? 0 : zzsVar.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestField(position=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", log=");
        g8e.D(sb, this.c, ", type=", this.d, ", entrance=");
        return g8e.r(sb, this.e, ", shortText=", this.f, Extension.C_BRAKE);
    }

    public e5v0(zzs zzsVar, String str, String str2, String str3, String str4, String str5) {
        this.a = zzsVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }
}
